package FizzBuzz;

/**
 * @author engincanvaran
 * @project Unit Testing
 * @date 9.06.2021 18:14
 */
public class FizzBuzz {

    public String stringFor(int num){
        if(num < 1 || num > 100) {
            throw new IllegalArgumentException();
        }

        if (num % 15 == 0) {
            return "FizzBuzz";
        }
        else if(num % 3 == 0) {
            return "Fizz";
        }
        else if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
