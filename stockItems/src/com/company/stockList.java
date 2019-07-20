package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class stockList {
    private final Map<String, stockItem> list;

    public stockList() {
        this.list=new HashMap<>();
    }

    public int addStock(stockItem item){
        if(item!=null){
            stockItem inStock=list.getOrDefault(item.getName(),item);
            if(inStock!=item){
                item.adjustStock(inStock.quantityInStock() );
            }

            list.put(item.getName(),item);
            return item.quantityInStock();
        }

        return 0;
    }

    public int sellStock(String item, int quantity){
        stockItem inStock=list.getOrDefault(item,null);
        if((inStock!=null)&&(inStock.quantityInStock()>=quantity)&&(quantity>=0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }

        return 0;
        }

    public stockItem get(String key){
            return list.get(key);
        }

    public Map<String, Double> PriceList(){
        Map<String, Double> prices=new LinkedHashMap<>();
        for(Map.Entry<String, stockItem> item:list.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

        public Map<String,stockItem> Items(){
            return Collections.unmodifiableMap(list);
        }



    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost=0.0;
        for(Map.Entry<String, stockItem> Item: list.entrySet()){
            stockItem StockItem= Item.getValue();

            double itemValue =StockItem.getPrice() + StockItem.quantityInStock();

            s=s+StockItem +". There are "+StockItem.quantityInStock() + " in stock. value of items: ";
            s=s+ String.format("%.2f",itemValue) +"\n";
            totalCost+=itemValue;
        }

        return s+"Total stock value "+ totalCost;

    }
}
