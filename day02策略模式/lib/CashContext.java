package lib;

import lib.CashSuper;
import lib.cashs.*;
// 策略与简单工厂相结合
public class CashContext {
    private  CashSuper cs = null;
    // 简单工厂,初始化具体的策略对象
    public CashContext(String type) throws Exception{
        switch(type){
            case "正常收费":
                this.cs = new Cash();
                break;
            case "满300减100":
                this.cs = new CashReturn(300, 100);
                break;
            case "打8折":
                this.cs = new CashRebate(0.8);
                break;
            default:
                throw new Exception("没有该算法!");
        }
    }
    // 根据其具体策略对象，调用其算法的方法
    public double GetReusult(double money) throws Exception{
        if(this.cs == null){
            throw new Exception("策略对象未初始化!");
        }
        return this.cs.accCash(money);
    }
}
