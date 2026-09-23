/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab1;

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
    
    int orderCounter = 0;
    while (orderCounter < nums.length) {
        System.out.println(nums[orderCounter]);
        ++orderCounter;
    }
    int reverseCounter = 0;
    while (reverseCounter < nums.length){
        System.out.println(nums[nums.length - (reverseCounter + 1)]);
        ++reverseCounter;
    }
    System.out.println(lab.increment(1));
    System.out.println(lab.max(1,3));
    System.out.println(lab.min(12, 3));
    System.out.println(lab.sum(nums));
    System.out.println(lab.average(nums));
    System.out.println(lab.max(nums));
    System.out.println(lab.min(nums));
  }
}     
