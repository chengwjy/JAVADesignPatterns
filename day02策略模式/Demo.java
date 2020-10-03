import lib.*;
public class Demo {
    public static void main(String[] args) throws Exception {

        // 策略模式与简单工厂模式相结合后，选择具体实现的职责也可以由Context来承担，
        // 这就最大化减轻了客户端的职责
        System.out.println( (new CashContext("正常收费")).GetReusult(300));
        System.out.println( (new CashContext("满300减100")).GetReusult(200));
        System.out.println( (new CashContext("打8折")).GetReusult(300));
    }
}
