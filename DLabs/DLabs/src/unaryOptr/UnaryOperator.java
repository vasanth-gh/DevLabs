//LAB2

package unaryOptr;

public class UnaryOperator {

	public static void main(String[] args) {
		int num = 100;
		int x = 10;
		int res;
		
		System.out.println("Number = " + num);
		
		System.out.println("------------------------");
		
		System.out.println("Post Increment (Number++) : " + num++);
				
		System.out.println("Pre Increment (++Number) : " + ++num);
				
		System.out.println("Post Decrement (Number--) : " + num--);
				
		System.out.println("Pre Decrement (--Number) : " + --num);
				
		System.out.println("Complement (!true) : " + !true);
		
		System.out.println("Complement (!false) : " + !false);
		
		System.out.println("------------------------");
		
		System.out.println("x = " + x);
		res = x + x++ + x++ + x;
		System.out.println("Result (x + x++ + x++ + x)/(10 + 10 + 11 + 12) : " + res);
		
		System.out.println("------------------------");
		
		x = 10;
		System.out.println("x = " + x);
		res = x + ++x + x++ + x;
		System.out.println("Result (x + ++x + x++ + x)/(10 + 11 + 11 + 12) : " + res);
		
		System.out.println("------------------------");
		
		x = 10;
		System.out.println("x = " + x);
		res = x + --x + --x + x;
		System.out.println("Result (x + --x + --x + x)/(10 + 9 + 8 + 8) : " + res);
		
		System.out.println("------------------------");
		
		x = 10;
		System.out.println("x = " + x);
		res = x + x-- + --x + x;
		System.out.println("Result (x + x-- + --x + x)/(10 + 10 + 8 + 8) : " + res);
		
		System.out.println("------------------------");
		
	}
	
}