package sort;

/**
 * @author wuxiaoming
 * @date 2017-12-06 11:41
 */

/**
 * 选择排序
 *
 * 选择排序的基本思想：给定数组：int[] arr={里面n个数据}；
 * 第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，将它与arrr[1]交换；
 * 第2趟，在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；
 * 以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。
 */
public class SelectSort {

    private void sort(int[] data){
        for (int i = 0; i < data.length-1; i++) {
            int index=i;
            for (int j = i+1; j < data.length; j++) {
                if(data[j]<data[index]){
                    index = j;
                }
            }
            //内层循环结束，即找到本次循环的最小值下标，然后进行交换
            if (index!=i) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        System.out.println("\n排序后:");
        for (int datum : data) {
            System.out.print(datum+" ");
        }
    }
    public static void main(String[] args){
        SelectSort selectSort = new SelectSort();
        int[] data = new int[]{7,52,4,6,9,14,98,64,18,33,26,45,1};
        System.out.println("排序前:");
        for (int datum : data) {
            System.out.print(datum+" ");
        }
        selectSort.sort(data);
    }
}
