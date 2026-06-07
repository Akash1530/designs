package impl.abstractFactory.case1.modals;

public class WinButton implements Button{
    @Override
    public String colour() {
        return "BLUE";
    }

    @Override
    public void click() {
        System.out.println("Win Button Clicked");
    }
}
