package observer.channel;

public class OrderChannel extends AbstractChannel {
    public void publishOrder(String order) {
        System.out.println("\n======================================");
        System.out.println("[ORDER]: " + order);
        System.out.println("======================================");
        notifyObservers(order);
    }
}
