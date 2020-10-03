package lib.methods;
import lib.Oper;
public class OperMul extends Oper {
    public  long GetRes(int firstNum, int secondNum) {
        long resultNum = 0;
        resultNum = firstNum * secondNum;
        return resultNum;
    }
}
