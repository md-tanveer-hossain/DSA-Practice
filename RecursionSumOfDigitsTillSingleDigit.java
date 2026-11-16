import java.util.Scanner;

class Solution {
    public int addDigits(int num) {
        int s=0;
        char[] n = Integer.toString(num).toCharArray();
        for(var i:n){
            s+=i-'0';
        }
        if(s%10==s){
            return s;
        }
        return(addDigits(s));
    }
}

class RecursionSumOfDigitsTillSingleDigit {
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
        var ans = solver.addDigits(n);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
