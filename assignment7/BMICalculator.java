package assignment7;
import java.util.Scanner;
public class BMICalculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of persons: ");
	        int nPersons = scanner.nextInt();
	        double[] heights = new double[nPersons];
	        double[] weights = new double[nPersons];
	        for (int i = 0; i < nPersons; i++) {
	            System.out.print("Enter height for person " + (i + 1) + ":");
	            heights[i] = scanner.nextDouble();

	            System.out.print("Enter weight for person " + (i + 1) + ":");
	            weights[i] = scanner.nextDouble();
	        }
	        compareBMIs(heights, weights);
	    }

	    public static double calculateBMI(double height, double weight) {
	        return weight / (height * height);
	    }
	    public static void compareBMIs(double[] heights, double[] weights) {
	        System.out.println("Comparing BMIs:");

	        for (int i = 0; i < heights.length; i++) {
	            double bmi = calculateBMI(heights[i], weights[i]);
	            System.out.println("Person " + (i + 1) + ": BMI = " + bmi);
	        }
	    }
	    
	}