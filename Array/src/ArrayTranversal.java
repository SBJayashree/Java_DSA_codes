import java.util.Arrays;
import java.util.Scanner;

public class ArrayTranversal {
    public static void main(String[] args) {
        //creating array
        //1
        int[] a={1,2,3,4,5,6};
        //2
        Scanner scanner = new Scanner(System.in);
        int[] b=new int[6];
        for(int  i=0;i<b.length;i++){
            b[i]=scanner.nextInt();
        }
        //3
        int c[]={13,14,15,16,17,18};
        //printing the array
        //1
        System.out.println(Arrays.toString(a));
        //2
        for(int x:b){
            System.out.print(x+ " ");
        }
        System.out.println();
        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]+" ");
        }

    }
}
