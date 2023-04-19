import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().replaceAll("zero", "0").replaceAll("one", "1");
        String s2 = scanner.nextLine().replaceAll("zero", "0").replaceAll("one", "1");
        int n1 = Integer.parseInt(s1, 2);
        int n2 = Integer.parseInt(s2, 2);
        System.out.println(n1 > n2 ? ">" : n1 < n2 ? "<" : "=");
    }
//        Scanner scanner = new Scanner(System.in);
//        int currentTemperature = scanner.nextInt();
//        int desiredTemperature = scanner.nextInt();
//        String mode = scanner.next();
//
//        int resultTemperature = calculateTemperature(currentTemperature, desiredTemperature, mode);
//        System.out.println(resultTemperature);
//    }
//
//    private static int calculateTemperature(int currentTemperature, int desiredTemperature, String mode) {
//        switch (mode) {
//            case "freeze":
//                if (currentTemperature > desiredTemperature) {
//                    return desiredTemperature;
//                }
//                break;
//            case "heat":
//                if (currentTemperature < desiredTemperature) {
//                    return desiredTemperature;
//                }
//                break;
//            case "auto":
//                return desiredTemperature;
//            case "fan":
//                return currentTemperature;
//        }
//        return currentTemperature;
//    }
}
