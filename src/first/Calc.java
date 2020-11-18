package first;


public class Calc {
    
    public int Sum(int A,int B){
        return A+B;
    }
    public int Min(int A,int B){
        return A-B;
    }
    public int Mul(int A, int B){
        return A*B;
    }
    public int Dev(int A,int B){
        if (B==0) return 0;
        return A/B;
    }
    public int dot(int [] A,int [] B){
        if(A.length==B.length){
        int sum=0;
        for (int i=0;i<A.length;i++){
            sum+=A[i]*B[i];
        }
            return sum;    }
        return 0;
    }
    public int [] ArrayMul(int [] A,int [] B ){
        if (A.length!=B.length){
        return null;
    }
        int [] ans = new int [A.length];
        for (int i=0;i<A.length;i++){
            ans[i]=A[i]*B[i];
            
        }
        return ans;
    }
}
