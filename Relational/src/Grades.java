import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 3 subjects");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        float avg = (float)(m1+m2+m3)/3;

        if(avg >= 70){
            System.out.println("Grade A");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade B");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade c");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade E");
        }
    }
}
