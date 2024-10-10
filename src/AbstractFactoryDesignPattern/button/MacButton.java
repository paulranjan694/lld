package AbstractFactoryDesignPattern.button;


public class MacButton implements IButton{

    @Override
    public void press(){
        System.out.println("mac button pressed");
    }
}
