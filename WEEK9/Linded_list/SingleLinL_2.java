/**
  DELETION IN SINGLE LINKED LIST : 
  ->deleteAtStart : just need to update the head 
    Tc: o(1) sc:o(1)

  ->deleteAtEnd : We use pre to go to before the last node 
    Tc : O(n) ; sc : O(1)
    
  ->deleteAtIndex : delete a particular index (1-indexed)
    tc : o(n)
    *-> We use 2 pointers pre(points to before node) and cur(points on delete node)
    *->To cur point to delete node we need k-1 jumps from (cnt=1)   

   ->Reverse the ll : 
    Tc:O(n) 
 */

package Linded_list;

public class SingleLinL_2 {
     
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
        int size =0 ;
        printLinkedList(head);
        head = InsertAtStart(head,5);
         head = insertAtEnd(head, 40);
         size = findSize(head);
        System.out.println("SIZE : " + size);
        System.out.println("**********DLETION START**********"); 
        // // head = deleteAtEnd(head); 
        // head = deleteAtIndex(head, 1);
        head = reverse1(head);
        printLinkedList(head);

        }

        public static node deleteAtStart(node head){
            node temp = head ;
            head = head.next ; 
            temp.next=null;
            printLinkedList(head);
            return head ;
        }
        public static node deleteAtEnd(node head){
            // node pre = null ;
            // node cur = head ; // NO NEED CUR AS CARBAGE COLLECTOR IS THER EIN JAVA 
            // for( ; cur.next!=null;cur= cur.next){
            //        pre = cur ; 
            // }
            node pre = head ; 
            for( ; pre.next.next!=null ; pre= pre.next){

            }
            pre.next = null ;
            printLinkedList(head);
            return head ; 
        }
        public static node deleteAtIndex(node head , int k){
            if(k==1){ // deltet fist node 
                 return deleteAtStart(head);
            }
            int cnt =1 ;
            node pre = null ;
            node cur = head;
            while(cnt<=k-1){ // To go to prev node we need k-1 jumps 
                pre = cur ; 
                cur= cur.next;
                cnt++ ; 
            }
            pre.next = cur.next ; 
            cur.next = null ; 
            printLinkedList(head);
            return head ; 
        }

        public static node reverse1(node head){
            node pre= null;
            node cur = head ;
            
            while(cur!=null){
                node temp = cur.next ; 
                cur.next= pre ; 
                pre = cur ; 
                cur = temp ;
            }
            
            return pre ; 
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
}
