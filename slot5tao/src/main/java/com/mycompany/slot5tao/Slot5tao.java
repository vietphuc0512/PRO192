/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.slot5tao;
import java.util.Scanner;
class Person{
    String name, email,sex,phone,add;
    int age;
public void getInformation(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ten: ");
    name = sc.nextLine();
    email = sc.nextLine();
    age = sc.nextInt();
    sex = sc.nextLine();
    phone = sc.nextLine();
    add = sc.nextLine();
}
public void display(){
    System.out.println("name: " + name);
    System.out.println("email: " + email);
    System.out.println("age: " + age);
    System.out.println("sex: " + sex);
    System.out.println("phone: " + phone);
    System.out.println("add: " + add);
}
}
public class Slot5tao {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.getInformation();
        p1.display();
    }
}
