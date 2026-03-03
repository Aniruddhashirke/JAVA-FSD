import java.util.Scanner;
public class practice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements for array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key to be searched:");
        int key, flag = 0;
        key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at position " + (i+1));
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(key+" not found");
        }
    }

}
