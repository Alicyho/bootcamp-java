import java.util.ArrayList;

  //HashMap 寫功能介紹 （以DEMO 說明）

public class HashMap1<K, V> {
  private ArrayList<Entry<K, V>> entries;

  public HashMap1() {
    this.entries = new ArrayList<>();
  }

  public void put(K key, V value) {
    Entry<K, V> entry = new Entry<>(key, value);
    this.entries.add(entry);
  }

  public V get(K key) {
    // ! Real HashMap not using loop
    for (Entry<K,V> entry : this.entries) {
      if (entry.getKey().equals(key)) {
        return entry.getValue();
      }
    }
    return null;
  }

  public static class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return this.key;
    }

    public V getValue() {
      return this.value;
    }
  }

  public static void main(String[] args) {
    HashMap1<String, String> hm = new HashMap1<>();
    hm.put("AAPL", "apple");
    System.out.println(hm.get("AAPL")); // apple

    HashMap1<String, Dog> hm2 = new HashMap1<>();

  }

}