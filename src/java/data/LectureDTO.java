package data;

public class LectureDTO {
	int LectureID;
	int TopicID;
	String TopicName;
	String Description;
	String File;
	String Video;
	String FileName;
	String VideoName;
	
	
	public int getLectureID() {
		return LectureID;
	}
	public void setLectureID(int lectureID) {
		LectureID = lectureID;
	}
	public int getTopicID() {
		return TopicID;
	}
	public void setTopicID(int topicID) {
		TopicID = topicID;
	}
	public String getTopicName() {
		return TopicName;
	}
	public void setTopicName(String topicName) {
		TopicName = topicName;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getFile() {
		return File;
	}
	public void setFile(String file) {
		File = file;
	}
	public String getVideo() {
		return Video;
	}
	public void setVideo(String video) {
		Video = video;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getVideoName() {
		return VideoName;
	}
	public void setVideoName(String videoName) {
		VideoName = videoName;
	}
	
	
	
}
