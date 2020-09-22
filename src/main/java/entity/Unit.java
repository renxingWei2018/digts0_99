package entity;

/**
 * 按键类(单个元素)
 * <p>
 * Created  by  renxingWei  on  2020/9/21
 **/
public class Unit {

    // 元素的代表数字
    private int number;

    // 元素代表的字母(大写)
    private Character[] leters;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Character[] getLeters() {
        return leters;
    }

    public void setLeters(Character[] leters) {
        this.leters = leters;
    }
}
