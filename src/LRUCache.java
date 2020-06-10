import java.util.LinkedHashSet;
import java.util.Set;

class LRUCache <T> {
  private Set<T> lruCache;
  private int capacity;

  LRUCache(int capacity) {
    this.capacity = capacity;
    lruCache = new LinkedHashSet<>(capacity);
  }

  private boolean get(T t) {
    if (!lruCache.contains(t)) {
      return false;
    }
    lruCache.remove(t);
    lruCache.add(t);
    return true;
  }

  private void put(T t) {
    if (lruCache.contains(t)) {
      lruCache.remove(t);
    }
    else if (lruCache.size() == capacity) {
      T firstKey = lruCache.iterator().next();
      lruCache.remove(firstKey);
    }
    lruCache.add(t);
  }

  void refer(T t) {
    if (!get(t))
      put(t);
  }

  void display()
  {
    for (T t : lruCache) {
      System.out.print(t + " ");
    }
  }
}
