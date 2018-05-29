
/**
 * Write a description of class collatzConj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class collatzConj
{
    public int tester( int x ){
        if(x%2 == 0){
            x= x/2;
        }
        else
        {
            x = (3*x) + 1;
        }
        return x; 
    }
    public int findResult (int x){
        while(x != 1){
            x = tester(x);
        }
        return x;
    }
    public boolean result(int x){
        System.out.print("The collatz conjecture states that if you multiply an integer by 3 and add 1 if it is odd and divide by 2 if it is even, every number will reduce to 0. This tests that. \nIf it returns true, it does. If not, (i.e., it returns false) congratulations!\n");
        if(findResult(x) == 1){
             System.out.print("Result: This number reduces to 1");
            return true;
        }
        else {
        System.out.print("Result: You beat the collatz conjecture!!! :DDD");
        return false;
    }
}
}
