/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testarray;

import java.util.Arrays;

/**
 *
 * @author HASARANGA
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer [] a= new Integer [] {9,7,11,8,1};
        int temp;
        
        System.out.println("Before swapping");
        System.out.println(Arrays.deepToString(a));
        
        temp = a[4];
        a[4] = a[3];
        a[3] = temp;
        
        System.out.println("After swapping");
        System.out.println(Arrays.deepToString(a));
       
    }
    
}
