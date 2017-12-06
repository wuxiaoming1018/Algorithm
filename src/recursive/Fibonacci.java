package recursive;

/**
 * @author wuxiaoming
 * @date 2017-12-06 12:29
 */

/**
 * 斐波那契数
 *
 * 1、1、2、3、5、8、13、21、……
 * 即从第三个数开始,当前数字都是前两个数字之和
 */
public class Fibonacci {

    private  int fibonacci(int index){
        if(index==1||index==2){
            return 1;
        }else{
            return fibonacci(index-1)+fibonacci(index-2);
        }
    }

    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("斐波那契数数列前15项值：");
        for(int i=1;i<=15;i++){
            System.out.print(fibonacci.fibonacci(i)+" ");
        }

    }
}
