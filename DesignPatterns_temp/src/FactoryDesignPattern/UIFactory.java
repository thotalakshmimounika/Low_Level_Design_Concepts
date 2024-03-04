package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.dropdown.Dropdown;
import FactoryDesignPattern.Components.menu.Menu;

public interface UIFactory {
    Menu createmenu();
    Button createButton();
    Dropdown createDropdown();

}
