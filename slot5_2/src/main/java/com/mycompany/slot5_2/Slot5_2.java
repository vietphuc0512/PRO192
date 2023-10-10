/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.slot5_2;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class Slot5_2 {

    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (  b != 0)
            System.out.println ("a / b = " + (a / b));
        else
            System.out.println("Khong tinh duoc ket qua");
    }
    }
