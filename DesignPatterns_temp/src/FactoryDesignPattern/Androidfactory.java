package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.AndriodButton;
import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.dropdown.AndroidDropdown;
import FactoryDesignPattern.Components.dropdown.Dropdown;
import FactoryDesignPattern.Components.menu.AndroidMenu;
import FactoryDesignPattern.Components.menu.Menu;

public class Androidfactory implements UIFactory{
    @Override
    public Menu createmenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
