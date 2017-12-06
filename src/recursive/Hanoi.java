package recursive;

/**
 * @author wuxiaoming
 * @date 2017-12-06 13:57
 */

/**
 * 汉诺塔(总共运行次数是2^n-1)
 * <p>
 * 1.有三根杆子A,B,C。A杆上有若干碟子
 * 2.每次移动一块碟子,小的只能叠在大的上面
 * 3.把所有碟子从A杆全部移到C杆上
 *
 *
 * 实现这个算法可以简单分为三个步骤：
 * (1)把n-1个盘子由A 移到 B;
 * (2)把第n个盘子由 A移到 C;
 * (3)把n-1个盘子由B 移到 C;
 *
 * 从这里入手，在加上上面数学问题解法的分析，我们不难发现，移到的步数必定为奇数步:
 * (1)中间的一步是把最大的一个盘子由A移到C上去;
 * (2)中间一步之上可以看成把A上n-1个盘子通过借助辅助塔（C塔）移到了B上;
 * (3)中间一步之下可以看成把B上n-1个盘子通过借助辅助塔（A塔）移到了C上;
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
