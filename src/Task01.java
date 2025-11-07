import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    /*
    Напишите программу, которая позволяет пользователю ввести список строк (например имена),
    и по завершение (например, если пользователь ввел "exit" сохраняет этот список в файл strings.txt
     */
    public static void main(String[] args) {
        writeToFile();
    }

    public static void writeToFile() {
        try (Writer writer = new FileWriter("strings.txt");
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter text:");
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Writing finished");
        } catch (IOException e) {
            System.out.println("Error when writing file: " + e.getMessage());
        }
    }
}
