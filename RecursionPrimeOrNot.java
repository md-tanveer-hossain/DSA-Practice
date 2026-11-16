import java.util.Scanner;

class Solution {
    int c=1;
    public boolean checkPrime(int num) {
        if(num==1){
            return false;
        }
        c++;
        if(c==num){
            c=1;
            return (num%num==0);
        }
        if(num%c==0){
            c=1;
            return false;
        }
        return checkPrime(num);
    }
}

class RecursionPrimeOrNot {
    public static void main(String[] args) {
        // 1. Create an object of the Solution class
        Solution solver = new Solution();
        
        Scanner sc=new Scanner(System.in);
        
        // 2. Put your test number here
        int n = sc.nextInt();
        //int[] arr = new int[n];

        //for(int i = 0; i < n; i++) {
        //    arr[i] = sc.nextInt();
        //}
        //ArrayList<Character> L = sc.next().chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayList::new));
        // 3. Call the method and print the output
        var ans = solver.checkPrime(n);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
