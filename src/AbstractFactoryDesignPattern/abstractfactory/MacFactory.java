package AbstractFactoryDesignPattern.abstractfactory;

import AbstractFactoryDesignPattern.button.IButton;
import AbstractFactoryDesignPattern.button.MacButton;
import AbstractFactoryDesignPattern.textbox.ITextbox;
import AbstractFactoryDesignPattern.textbox.MacTextbox;

/*
* concrete factory class
* */
public class MacFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextbox createTextbox() {
        return new MacTextbox();
    }
}
