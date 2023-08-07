package mandatoryHomeWork;

public class ThreeDivisors {
    public boolean isThree(int n) {
        int counter=1; //all numbers will be divided by 1 so starting with counter = 1 and i=2
        for(int i=2;i<=n;i++){
            if(n%i==0 && counter<=3){    
                counter++;
                if(counter>3) return false;
            }
        }
    boolean var = (counter==3)? true:false;
    return var;
    }
}
