package org.example.iteratorpattern.waitress;

import org.example.iteratorpattern.iterator.Iterator;
import org.example.iteratorpattern.menu.DinerMenu;
import org.example.iteratorpattern.menu.MenuItem;
import org.example.iteratorpattern.menu.PancakeMenu;

public class Waitress {
    PancakeMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    public Waitress(PancakeMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
