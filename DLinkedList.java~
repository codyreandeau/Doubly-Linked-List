public class DLinkedList {
  
  private Node head;
  private Node tail;
  
/**
  * Method to add items to our linked list
  */
  public void add(String data) {
    //Check if head is null, if so, create head
    if(isEmpty()) {
      head = new Node(data);
      tail = head;
    }else{
    //if head is not null, add to the end of the list
      tail.setNext(new Node(data, null, tail));
      tail = tail.getNext();
    }
  }
  
/**
  * Method to insert items to our doubly linked list
  */
  public void insert(int index, String data)
  {
    //Check if index is less than 0, or greater than the size of the list
    if(index < 0 || index > size()) {
      return;
    }
    //Check if index is equal to 0
    if(index == 0) {
      Node temp = head;
      head = new Node(data, temp, null);
      if(temp != null) {
        temp.setNext(head);
      }
      if (tail == null) {
        tail = head;
      }
        return;
      }
    
    //Find the index of where the node should be placed by finding the predecessor
    Node pre = head;
    for(int i=1; i <= index -1; i++) {
      pre = pre.getNext();
    }
    
    //Insert the new node within the list
    Node suc = pre.getNext();
    Node newNode = new Node(data, suc, pre);
    pre.setNext(newNode);
    //Check if the successor is null 
    if(suc == null){
      tail = newNode;
    }else{
      suc.setPrev(newNode);
    }
  }
  
 /**
   * Method to check if each node is empty
   */
    public boolean isEmpty() {
    return head == null;
  }
    
 /**
   * Method that records the size of the list
   */
  public int size() {
    int counter = 0;
    Node temp = head;
    while(temp!=null) {
      counter++;
      temp = temp.getNext();
    }
    return counter;
 }
    
 /**
   * Method to print out all items in the list
   */
  public void print() {
    Node temp = head;
    //print out nodes until we reach null
    while(temp!= null)
    {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }
  }
}