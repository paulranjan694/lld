package AbstractFactoryDesignPattern.factory;

import AbstractFactoryDesignPattern.abstractfactory.IFactory;
import AbstractFactoryDesignPattern.abstractfactory.MacFactory;
import AbstractFactoryDesignPattern.abstractfactory.WindowsFactory;

/*
*  factories ka factory
* */
public class UIFactory {
    public static IFactory getFactory(String osType) {
      if(osType.equalsIgnoreCase("win")) {
          return new WindowsFactory();
      }else if(osType.equalsIgnoreCase("mac")) {
          return new MacFactory();
      }else {
          return null;
      }
    }
}
