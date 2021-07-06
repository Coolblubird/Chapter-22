//NOT FINISHED, JUST SAVING MY WORK. - Jordan Ashe 


import java.util.*;

class TwentyTwoDashThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String s1 = input.nextLine();
		
		System.out.println("Please enter another string: ");
		String s2 = input.nextLine();
		
		int index = 0;
		
		char[] temp = new char[s2.length()];
		
		if (s1.contains(s2)){
			while (index<s1.length()){
				if (s1.charAt(index) == s2.charAt(0)){
					s1.getChars(index, index+s2.length(), temp, 0);
					
					if (String.valueOf(temp).equals(s2)){
						break;
					}
				}
				
				index++;
			}
			
			System.out.println("Matched at index: " + index);
		}
		else{
			System.out.println("No match found.");
		}
		
		
	}
}