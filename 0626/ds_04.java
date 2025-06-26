import java.util.Random;

public class ds_04 {
    public static void main(String[] args) {
        // 建立隨機數產生器
        Random random = new Random();

        // 建立一個包含 10 個整數的一維陣列
        int[] numbers = new int[10];

        // 將陣列填入隨機整數（範圍 0 到 100）並印出
        System.out.println("陣列中的隨機整數為：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101); // 產生 0~100 的整數
            System.out.print(numbers[i] + " ");
        }

        // 找出最大值
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 換行並輸出最大值
        System.out.println("\n陣列中的最大值為：" + max);
    }
}

