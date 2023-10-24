//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
//а также переопределение метода toString(), возвращающее строковое представление пары.

public class Task3 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(123, "Привет");
        System.out.println(pair);
        System.out.println("Первый элемент - " + pair.getFirst());
        System.out.println("Второй элемент - " + pair.getSecond());
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("key - %s, value - %s", this.key, this.value);
    }
}


