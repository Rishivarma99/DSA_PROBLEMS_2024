
// QUESTION : (16-FEB)
// SET THE KTH BIT FROM RIGHT TO 1 AND GET THE NEW NUMBER 

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class problem1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        
// APP 1 : HERE PROBLEM OCCURS IF THE KTH BIT IS ALREADY 1 
//         int bit =1;
//         bit = bit<<k;
//         n = n ^ bit ;         
//         long extraValue = pow1(2,k);
//         long res = n + extraValue ; 
//         System.out.println(res);

// APP 2 : USING OR OPERATION 
        int ans  = n | 1<<k ;
        System.out.println(ans);
    }
// TO CALULATE THE POWER 
    public static long pow1(int n , int k){    
        long number = 1 ;
        for(int i=1;i<=k;i++){
            number = number * n;
        }
        return number ; 
    }
}
