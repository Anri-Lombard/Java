" Datastructures are built in with functions such as (1) add, (2) remove, (3) size(), (4) isEmpty() "

## Arrays
- Arrays.sort(arr) sorts static arrays
- Collections.sort(arr) sorts dynamic arrays
- O(n)


## Stacks
- LIFO
- push adds element on top of the stack
- pop removes element from bottom of stack
- peek retrieves element from top without removing it
- O(1)


## Queues
- FIFO
- add at back of queue
- poll deletes from back of queue
- peek retrieves element without deleting it
- Queues are only interfaces - use linkedlists
- O(1)


## Deques (pronounced "deck")
- addFirst, addLast, removeFirst, removeLast
- O(1)


## Priority Queues
- insertion, deletion, and retrieval of highest priority elements
- puts lowest element in front of the queue
- O(log(n))


## Sets and Maps
- Set: collection of objects that contain no duplicates
- unordered (HashSet) and ordered (Treeset)
- unordered set: add, remove, contains
- ordered set: add, remove, contains, first, last, lower, higher
- O(log(n))
- Map: set of orderred pairs (key, value pairs)
- unordered map: add specified key-value pair, retrieve value of given key, remove key-value pair
- unordered map: add specified key-value pair, retrieve value of given key, remove key-value pair, firstKey, lastKey, higherKey/higherEntry, lowerKey/lowerEntry
- unordered map: O(1)
- ordered map: O(log(n))

### Note: in codeforces always use ordered maps and sets!
