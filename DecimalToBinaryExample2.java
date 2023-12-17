import java.util.Scanner;

public class DecimalToBinaryExample2 {
  public static void toBinary(int decimal) {
    long binary[] = new long[255];
    int index = 0;
    int a = decimal;
    while (decimal > 0) {
      binary[index++] = decimal % 2;
      decimal = decimal / 2;
    }
    System.out.print(a + " bimary is: ");
    for (int i = index - 1; i >= 0; i--) {
      System.out.print(binary[i]);
    }
    System.out.println();// new line
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many number's binary you want's:");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      toBinary(i);
    }
  }
}