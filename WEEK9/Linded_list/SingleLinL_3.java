package Linded_list;

public class SingleLinL_3 {
    
    public static class node {
        int value ;
        node next ;

        node(int v1){
             value = v1 ;
        }
    }

    public static void main(String[] args) {
        
        node head1 = new node(10);
        node n1 = head1 ;
        node n2 = new node(20);
        node n3 = new node (30);
        node n4 = new node(40);
        n1.next = n2 ;
        n2.next = n3 ;
        n3.next = n4 ;
        int size1 = findSize(head1);
        
        node head2 = new node(100);
        node t1 = head2 ;
        node t2 = new node(200);
        node t3 = new node(300);
        node t4 = new node(400);
        node t5 = new node(500);
        int size2 = findSize(head1);
        t1.next = t2;
        t2.next = t3 ;
        t3.next = t4 ;
        t4.next = t5 ;

        // getmiddle1(head1,size1); 
        // getmiddle1(head2, size2);
        // getmiddle2(head1);
        // getmiddle2(head2);

        getmiddle3(head1);
        getmiddle3(head2);
        
        
    }
    public static int findSize(node head){
        int size = 0 ;
        node temp = head ; 
        for( ; temp!=null;temp = temp.next){
         size++ ;
        }
        return size ; 
     }
     public static void getmiddle1(node head , int size){

         int k = size/2 +1 ; 
        int cnt = 1 ;
        node temp = head; 
        while(cnt<=k-1){
            temp = temp.next ; 
            cnt++;
        }
        System.out.println("The middle node of LL is ");
        printLinkedList(head);
        System.out.println("The middle data is : " + temp.value); 

     }

     public static void getmiddle2(node head){
     
     node slow = head ;
     node fast = head.next ;
     while(fast!=null && fast.next!=null){
        slow = slow.next ;
        fast = fast.next ;
        if(fast!=null){
            fast = fast.next;
        }        
     }
     System.out.println("The middle node of LL is ");
        printLinkedList(head);
        System.out.println("The middle data is : " + slow.value);   
     
     }

     public static void getmiddle3(node head){
        // Observation : 
        // Even : fast never point to last l=node 
        // Odd: fast will point to last node 
        node slow = head ; 
        node fast = head;
        
        // fast.next=null -> for odd 
        // fast.next.next==null -> for even 
        while( fast.next!=null && fast.next.next!= null){
            slow = slow.next ;
            fast = fast.next ;
            if(fast!=null){
                fast=fast.next ; 
            }
        }
        if(fast.next!=null){  // not a odd case 
            // even hase 2 mid elements 
            // If we want the 2nd one
                slow = slow.next ; 
        }
        System.out.println("The middle node of LL is ");
        printLinkedList(head);       
        System.out.println("The middle data is : " + slow.value);   
     }

     public static void printLinkedList(node head){
          
        System.out.println("Printing LL" );
        for(node temp = head ; temp!=null ; temp = temp.next){
               System.out.print(temp.value + " ");
        }
        System.out.println();
        System.out.println();
       
    }


}
