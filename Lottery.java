import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 要抽取的数量
        System.out.print("how many number do you need draw?");
        int n = in.nextInt();

        // 最大数
        System.out.print("what is the highest number you can draw?");
        int b = in.nextInt();

        // generator an array with length b;
        // 生成一个长度为b的数组
        int[] arrayAll = new int[b];
        int a = 0;

        // 填充数组 1，2，3。。。b
        for (int arrarAn : arrayAll) {
            arrarAn = ++a;
        }


        // 抽取数并放入新数组
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            int r = (int)(Math.random()*b);

            result[i] = arrayAll[r];

            arrayAll[r] = arrayAll[b-1];
            b--;
        }
        Arrays.sort(result);

        System.out.println("here is coming:");
        for (int i: result) {
            System.out.println(i);
        }
    }
}