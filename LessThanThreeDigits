import CorrectHours.CorrectHours;

import java.util.Scanner;

public class LessThanThreeDigits {
    public int solution(int a, int b) {
        int n, cnt=0;
        for(int i=a; i<=b; i++) {
            n=i;
            int arr[] = {0,0,0,0,0,0,0,0,0,0};
            while(n!=0) {
                arr[n%10]++;
                if(arr[n%10] > 2) break;
                n=n/10;
            }
            if(n==0) cnt++;
        }
        return cnt;
    }
    public static void main (String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers");
        a=sc.nextInt();
        b=sc.nextInt();
        LessThanThreeDigits ch = new LessThanThreeDigits();
        System.out.println(ch.solution(a,b));
    }
}
