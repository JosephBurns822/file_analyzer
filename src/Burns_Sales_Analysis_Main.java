import java.io.IOException;
import java.util.Scanner;

/* Joseph Burns
 * 9/21/2020
 * Sales Analysis
 * Description - The purpose of the program is to read over a text file and output information about it. Such as, the total for the weeks within the document.
 * The average of the weeks and even their days. The total of all the weeks combined and which week had the highest and lowest sales. The program uses the File_Analyzer class in order
 * to produce all the outputs. 
 */

public class Burns_Sales_Analysis_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Declaring the variables for the main method of the program 
		Scanner keyboard = new Scanner(System.in);
		String userFile; 
		
		// The user will be able to input a text file that they would want to be computed
		System.out.println("Enter the sales document you would like to compute:");
		userFile = keyboard.next();
		
		// The object is created with the File_Analyzer class
		File_Analyzer analyzedFile = new File_Analyzer(userFile);
		
		// These are all the fantastic outputs that will be given for the user in the end
		System.out.printf("Total sales for Week One are $%.2f\n", analyzedFile.getTotalSalesWeek1());
		System.out.printf("Total sales for Week Two are $%.2f\n", analyzedFile.getTotalSalesWeek2());
		System.out.printf("Total sales for Week Three are $%.2f\n", analyzedFile.getTotalSalesWeek3());
		
		System.out.printf("Average daily sales for Week One are $%.2f\n", analyzedFile.getAverageDailySales());
		System.out.printf("Average daily sales for Week Two are $%.2f\n", analyzedFile.getAverageDailySales2());
		System.out.printf("Average daily sales for Week Three are $%.2f\n", analyzedFile.getAverageDailySales3());
		
		System.out.printf("The total sales for every week is $%.2f\n", analyzedFile.getTotalAllWeeks());
		
		System.out.printf("The average of all the weekly sales $%.2f\n", analyzedFile.getAverageWeeklySales());
		
		System.out.println("The week with the highest amount of sales is week " + analyzedFile.getHighestSalesWeek());
		System.out.println("The week with the lowest amount of sales is week " + analyzedFile.getLowestSalesWeek());
		
		keyboard.close();	
	}
}
