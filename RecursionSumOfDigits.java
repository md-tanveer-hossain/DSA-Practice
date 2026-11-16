import java.util.Scanner;

class Solution {
    int c=0;
    public int addDigits(int num) {
        c++;
        if(c==Integer.toString(num).length()){
            return num%((int)Math.pow(10,c))/((int)Math.pow(10,c-1));
        }
        return num%((int)Math.pow(10,c))/((int)Math.pow(10,c-1))+addDigits(num);
    }
}

class RecursionSumOfDigits {
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
