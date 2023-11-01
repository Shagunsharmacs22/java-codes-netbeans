/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package root;
import java.lang.*;
import java.util.*;
/**
 *
 * @author HP
 */
public class Root {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a,b,c,D;
        double r1,r2;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        D=(b*b)-(4*a*c);
        r1= (-b+(Math.sqrt(D)))/(2*a);
        r2=(-b-(Math.sqrt(D)))/(2*a);
        System.out.println("the roots of the quadratic equation is "+ r1+" "+r2);
        


        
        
        
        
                
    }
    
}
