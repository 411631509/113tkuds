
import java.util.Scanner;

public class ds_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 建立 Scanner 物件以讀取使用者輸入

        System.out.print("請輸入圓的半徑：");
        double radius = scanner.nextDouble();  // 讀取使用者輸入的半徑

        if (radius < 0) {
            System.out.println("半徑不能為負數！");
        } else {
            double area = Math.PI * radius * radius;  // 計算面積：π * r^2
            System.out.printf("半徑為 %.2f 的圓面積為 %.2f\n", radius, area);
        }

        scanner.close();  // 關閉 Scanner
    }
}
