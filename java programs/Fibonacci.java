/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
import java.util.*;
/**
 *
 * @author HP
 */
public class Fibonacci {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a=0,b=1,c;
         System.out.println(a);
          System.out.println(b);
        
        for(int i=2;i<n;i++){
              c=a+b;
             System.out.println(c);
             a=b;
             b=c;
           
            
            
        }
        
       
        
    }
    
}
