package Dsa;

import java.util.Arrays;

class Item implements Comparable<Item>{

    int weight,value;
    double ratio;

    Item(int w,int v){

        weight=w;
        value=v;
        ratio=(double)v/w;
    }

    public int compareTo(Item i){
        return Double.compare(i.ratio,this.ratio);
    }
}

public class FractionalKnapsack {

    public static void main(String[] args) {

        Item[] items={
                new Item(10,60),
                new Item(20,100),
                new Item(30,120)
        };

        int capacity=50;

        Arrays.sort(items);

        double total=0;

        for(Item item:items){

            if(capacity>=item.weight){

                total+=item.value;
                capacity-=item.weight;
            }
            else{

                total+=item.ratio*capacity;
                break;
            }
        }

        System.out.println("Max value: "+total);
    }
}
