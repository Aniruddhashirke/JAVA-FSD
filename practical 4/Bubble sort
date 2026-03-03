import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements  for array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Implementing bubble sort");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
