package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.abstractfactory.IFactory;
import AbstractFactoryDesignPattern.button.IButton;
import AbstractFactoryDesignPattern.factory.UIFactory;
import AbstractFactoryDesignPattern.textbox.ITextbox;

public class Client {
    public static void main(String[] args) {

        IFactory macfactory = UIFactory.getFactory("mac");
        IButton button = macfactory.createButton();
        button.press();

        IFactory winfactory = UIFactory.getFactory("win");
        ITextbox textarea = winfactory.createTextbox();
        textarea.writeText();


    }
}
