package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestScore {
    public static void main(String[] args) {
        // attempt to open a file if one exists
        Path path = Paths.get("src/resources/high_score.txt");

        createFile(path);
        writeFile(path);
        List<String> outArray = readFile(path);
        var outArray2 = outArray.stream().map(e -> Stream.of(e.split(" ")).collect(Collectors.toList()))
                .collect(Collectors.toCollection(ArrayList::new));
        outArray2.stream().sorted((a, b) -> Integer.parseInt(b.get(1)) - Integer.parseInt(a.get(1))).forEach(System.out::println);
    }


    public static void createFile(Path path) {
        if (Files.exists(path)) {
            System.out.println("High Score file exists");
        } else {
            try {
                Files.createFile(path);
                System.out.println("high_score file was created!!!");
            } catch (Exception err) {
                System.out.println("Unable to ope file");
                System.out.println(err.getMessage());
            }
        }
    }

    public static void writeFile(Path path) {
        Scanner in = new Scanner(System.in);
        System.out.print(" -- Pleas enter player name: ");
        var name = in.next();
        System.out.print(" -- Please enter player score: ");
        var score = in.next();
        try {
            Files.writeString(path, name + " " + score + "\n", StandardOpenOption.APPEND);
        } catch (IOException err) {
            System.out.println(err.getMessage());
            System.out.println("Unable to write to file");
        }
    }

    public static List readFile(Path path) {
        try {
            var input = Files.readAllLines(path);
            return input;
        } catch (IOException err) {
            System.out.println(err.getMessage());
            System.out.println("Unable to read file");
        }
        return null;
    }
}
