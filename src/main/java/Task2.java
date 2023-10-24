//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
//если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
//но должны иметь одинаковую длину и содержать элементы одного типа.

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Array123.compareArrays(new String[]{"1", "2", "4"}, new String[]{"1", "2", "4"}));
        System.out.println(Array123.compareArrays(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 4}));
    }
}

class Array123 {
    public static <T1, T2> boolean compareArrays(T1[] t1, T2[] t2) {
        if (!t1.getClass().toString().equals(t2.getClass().toString())) {
            return false;
        }
        if (t1.length != t2.length) {
            return false;
        }
        for (int i = 0; i < t1.length; i++) {
            if (!t1[i].equals(t2[i])) {
                return false;
            }
        }
        return true;
    }
}