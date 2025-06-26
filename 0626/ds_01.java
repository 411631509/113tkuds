import java.util.Scanner;

public class ds_01 {
    public static void main(String[] args) {
        // 建立 Scanner 物件以讀取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 讀取使用者輸入的姓名
        System.out.print("請輸入您的姓名：");
        String name = scanner.nextLine();

        // 讀取使用者輸入的年齡
        System.out.print("請輸入您的年齡：");
        int age = scanner.nextInt();
        scanner.nextLine(); // 清除緩衝區中的換行符

        // 讀取使用者輸入的城市
        System.out.print("請輸入您所在的城市：");
        String city = scanner.nextLine();

        // 輸出資訊
        System.out.println("\n以下是您輸入的資訊：");
        System.out.println("姓名：" + name);
        System.out.println("年齡：" + age);
        System.out.println("城市：" + city);

        // 關閉 Scanner
        scanner.close();
    }
}

