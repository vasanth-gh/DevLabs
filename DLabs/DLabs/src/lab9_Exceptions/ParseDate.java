package lab9_Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseDate {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter date in this format dd/mm/yyyy : ");
		Scanner sc = new Scanner(System.in);
		String dte = sc.nextLine();
		
		SimpleDateFormat parser = new SimpleDateFormat("dd/mm/yyyy");
        Date date = null;
		try {
			date = parser.parse(dte);
		} catch (ParseException e) {
			System.out.println("Not in the required date format");
			e.printStackTrace();
		}
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
        String formattedDate = formatter.format(date);
        System.out.println(formattedDate);
		
		
	}

}