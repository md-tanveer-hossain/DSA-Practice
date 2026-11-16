class Solution {
    int s=1;
    int c=0;
    int z=0;
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        c++;
        int k=s;
        s=s+z;
        z=k;
        if(c==n){
            return z;
        }
        
        return fib(n);
        
    }
}