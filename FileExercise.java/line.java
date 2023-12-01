import java.io.IOException;
import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class line {

    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Sangeetha priya\\Java\\File\\app.txt";


        Stream<String> line = Files.lines(Paths.get(filePath));
        
        //line.forEach(System.out::println);

        List<String> collect = line.collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.size());
        line.close();
    }

}