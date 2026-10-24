package strategy;

public class CycleStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("[Cycle Strategy] Calculating bicycle-friendly route from " + startPoint + " to " + endPoint + " avoiding high-speed traffic.");
    }
}