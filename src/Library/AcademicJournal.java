package Library;

public class AcademicJournal extends ReadingMaterial{
	
	String author;
	String topic;
	
	public AcademicJournal(String name, int numberOfPages, String author, String topic) {
		super(name, numberOfPages);
		this.author = author;
		this.topic = topic;
	}

	public String read() {
		this.numberOfReads++;
		return name+" has supposedly been read "+this.numberOfReads+" times (Thats a lie, nobody reads this stuff)";
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
}
