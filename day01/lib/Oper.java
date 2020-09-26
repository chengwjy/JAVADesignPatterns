package lib;
// 抽象类
abstract public class Oper{
    // 抽象方法，子类必须实现
    public abstract long GetRes(int firstNum, int secondNum) throws Exception;
}