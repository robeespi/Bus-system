public class FleetBus{
	
	public Node head;

	FleetBus(){
		this.head = null;
	}

	public void addBus(Node newNode) {
		if(this.head != null){
			Node tmp = this.head;
			while(tmp.next != null){
				tmp = tmp.next;
			}
			tmp.next = newNode;
		} else{
			this.head = newNode;
		}
	}

	public Node find(int query){
		if(this.head != null){
			Node tmp = this.head;
			do{
				if(tmp.bus_ == query)
					return tmp;
				tmp = tmp.next;
			}while(tmp != null);
		}
		return null;
	}
}