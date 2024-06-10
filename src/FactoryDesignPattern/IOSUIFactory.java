package FactoryDesignPattern;


import FactoryDesignPattern.Button.IOSButton;
import FactoryDesignPattern.Dropdown.IOSDropDown;
import FactoryDesignPattern.Menu.IOSMenu;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropDown createDropdown() {
        return new IOSDropDown();
    }
}