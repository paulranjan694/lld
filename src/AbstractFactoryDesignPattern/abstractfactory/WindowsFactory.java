package AbstractFactoryDesignPattern.abstractfactory;

import AbstractFactoryDesignPattern.button.IButton;
import AbstractFactoryDesignPattern.button.WindowsButton;
import AbstractFactoryDesignPattern.textbox.ITextbox;
import AbstractFactoryDesignPattern.textbox.WindowsTextbox;

/*
 * concrete factory class
 * */
public class WindowsFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextbox createTextbox() {
        return new WindowsTextbox();
    }
}
