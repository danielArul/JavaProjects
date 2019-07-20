package com.company;

public class Main {
    private static stockList StockList=new stockList();

    public static void main(String[] args) {
	// write your code here
        stockItem temp=new stockItem("bread", 0.86,100);
        StockList.addStock(temp);

         temp=new stockItem("bread", 0.86,100);
        StockList.addStock(temp);

         temp=new stockItem("cake", 2,7);
        StockList.addStock(temp);

        temp=new stockItem("car", 20,13);
        StockList.addStock(temp);

         temp=new stockItem("chair", 3.99,11);
        StockList.addStock(temp);

         temp=new stockItem("PC", 399.99 ,40);
        StockList.addStock(temp);

        temp=new stockItem("cup", 72.95 ,4);
        StockList.addStock(temp);

        temp=new stockItem("juice", 36.23 ,34);
        StockList.addStock(temp);

        temp=new stockItem("phone", 300 ,23);
        StockList.addStock(temp);

        temp=new stockItem("towel", 2.30 ,80);
        StockList.addStock(temp);

        temp=new stockItem("vase", 8.76 ,40);
        StockList.addStock(temp);

        System.out.println(StockList);

        Basket timsBasket=new Basket("tim");

        sellItem(timsBasket,"car",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"car",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"car",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"juice",2);
        sellItem(timsBasket,"cup",2);
        sellItem(timsBasket,"bread",2);

        System.out.println(timsBasket);

        System.out.println(StockList);

//        temp=new stockItem("pen",1.12);
//        StockList.Items().put(temp.getName(),temp);





    }

    public static int sellItem(Basket basket, String item, int quantity){
        stockItem StockItem = StockList.get(item);
        if(StockItem==null){
            System.out.println("We don't sell "+item);
            return 0;
        }
        if(StockList.sellStock(item,quantity)!=0){
            basket.addToBasket(StockItem,quantity);
            return quantity;
        }

        return 0;
    }

}
