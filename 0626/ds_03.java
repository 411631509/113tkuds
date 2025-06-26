public class ds_03 {
    public static void main(String[] args) {
        // 建立一個包含 10 個整數的一維陣列
        int[] numbers = {3, 7, 1, 9, 4, 8, 2, 5, 6, 10};

        // 計算總和
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // 輸出總和
        System.out.println("陣列所有元素的總和為：" + sum);
    }
}

