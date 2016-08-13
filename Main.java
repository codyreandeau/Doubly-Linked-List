public class Main {
  
  public static void main(String[] args) {
    
    DLinkedList list = new DLinkedList();
      
      list.add("Hello");
      list.add("Name");
      list.add("Cody");
      list.insert(1, "My");
      list.insert(3, "Is");
      list.insert(5, "Reandeau");
      
      list.print();
      
      System.out.println();
      System.out.println("------------------------------");
      
      list.remove(0);
      list.remove(4);
      list.print();
    
  }
}