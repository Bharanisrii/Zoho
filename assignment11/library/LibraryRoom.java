package assignment11.library;

import assignment11.library.transactions.Transaction;
import assignment11.librarymanagement.members.Member;
import assignment11.librarymanagment.book.Books;

public class LibraryRoom {
	public static void main(String[]args) {
		Books bk = new Books("Java Programming","John Doe", 250);
		Member mem = new Member("Prist",123,898976542);
		Transaction trans = new Transaction("Book1",20,12032004);
		
		System.out.println("Book: "+ bk.getTitle());
		
		System.out.println("Member :"+ mem.getMemberId());
		System.out.println("Date :"+ trans.getDate());
	}

}
