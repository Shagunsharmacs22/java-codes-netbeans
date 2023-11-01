/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armstrong;
import java.util.*;
import java.lang.Math.*;

/**
 *
 * @author HP
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        int n,temp,count=0,r;
        int sum=0;
        n=sc.nextInt();
        temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;
            
        }
        temp=n;
        while(n!=0){
            r=n%10;
            sum=sum+(int)(Math.pow(r,count));
            n=n/10;
            
        }
        if(temp==sum){
            System.out.println("Armstrong number ");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        
    }
    
}
