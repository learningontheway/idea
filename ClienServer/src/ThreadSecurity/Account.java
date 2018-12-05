package ThreadSecurity;
/*
定义一个Account类
1）该Account类封装了账户编号（String）和余额（double）两个属性
2）设置相应属性的getter和setter方法
3）提供无参和有两个参数的构造器
4）系统根据账号判断与用户是否匹配，需提供hashCode()和equals()方法的重写

 */

import java.util.Objects;

public class Account {
    private String accountNum;
    private double money;

    public Account() {
    }

    public Account(String accountNum, double money) {
        this.accountNum = accountNum;
        this.money = money;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum='" + accountNum + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Double.compare(account.getMoney(), getMoney()) == 0 &&
                Objects.equals(getAccountNum(), account.getAccountNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNum(), getMoney());
    }
}
