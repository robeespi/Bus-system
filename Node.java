public class Node {
    public Node next;
    public Bus bus_;

    public Node(Bus bus_) {
        this.bus_ = bus_;
        this.next = null;
    }

    
    public void printNode() {
        System.out.println("id: "+ this.bus.getBusId());
    }
}