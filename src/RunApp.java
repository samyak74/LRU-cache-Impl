public class RunApp {

    public static void main (String[] args) throws Exception {
        LRUCache<Double> lruCache = new LRUCache<>(5);
        lruCache.refer(1.3);
        lruCache.refer(2.0);
        lruCache.refer(3.3);
        lruCache.refer(4.3);
        lruCache.refer(5.3);

        lruCache.refer(6.5);
        lruCache.refer(1.2);
        lruCache.refer(6.6);
        lruCache.display();
    }
}
