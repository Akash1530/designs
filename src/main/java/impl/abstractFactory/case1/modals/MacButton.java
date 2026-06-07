package impl.abstractFactory.case1.modals;

public class MacButton implements Button{
    @Override
    public String colour() {
        return "RED";
    }

    @Override
    public void click() {
        System.out.println("Mac Button Clicked");
    }
}
