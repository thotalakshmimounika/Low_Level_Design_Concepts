package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.button.MacButton;
import FactoryDesignPattern.Components.dropdown.Dropdown;
import FactoryDesignPattern.Components.dropdown.MacDropdown;
import FactoryDesignPattern.Components.menu.Macmenu;
import FactoryDesignPattern.Components.menu.Menu;

public class Macfactory implements UIFactory{
    @Override
    public Menu createmenu() {
        return new Macmenu();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new MacDropdown();
    }
}
