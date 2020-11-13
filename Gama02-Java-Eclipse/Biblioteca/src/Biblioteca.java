
public class Biblioteca {
	public static void main(String[] args) {
		
		Book b1,b2,b3,b4,b5;
		
		b1 = new Book("O Andar do Bêbado", "Leonard Mlodinow","9788537801550", 2009);
		b2 = new Book("Eu, Robô", "Isaac Asimov","9788576572008", 2014, "Science Fiction");
		b3 = new Book("Contato", "Carl Sagan","9788535913514", 2008);
		b4 = new Book("1984", "George Orwell","9788535914849", 2009);
		b5 = new Book("Física matemática", "George Arfken","9788535287349", 2017, "Exact Sciences");
		
		console(b1.BookData());
		console(b2.BookData());
		console(b3.BookData());
		console(b4.BookData());
		console(b5.BookData());
		System.out.println();
		
		
		b1.Lend();
		b3.Lend();
		
		console(b1.BookData());
		console(b2.BookData());
		console(b3.BookData());
		console(b4.BookData());
		console(b5.BookData());
		System.out.println();
		
	}
	
	private static void console(String text) {
		System.out.println(text);
	}
}
