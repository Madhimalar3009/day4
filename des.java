import java.util.Arrays;

class des {
 public static void main(String[] args)
 {
int[] arr = {2, 5, 7, 3, 9};
Arrays.sort(arr);
for (int i = arr.length - 1; i >= 0; i--)
 {
System.out.println(arr[i]);
 }
 }
}