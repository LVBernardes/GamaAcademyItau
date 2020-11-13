
public class Book {
	String title;
	String author;
	String ISBN;
	int year;
	String category;
	int shelf;
	int stand;
	boolean borrowed;

	/*
	 * Constructor with options for informing: - Title, Author, ISBN, Year, Borrowed
	 * - Title, Author, ISBN, Year[, false] - Title, Author[, null, 0, false] -
	 * Title[, null, null, 0, false]
	 */
	
	public Book(String title, String author, String ISBN, int year, String category, int shelf, int stand, boolean borrowed) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.year = year;
		this.category = category;
		this.shelf = shelf;
		this.stand = stand;
		this.borrowed = borrowed;
	}

	public Book(String title, String author, String ISBN, int year, String category, boolean borrowed) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.year = year;
		this.category = category;
		this.shelf = 0;
		this.stand = 0;
		this.borrowed = borrowed;
	}
	
	public Book(String title, String author, String ISBN, int year, String category) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.year = year;
		this.category = category;
		this.shelf = 0;
		this.stand = 0;
		this.borrowed = false;
	}
	
	public Book(String title, String author, String ISBN, int year, boolean borrowed) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.year = year;
		this.category = "Not informed";
		this.shelf = 0;
		this.stand = 0;
		this.borrowed = borrowed;
	}

	public Book(String title, String author, String ISBN, int year) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.year = year;
		this.category = "Not informed";
		this.shelf = 0;
		this.stand = 0;
		this.borrowed = false;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.ISBN = "000000000000";
		this.year = 0;
		this.category = "Not informed";
		this.shelf = 0;
		this.stand = 0;
		this.borrowed = false;
	}
	
	public Book(String title, String author, int shelf, int stand) {
		this.title = title;
		this.author = author;
		this.ISBN = "000000000000";
		this.year = 0;
		this.category = "Not informed";
		this.shelf = shelf;
		this.stand = stand;
		this.borrowed = false;
	}


	public Book(String title) {
		this.title = title;
		this.author = "Not informed";
		this.ISBN = "000000000000";
		this.year = 0;
		this.category = "Not informed";
		this.shelf = 0;
		this.stand = 0;
		this.borrowed = false;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public int getStand() {
		return stand;
	}

	public void setStand(int stand) {
		this.stand = stand;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	
	/*
	 * Advanced methods: 
	 * - LendBook() => "OK" 
	 * - ReturnBook() => "OK" 
	 * - BookData() =>
	 * "Author: [Author], Title: [Title] | [Year] | ISBN: [ISBN] | Available: [borrowed]"
	 * - IsAvailable(); 
	 */
	
	public String Lend() {
		if (IsAvailable()) {
			this.borrowed = true;
			return "OK";
		} else {
			return "Book Unavailable for borrowing";
		}
		
	}

	public String Return() {
		this.borrowed = false;
		return "OK";
	}
	
	public String BookData() {
		String data;
		String availability;
		
		if (this.IsAvailable()) {
			availability = "Yes";
		} else {
			availability = "No";
		}
		
		
		
		data =    "Author: "        + this.author   + ", "
				+ "Title: "         + this.title    + " | "
							        + this.year     + " | "
				+ "Category: "      + this.category + " | "
				+ "ISBN: "          + this.ISBN     + " | "
				+ "Available: "     + availability  + " | "
				+ "Stand - Shelf: " + this.stand    + " - "
				                    + this.shelf;
				                    
		return data;
	}

	private boolean IsAvailable() {
		if (this.borrowed) {
			return false;
		} else {
			return true;
		}
	}

}
