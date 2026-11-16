import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        ArrayList<Character> L=new ArrayList<>();
        if(s.size()==0){
            return L;
        }
        L.add(s.get(s.size()-1));
        L.addAll(reverseString(new ArrayList<>(s.subList(0,s.size()-1))));
        return L;
        
    }
}

class RecursionReverseOfArrayList {
    public static void main(String[] args) {
        // 1. Create an object of the Solution class
        Solution solver = new Solution();
        
        Scanner sc=new Scanner(System.in);
        
        // 2. Put your test number here
        //int n = sc.nextInt();
        //int[] arr = new int[n];

        //for(int i = 0; i < n; i++) {
        //    arr[i] = sc.nextInt();
        //}
        ArrayList<Character> L = sc.next().chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayList::new));
        // 3. Call the method and print the output
        var ans = solver.reverseString(L);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
