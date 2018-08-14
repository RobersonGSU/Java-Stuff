
public class LinkedList {

private Node head;

   public void insertNodeAtFront(int data){
   
      Node newNode = new Node(data);
      newNode.setNextNode(this.head);
      this.head = newNode;
   }


   public String toString(){
   
      
      String result = " {  " ;
      Node current = this.head;
      
      while(current != null){
      
      result += current.toString() ;
      
      if(current.getNextNode()!=null){
      result+= " , ";
      
      }
      current = current.getNextNode();
      
      }
      result+= " } ";
   return result;
   }

}



