import java.util.Scanner;

class store{
    public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of product: ");
 int n = sc.nextInt();
 int total = 0;
int highest = 0;
int above= 0;
 for (int i = 1; i <= n; i++)
 {
System.out.print("Enter price: ");
int price = sc.nextInt();
 if (price > highest)
 highest = price;
if (price >1000)
above++;
total += price;
}
 System.out.println("total= " + total);
 System.out.println("highest = " +highest);
 System.out.println("above 1000 = " + above);
    }
}