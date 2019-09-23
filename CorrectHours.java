import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CorrectHours {
    Set<String> mp = new HashSet<String>();
    public void check(int a, int b, int c, int d) {
        if(a*10+b <= 23 && c*10+d <= 59 ) mp.add(a*10+b+":"+c*10+d);
        if(a*10+b <= 23 && d*10+c <= 59 ) mp.add(a*10+b+":"+d*10+c);
        if(b*10+a <= 23 && c*10+d <= 59 ) mp.add(b*10+a+":"+c*10+d);
        if(b*10+a <= 23 && d*10+c <= 59 ) mp.add(b*10+a+":"+d*10+c);
    }
    public int solution(int a, int b, int c, int d) {
        check(a,b,c,d); check(a,c,b,d); check(a,d,b,c); check(b,c,a,d); check(b,d,a,c); check(c,d,a,b);
        return mp.size();
    }
    public static void main (String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four integers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        CorrectHours ch = new CorrectHours();
        System.out.println(ch.solution(a,b,c,d));
    }
}
