import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * The File_Analyzer Class
 * @author iburn
 */
public class File_Analyzer {
	private double totalSalesWeek = 0.0;
	private double totalSalesWeek2 = 0.0;
	private double totalSalesWeek3 = 0.0;
	private double averageDailySales;
	private double averageDailySales2;
	private double averageDailySales3;
	private double totalAllWeeks;
	private double averageWeeklySales;
	private int highestSalesWeek;
	private int lowestSalesWeek;
	private Scanner theFile;
	private String[] fileLineArray;
	private String[] fileLineArray2;
	private String[] fileLineArray3;

	
	/**
	 * @param inputFile - The user input file that was given in the main method
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public File_Analyzer(String inputFile) throws IOException{
		File file = new File(inputFile);
		theFile = new Scanner(file);
	}

	/**
	 * @return totalSalesWeek - The total sales of the first week
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getTotalSalesWeek1() throws IOException{
		readingTheLines(theFile);
		findingTotalSalesEachWeek();
		return totalSalesWeek;
	}
	
	/**
	 * @return totalSalesWeek2 - The total sales of the second week
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getTotalSalesWeek2() throws IOException{
		readingTheLines(theFile);
		findingTotalSalesEachWeek2();
		return totalSalesWeek2;
	}
	
	/**
	 * @return totalSalesWeek3 - The total sales of the third week
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getTotalSalesWeek3() throws IOException{
		readingTheLines(theFile);
		findingTotalSalesEachWeek3();
		return totalSalesWeek3;
	}
	
	/**
	 * @return averageDailySales - The average sales of each day in the first week
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getAverageDailySales() throws IOException{
		readingTheLines(theFile);
		findingAverageDailySalesEachWeek();
		return averageDailySales;
	}
	
	/**
	 * @return averageDailySales2 - The average sales of each day in the second week
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getAverageDailySales2() throws IOException{
		readingTheLines(theFile);
		findingAverageDailySalesEachWeek();
		return averageDailySales2;
	}
	
	/**
	 * @return averageDailySales3 - The average sales of each day in the third week
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getAverageDailySales3() throws IOException{
		readingTheLines(theFile);
		findingAverageDailySalesEachWeek();
		return averageDailySales3;
	}
	
	/**
	 * @return totalAllWeeks - The total sales for all the weeks combined
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getTotalAllWeeks() throws IOException{
		readingTheLines(theFile);
		findingTotalAllWeeks();
		return totalAllWeeks;
	}
	
	/**
	 * @return averageWeeklySales - The average of the three weeks
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public double getAverageWeeklySales() throws IOException{
		readingTheLines(theFile);
		findAverageWeeklySales();
		return averageWeeklySales;
	}
	
	/**
	 * @return highestSalesWeek - The week with the highest sales produced 
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public int getHighestSalesWeek() throws IOException{
		readingTheLines(theFile);
		findHighestSalesWeek();
		return highestSalesWeek;
	}
	
	/**
	 * @return lowestSalesWeek - The week with the lowest sales produced 
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public int getLowestSalesWeek() throws IOException{
		readingTheLines(theFile);
		findLowestSalesWeek();
		return lowestSalesWeek;
	}
	
	/**
	 * @param file - the user input file
	 * @return theLineRead - true
	 * @throws IOException - Could throw an exception if the file isn't found
	 */
	public boolean readingTheLines(Scanner file)throws IOException{
		boolean theLineRead;
		theLineRead = theFile.hasNext();
		if(theLineRead){
			String fileLine = theFile.nextLine();
			fileLineArray = fileLine.split(",");
		}
		if(theLineRead){
			String fileLine2 = theFile.nextLine();
			fileLineArray2 = fileLine2.split(",");
		}
		if(theLineRead){
			String fileLine3 = theFile.nextLine();
			fileLineArray3 = fileLine3.split(",");
		}
		return theLineRead;
	}
	
	/**
	 * Sets the totals for each week with a for-each loop and adding the elements
	 */
	public void findingTotalSalesEachWeek(){
		for(String s : fileLineArray){
			totalSalesWeek += Double.parseDouble(s);
		}
	}
	public void findingTotalSalesEachWeek2(){
		for(String p : fileLineArray2){
			totalSalesWeek2 += Double.parseDouble(p);
		}
	}	
	public void findingTotalSalesEachWeek3(){
		for(String f : fileLineArray3){
			totalSalesWeek3 += Double.parseDouble(f);
		}
	}
	
	/**
	 * Finding the average of each week by dividing the length of each array with the total sales for that week
	 */
	
	public void findingAverageDailySalesEachWeek(){
		averageDailySales = totalSalesWeek / fileLineArray.length;
		averageDailySales2 = totalSalesWeek2 / fileLineArray2.length;
		averageDailySales3 = totalSalesWeek3/ fileLineArray3.length;
	}
	
	/**
	 * Getting the total of all three weeks together
	 */
	public void findingTotalAllWeeks(){
		totalAllWeeks = totalSalesWeek + totalSalesWeek2 + totalSalesWeek3;
	}
	
	/**
	 * Getting the average of all three weeks
	 */
	public void findAverageWeeklySales(){
		// There are 3 weeks to be used from the SalesData.txt 
		averageWeeklySales = totalAllWeeks / 3.0;
	}

	/**
	 * This if statement will locate the week with the highest sales from that week 
	 */
	public void findHighestSalesWeek(){
		if(totalSalesWeek > totalSalesWeek2 && totalSalesWeek > totalSalesWeek3){
			highestSalesWeek = 1;
		} else if(totalSalesWeek2 > totalSalesWeek && totalSalesWeek2 > totalSalesWeek3){
			highestSalesWeek = 2;
		} else{
			highestSalesWeek = 3;
		}
	}
	
	/**
	 * This if statement will locate the week with the least sales from that week
	 */
	public void findLowestSalesWeek(){
		if(totalSalesWeek < totalSalesWeek2 && totalSalesWeek < totalSalesWeek3){
			lowestSalesWeek = 1;
		} else if(totalSalesWeek2 < totalSalesWeek && totalSalesWeek2 < totalSalesWeek3){
			lowestSalesWeek = 2;
		} else{
			lowestSalesWeek = 3;
		}
	}
}
