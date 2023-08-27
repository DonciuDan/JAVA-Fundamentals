package Arrays;

public class ArrayForEachExample {
    public static void main(String[] args) {
        int[] numbers = {5, -1, 10, 3};
        for ( int element : numbers ) {
            //prima zona este declararea elementului din array; trec element pt ca alegi doar unul; a doua zona este sa alegi de unde sa selecteze
            System.out.println(element);

        }
        //face la fel ca mai jos
        System.out.println("____________________");

        for (int i = 0; i <= (numbers.length - 1); i++) {
            System.out.println(numbers[i]);
        }
    }
}
