package lib.cashs;
import lib.CashSuper;
// 打折收费类
public class CashRebate extends CashSuper{
    // 折扣
    private double moneyRebate = 1.0;
    public CashRebate(double moneyRebate){
        // 构造函数初始化折扣
        this.moneyRebate = moneyRebate;
    }
    public  double accCash(double money){
        // 金钱*折扣=应付
        return money * this.moneyRebate;
    }
}
