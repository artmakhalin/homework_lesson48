import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02 {
    /**
     * Допустим дан текстовый файл, где имена записаны в одну строку записаны имена (разделены ;)
     *
     * jack;john;ann;nick
     *
     * ваша задача прочитать этот файл и получить список строк
     */

    public static void main(String[] args) {
        System.out.println(writeStringsFromFile("test.txt"));
    }

    public static List<String> writeStringsFromFile(String filename) {
        List<String> result;
        try (Reader reader = new FileReader(filename)) {
            int data;
            StringBuilder builder = new StringBuilder();
            while ((data = reader.read()) != -1) {
                builder.append((char) data);
            }
            String[] split = builder.toString().split(";");
            result = Arrays.asList(split);

        } catch (Exception e) {
            System.out.println("Error when reading file " + e.getMessage());
            result = new ArrayList<>();
        }
        return result;
    }
}
