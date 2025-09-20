package abstractFactory;
//windows gui elements
class WindowsButton implements Button{
    @Override
    public void paint(){
        System.out.println("windows Button working");
    }
}
class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Windows checkbox working");
    }
}
class WindowsScroll implements Scroll{
    @Override
    public void paint() {
        System.out.println("Windows scroll button working");
    }
}
//android gui element
class AndroidButton implements Button{
    @Override
    public void paint() {
        System.out.println("android buttons working");
    }
}
class AndroidScroll implements Scroll{
    @Override
    public void paint() {
        System.out.println("android scroll working");
    }
}
class AndroidCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("android checkbox working good!");
    }
}
//linux gui elements
class LinuxButton implements Button{
    @Override
    public void paint() {
        System.out.println("linux button working");
    }
}
class LinuxScroll implements Scroll {
    @Override
    public void paint() {
        System.out.println("linux scroll working");
    }
}
class LinuxCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("linux checbox working");
    }
}

//factory of windows gui
class WindowsGUI implements GUI{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }
}
//factory of linux gui
class LinuxGUI implements GUI{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public Scroll createScroll() {
        return new LinuxScroll();
    }
}
//factory of android gui
class AndroidGUI implements GUI{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }

    @Override
    public Scroll createScroll() {
        return new AndroidScroll();
    }
}
public class FactoryGUI {
    public GUI createGUI(String OS){
        switch (OS.toLowerCase()){
            case "windows": return new WindowsGUI();
            case "linux": return new LinuxGUI();
            case "android": return new AndroidGUI();
            default: throw new IllegalArgumentException("this OS is not supported by the program " + OS);
        }
    }
}


