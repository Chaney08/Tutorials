package Java8Features.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {
        //1. Integer Streams
        IntStream
                .range(1,10)
                .forEach(System.out::print);

        //2 Integer Streams with skip
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x -> System.out.println(x));

        //3 Integer Stream with sum
        System.out.println(IntStream
                .range(1,5)
                .sum());

        //4 Stream.of, sorted and findFirst
        Stream.of("Paul","Emma","Test")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //5 Stream from array, sort, filter and print
        String[] names = {"Paul","Emma","Test","Pat"};
        Arrays.stream(names) //Same as Stream.of(names)
                .filter(x -> x.startsWith("P"))
                .sorted()
                .forEach(System.out::println);

        //6 Average of squares of an int array
        int[] nums = {2,4,6,8,10};
        Arrays.stream(nums)
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        //7 Stream from List, filter and print
        String[] moreNames = {"Paul","Emma","Test","Pat"};
        Arrays.stream(moreNames) //Same as Stream.of(names)
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("p"))
                .forEach(System.out::println);

        //8 Stream rows from text file, sort, filter and print
        Stream<String> bands = Files.lines(Paths.get("src/streams/bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 10)
                .forEach(System.out::println);
        bands.close();

        //9 Stream rows from text file and save to list
        List<String> bands2 = Files.lines(Paths.get("src/streams/bands.txt"))
                .filter(x -> x.contains("Imag"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));

        //10 Stream rows from CSV file and count
        Stream<String> rows = Files.lines(Paths.get("src/streams/partialData.csv"));
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows.close();

        //11 Stream rows from CSV file and parse date from rows
        Stream<String> rows2 = Files.lines(Paths.get("src/streams/partialData.csv"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] ));
        rows2.close();

        //12 Stream rows from CSV file and store in HashMap
        Stream<String> rows3 = Files.lines(Paths.get("src/streams/partialData.csv"));
        Map<String,Integer> map = new HashMap<>();

        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x-> x[0],
                        x-> Integer.parseInt(x[1])));
        rows3.close();
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        //13 Reduction - Sumn
        double total = Stream.of(7.3,1.5,4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total:" + total);

        //14 Reduction - Summary Statistics
        IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
        .summaryStatistics();
        System.out.println(summary);

    }
}
