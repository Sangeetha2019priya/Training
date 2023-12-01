import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Lineparallel {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\\\Sangeetha priya\\\\Java\\\\File\\\\app.txt";

        processFileLies(fileName);
    }

    public static void processFileLies(String fileName) throws IOException {
        Stream<String> Lineparallel = Files.lines(Paths.get(fileName));

         Lineparallel.forEachOrdered(System.out::println);
        // Lineparallel.parallel().forEach(line -> {
        //     // Perform some work on each line
        //     System.out.println(line);
        //     // Add your custom processing logic here
        // });
        Lineparallel.close();
    }
}