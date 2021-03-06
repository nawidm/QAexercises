package Library;

public class AcademicJournal extends ReadingMaterial{
	
	String author;
	String topic;
	
	public AcademicJournal(String name, String author, String topic) {
		super(name);
		this.author = author;
		this.topic = topic;
	}

	public String read() {
		setNumberOfReads(getNumberOfReads()+1);
		return getName()+" has supposedly been read "+getNumberOfReads()+" times (Thats a lie, nobody reads this stuff)";
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
