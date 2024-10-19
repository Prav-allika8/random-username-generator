import java.util.Random;

public class RandomUsernameGenerator {

    // Method to generate a random username
    public static String generateUsername(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder username = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            username.append(characters.charAt(index));
        }

        return username.toString();
    }

    public static void main(String[] args) {
        int usernameLength = 8;  // Set the desired length of the username
        String randomUsername = generateUsername(usernameLength);

        System.out.println("Generated Random Username: " + randomUsername);
    }
}