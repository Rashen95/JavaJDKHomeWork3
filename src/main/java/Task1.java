//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//sum(), multiply(), divide(), subtract().
//Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Culc.sum(15.15, 16));
        System.out.println(Culc.multiply(5, 5.555));
        System.out.println(Culc.subtract(15.15, 28));
        System.out.println(Culc.divide(15, 3.15));
    }
}

class Culc {
    public static <T1 extends Number, T2 extends Number> double sum(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf(t1)) + Double.parseDouble(String.valueOf(t2));
    }

    public static <T1 extends Number, T2 extends Number> double multiply(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf(t1)) * Double.parseDouble(String.valueOf(t2));
    }

    public static <T1 extends Number, T2 extends Number> double divide(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf(t1)) / Double.parseDouble(String.valueOf(t2));
    }

    public static <T1 extends Number, T2 extends Number> double subtract(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf(t1)) - Double.parseDouble(String.valueOf(t2));
    }
}


