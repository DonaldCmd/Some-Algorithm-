import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //filter
        List<Integer> num1= Arrays.asList(1,2,3,4,5,7,8,7,6);
        List<Integer> evennumbers=num1.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(evennumbers);
//Map
        List<String> String1=Arrays.asList("zebra","apple","banana");
        List<Integer> sortedString1=String1.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(sortedString1);

        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry");
        List<Integer> stringLengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(stringLengths); // 输出: [5, 6, 6]
        //sort,大写字母在前
        List<String> unsortedStrings=Arrays.asList("Simple","zebra","banana");
        List<String> sortedStrings=unsortedStrings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedStrings);
        //reduce
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        sum.ifPresent(System.out::println); // 输出: 15



    }
}
