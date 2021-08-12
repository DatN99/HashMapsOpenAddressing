package com.company;

/**
 * This is a hashmap I created that uses linear probing (LP) to resolve collisions.
 *
 * While the array[key] is not empty, it keeps increasing key by 1 to find the next available spot
 *
 * On average, insertion and removal is O(1) time since the indices of the array can be accessed without searching through the array
 * by using a key
 *
 * Worst-case would be O(n) time which means that a lot of primary clustering is happening and the next available spot may be reached
 * by traversal of the entire array.
 *
 * Secondary clustering is much less likely since linear probing finds the next available spot by increments of 1
 *
 */

public class HashMapLP {

    String[] array = new String[100];

    private int hash(String string){

        int hash = array.length;

        for (int i = 0; i < string.length(); i++){
            hash = (hash*31) + string.charAt(i);
        }

        hash = hash % array.length;
        hash = Math.abs(hash);

        while (array[hash] != null){
            hash ++;
            hash = hash % array.length;
        }

        return hash;

    }

    public void insert(String string){

        int key = hash(string);


        array[key] = string;
    }

    public void remove(String string){

        int hash = array.length;

        for (int i = 0; i < string.length(); i++){
            hash = (hash*31) + string.charAt(i);
        }

        hash = hash % array.length;
        hash = Math.abs(hash);

        if (array[hash].equals(string)){
            array[hash] = "";
            return;
        }

        int i =0;
        while (!array[hash].equals(string) && i < array.length){
            hash ++;
            hash = hash % array.length;

            if (array[hash].equals(string)){
                array[hash] = "";
                return;
            }
        }

        System.out.println("String doesn't exist");
    }

    public void print(){


        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                System.out.println(i + ": ");

            }
            else {
                System.out.println(i + ": " + array[i]);
            }
        }
    }
}
