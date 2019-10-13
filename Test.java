//calling a package
import java.util.Scanner;

public class Test{

    FleetBus list = new FleetBus();
    Scanner inputScan = new Scanner(System.in);

    displayMenu();


    public static void displayMenu(){
        String ans1 = ":: 1. Add a bus                                                              ::" + "\n";
        String ans2 = ":: 2. Reservation                                                            ::" + "\n";
        String ans3 = ":: 3. Show Buses Information                                                 ::" + "\n";
        String ans4 = ":: 4. Exit                                                                   ::" + "\n";
        String ans5 = ":: Enter your choice (a number)                                              ::" + "\n";
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        String input_ = inputScan.nextLine();
        int _option = Integer.parseInt(input_);
        enterToTheOption(_option);
    }

    public static void addBus(){ 
        System.out.println("Enter Bus Id: ");
        int _input_busid = inputScan.nextInt();
        System.out.println("Enter capacity: ");
        int _input_capacity = inputScan.nextInt();
        System.out.println("Enter number of seats: ");
        int _input_numberOfSeats = inputScan.nextInt();
        Bus bus_ = new Bus(_input_busid,_input_capacity,_input_numberOfSeats);
        System.out.println("Bus added")
    }

    public static void reservation(){
        System.out.println("Enter passenger Name: ");
        String input_passenger = inputScan.nextLine();
        System.out.println("Enter Bus Id: ");
        int input_busid = inputScan.nextInt();
        Node bus = list.find(input_busid);
        System.out.println("Enter Seat Id: ");    
        int input_seatId = inputScan.nextInt();
        int seat_index= bus.searchIndexSeat(input_seatId);
        bus.makingReservation(seat_index,input_seatId,input_passenger);
    }

    //public static void showBusesInfo(){

    //}

    public void enterToTheOption(_option){
    switch(_option){
            case 1:
                addbus();
                break;
            case 2:
                clearScreen();
                printSubHeader("Assign Ambulance");
                serviceCenter.assignAmbulanceForPatient();
                waitInput(inputScan);
                break;
            case 3:
                clearScreen();
                printSubHeader("Assign Ambulance by Id");
                
                //Using try and catch for avoid mistakes entering Id
                try{
                String idd = getInput(inputScan, "Please enter Id of patient: ");
                serviceCenter.assignAmbulanceForPatientById(Integer.parseInt(idd));
                }catch (IllegalArgumentException e){
                    System.out.println(" Id does not exist");
                    displayMenu();
                }
                waitInput(inputScan);
                break;
            case 4:
                clearScreen();
                printSubHeader("Check Position By Id");
                String iddd = getInput(inputScan, "Please enter Id of patient: ");
                serviceCenter.checkPositionById(Integer.parseInt(iddd));
                waitInput(inputScan);
                break;
            case 5:
                clearScreen();
                printSubHeader("Waiting List");
                serviceCenter.printWaitingList();
                waitInput(inputScan);
                break;
            case 0:
                exitMessage();
                return false;
        }
        return true;

    }    
}