package assignment8;

public class Flight {
	private String FlightNumber;
	private String departurecity;
	private String destinationcity;
	private int NumberOfseats;
	private double TicketPrice;
	public String getFlightNumber() {
		return FlightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}
	public String getDeparturecity() {
		return departurecity;
	}
	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}
	public String getDestinationcity() {
		return destinationcity;
	}
	public void setDestinationcity(String destinationcity) {
		this.destinationcity = destinationcity;
	}
	public int getNumberOfseats() {
		return NumberOfseats;
	}
	public void setNumberOfseats(int numberOfseats) {
		NumberOfseats = numberOfseats;
	}
	public double getTicketPrice() {
		return TicketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		TicketPrice = ticketPrice;
	}

}
