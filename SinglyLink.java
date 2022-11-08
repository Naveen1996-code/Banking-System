
class SinglyLink {
	Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			}
	}
	
	//add - first,last
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next !=null) {
		currNode= currNode.next;
		}
		currNode.next=newNode;
	}
	
	public void printList() {
		if(head==null) {
			return;
		}
		Node currNode=head;
		while(currNode !=null) {
			System.out.print(currNode.data + " - ");
			currNode=currNode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		SinglyLink list=new SinglyLink();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("List");
		list.printList();
		list.addFirst("This");
		list.printList();
	}
}
