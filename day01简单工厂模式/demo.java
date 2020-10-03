
import java.util.Scanner;
import lib.*;
public class demo {
    public static void main(String[] args) throws Exception {
        Scanner ip = new Scanner(System.in);
        // 操作数
        int firstNum, secondNum;
        long resultNum;
        // 操作符
        String operator;
        System.out.println("enter first code:");
        firstNum = ip.nextInt();
        System.out.println("enter operator:");
        operator = ip.next();
        System.out.println("enter second code:");
        secondNum = ip.nextInt();
        ip.close();
        Oper oper = operFactory.createOper(operator);
        resultNum = oper.GetRes(firstNum, secondNum);
        System.out.println("result is:" + resultNum);
    }

}