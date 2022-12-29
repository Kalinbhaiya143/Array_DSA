import java.util.Scanner;
public class Array_mergesort_01 {
    int[]array;
    int[]tempmergeArr;
    int length;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Input array size:");
        int n=scanner.nextInt();
        int[]inputArr=new int[n];
        System.out.println("Enter the Input Array element:");
        for (int i=0;i<inputArr.length;i++){
            inputArr[i]=scanner.nextInt();
        }
        Array_mergesort_01 Am=new Array_mergesort_01();
        Am.sort(inputArr);
        System.out.println("Your Output:");
        for (int i:inputArr){
            System.out.print(i+" ");
        }
    }
    public void sort(int inputArr[]){
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempmergeArr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int lowerindex,int higherindex){
        if (lowerindex<higherindex){
            int middle=lowerindex+(higherindex-lowerindex)/2;
            //It will sort the left side of Array
            divideArray(lowerindex,middle);
            //It will sort the right side of Array
            divideArray(middle+1,higherindex);

            mergeArray(lowerindex,middle,higherindex);
        }
    }
    public void mergeArray(int lowerindex,int middle,int higherindex){
        for (int i=lowerindex;i<=higherindex;i++){
            tempmergeArr[i]=array[i];
        }
        int i=lowerindex;
        int j=middle+1;
        int k=lowerindex;
        while (i<=middle && j<=higherindex){
            if (tempmergeArr[i]<=tempmergeArr[j]){
                array[k]=tempmergeArr[i];
                i++;
            }
            else {
                array[k]=tempmergeArr[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempmergeArr[i];
            k++;
            i++;
        }
    }
}
