package ru.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
           result[index] = array[array.length - index - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        array[0] = 10;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - i - 1]);

        }
    }
}
