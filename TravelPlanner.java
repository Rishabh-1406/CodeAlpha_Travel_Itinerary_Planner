import java.util.*;
public class TravelPlanner{
    private Map<String, Date> destinationsAndDates;
    private Map<String, Double> destinationBudgets;
    public TravelPlanner(){
        destinationsAndDates = new HashMap<>();
        destinationBudgets = new HashMap<>();
    }
    public void addDestination(String destination, Date date){
        destinationsAndDates.put(destination, date);
    }
    public void addBudget(String destination, double budget){
        destinationBudgets.put(destination, budget);
    }
    public void generateItinerary(){
        for(Map.Entry<String, Date> entry : destinationsAndDates.entrySet()){
            String destination =entry.getKey();
            Date date = entry.getValue();
            double budget = destinationBudgets.get(destination);
        System.out.println("Destination:"+ destination);
        System.out.println("Date:"+ date);
        System.out.println("Budget:"+ budget );
        System.out.println("---------");
        }
    }
    public static void main (String args[]){
        TravelPlanner planner =new TravelPlanner();
        planner.addDestination("Russia", new Date(2024,7,10));
    planner.addBudget("Russia",2400.0);
    planner.generateItinerary();
    }
}