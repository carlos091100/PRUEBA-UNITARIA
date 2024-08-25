import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {


    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            numbers.add(getNumber(i));
        }
        return numbers;
    }

    private String getNumber(int i) {
        if (isaBoolean1(i) && isaBoolean2(i)) {
            return "FizzBuzz";
        }
        else if (isaBoolean(i)) {
            return "Fizz";
        }
        else if(isaBoolean2(i)){
            return "Buzz";
        }
            return "" + i;
        
    }

    private static boolean isaBoolean2(int i) {
        return i % 5 == 0;
    }

    private static boolean isaBoolean1(int i) {
        return i % 3 == 0;
    }

    private static boolean isaBoolean(int i) {
        return isaBoolean1(i);
    }
}
