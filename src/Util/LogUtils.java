package Util;

/**
 * @author wuxiaoming
 * @date 2017-12-12 9:47
 */
public class LogUtils {

    public static void logIntegerArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
