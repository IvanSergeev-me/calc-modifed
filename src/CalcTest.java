import java.util.Scanner;
public class CalcTest {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Calc c = new Calc();
        while (true) {
            System.out.println("enter a formula");
            c.compile(in.next().toCharArray());
        }
    }
}