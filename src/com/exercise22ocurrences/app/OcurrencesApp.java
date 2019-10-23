package com.exercise22ocurrences.app;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class OcurrencesApp {

	public static void main(String[] args) {
		//Constants declaration
		final int ELEMENTS = 20;
		
		//Variables Declaration
		
		//Objects Declaration
		Scanner input = new Scanner(System.in);
		Random randomNumbers = new Random(System.nanoTime());
		HashMap<Integer, Integer> myHash = new HashMap<Integer,Integer>();
		
		int[] myArray = new int[ELEMENTS];
		for(int i=0;i<ELEMENTS;i++) {
			myArray[i] = randomNumbers.nextInt(5);
		}
		//Process
		for(int element : myArray) {
			if(myHash.containsKey(element)) {
				myHash.put(element, myHash.get(element)+1);
			}
			myHash.putIfAbsent(element,1);
		}
		System.out.println(myHash);
		//Visualization
		for(int i : myArray) {
			System.out.print(i+" ");
		}
		
	}

}
