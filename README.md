# HashMapsOpenAddressing

src/com/company/HashMapLP.java contains a hashmap I created that uses linear probing (LP) to resolve collisions.

While the array[key] is not empty, it keeps increasing key by 1 to find the next available spot
 
On average, insertion and removal is O(1) time since the indices of the array can be accessed without searching through the array
by using a key
 
Worst-case would be O(n) time which means that a lot of primary clustering is happening and the next available spot may be reached
by traversal of the entire array.

Secondary clustering is much less likely since linear probing finds the next available spot by increments of 1




src/com/company/HashMapQP a hashmap I created that uses Quadratic probing (QP) to resolve collisions.
 
While the array[key] is not empty, it keeps increasing key by (hash + i^2) where i increments by 1 to find the next available spot
 
On average, insertion and removal is O(1) time since the indices of the array can be accessed without searching through the array
by using a key
 
Worst-case would be O(n) time which means that a lot of secondary clustering is happening and the next available spot may be reached
by traversal of the entire array.
 
Primary clustering is much less likely since the hash function guarantees spaced insertions




src/com/company/HashMapSH contains a hashmap I created that uses Secondary hashing (SH) to resolve collisions.
 
While the array[key] is not empty, it keeps increasing key by (hash + i(second hash)) where i increments by 1 to find the next available spot
 
On average, insertion and removal is O(1) time since the indices of the array can be accessed without searching through the array
by using a key
 
Worst-case would be O(n) time which means that a lot of secondary clustering is happening and the next available spot may be reached
by traversal of the entire array.
 
Primary clustering is much less likely since the hash function guarantees spaced insertions


operations for all:

insert -> insert a new value

remove -> remove specified value

print -> prints index and value of entire hashmap
 
 

 
 
 
