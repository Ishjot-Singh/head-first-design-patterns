package org.example.adapterpattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator {
    Enumeration enumeration;

    public EnumerationIteratorAdapter(Enumeration enumeration){
        this.enumeration = enumeration;

    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return this.enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
