package assignmentTwo;

public class NumFormatExcep {

	public static void main(String[] args) {
		
		String s1 = "20s";
		System.out.println("String that is converedted to int : " + s1);
		
		try {
			int num = Integer.parseInt(s1);
			System.out.println("After converting to int: " + num);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}	
	}
}
