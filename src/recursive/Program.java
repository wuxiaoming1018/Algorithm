package recursive;

/**
 * @author wuxiaoming
 * @date 2017/12/6 20:42
 */

/**
 * 为2^n名选手设置赛程表
 */
public class Program {

    /**
     *
     * @param array
     * @param fromX
     * @param fromY
     * @param toX
     * @param toY
     * @param r 对角线上元素的个数
     */
    public void copy(int[][] array,int fromX,int fromY,int toX,int toY,int r){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                array[toX+i][toY+j] = array[fromX+i][fromY+j];
            }
        }
    }

    /**
     *
     * @param k
     * @return
     */
    public int[][] table(int k){
        int n = 1<<k;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[0][i] = i+1;
        }
        //开始使用分治法
        //r表示拷贝的轮数,和人数的关系
        for (int r = 1; r < n; r=r*2) {
            for (int i = 0; i < n; i=i+r*2) {
                copy(array,0,i,r,r+i,r);
                copy(array,0,r+i,r,i,r);
            }
        }
        return array;
    }
    
    public static void main(String[] args){
        Program p = new Program();
        int[][] table = p.table(4);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}
