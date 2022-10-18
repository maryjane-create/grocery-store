package com.example.store.model;

public class Good {

    private String id;

    private  String name;

    private String price;

    public Good(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Good() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    @Override
    public  String toString(){
        return "customer " + id + " bought " +name + " worth "+ price;
    }
}
