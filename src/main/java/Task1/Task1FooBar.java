package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1FooBar {
    public static void main(String[] args) {

        //add input string from command line
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        //iterates via the input string and collect the values with comma separator
        List<String> input = Arrays.stream(scan.nextLine().split(",")).collect(Collectors.toList());
        fooBarFunction(input);

    }

    public static void fooBarFunction(List<String> values){
        //list with output values
        List<String> output = new ArrayList<>();
        //list for repeated values
        List<String> copyCheck = new ArrayList<>();

        //check each value in the input list
        for (String value : values)
            if(Integer.parseInt(value) % 3 == 0 && Integer.parseInt(value) % 5 == 0) {
                //check if the value already exists
                if (copyCheck.contains(value)){
                    output.add("foobar-copy");
                    continue;
                }
                output.add("foobar");
                copyCheck.add(value);
            } else if (Integer.parseInt(value) % 3 == 0) {
                if (copyCheck.contains(value)){
                    output.add("foo-copy");
                    continue;
                }
                output.add("foo");
                copyCheck.add(value);
            } else if (Integer.parseInt(value) % 5 == 0) {
                if (copyCheck.contains(value)){
                    output.add("bar-copy");
                    continue;
                }
                output.add("bar");
                copyCheck.add(value);
            } else {
                if (copyCheck.contains(value)){
                    output.add(value + "-copy");
                    continue;
                }
                output.add(value);
                copyCheck.add(value);
            }

        //convert the output to comma separated string
        String print =  String.join(",", output);
        System.out.println("Output: " + print);
    }
}
