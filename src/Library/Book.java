package Library;

public class Book extends ReadingMaterial {
	
	String author;
	String genre;
	
	public Book(String name, String author, String genre) {
		super(name);
		this.author = author;
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
