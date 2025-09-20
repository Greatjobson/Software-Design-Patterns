package factory;

public class test {
    public static void main(String[] args) {
        OrderFactory factory = new OrderFactory();
        Order onlineOrder = factory.creatOrder("online");
        Order offlineOrder = factory.creatOrder("offline");
        Order preOrder = factory.creatOrder("preoder");
        //Order newOrder = factory.creatOrder("new");
        System.out.println(onlineOrder.work());
        System.out.println(offlineOrder.work());
        System.out.println(preOrder.work());
    }
}
