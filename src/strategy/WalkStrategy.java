package strategy;

public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("[Walk Strategy] Calculating shortest pedestrian path from " + startPoint + " to " + endPoint + " through parks and sidewalks.");
    }
}