package ru.ifellow.introdution;

public class FirstStep {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        var checkX = x >= xLeft && x <= xRight;
        var checkY = y >= yTop && y <= yBottom;
        return checkX && checkY;
    }

    public int sum(int[] array){
        var result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }

    public int mul(int[] array){
        if (array.length == 0) {
            return 0;
        }

        var result = 1;
        for (int i : array) {
            result *= i;
        }
        return result;
    }

    public int min(int[] array){

        var min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int max(int[] array){

        var max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public double average(int[] array){

        double result = sum(array);
        return result / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array.length <= 1) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[]array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        var left = 0;
        var right = array.length - 1;
        while (left < right) {
            var temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public boolean isPalindrome(int[]array){
        var left = 0;
        var right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int sum(int[][] matrix){
        var result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += sum(matrix[i]);
        }
        return result;
    }

    public int max(int[][] matrix){

        var max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int maxInRow = max(matrix[i]);
            max = max >= maxInRow ? max : maxInRow;
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){

        var max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix.length <= 1) {
            return true;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])) {
                return false;
            }
        }
        return true;
    }
}
