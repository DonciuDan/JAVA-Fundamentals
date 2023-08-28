package JAVAFundamentals.Varargs;

public class VarargsExample {
    public static void main(String[] args) {
        VarargsExample object = new VarargsExample();
        //paranteze rotunde inseamna metode, dar daca e acelasi nume precum clasa este un constructor
        //nu poti sa pui array fiindca are o dimensiune fixa, linii si coloane
        System.out.println(object.calculateSum(2, 20));
        System.out.println(object.calculateSum(2, 20, 5));
        System.out.println(object.sumVarargs());
        System.out.println(object.sumVarargs(5));
        System.out.println(object.sumVarargs(5, 10, 52));
        System.out.println(object.sumVarargs(10, 85, 2, 54));
        System.out.println(object.sumVarargs(2, 10));

        object.averageOfStudent("Dan", 8,10,5,4,9);
        System.out.println("--------------------------------------------------------");
        System.out.println(object.findTheLongestName("Alina","Dan","Marcel","Alexandru"));

    }

    public int calculateSum(int number, int number1) {
        int sum = number + number1;
        return sum;
    }

    public int calculateSum(int number, int number1, int number2) {
        int sum = number + number1 + number2;
        return sum;
    }

    public int sumVarargs (int... numbers) { //se comporta ca un array, cele 3 puncte transmite ca e un JAVAFundamentals.Varargs Variable Arguments
        int sum = 0;

        for (int i = 0; i <= numbers.length - 1; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
    public void averageOfStudent (String studentName, int... grades) { // regula: poate fi folosit doar o singura data si tot timpul sa fie varargs la final

        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        float average = (float) sum / grades.length;
        System.out.println("Media aritmetica a notelor pentru studentul " + studentName + " este: " + average);
    }

    public String findTheLongestName (String... names) {
        String longestName = names[0];
        for (String name:names) {
            if (longestName.length() < name.length()) {
                longestName = name;
            }
        }
        return longestName;


    }




}
