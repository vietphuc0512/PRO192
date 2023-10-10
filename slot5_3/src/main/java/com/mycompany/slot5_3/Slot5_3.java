/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.slot5_3;
import java.util.Scanner;

public class Slot5_3 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = 0;
            try{
            System.out.println("Nhap vao so nguyen a: ");
            a = sc.nextInt();
            }
        catch (Exception ex){
            System.out.println("Nhap du lieu sai");
        }
            System.out.println("a = " + a);
    }
}