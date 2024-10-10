package AbstractFactoryDesignPattern.textbox;

public class MacTextbox implements ITextbox{
    @Override
    public void writeText() {
        System.out.println("mac textbox write");
    }
}
