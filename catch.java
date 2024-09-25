import java.util.*;
public class main1{
public static void main(String[] args) {
Scanner se = new Scanner(System.in);

try {
int a = se.nextInt();
int b = se.nextInt();
System.out.print(a/b);
}
catch(ArithmeticException e) {
System.out.print(e);
}
catch(InputMismatchException e) {
System.out.print(e);

}

finally {
System.out.print(" Exception not handles");
}
}
}
