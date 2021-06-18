import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String inputString = input.nextLine();
        int[] frequentChar = new int[255]; // 1 O(1)
        for (int i = 0; i < inputString.length(); i++) {// 2 O(n)
            int ascii = (int) inputString.charAt(i);// 3 O(1)
            frequentChar[ascii] += 1;// 4 O(1)
        }
        int max = 0;// 5 O(1)
        char character = (char) 255;// 6 O(1)
        for (int j = 0; j < 255; j++) {// 7 O(255)
            if (frequentChar[j] > max) {// 8 O(1)
                max = frequentChar[j];// 9 O(1)
                character = (char) j;// 10 O(1)
            }
        }
        System.out.println("Most appear letter: " + character + " With frequency of " + max );
    }
}
