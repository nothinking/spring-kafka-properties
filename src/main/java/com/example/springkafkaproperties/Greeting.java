package com.example.springkafkaproperties;

public class Greeting {
    private String itemid;

    @Override
    public String toString() {
        return "Greeting{" +
                "itemid='" + itemid + '\'' +
                '}';
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Greeting() {
    }

    public Greeting(String itemid) {
        this.itemid = itemid;
    }
}
