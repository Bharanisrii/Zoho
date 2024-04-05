package assignment11.library.transactions;

public class Transaction {
	private String book;
    private int member;
    private long date;
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public Transaction(String book,int member,long date) {
        this.book = book;
        this.member = member;
        this.date = date;

}
}
