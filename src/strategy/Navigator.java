package strategy;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeRoute(String startPoint, String endPoint) {
        if (strategy == null) {
            throw new IllegalStateException("Route strategy is not set!");
        }
        strategy.buildRoute(startPoint, endPoint);
    }
}