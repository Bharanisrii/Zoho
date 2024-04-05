package assignment11.librarymanagement.members;

public class Member {
	private String name;
    private int memberId;
    private long phonenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Member(String name,int memberId,long phonenumber) {
		this.name=name;
		this.memberId=memberId;
		this.phonenumber=phonenumber;
	}
	

}
