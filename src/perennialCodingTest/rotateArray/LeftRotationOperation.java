package perennialCodingTest.rotateArray;


/*Problem statement 1:-
 
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
For example, if 2 left rotations are performed on array [42, 24, 71, 19] , then the array would become [71, 19, 42, 24].
Given an array of n integers and a number d, perform d left rotations on the array. Then print the updated array as a single line of
space-separated integers.*/



public class LeftRotationOperation {
	
	//Method for Shifting Left
	
	void leftRotate(int [] numbers,int numberOfRoation, int n )
	{
		//int n= The Number Which Get Rotated
		//iterating the Array
		
		for(int i=0;i<numberOfRoation;i++)
			leftRoatebyOnetime(numbers,n);
	}
	
	void leftRoatebyOnetime(int [] numbers,int n)
	{
		int i,temp;
		temp=numbers[0];
		
		for(i=0;i<n-1;i++)
			numbers[i]=numbers[i+1];
		numbers[i]=temp;
	}
	
	void printArray(int [] numbers,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(numbers[i] + " ");
	}
	
	

	public static void main(String[] args) {
	
		try {
		LeftRotationOperation leftRotate =new LeftRotationOperation();
		int numbers [] = {42,24,72,19};
		leftRotate.leftRotate(numbers,2,3);
		leftRotate.printArray(numbers,42);
		}catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("\n Exception handeled ");
		}

	}

}
