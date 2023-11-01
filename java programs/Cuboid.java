/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboid;
import java.lang.*;
import java.util.*;


/**
 *
 * @author HP
 */
public class Cuboid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
         float l,b,h,area,volume;
         l=sc.nextFloat();
         b=sc.nextFloat();
         h=sc.nextFloat();
         area=2*l*b+2*b*h+2*h*l;
         volume= l*b*h;
         System.out.println("the area and volume of the cuboid is " +area +"\n "+volume);
         
                
      
    }
    
}
