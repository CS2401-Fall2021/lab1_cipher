
import java.util.Scanner;
// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    line = scanner.nextLine();
    String[] inputs=line.split(",");
   String messageToEncode=inputs[0];
   int shift =(int)(input[1]);
   Cipher cipher= new Cipher(shift);
   System.out.println(cipher.encode(messageToEncode));
  }
}
