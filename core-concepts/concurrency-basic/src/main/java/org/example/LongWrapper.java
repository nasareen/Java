package org.example;

public class LongWrapper {
    private Object key = new Object();
    private long value;

    public LongWrapper(long value){
        this.value = value;
    }

    public long getValue(){
        return value;
    }

    public void increment(){
        synchronized (key){
            value = value + 1;
        }

    }
}
