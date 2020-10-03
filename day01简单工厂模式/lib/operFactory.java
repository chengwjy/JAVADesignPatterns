package lib;

import java.util.List;
import lib.methods.*;

public class operFactory {
    public static Oper createOper(String operate) throws Exception {
        Oper oper;
        // List<String> allows = List.of("+", "-", "*", "/");
        // if (!allows.contains(operator)) {
        // throw new Exception("err");
        // }

        switch (operate) {
            case "+":
                oper = new OperAdd();
                // 语句
                break; // 可选
            case "-":
                oper = new OperSub();
                // 语句
                break; // 可选
            case "*":
                oper = new OperMul();
                // 语句
                break; // 可选
            case "/":
                oper = new OperDiv();
                break; // 可选
            default: // 可选
                throw new Exception("class not found");
        }

        return oper;
    }
}
