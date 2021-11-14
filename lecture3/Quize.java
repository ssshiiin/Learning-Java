import java.util.Scanner;

public class Quize {
    public static void main(String[] args) {
        System.out.println(appendAll(args));
    }

    public static String appendAll(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();

        String string = scanner.nextLine();
        String[] strList = string.split(" ");
        for (String str : strList) {
          stringBuffer.append(str);
          stringBuffer.append(";");
        }
        return stringBuffer.toString();

    }
}