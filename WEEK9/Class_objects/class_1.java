/*
 * JAVA CLASSES AND OBJECTS : 
   
 ->CONSTRUCTOR : Can have multiple having diff in arguments type or no of arguments
 ->
 */
package Class_objects;
public class class_1 {
     
    public static void main(String[] args) {
         
        Pair p1 = new Pair(10,'v');

        System.out.println(p1.x);
        System.out.println(p1.ch);

    }
    // CLASS PAIR 
    public static class Pair {
     int x ;
     char ch ; 
    //  EMPTY CONST
    Pair(){

    }
    // Constuctor 1 
     Pair (int v1 , char v2){
        x = v1;
        ch = v2 ; 
     }
    //  Constructor 2 
     Pair(int v1){
        x= v1 ;
     }
    }
    
    
}
