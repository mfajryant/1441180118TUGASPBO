package com.company;


/**
 * Created by lenovo on 11/06/2015.
 */
public class Test {
    public static void main(String[] args) {
        Sepeda polygon = new Sepeda("Polygon","MTB","Merah",2014);
        Sepeda wimcycle = new Sepeda("Wimcycle","BMX","Hitam",2014);

        Rider Rey = new Rider("Rey","Tulungagung",19,wimcycle);
        System.out.println(Rey.toString());

    }
}
