package Day11;

// You are using Java
import java.util.*;
public class DailyChallange{
    static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n ; i++){
            int num = sc.nextInt();
            arr[i][0] = num;
            arr[i][1] = digitSum(num);

        }
        int d = sc.nextInt();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int left = 0, right = n - 1;
        int index = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid][1] == d){
                index = mid;
                break;
            }else if(arr[mid][1] < d){
                left = mid + 1;
            }else{
                right = mid  -1;
            }
        }
        if(index == -1){
            System.out.println(-1);
            return;
        }
        int minNum = Integer.MAX_VALUE;
        int i = index;

        while(i >= 0 && arr[i][1] == d){
            minNum = Math.min(minNum, arr[i][0]);
            i--;
        }
        i = index + 1 ;
        while(i < n && arr[i][1] == d){
            minNum = Math.min(minNum, arr[i][0]);
            i++;
        }
        System.out.println(minNum);
    }
}