package abstractFactory;

interface Button{
    void paint();
}
interface Checkbox{
    void paint();
}
interface Scroll{
    void paint();
}

public interface GUI {
    Button createButton();
    Scroll createScroll();
    Checkbox createCheckbox();
}

