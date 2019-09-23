import java.util.Scanner;

public class AlternatingTrees {
    public int isPleasing(int arr[], int n) {
        int x,y,z,t=0,i,j;
        for(j=0;j<n;j++) {
            y = j - 1;
            z = j + 1;
            if (y >= 0 && z < n) {
                if (!((arr[j] > arr[y] && arr[j] > arr[z]) || (arr[j] < arr[y] && arr[j] < arr[z]))) {
                    break;
                }
            } else if (y < 0 && z < n) {
                if (!((arr[j] > arr[z]) || (arr[j] < arr[z]))) {
                    break;
                }
            } else if (z >= n && y >= 0) {
                if (!((arr[j] > arr[y]) || (arr[j] < arr[y]))) {
                    break;
                }
            }
        }
        if(j!=n)
            t=1;
        return t;
    }
    public int solution(int arr[], int n) {
        int x,y,z,t=0,i,j;
        for(i=0;i<n;i++) {
            x=i;
            for(j=0;j<n;j++) {
                if(j!=i) {
                    y=j-1;
                    z=j+1;
                    if(y==i)
                        y=y-1;
                    if(z==i)
                        z=z+1;
                    if(y>=0&&z<n) {
                        if(!((arr[j]>arr[y]&&arr[j]>arr[z]) || (arr[j]<arr[y]&&arr[j]<arr[z]))) {
                            break;
                        }
                    }
                    else if(y<0&&z<n) {
                        if(!((arr[j]>arr[z]) || (arr[j]<arr[z]))) {
                            break;
                        }
                    }
                    else if(z>=n&&y>=0) {
                        if(!((arr[j]>arr[y]) || (arr[j]<arr[y]))) {
                            break;
                        }
                    }
                }
            }
            if(j==n) {
                t++;
                //System.out.println(i);
            }
        }
        return t;
    }
    public static void main (String[] args) {
        int n, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        AlternatingTrees ch = new AlternatingTrees();
        int ans=ch.isPleasing(arr,n);
        if(ans==0)
            System.out.println(ans);
        else {
            ans=ch.solution(arr,n);
            if(ans==0) ans=-1;
            System.out.println(ans);
        }
    }
}
