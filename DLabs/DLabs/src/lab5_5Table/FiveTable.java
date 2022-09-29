package lab5_5Table;

public class FiveTable {
	
	int num;
	
	public FiveTable(int num) {
		this.num = num;
	}
	
	public void multiply() {
		for(int i=1;i<=10;i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}

}
