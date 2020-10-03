package lib.cashs;
import lib.CashSuper;
// 满减收费类
public class CashReturn extends CashSuper{
    // 满多少
    private double moneyCondition = 0;
    // 减多少
    private double moneyReturn = 0;
    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    public  double accCash(double money){
        double totle = money;
        // 处理满减
        if(money >= this.moneyCondition){
            totle = money - moneyReturn;
        }
        return totle;
    }
}
