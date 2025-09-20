package factory;

public class OrderFactory {
    public Order creatOrder(String type){
        switch (type.toLowerCase()) {
            case "online": return new OnlineOrder();
            case "offline": return new OfflineOrder();
            case "preoder":return new PreOrder();
            default:
                throw new IllegalArgumentException("There is no such type: " + type);
        }
    }
}
class OnlineOrder implements Order{
    @Override
    public String work() {
        return "online order works";
    }
}
class OfflineOrder implements Order {
    @Override
    public String work() {
        return "offline order works";
    }
}
class PreOrder implements Order{
    @Override
    public String work() {
        return "preorder workin coorectly";
    }
}