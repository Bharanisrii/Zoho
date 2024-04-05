package assignment13;

public class Books2 {
		private String title;
		private String author;
		private int price;
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
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Books2(String title,String author,int price) {
			this.title=title;
			this.author=author;
			this.price=price;
		}

	
public void isvalid(String name,String password) {
if(name.equals("admin")&& password.equals("password")) {
	System.out.println("Unauthorized access");

	updatebook("vali","Gopal",1500);
}
else {
	System.out.println("Authentication failed");
}}

public void updatebook(String newtitle,String newauthor,int newprice) {
		this.title=newtitle;
		this.author=newauthor;
		this.price=newprice;
	}


	

}



