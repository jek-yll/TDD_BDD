package org.example.entity;

public class Product {

    private int sellin;
    private int quality;


    public void update(){
       if (sellin > 0){
           quality --;
       } else {
           quality -= 2;
       }
       sellin --;
    }


    public int getSellin() {
        return sellin;
    }

    public void setSellin(int sellin) {
        this.sellin = sellin;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
