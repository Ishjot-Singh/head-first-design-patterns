package org.example.iteratorpattern;

import org.example.iteratorpattern.menu.DinerMenu;
import org.example.iteratorpattern.menu.PancakeMenu;
import org.example.iteratorpattern.waitress.Waitress;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeMenu pancakeHouseMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
