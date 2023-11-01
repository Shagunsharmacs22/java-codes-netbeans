/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaydigits;
import java.util.*;

/**
 *
 * @author HP
 */
public class Displaydigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        int n,r,count=0;
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
                    System.out.println(r);
                    n=n/10;
                    count++;
                    
        }
        System.out.println("count digit of number is:"+count);
    }
    
}
