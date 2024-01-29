import java.util.Scanner;

public class forReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        extracted(sc);
    }

    public static void extracted(Scanner sc) {
        System.out.println("Enter string for reverse:||");
        String h1= sc.nextLine();
        String[]h2=new String[h1.length()];
        for(int i=0;i<h1.length();i++)
        {
            h2[i]= String.valueOf(h1.charAt(i));
        }
        int left=0,right= h1.length()-1;
        String temp;
        while (left < right)
        {
            temp=h2[left];
            h2[left]=h2[right];
            h2[right]=temp;
            left++;
            right--;
        }
        for(String s:h2)
        {
            System.out.print(s);
        }
    }
}
