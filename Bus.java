//Defining a class
public class Bus{
	
	//Declaring variables
	protected int busId;
	protected int capacity;
	protected int numberOfSeatsAvaliable;
	protected Seat[] seats;
	protected boolean busIsAvailable;

	//Parametric Constructor
	public Bus(int busId, int capacity, int numberOfSeatsAvaliable){
		this.busId=busId;
		this.capacity=capacity;
		this.numberOfSeatsAvaliable=numberOfSeatsAvaliable;
		this.seats= new Seat[numberOfSeatsAvaliable];
		this.busIsAvailable=true;
	}


	//Implementing mutators
	public void setBusId(int busId){
		this.busId=busId;
	}

	public void setCapacity(int capacity){
		this.capacity=capacity;
	}

	public void setNumberOfSeatsAvaliable(int numberOfSeatsAvaliable){
		this.numberOfSeatsAvaliable=numberOfSeatsAvaliable;
	}

	public void setSeats(Seat[] seats){
		this.seats=seats;
	}

	public void setBusIsAvailable(boolean busIsAvailable){
		this.busIsAvailable=busIsAvailable;
	}

	//Implementing accesors
	public int getBusId(){
		return this.busId;
	}

	public int getCapacity(){
		return this.capacity;
	}

	public int getNumberOfSeatsAvaliable(){
		return this.numberOfSeatsAvaliable;
	}

	public Seat[] getSeats(){
		return this.seats;
	}

	public boolean getbusIsAvailable(){
		return this.busIsAvailable;
	}

	public int searchIndexSeat(int input_seatId){
		Seat listofseats[]=this.getSeats();
		for(int i = 0; i < listofseats.length; i ++){
            
            //Condition to return the index if is founded
            if(listofseats[i].getSeatId()==input_seatId)
                return i;
        }
        return -1;
	}


	public void makingReservation(int seat_index, int input_seatId,String passenger){
		Seat temp=this.seats[seat_index];
		temp.makeReservation(input_seatId,passenger);
	}

	

	//cancelingReservation(){

	//}

	//printingBusInformation(){

	//}
}