package com.company;

public class Main {

    public static void main(String[] args) {

        HashMapSH HashmapSH = new HashMapSH();


        for (int i = 0; i < 5; i ++) {
            HashmapSH.insert("yamom");

        }

        for (int i = 0; i < 5; i ++) {
            HashmapSH.remove("yamom");

        }




        HashmapSH.print();
    }
}
