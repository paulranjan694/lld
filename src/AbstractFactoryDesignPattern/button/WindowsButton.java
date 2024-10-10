package AbstractFactoryDesignPattern.button;


public class WindowsButton implements IButton{

    @Override
    public void press(){
        System.out.println("windows button pressed");
    }
}
