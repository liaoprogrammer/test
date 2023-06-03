import java.util.Random;
import java.util.Scanner;

/**
 * 开发验证吗
 */
public class test2 {
    public static void main(String[] args) {
        int[] lucknum = createLuckNum();
        printArray(lucknum);
        int[] usenum = input();
        printArray(usenum);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static int[] input(){
        int[] nums = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length-1; i++) {
            System.out.println("请你输入第"+(i+1)+"个红球号码：");
            int data = scanner.nextInt();
            nums[i] = data;
        }
        System.out.println("请输入蓝球号码:");
        nums[6] = scanner.nextInt();
        return nums;
    }

    public static int[] createLuckNum(){
        int[] nums = new int[7];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            while(true){
                int data = random.nextInt(33)+1;
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (nums[i]==data){
                        flag = false;
                        break;
                    }


                }
                if (flag){
                    nums[i] = data;
                    break;
                }
            }
        }
        nums[nums.length-1] = random.nextInt(16)+1;
        return nums;
    }
}
