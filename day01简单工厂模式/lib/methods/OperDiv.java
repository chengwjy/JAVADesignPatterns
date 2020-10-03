package lib.methods;
import lib.Oper;
public class OperDiv  extends Oper {
    public  long GetRes(int firstNum, int secondNum) throws Exception {
        long resultNum = 0;
        if(secondNum == 0){
            throw new Exception("can'not / 0");
        }
        resultNum = firstNum / secondNum;
        return resultNum;
    }
}
