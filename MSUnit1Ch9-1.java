/****************************************************************************
*MSUnit1Ch9.java
*Molina
*
*This class gets creates, sorts, prints, searches an array of random numbers.
******************************************************************************/

import java.util.Arrays;
import java.util.Scanner;
public class MSUnit1Ch9
{
	public static void main(String[] args)//main
	{

//Declare unsorted array
		int[] unsortedArray = new int[10]; // array size of 10


//Fill array with random numbers 1-20
		for (int i=0; i<unsortedArray.length; i++) //length property
   		{
   			unsortedArray[i] = (int)(Math.random()*20);
   		}//end for


//Copy array and sort
   				int[] sortedArray = new int[unsortedArray.length];
   				//declare sortedArray, same length as unsortedArray

				sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
				//copy unsortedArray to sortedArray

				Arrays.sort(sortedArray); //sort sortedArray



//Print Arrays
	System.out.println("UnsortedArray\t\tSortedArray"); //print titles

	for (int i=0; i<unsortedArray.length; i++)
	{
		System.out.println(unsortedArray[i] + "\t\t\t" + sortedArray[i]); //print arrays
	}



//Enter number to search
	System.out.printf("Please enter a number to search for: ");

	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt(); //integer entered will be num


//Search arrays using for each loop
	int index = -1; //default if index does not match num

		for (int i=0; i<unsortedArray.length; i++)
		{
			for (int a : unsortedArray) //for each loop
			{
				if (unsortedArray[i] == num)
				{
					index = i;
					System.out.println("Search value: " + num + " found at location "
										+ (index + 1 )+ " in the unsorted array");
					break;
				}//end if
			}//end for each
			for (int b : sortedArray) //for each loop
			{
				if (sortedArray[i] == num)
				{
					index= i;
					System.out.println("Search value: " + num + " found at location "
										+ (index + 1) + " in the sorted array");
					break;
				}//end if
			  }//end for each
			}//end for


	if (index == -1) // if index is still at default
			{
			System.out.println("Search value: " + num + " was not found");
			}

} //end main
} //end class MSUnit1Ch9

