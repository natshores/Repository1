package tutorial1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JTextArea;

public class UltimateShpargalka {
	public static void main(String[] args) {
		int myNumber; 			// declared int
		myNumber = 16; 			//initialized int
		short myShort = 32767; 	//initialized and declared at the same time max value for short
		long myLong = 5555555555555555555l;		//64 bit value
		byte myByte = 127;		//byte -128 to 127 2^8=256 max
		
		double myDouble = 2.23124; 
		float myFloat = 0.11f;
		
		char myCHar = 'y';		//character
		boolean myBoolean = true;// or false
		boolean loop = 4 < myNumber;// 
		
		String myString = "Leraning ";
		String my2ndString = "Java";
		String total = myString + my2ndString;
		
		int[] myIntArr = new int[3]; 	// 0,1,2 indexes
		myIntArr[0] = 1;				//length cannot be changed
		myIntArr[1] = 2;
		myIntArr[2] = 3;
		
		String[] myStrArr = {"First item for the enhanced for loop","qwe"};
		
		int lengthOfTheArr = myStrArr.length;
		
		//Enhanced for-loop
		for (String anOtherString : myStrArr) {
			System.out.println(anOtherString);
		}
		
		
		while (4 < myNumber) {
			if (myNumber % 2 < 1) {
				System.out.println(myNumber);
			}
			myNumber -= 1;
		}
		
		if (myNumber==16)
			System.out.println("Yes it's true");
		
		/*
		 * If inside of an while loop
		 * = assigns equality
		 * == tests equality
		 * != not equals to
		 * 
		 */
		for (int i = 0; i < 3; i++) { 		// (counter variable; 
											//	condition; 
											// 	condition to be executed every loop;)
			System.out.printf("Hi number %d %s%n", i, my2ndString); 
		}
		
		/*	Text formatting
		 * \t - tab
		 *  \n - new line
		 *  \\ - \
		 *    
		 *  %d is a location for an int i
		 *  also could be %s far a String
		 */
	
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();			//nextLine for Strings
		int numberEntered = scan.nextInt();		//netInt for the integers
		myDouble = scan.nextDouble();	//for doubles
		
		
		/*
		 * Before using scanner you have to import Java.util.Scanner
		 * scan is containing user input from key board
		 */
		
		int forDo = 5;
		
		do {
			System.out.println("Your Integer  just decreased by 1");
			forDo--;
		} while (forDo > 0);

		//do-while loop  will continue execute statement inside of the curly braces 
		// while statement after them is true
		
		switch (line) {
		case "start":
			System.out.println("Machine started");
			break;
		case "stop":
			System.out.println("Machine stopped");
			break;
		default:
			System.out.println("None of your options has been executed");
		}
		
		Person vasya = new Person("Vasya", 23);
		Person lokh = new Person("Loshpet", 33);
		
		ArrayList<String> arrList = new ArrayList<String>(5);
		
		//The same we can do with the LinkedList
		//LinkedLists are better for multiple inserts and deletes from the middle of an array.
		//For rapid access to data ArrayLists are more preferable
		
		arrList.add("Red");
		arrList.add("Blue");
		arrList.add("Green");
		arrList.add("Yellow");
		arrList.remove("Yellow");
		arrList.contains("Red");	//returns true
		arrList.get(1); 			//returns item index 1
		arrList.size();				//returns size of the arrayList
		arrList.clear();			//clears all the elements in the arrayList
		
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("Amy", 154);//cannot have duplicate keys
		points.put("Dave", 42);//if you'll add a duplicate key it will override the value
		points.put("Rob", 733);
		System.out.println(points.get("Dave")); //returns 42
		
		
		System.out.println("Hello world " + myNumber);
		System.out.println(2^32);
		System.out.println(total);
		System.out.println(lengthOfTheArr);
		JTextArea jt 
		
		vasya.name = "Vasya";
		vasya.age = 23;
		vasya.speak();
		lokh.speak();
		
		
	}
	
}


//

