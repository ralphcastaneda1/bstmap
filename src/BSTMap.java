import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {

    public class BSTMapNode {
        K key;
        V value;
        BSTMapNode left;
        BSTMapNode right;

        BSTMapNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    BSTMapNode root;
    int size;

    public BSTMap() {
        root = null;
        size = 0;
    }


    @Override
    public void put(K key, V value) {
        if (root == null) {
            root = new BSTMapNode(key, value);
            size++;
            return;
        }

        //BSTMapNode previousNode = null;
        BSTMapNode traversalNode = root;
        while (traversalNode != null) {
            int comparableNode = key.compareTo(traversalNode.key);

            if (comparableNode < 0) {
                if (traversalNode.left == null) {
                    traversalNode.left = new BSTMapNode(key, value);
                    size++;
                    return;
                }
                traversalNode = traversalNode.left;
            } else if (comparableNode > 0) {
                if (traversalNode.right == null) {
                    traversalNode.right = new BSTMapNode(key, value);
                    size++;
                    return;
                }
                traversalNode = traversalNode.right;
            } else {
                traversalNode.value = value;
                return;
            }
        }
    }

    @Override
    public V get(K key) {
        BSTMapNode traversalNode = root;
        if (root == null) {
            return null;
        }
        while (traversalNode != null) {
            int compareableNode = key.compareTo(traversalNode.key);
            if (compareableNode < 0) {
                traversalNode = traversalNode.left;
            } else if (compareableNode > 0) {
                    traversalNode = traversalNode.right;
                } else {
                    return traversalNode.value;
                }
            }
        return null;
        }


    @Override
    public boolean containsKey(K key) {
        BSTMapNode traversalNode = root;
        while (traversalNode != null) {
            int compareableNode = key.compareTo(traversalNode.key);
            if (compareableNode < 0) {
                traversalNode = traversalNode.left;
            } else if (compareableNode > 0) {
                    traversalNode = traversalNode.right;
                } else {
                    return true;
                }
            }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
            this.root = null;
            size = 0;
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<K> iterator() {
        throw new UnsupportedOperationException();
    }

}

