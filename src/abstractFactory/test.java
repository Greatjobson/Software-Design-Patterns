package abstractFactory;

public class test {
    FactoryGUI factoryGUI = new FactoryGUI();

    public static void main(String[] args,FactoryGUI factoryGUI) {
        GUI windows = factoryGUI.createGUI("windows");
        Button windowsButton = windows.createButton();
        Scroll windowsScroll = windows.createScroll();
        Checkbox windowsCheckbox = windows.createCheckbox();
        windowsButton.paint();
        windowsCheckbox.paint();
        windowsScroll.paint();

        GUI linux = factoryGUI.createGUI("linux");
        Button linuxButton = linux.createButton();
        Scroll linuxScroll = linux.createScroll();
        Checkbox linuxCheckbox = linux.createCheckbox();
        linuxButton.paint();
        linuxCheckbox.paint();
        linuxScroll.paint();

        GUI android = factoryGUI.createGUI("android");
        Button androidButton = android.createButton();
        Scroll androidScroll = android.createScroll();
        Checkbox androidCheckbox = android.createCheckbox();
        androidButton.paint();
        androidCheckbox.paint();
        androidScroll.paint();
    }
}
