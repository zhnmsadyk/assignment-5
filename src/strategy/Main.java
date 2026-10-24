package strategy;

public class Main {
    public static void main(String[] args) {
        String start = "Astana IT University";
        String destination = "MEGA Silk Way";

        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println("--- Driving Mode ---");
        navigator.executeRoute(start, destination);

        System.out.println("\n--- Switching to Walking Mode ---");
        navigator.setStrategy(new WalkStrategy());
        navigator.executeRoute(start, destination);

        System.out.println("\n--- Switching to Cycling Mode ---");
        navigator.setStrategy(new CycleStrategy());
        navigator.executeRoute(start, destination);
    }
}