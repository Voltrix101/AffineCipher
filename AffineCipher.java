//Amrito Ballav Roy
//Reg no-2241018182
//Sec-2241013
import java.util.Scanner;

 public class AffineCipher {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter plaintext: ");
      String plaintext = sc.nextLine();
      String ciphertext = encrypt(plaintext);
      System.out.println("Ciphertext: " + ciphertext);
      System.out.println("Decrypted Text: " + decrypt(ciphertext));
   }

   public static String encrypt(String plaintext) {
      int a = 5, b = 8;
      String ciphertext = "";
      for (int i = 0; i < plaintext.length(); i++) {
         char c = plaintext.charAt(i);
         if (c >= 'a' && c <= 'z') {
            ciphertext += (char)((a * (c - 'a') + b) % 26 + 'a');
         } else if (c >= 'A' && c <= 'Z') {
            ciphertext += (char)((a * (c - 'A') + b) % 26 + 'A');
         } else {
            ciphertext += c;
         }
      }
      return ciphertext;
   }

   public static String decrypt(String ciphertext) {
      int a = 5, b = 8, a_inv = 21;
      String plaintext = "";
      for (int i = 0; i < ciphertext.length(); i++) {
         char c = ciphertext.charAt(i);
         if (c >= 'a' && c <= 'z') {
            plaintext += (char)((a_inv * (c - 'a' - b + 26)) % 26 + 'a');
         } else if (c >= 'A' && c <= 'Z') {
            plaintext += (char)((a_inv * (c - 'A' - b + 26)) % 26 + 'A');
         } else {
            plaintext += c;
         }
      }
      return plaintext;
   }
}
