import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a word:");
    Scanner input = new Scanner(System.in);
    String word= input.nextLine();
    System.out.println(word.length());
    //Your code will return the length of the entered String
  }
}
