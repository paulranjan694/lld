package AbstractFactoryDesignPattern.textbox;

public class WindowsTextbox implements ITextbox{
    @Override
    public void writeText() {
        System.out.println("windows textbox write");
    }
}
