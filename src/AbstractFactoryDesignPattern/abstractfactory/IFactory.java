package AbstractFactoryDesignPattern.abstractfactory;

import AbstractFactoryDesignPattern.button.IButton;
import AbstractFactoryDesignPattern.textbox.ITextbox;
/*
* abstract factory
* */
public interface IFactory {
    IButton createButton();
    ITextbox createTextbox();
}
