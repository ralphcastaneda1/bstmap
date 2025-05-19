# bstmap
Java BSTMap implementation of Map61B, with performance comparison to ULLMap and Java’s TreeMap


BSTMap

**A Binary Search Tree–based `Map61B` implementation**  

## Overview

In this lab you implement **`BSTMap<K,V>`**—a binary-search-tree map—by completing all non-optional methods of the **`Map61B`** interface:

- `put(K key, V value)`
- `get(K key)`
- `containsKey(K key)`
- `size()`
- `clear()`

Your implementation is then benchmarked (**`InsertRandomSpeedTest`**) against:

1. **`ULLMap`** (a list-based `Map61B`)  
2. **`TreeMap<K,V>`** (Java’s built-in Red-Black tree)  
3. **`HashMap<K,V>`** (Java’s built-in hash table)


