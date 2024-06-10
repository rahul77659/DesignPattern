package FactoryDesignPattern;

import FactoryDesignPattern.Button.Button;
import FactoryDesignPattern.Dropdown.DropDown;
import FactoryDesignPattern.Menu.Menu;
public interface UIFactory {
        Button createButton();
        Menu createMenu();
        DropDown createDropdown();
    }

