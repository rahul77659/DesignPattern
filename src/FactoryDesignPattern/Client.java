package FactoryDesignPattern;

import FactoryDesignPattern.Button.Button;
import FactoryDesignPattern.Dropdown.DropDown;
import FactoryDesignPattern.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);

        UIFactory uiFactory = flutter.createFactory();
        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropdown();
    }
}