
public abstract class HotelRoom {

	private String roomID;
	private int numOfBeds;
	private String featureSummary;
	private String roomType;
	private String roomStatus;

	public HotelRoom(String roomID, int numOfBeds, String featureSummary, String roomType, String roomStatus) {
		roomID = roomID;
		numOfBeds = numOfBeds;
		featureSummary = featureSummary;
		roomType = roomType;
		roomStatus = roomStatus;

	}

	public abstract void rent();

	HotelRoom hotelApartment = new HotelApartment();
//hotelApartment.rent();

	HotelRoom hotelSuite = new HotelSuite();
//hotelSuite.rent();

	
	
	
	
	

	
	
	
}
