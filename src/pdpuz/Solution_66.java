public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // Agar 9 dan kichik bo‘lsa, shunchaki 1 qo‘shamiz va qaytamiz
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // carry kerak emas
            }
            // Aks holda, 9 bo‘lsa 0 qilib davom etamiz
            digits[i] = 0;
        }

        // Agar bu joyga kelgan bo‘lsak, hamma raqam 9 bo‘lgan
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // 1000... shaklida bo‘ladi
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        printArray(result1); // [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
        printArray(result2); // [4, 3, 2, 2]

        int[] digits3 = {9, 9, 9};
        int[] result3 = plusOne(digits3);
        printArray(result3); // [1, 0, 0, 0]
    }

    // Arrayni ekranga chiqarish uchun yordamchi metod
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
