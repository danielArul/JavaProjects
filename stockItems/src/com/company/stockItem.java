package com.company;

public class stockItem implements Comparable<stockItem> {

    private final String name;
    private double price;
    private int quantityStock;

    public stockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock=0;
    }

    public stockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock=quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public void adjustStock(int quantity){
        int newQuantity=this.quantityStock+quantity;
        if(newQuantity>=0){
            this.quantityStock=newQuantity;
        }

    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering stockItems.equals");
        if(obj==this){
            return true;
        }

        if((obj==null) || (obj.getClass() != this.getClass())){
                    return false;
        }

        String objName=((stockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+31;
    }

    @Override
    public int compareTo(stockItem o) {
        if(this==o){
            return 0;
        }

        if(o!=null){
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name +" : price " + this.price;
    }
}
