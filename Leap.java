import java.util.Scanner;
public class Leapyear{
    public static void main(String args[]){
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter The Year :"+a);
        if(a%4==0)
        {
            System.out.println(+a+" :This Year is LEAP YEAR");
            
        }
        else
        {
            System.out.println(+a+" :This Year Is Not a LEAP YEAR");
        }
    }
}
