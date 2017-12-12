package algorithm;

import Util.LogUtils;

import java.util.Stack;

/**
 * @author wuxiaoming
 * @date 2017-12-12 9:29
 */
public class LCSAlgorithm {
    private boolean isOk = false;
    private void getLCS(String x, String y) {
        char[] charX = x.toCharArray();
        char[] charY = y.toCharArray();
        int[][] result = new int[charX.length + 1][charY.length + 1];
        //初始化数组
        for (int i = 0; i < result.length; i++) {
            result[i][0] = 0;
        }
        for (int i = 0; i < result[0].length; i++) {
            result[0][i] = 0;
        }
        //动态规划填入数据
        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[i].length; j++) {
                if (charX[i - 1] == charY[j - 1]) {
                    //相等，取左上角+1
                    result[i][j] = result[i - 1][j - 1] + 1;
                } else {
                    //不相等,取左、上最大值
                    result[i][j] = max(result[i - 1][j], result[i][j - 1]);
                }
            }
        }
        if (!isOk) {
            LogUtils.logIntegerArray(result);
        }
        answer(x, y, charX, charY, result);
    }

    private void answer(String x, String y, char[] charX, char[] charY, int[][] result) {
        Stack stack = new Stack();
        int i = x.length()-1;
        int j = y.length()-1;
        while ((i>=0)&&(j>=0)){
            if (charX[i]==charY[j]) {
                //相等就入栈
                stack.push(charX[i]);
                i--;
                j--;
            }else{
                if(result[i+1][j-1+1]>result[i-1+1][j+1]){
                    //上>左,往上走
                    j--;
                }else if(result[i+1][j-1+1]<result[i-1+1][j+1]) {
                    //左>上,往左走
                    i--;
                }else{
                    if (!isOk) {
                        i--;
                        isOk = true;
                    }else{
                        j--;
                    }
                }
            }
        }
        System.out.println("\n-------------------------");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+"");
        }
    }

    private int max(int i, int j) {
        return i > j ? i : j;
    }

    public static void main(String[] args){
        LCSAlgorithm lcs = new LCSAlgorithm();
        lcs.getLCS("ABCBDAB","BDCABA");
        if (lcs.isOk) {
            lcs.getLCS("ABCBDAB","BDCABA");
        }
    }
}
