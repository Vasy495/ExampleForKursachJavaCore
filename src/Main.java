import java.util.Scanner;

public class Main {
    public static boolean validate(String password) {
        try {
            validatePassword(password);
        } catch (PasswordException e) {
            return false;
        }
        return true;
        }

        private static boolean validatePassword(String s) throws PasswordException {
            if (s.length() > 10) {
                throw new PasswordException();
            }
            return true;
        }
    public static void main(String[] args) {

        System.out.println("Введите пароль: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (validate(password)) {
            System.out.println("Пароль корректный");

        }
    }
}