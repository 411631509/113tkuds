public class ds_05 {
    public static void main(String[] args) {
        // 建立一個 3x3 的二維陣列，初始化為一些範例數值
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 使用巢狀迴圈來輸出所有元素
        System.out.println("3x3 陣列的內容：");
        for (int i = 0; i < array.length; i++) {           // 逐行
            for (int j = 0; j < array[i].length; j++) {    // 逐列
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // 換行
        }
    }
}

