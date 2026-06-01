import java.util.Arrays;
import java.util.Collections;
public class desc{
public static void main(String [] args){
Integer[]arr={5,2,1,8,9};
Arrays.sort(arr,Collections.reverseOrder());
System.out.println("Descending order:");
for(int n:arr)
{
System.out.println(n);
}
}
}
