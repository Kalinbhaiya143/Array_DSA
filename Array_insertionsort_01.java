import java.util.Scanner;

public class Array_insertionsort_01 {
    public static void main(String[] args) {
        int temp;
        int j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=scanner.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the Array of element:");
        for (int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        for (int i=0;i<a.length;i++){
            temp=a[i];
            j=i;
            while (j>0&&a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }a[j]=temp;
        }
        System.out.println("Your output:");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
