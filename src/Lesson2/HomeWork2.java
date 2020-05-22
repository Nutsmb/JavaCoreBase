package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {

        int arrayEx1[] = {1,0,1,1,1,0,0,1,0};
        int arrayEx3[] = {1,5,3,2,11,4,5,2,4,8,9,1};
        int arrayEx5[] = {1,5,-23,2,11,4,5,2,4,8,22,1};
        int arrayEx6[] = {1,3,3,3,1,3};
        int arrayEx7[] = {1,5,3,2,11,4,5,2,4,8,9,1};

        swap1and0(arrayEx1);
        Ex2();
        Ex3(arrayEx3);
        fillDiagonale(5);
        System.out.println(findMinInIntArray(arrayEx5));
        System.out.println(findMaxInIntArray(arrayEx5));
        System.out.println(checkBalance(arrayEx6));
        movingArrayElements(arrayEx7,-4);
    }
    public static void printIntArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printInt2DArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void swap1and0(int[] array){
        printIntArray(array);
        for(int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 1)? 0:1;
        }
        printIntArray(array);
    }

    public static void Ex2() {
        int[] array = new int[8];
        for(int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        printIntArray(array);
    }

    public static void Ex3(int[] array){
        printIntArray(array);
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        printIntArray(array);
    }

    public static void fillDiagonale(int n){
        int[][] array = new int[n][n];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            array[i][j] = 1;
        }
        printInt2DArray(array);
    }

    public static int findMinInIntArray(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxInIntArray(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkBalance(int[] arr) {
        boolean answer =  false;
        if(arr.length > 1) {
            for (int n = 0; n < arr.length; n++) {
                int leftSum = 0;
                for (int i = 0; i <= n; i++) {
                    leftSum = leftSum + arr[i];
                }
                int rightSum = 0;
                for (int j = (arr.length - 1); j > n; j--) {
                    rightSum = rightSum + arr[j];
                }
                if (rightSum == leftSum) {
                    answer = true;
                }
            }
        }
        else {
            System.out.println("Массив должен быть длиннее 1 элемента");
        }
        return answer;
    }
    public static void movingArrayElements(int[] arr, int n) {
        printIntArray(arr);
        if (n > 0) {
            for (int i = (arr.length - 1 - n); i >= 0; i--) {
                arr[i + n] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = 0;
            }
        } else {
            for (int i = 0; i <= (arr.length + n - 1); i++) {
                arr[i] = arr[i - n];
            }
            for (int i = (arr.length - 1); i > (arr.length + n - 1); i--) {
                arr[i] = 0;
            }
        }
        printIntArray(arr);
    }
}
