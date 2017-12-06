package sort;

/**
 * @author wuxiaoming
 * @date 2017-12-06 10:41
 */

/**
 * 冒泡排序(3-5个数字排序的最好方式)
 */
public class BubbleSort {

    private void sort(int[] data){
        System.out.println("\n排序后：");
        for(int j=data.length-1;j>0;j--){
            boolean flag = true;
            for (int i = 0; i < j; i++) {
                if(data[i]>data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        for (int datum : data) {
            System.out.print(datum+" ");
        }
    }

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] data = new int[]{4,25,41,15,3,5,14,9,8,62,29};
        System.out.println("排序前：");
        for (int datum : data) {
            System.out.print(datum+" ");
        }
        bubbleSort.sort(data);
    }
}
