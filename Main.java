import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static int findVietnameseCharacters(String input) {
        input = input.replaceAll("aw", "ă")
                .replaceAll("aa", "â")
                .replaceAll("ee", "ê")
                .replaceAll("oo", "ô")
                .replaceAll("ow", "ơ")
                .replaceAll("w", "ư")
                .replaceAll("dd", "đ")
                .replaceAll("Aw", "Ă")
                .replaceAll("Aa", "Â")
                .replaceAll("Ee", "Ê")
                .replaceAll("Oo", "Ô")
                .replaceAll("Ow", "Ơ")
                .replaceAll("W", "Ư")
                .replaceAll("Dd", "Đ");

        Pattern pattern = Pattern.compile("[ăâêôơưđĂÂÊÔƠƯĐ]");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>> Nhập chuỗi kí tự cần chuyển đổi: ");
        String input = scanner.nextLine();
        int count = findVietnameseCharacters(input);
        System.out.println(">>> Số kí tự có thể chuyển đổi là: " + count);
    }


}