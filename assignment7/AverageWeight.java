package assignment7;

public class AverageWeight {
    public static void main(String[] args) {
        int numberOfPeople = 10;
        double totalWeight = 0.0;
        

        double[] weights = {68.5, 70.2, 65.9, 72.3, 75.6, 63.8, 67.4, 69.1, 71.5, 74.9};
        
        
        for (double weight : weights) {
            totalWeight += weight;
        }
        

        double averageWeight = totalWeight / numberOfPeople;
        
        System.out.println("Total weight of 10 people: " + totalWeight + " kg");
        System.out.println("Average weight of 10 people: " + averageWeight + " kg");
    }
}



