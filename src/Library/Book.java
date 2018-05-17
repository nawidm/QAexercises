package Library;

public class Book extends ReadingMaterial {
	
	String author;
	String genre;
	
	public Book(String name, int numberOfPages, String author, String genre) {
		super(name, numberOfPages);
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
