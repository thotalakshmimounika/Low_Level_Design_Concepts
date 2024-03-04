package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.button.IOSButton;
import FactoryDesignPattern.Components.dropdown.Dropdown;
import FactoryDesignPattern.Components.dropdown.IOSDropdown;
import FactoryDesignPattern.Components.menu.IOSMenu;
import FactoryDesignPattern.Components.menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Menu createmenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
