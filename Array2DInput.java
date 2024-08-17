import java.util.Scanner;

public class Array2DInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 row 4 column : ");
        int matrix[][] = new int[5][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
    }
}
