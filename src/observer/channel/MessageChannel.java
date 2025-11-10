package observer.channel;

public class MessageChannel extends AbstractChannel {
    public void publishNews(String news) {
        System.out.println("\n======================================");
        System.out.println("[NEWS]: " + news);
        System.out.println("======================================");
        notifyObservers(news);
    }
}
