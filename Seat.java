//Defining a class
public class Seat{
	
	//Declaring variables
	protected String seatId;
	protected boolean isReserved;
	protected String passengerName;

	//Non Parametric constructor
	public Seat(){
		this.seatId=0;
		this.passengerName="";
		this.isReserved=false;
	}


	//Parametric constructor
	public Seat(String passengerName){
		this.seatId=seatId;
		this.passengerName=passengerName;
		this.isReserved=true;
	}

	//Implementing mutators
	public void setSeatId(int seatId){
		this.seatId=seatId;
	}

	public void setIsReserved(boolean isReserved){
		this.isReserved=isReserved;
	}

	public void setPassengerName(String passengerName){
		this.passengerName=passengerName;
	}

	//Implementing accesors
	public int getSeatId(){
		return this.seatId;
	}

	public boolean getIsReserved(){
		return this.isReserved;
	}

	public String getPassengerName(){
		return this.passengerName;
	}

	public void makeReservation(int input_seatId, String passenger){
		setPassengerName(passenger);
		setSeatId(input_seatId);
	}

	//cancelReservation(){

	//}
}