package pdpuz;

import java.io.*;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "myFile.txt";

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Fayl yaratildi: " + file.getName());
            } else {
                System.out.println("Fayl allaqachon mavjud.");
            }

            System.out.println("\nFaylga yozmoqchi bo‘lgan matningizni kiriting:");
            String text = scanner.nextLine();

            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(text + "\n");
                System.out.println("Ma'lumot faylga yozildi.");
            }

            System.out.println("\n Fayldan o‘qilgan ma'lumotlar:");
            try (Scanner fileReader = new Scanner(file)) {
                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }
            }

        } catch (IOException e) {
            System.out.println("Xatolik yuz berdi!");
            e.printStackTrace();
        }
    }
}