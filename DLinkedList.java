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
   * Method to check if each node is empty
   */
    public boolean isEmpty() {
    return head == null;
  }
}