package FactoryDesignPattern;

import FactoryDesignPattern.Button.AndroidButton;
import FactoryDesignPattern.Dropdown.AndroidDropDown;
import FactoryDesignPattern.Menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropdown() {
        return new AndroidDropDown();
    }
}