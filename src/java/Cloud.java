/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDEN
 */
import com.dropbox.core.*;
import java.io.*;
import java.util.Locale;

public class Cloud{
    public static void main(String args[]) throws IOException, DbxException{
        //uploadtodropbox("d:\\hash.txt","E-DmBEZMAsYAAAAAAAAAIDIUdwyTa7qgCYnVLnoHAT8");
    }
    public static void uploadtodropbox(String filePath,String fileName,String code) throws IOException, DbxException {
        // Get your app key and secret from the Dropbox developers website.
        final String APP_KEY = "bxhczg9qn2l6pt2";
        final String APP_SECRET = "hsmja9a1hxzcu9k";

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0",
            Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);

        // Have the user sign in and authorize your app.
        String authorizeUrl = webAuth.start();
        System.out.println("1. Go to: " + authorizeUrl);
        System.out.println("2. Click \"Allow\" (you might have to log in first)");
        System.out.println("3. Copy the authorization code.");
       // String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
System.out.println("code:" + code);
        // This will fail if the user enters an invalid authorization code.
        DbxAuthFinish authFinish = webAuth.finish(code);
        String accessToken = authFinish.accessToken;

        DbxClient client = new DbxClient(config, accessToken);

        System.out.println("Linked account: " + client.getAccountInfo().displayName);

        File inputFile = new File(filePath+fileName);
        FileInputStream inputStream = new FileInputStream(inputFile);
        try {
            DbxEntry.File uploadedFile = client.uploadFile("/"+fileName,
                DbxWriteMode.add(), inputFile.length(), inputStream);
            System.out.println("Uploaded: " + uploadedFile.toString());
        } finally {
            inputStream.close();
        }
    }

      /* DbxEntry.WithChildren listing = client.getMetadataWithChildren("/");
        System.out.println("Files in the root path:");
        for (DbxEntry child : listing.children) {
            System.out.println("	" + child.name + ": " + child.toString());
        }*/
        
 public void downloadtodropbox(String filePath,String fileName,String code) throws IOException, DbxException {
        // Get your app key and secret from the Dropbox developers website.
        final String APP_KEY = "bxhczg9qn2l6pt2";
        final String APP_SECRET = "hsmja9a1hxzcu9k";

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0",
            Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);

        // Have the user sign in and authorize your app.
        //String authorizeUrl = webAuth.start();
        //System.out.println("1. Go to: " + authorizeUrl);
        //System.out.println("2. Click \"Allow\" (you might have to log in first)");
        //System.out.println("3. Copy the authorization code.");
       // String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
System.out.println("code:" + code);
        // This will fail if the user enters an invalid authorization code.
        DbxAuthFinish authFinish = webAuth.finish(code);
        String accessToken = authFinish.accessToken;

        DbxClient client = new DbxClient(config, accessToken);

        System.out.println("Linked account: " + client.getAccountInfo().displayName);

        File inputFile = new File(filePath+fileName);
         FileOutputStream outputStream = new FileOutputStream(inputFile);
        try {
            DbxEntry.File downloadedFile = client.getFile("/"+fileName, null,
                outputStream);
            System.out.println("Metadata: " + downloadedFile.toString());
        } finally {
            outputStream.close();
        }
    }
}
