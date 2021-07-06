import java.util.*;

class SubStringSizeChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String in = input.nextLine();
		
		String result = "";
		
		ArrayList<Character> substring1 = new ArrayList<>();
		
		ArrayList<Character> substring2 = new ArrayList<>();
		
		int index = 0;
		
		while (index < in.length()){
			if (index>0){
				if (in.charAt(index)>=in.charAt(index-1)){
					substring1.add(in.charAt(index));
				}
				else if (in.charAt(index)<in.charAt(index-1)){
					if (substring1.size() > substring2.size()){
						substring2.clear();
						substring2.addAll(substring1);
					}
					substring1.clear();
					substring1.add(in.charAt(index));
				}
			}
			else{
				substring1.add(in.charAt(index));
			}
			index++;
		}
		
		for (int i=0; i<substring2.size(); i++){
			result = result + substring2.get(i);
		}
		
		System.out.println("Maximum consecutive substring is: " + result);
		
	}
}