Affine Cipher
-A Java program that implements Affine Cipher encryption and decryption. The program takes plaintext as input from the user and displays its equivalent ciphertext after encryption. The ciphertext is then decrypted to get the same plaintext.

The program has three methods:

main(): takes plaintext as input from the user, encrypts it and displays the ciphertext, and then decrypts the ciphertext to get the original plaintext.
encrypt(String plaintext): takes plaintext as input and returns the equivalent ciphertext.
decrypt(String ciphertext): takes ciphertext as input and returns the original plaintext.
Usage
Compile the Java file AffineCipher.java using the following command:
Copy code
javac AffineCipher.java
Run the program using the following command:
Copy code
java AffineCipher
Enter the plaintext when prompted and the program will display the ciphertext and the decrypted text.
Note
The program uses the Affine Cipher encryption formula c = (a * p + b) % 26 where c is the ciphertext, p is the plaintext, a and b are constants.
The program uses the Affine Cipher decryption formula p = a^-1 * (c - b) % 26 where p is the plaintext, c is the ciphertext, a^-1 is the inverse of a modulo 26, and b is a constant.
The program only supports alphabetical characters (both uppercase and lowercase) and ignores other characters.


Regenerate response

ChatGPT Jan 30 Version. Free Research Preview. Our goal is to make AI systems more natural and safe to interact with. Your feedback will help us improve.
New chat
Pseudo Feminism & Man Empowerment Prohibited
Java Affine Cipher Pro
