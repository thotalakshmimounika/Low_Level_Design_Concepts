package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.AndriodButton;
import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.dropdown.AndroidDropdown;
import FactoryDesignPattern.Components.dropdown.Dropdown;
import FactoryDesignPattern.Components.menu.AndroidMenu;
import FactoryDesignPattern.Components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory factory = flutter.createUIfactory();
        Menu menu = factory.createmenu();
        Button button = factory.createButton();
        Dropdown dropdown = factory.createDropdown();

    }
}
