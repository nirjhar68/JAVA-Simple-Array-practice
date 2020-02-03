import java.util.*;

public class LearnigArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values = new int[10];
		//Array variable must have a dimension or an initialization
		// Try to remove the size of the array, and you will see and error
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<9; i++) {
			values[i] = i+1;
			System.out.println(values[i]);
		}
		
		String [] name = new String[] {"Nuhel", "Muhammad", "Wadeed"}; //initializing the string from the null character
		System.out.println(name[3-1]);
		
		
		//Control flow
		
		float tempFlag;
		int favoriteTemp = 60;
		String myOpinion = null;
		System.out.println("What is the temperature today?");
		tempFlag = input.nextFloat();
		input.close();
		if(tempFlag < favoriteTemp && tempFlag > 50) {
			myOpinion = "I kinda like it!!";
			System.out.println(myOpinion);
		}else if(tempFlag > favoriteTemp || tempFlag < 50){
			myOpinion = "I don't like it!";
			
			System.out.println(myOpinion);
		}else {
			tempFlag = 0;
			System.out.println("No temperature entered.");
		}
	

	}
}