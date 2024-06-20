package org.example.iteratorpattern.iterator;

import org.example.iteratorpattern.menu.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItem;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItem){
        this.menuItem = menuItem;
    }
    @Override
    public boolean hasNext() {
        if(position >= menuItem.length || menuItem[position] == null) return false;
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem1 = menuItem[position];
        position = position + 1;
        return menuItem1;
    }
}
