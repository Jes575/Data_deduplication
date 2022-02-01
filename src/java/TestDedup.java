import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.io.FileUtils;

import connection.DedupConn;
import data.Encryption;


public class TestDedup {
	

	public static void main(String args[]) throws IOException, NoSuchAlgorithmException, SQLException{
		
		
		

		File folder = new File("");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  File file = listOfFiles[i];
		  if (file.isFile() && file.getName().endsWith(".txt")) {
		    String content = FileUtils.readFileToString(file);
		   
		  
		
		
			MD5Digest m = new MD5Digest();
	    	String filecontent = content;
	        System.out.println("bbbbbbbbbbbbbbbbbbbb");
	    	System.out.println(filecontent);
	        System.out.println("cccccccccccccccccccccc");
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        md.update(filecontent.getBytes());
        
	        byte byteData[] = md.digest();
 
       
        
	        //convert the byte to hex format method 2
	        StringBuffer hexString = new StringBuffer();
	    	for (int j=0;j<byteData.length;j++) {
	    		String hex=Integer.toHexString(0xff & byteData[j]);
	   	     	if(hex.length()==1) hexString.append('0');
	   	     	hexString.append(hex);
	    	}
	    	System.out.println("Digest(in hex format):: " + hexString.toString());
	        String hash= hexString.toString();
        
	        int count = 0;
	        System.out.println("11111111111111111111");
	       DedupConn ms=new DedupConn();
	       Connection con=ms.Connection();
	       Statement st=con.createStatement();
	       String  qry="select count(*) from data_repo where generated_hashcode = '"+hash+"'";
	       System.out.println(qry);
		      ResultSet rs=st.executeQuery(qry);
		       while(rs.next())
		       {
		           count=rs.getInt(1);
		           if(count>0){
		            //file.delete();
		            System.out.println("File already exists");
		           }else{
		            
		        	   Encryption en= new Encryption();
		        	   //en.enc(file,file.getName());
		        	   
		        	   System.out.println("Uploaded Filename....: " + file.getName() + "<br>");
		           }
		       }
		 
		  } //end if
		}//end for
		
		
	}

}
