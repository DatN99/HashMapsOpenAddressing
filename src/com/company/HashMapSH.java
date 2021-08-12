package com.company;

/**
 * This is a hashmap I created that uses Secondary hashing (SH) to resolve collisions.
 *
 * While the array[key] is not empty, it keeps increasing key by (hash + i(second hash)) where i increments by 1 to find the next available spot
 *
 * On average, insertion and removal is O(1) time since the indices of the array can be accessed without searching through the array
 * by using a key
 *
 * Worst-case would be O(n) time which means that a lot of secondary clustering is happening and the next available spot may be reached
 * by traversal of the entire array.
 *
 * Primary clustering is much less likely since the hash function guarantees spaced insertions
 *
 */

public class HashMapSH {

    private String[] array = new String[100];

    public void insert(String string){
        int hash = array.length;
        int hash2 = array.length;

        int x = 0;
        boolean inserted = false;

        for (int i = 0; i < string.length(); i++){
            hash = (hash*31) + string.charAt(i);
        }

        for (int i = 0; i < string.length(); i++){
            hash2 = (hash2*97) + string.charAt(i);
        }

        hash = hash%array.length;
        hash = Math.abs(hash);

        hash2 = hash2%array.length;
        hash2 = Math.abs(hash2);

        while (!inserted){
            if (array[hash] == null){
                array[hash] = string;
                inserted =true;
            }

            else{
                x++;
                hash = (hash + (x * hash2))% array.length;
            }
        }

    }

    public void remove(String string){
        int hash = array.length;
        int hash2 = array.length;

        int x = 0;
        boolean deleted = false;

        for (int i = 0; i < string.length(); i++){
            hash = (hash*31) + string.charAt(i);
        }

        for (int i = 0; i < string.length(); i++){
            hash2 = (hash2*97) + string.charAt(i);
        }

        hash = hash%array.length;
        hash = Math.abs(hash);

        hash2 = hash2%array.length;
        hash2 = Math.abs(hash2);

        while (!deleted){
            if (array[hash] != null && array[hash].equals(string)) {
                array[hash] = null;
                deleted = true;
            }

            else{
                x++;
                hash = (hash + (x * hash2))% array.length;
            }
        }

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
