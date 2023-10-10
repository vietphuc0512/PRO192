/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.slot41_3;
import java.util.*; 
import java.util.Scanner;
public class Slot41_3 {

    public static void main(String[] args) {
       List<String> list = new ArrayList<String>();  
       Scanner sc = new Scanner(System.in);
       list.add("Nguyen");
       list.add("Tran");
       list.add("Viet");
       list.add("Phuc");
       System.out.println("Nhap ho va ten: ");
       String name = sc.next();
       for (int i =0; i < list.size();i++)
       {
           if ( list.get(i) == name)
           {
               System.out.println("Yes");
               return;
           }
       }
        System.out.println("No");
    }
}
