import java.util.Scanner;

//Calling a package for exception handling
import java.util.InputMismatchException; 

public class Main {
    
    public static void initializeFleet(FleetBus flota){
        int[] busId = {"032", "098", "076", "021", "042"};
        int[] capacity = {"30", "40", "50",  "70", "80"};
        int[] numberOfSeatsAvaliable = {20,50,20,40,30};
        Seat[] seat1 = new Seat[20];
        Seat[] seat2 = new Seat[50];
        Seat[] seat3 = new Seat[20];
        Seat[] seat4 = new Seat[40];
        Seat[] seat5 = new Seat[30];
        Seat[][] seat={seat1, seat2, seat3, seat4, seat5};
        // Check the length for each array is equal
        if(!(busId.length == capacity.length && numberOfSeatsAvaliable.length == seats.length)){
            System.out.println("Failed to initialize data.");
            return;
        }
        // Initialize data into service center
        for(int i=0; i<busId.length; i++){
            System.out.println(busId.length);
            Bus bus_ = new Bus(busId[i], capacity[i], numberOfSeatsAvaliable[i], seats[i]);
            flota.addBus(new Node(bus_));
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String getHeader(boolean toPrint){
        String ans = "\n\n\n";
        ans += "===============================================================================" + "\n";
        ans += ":: Bus Reservation System                                                    ::" + "\n";
        ans += "===============================================================================" + "\n";
        if(toPrint)
            System.out.println(ans);
        return ans;
    }

    public static void printSubHeader(String subHeader){
        getHeader(true);
        String str = ":: " + subHeader + "\n";
        System.out.println(str);
    }

    public static void printScreenMessage(String message){
        String ans = getHeader(false) + "\n\n";
        ans += "::            " + message + "\n\n";
        System.out.println(ans);
    }

    public static void exitMessage(){
        clearScreen();
        printScreenMessage("Thank you!!");
    }

    public static void displayMenu(){
        String ans = getHeader(false);
        ans += ":: Options:                                                                  ::" + "\n";
        ans += ":: 1. Add Bus                                                                ::" + "\n";
        ans += ":: 2. Reservation                                                            ::" + "\n";
        ans += ":: 3. Show Buses Information                                                 ::" + "\n";
        ans += ":: 0. Exit                                                                   ::" + "\n";
        ans += "===============================================================================" + "\n";
        System.out.println(ans);
    }

    public static int getOption(Scanner inputScan, int [] optionsAvailable){
        String ans = ":: Your option: ";
        System.out.println(ans);
        String _input = inputScan.nextLine();
        int _option = Integer.parseInt(_input);
        for(int i = 0; i < optionsAvailable.length; i++)
            if(_option == optionsAvailable[i])
                return _option;
        return -1;
    }

    public static String getInput(Scanner inputScan, String question){
        System.out.println(question);
        String _input = inputScan.nextLine();
        return _input;
    }

    public static void waitInput(Scanner scan){
        String ans = "\n\n\n";
        ans += "                        Press any key to continue . . .      " + "\n";
        ans += "===============================================================================" + "\n";
        System.out.println(ans);
        scan.nextLine();
    }

    public static void tryAgain(Scanner scan){
        clearScreen();
        String ans = getHeader(false);
        ans += ":: Your input is invalid, please select ::" + "\n";
        ans += ":: a valid option.                      ::" + "\n";
        ans += "===============================================================================" + "\n";
        System.out.println(ans);
        waitInput(scan);
    }

    public static boolean performAction(FleetBus flota, int _option, Scanner inputScan){
        String query = "";
        String id = "";
        switch(_option){
            case 1:
                clearScreen();
                printSubHeader("Add Bus");
                String _busId = getInput(inputScan, "Enter Bus Id: ");
                int busId = Integer.parseInt(_busId);
                String _capacity = getInput(inputScan, "Please enter the capacity of the bus: ");
                int capacity = Integer.parseInt(_capacity);
                String _numberOfSeatsAvaliable= getInput(inputScan, "Please enter the capacity of the bus: ");
                int numberOfSeatsAvaliable = Integer.parseInt(_numberOfSeatsAvaliable);


                flota.addBus(name, phoneNumber, Integer.parseInt(triageLevel), location);
                waitInput(inputScan);
                break;
            case 2:
                break;
            case 3:
                break;

            case 0:
                exitMessage();
                return false;
        }
        return true;

    }

    public static void main(String[] args){
        FleetBus flota = new FleetBus();
        initializeSystem(flota);
        Scanner inputScan = new Scanner(System.in);
        int [] options = new int []{1,2,3,0};
        boolean _continue = true;
        while(_continue){
            clearScreen();
            displayMenu();
            int _option = getOption(inputScan, options);
            if(_option != -1)
                _continue = performAction(flota, _option, inputScan);
            else
                tryAgain(inputScan);
        }
    }
}
