import java.util.Scanner;

class atten{
    public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of student: ");
 int n = sc.nextInt();
 int present = 0;
int  absent= 0;
 for (int i = 1; i <= n; i++)
 {
System.out.print("Enter deatils: ");
int student= sc.nextInt();
 if (student==1)
present++;
else
absent++;}
double percentage=(present*100.0)/n;

 System.out.println("total present= " + present);
 System.out.println("total absent = " +absent);
 System.out.println("total percentage= " + percentage+"%");
    }
}
