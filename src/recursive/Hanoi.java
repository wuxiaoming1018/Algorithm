package recursive;

/**
 * @author wuxiaoming
 * @date 2017-12-06 13:57
 */

/**
 * 汉诺塔
 * <p>
 * 1.有三根杆子A,B,C。A杆上有若干碟子
 * 2.每次移动一块碟子,小的只能叠在大的上面
 * 3.把所有碟子从A杆全部移到C杆上
 */
public class Hanoi {

    /**
     *
     * @param index  圆盘的个数  依次排列，越在底层，圆盘越大
     * @param start  刚开始的柱子
     * @param middle 中介柱子
     * @param end    结束柱子
     */
    public void move(int index, char start, char middle, char end) {
        if (index==1) {
            System.out.println("盘子" + index + "由" + start + "移至" + end);
        }else{
            move(index-1,start,end,middle);//把第一个柱子上的index-1个盘子移动到中间
            System.out.println("盘子" + index + "由" + start + "移至" + end);
            move(index-1,middle,start,end);//把中间的第index-1个盘子移动到最后
        }
    }

    public static void main(String[] args){
        Hanoi hanoi = new Hanoi();
        hanoi.move(5,'A','B','C');
    }
}
