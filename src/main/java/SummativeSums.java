public class SummativeSums {
    public static void main(String[] args) {
        int[] arrayOne = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arrayTwo = { 999, -60, -77, 14, 160, 301 };
        int[] arrayThree = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.println("#1 Array Sum: " + totalNumber(arrayOne));
        System.out.println("#2 Array Sum: " + totalNumber(arrayTwo));
        System.out.println("#3 Array Sum: " + totalNumber(arrayThree));
    }

    public static int totalNumber(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
}
