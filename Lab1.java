/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;



class Lab1{
    
    public int increment(int num){
        return ++num;
    }
    
    public int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
    
    public int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }
    
    public int sum(int[] numbers) {
        int output = 0;
        for (int i = 0; i < numbers.length; i++){
            output += numbers[i];
        }
        return output;
    }
    
    public double average(int[] numbers){
        double result = 0;
        for (int number : numbers) {
            result += number;
        }
        result = (result/numbers.length);
        return result;
    }
    
    public int max(int[] numbers) {
        //first line returns 0 if given an empty array to avoid errors
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        return result;
    }
    
    public int min(int[] numbers){
        //see max for explanation of first line
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < result){
                result = numbers[i];
            }
        }
        return result;
    }            
}