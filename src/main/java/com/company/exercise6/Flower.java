package com.company.exercise6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flower implements Comparable<Flower> {

    private final String type;
    private String color;
    private final String size;
    private final int price;


    private Flower() {
        type = "Rose";
        size = "big";
        color = "red";
        price = 25;
    }

    private Flower(String type, String size, int price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    private Flower(String type, String color, String size, int price){
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
    }

        public static void main(String[] args) {
        Flower f1 = new Flower();
        Flower f2 = new Flower("Alstroemeria", "medium", 20);
        Flower f3 = new Flower("Сhamomile", "white", "small", 15);

        List<Flower> flowerList = new ArrayList<Flower>();
        flowerList.add(f1);
        f1.bloom();
        flowerList.add(f2);
        f2.smell();
        flowerList.add(f3);

        Collections.sort(flowerList);

        System.out.println("The most expensive is " + flowerList.get(0).getSize() + " " + flowerList.get(0).getType());
        System.out.println(f1.equals(f2));
        System.out.println("\n Flower chamomile : " + f3.toString() + "\n hashCode: " + f3.hashCode());
    }
        @Override
        public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", color=" + color + '\'' + "size='" + size + '\'' + "price='" + price +
                '}';
    }

        public String getSize() {
        return size;
    }

        public String getType() {
        return type;
    }

        public String getColor() {
        return color;
    }
        public int getPrice() {
        return price;
    }
        void bloom()
    {
        System.out.println("Rose blooming");
    }

        void smell()
    {
        System.out.println("Alstroemeria smelling");
    }
        @Override
        public int compareTo(Flower f) {
        return f.getPrice() - this.getPrice();
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 20 * result + (color != null ? color.hashCode() : 0);
        result = 20 * result + price;
        return result;
    }
    }
