package observer;

import bridge.model.Warrior;
import bridge.warrior.*;


public class Main {
    public static void main(String[] args) {
        MessageChannel newsChannel = new MessageChannel();
        OrderChannel orderChannel = new OrderChannel();
        Warrior archer = new Archer();
        Warrior knight = new Knight();
        Warrior viknig = new Viking();

        newsChannel.addObserver(archer);
        newsChannel.addObserver(knight);
        newsChannel.addObserver(viknig);

        orderChannel.addObserver(knight);
        orderChannel.addObserver(viknig);


        newsChannel.publishNews("Taxes will be raised soon");
        newsChannel.removeObserver(viknig);
        newsChannel.publishNews("Taxes will be lowered soon");

        orderChannel.publishOrder("The campaign is coming soon and the kingdom needs you as a warrior!!");
        orderChannel.publishOrder("Defend the castle!!!");

    }
}

