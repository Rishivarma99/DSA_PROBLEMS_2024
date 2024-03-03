/* CLASS : 29 FEB AND  DATE 03-MAR 
LINKED LIST : 
-> TO PRINT A LINKED LIST IN JAVA
   tc : O(N) sc : O(1) 

->InsertAtStart : to insert at start 
  tc : o(1) sc : o(1)

->insertAtEnd : TO INSERT AT END 
  Need to traverse last node Tc : O(n) sc: O(1)

->insertAtIndex : after the kth node 
  to reach the kth node we need k-1 jumps from head 
  Tc : o(k) == O(n) sc : O(1)   
 */
package Linded_list;

public class SingleLinL_1 
{
   //    NODE CREATION 
    public static class node{
    int val ; 
    node next ; 
    
    node(int v1){
        val = v1 ;
    } }

    // MAIN FUNCTION 
    public static void main(String[] args) {
       
    node head = new node(10);
    node n1 = head;
    node n2 = new node(20);
    node n3 = new node(30);
    
    n1.next = n2 ;
    n2.next = n3 ;
    
    printLinkedList(head);
    head = InsertAtStart(head,5);
     head = insertAtEnd(head, 40);
    head = insertAtIndex(head, 25, 3);
    head = insertAtIndex(head, 25, 0);
    printLinkedList(head);
    int size = findSize(head);
System.out.println("SIZE : " + size);
    }
    
    // PRINT LL 
    public static void printLinkedList(node head){
      
        System.out.println("Printing LL" );
        for(node temp = head ; temp!=null ; temp = temp.next){
               System.out.print(temp.val + " ");
        }
        System.out.println();
        System.out.println();
       
    }

    // FIMD SIZE OF LL 
    public static int findSize(node head){
       int size = 0 ;
       node temp = head ; 
       for( ; temp!=null;temp = temp.next){
        size++ ;
       }
       return size ; 
    }

    //INSERT AT START 
   public static node InsertAtStart (node head,int value){
    node newNode = new node(value); // created node 
    newNode.next = head ;  // pointed neww to first posion of ll 
    head= newNode; // updated new head as newNode 
    System.out.println("LL AFTER INSERT AT HEAD VALUE:" + value);
    printLinkedList(head);
    return head;
   }  
   
    // INSERT AT END 
    public static node insertAtEnd(node head, int value){
        node newNode = new node(value);
        node temp = head ;
        for( ; temp.next!=null ; temp = temp.next){
            // System.out.println(temp.val); // 10 20 
        }
        // MOW TEMP AT LAST LL 
        temp.next= newNode ; 
        System.out.println("LL AFTER INSERTING AT LAST OF VALUE : " + value);
        printLinkedList(head);
        return head ; 
    }

    //INSERT AT A INDEX AFTER K NODES 
    public static node insertAtIndex(node head , int value , int k){ 
       if(k==0){
        return InsertAtStart(head, value);
       } 
    //    if k at last idx then no problem 

       node newNode = new node(value);
       node temp = head ; 
       int cnt = 1 ;  
       while(cnt<=k-1){ // FORM 1 WE NEED K-1(2) JUMPS TO REACH KTH NODE 
        temp = temp.next; // 1-2 (JUMP 1 ) 2-3(JUMP 2)
        cnt++ ; 
       }
       newNode.next = temp.next;
       temp.next= newNode; 
       System.out.println("LL AFTER INSERTING AT INDEX OF VALUE : " + value);
       printLinkedList(head); 
       return head ; 
    }


}
