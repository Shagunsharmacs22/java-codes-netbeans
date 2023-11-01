/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap;
import java.util.*;

/**
 *
 * @author HP
 */
public class AP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(a);
            a=a+d;
        }
    }
    
}
