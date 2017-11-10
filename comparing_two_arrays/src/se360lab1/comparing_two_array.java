/**
 * Course Homework: SE 360, 01 October 2017, Home
 * The duty is creating 2 arrays(10 elements in each)namely, first and second which involve random number between 1-10.
 * And comparing the elements of two arrays.
 * */
package se360lab1;

import java.util.Arrays;
//to generate random numbers :
import java.util.concurrent.ThreadLocalRandom;


public class lab {
	public static void main(String[] args){
		int[] first = new int[10]; 
		int[] second = new int[10];
//this for loop generates random numbers between 1-10 and assign those numbers into array until array is full:
		for(int i=0 ; i<first.length;i++){
			int rand1 = ThreadLocalRandom.current().nextInt(1,11);
			first[i] = rand1;
		}
		System.out.println(Arrays.toString(first));
		for(int i=0 ; i<second.length;i++){
			int rand2 = ThreadLocalRandom.current().nextInt(1,11);
			second[i] = rand2;
		}
	    System.out.println(Arrays.toString(second));
	    
	    int[] onlyFirst = new int[10];
	    int[] onlySecond = new int[10];
	    int[] both = new int[10];
//In array onlyFirst, there are numbers that exist in array first but not in array second.
//We have nested for loops here. 
//The code gets an element(temp) from first array starting from the first element and compare it with all elements of second array.
//if the numbers of first array and second array are equal, then the check variable is increased by one.
//After inner for loop finishes(you compare all the elements in the second array with temp), if the check variable is more than 0, that means temp variable also exists in the second array.
//But if not(check is zero), then temp only exists in array first.
//Same algorithm works for the other loops below.
	    int temp;
	    for(int i=0;i<first.length;i++){
	    	temp = first[i];
	    	int check = 0;
	        for(int k=0;k<second.length;k++){
	        	if(temp == second[k]){
	        		check = check + 1;
	        	}
	        }
	        if(check == 0){
	        	onlyFirst[i]= temp;
	        	
	        }  
	    }
	        /** Second Option :
	         * You can use this modified part of code if you do not want to allow repetition of numbers in onlyFirst array.
	         
	           if(check == 0){
	        	int count = 0;
	        	for(int p=0;p<onlyFirst.length;p++){
	        		if(temp == onlyFirst[p]){
	        			count = count+1;
	        		}
	        	}
	        	if(count == 0){
	        	onlyFirst[i]= temp;
	        	}
	        } */  
//In array onlySecond, there are numbers only exist in array second but not in array first.	    
	    for(int i=0;i<second.length;i++){
	    	temp = second[i];
	    	int check = 0;
	        for(int k=0;k<first.length;k++){
	        	if(temp == first[k]){
	        		check = check + 1;
	        	}
	        }
	        if(check == 0){
	        	onlySecond[i]= temp;
	        }  
	    }
//In array both, there are numbers both exist in arrays first and second.
	    for(int i=0;i<first.length;i++){
	    	int num = first[i];
	    	int check = 0;
	        for(int k=0;k<onlyFirst.length;k++){
	        	if(num == onlyFirst[k]){
	        		check = check + 1;
	        	}
	        }
	        if(check == 0){
	        	both[i]= num;
	        }  
	    }
	   
	    System.out.println(Arrays.toString(onlyFirst));
	    System.out.println(Arrays.toString(onlySecond));
	    System.out.println(Arrays.toString(both));
	   

	}

}


