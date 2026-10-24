package strategy;

public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("[Car Strategy] Calculating fastest driving route from " + startPoint + " to " + endPoint + " via highways.");
    }
}