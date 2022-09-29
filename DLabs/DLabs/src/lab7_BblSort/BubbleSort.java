package lab7_BblSort;

public class BubbleSort {
	
	String[] arrStr = new String[5];
	String tempStr;
	
	public void asgnVal (String[] arr) {
		for(int a=0;a<arr.length;a++) {
			arrStr[a]=arr[a];
		}
	}
	
	public void bubbSort() {
		for(int i=0;i<arrStr.length;i++) {
			for(int j=1;j<(arrStr.length - i);j++) {
				if(arrStr[j-1].compareTo(arrStr[j]) > 0) {
					tempStr = arrStr[j-1];
					arrStr[j-1] = arrStr[j];
					arrStr[j] = tempStr;
				}
			}
		}
		System.out.println("Sorted String array :");
		for(String sa:arrStr) {
			System.out.println(sa);
		}
	}
	
	

}
