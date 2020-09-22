package entity;
/**
 * 键盘模型
 * <p>
 * Created  by  renxingWei  on  2020/9/21
 **/
public class Model {
    // 元素集合，0-9
    private Unit[] units = new Unit[10];

    public Model() {
        // 直接组合成一个键盘
        init();
    }

    // 初始化数据
    private void init() {
        //初始化元素集合
        Unit unit0 = new Unit();
        unit0.setNumber(0);
        unit0.setLeters(null);
        units[0] = unit0;
        Unit unit1 = new Unit();
        unit1.setNumber(1);
        unit1.setLeters(null);
        units[1] = unit1;
        Unit unit2 = new Unit();
        unit2.setNumber(2);
        unit2.setLeters(new Character[]{'A', 'B', 'C'});
        units[2] = unit2;
        Unit unit3 = new Unit();
        unit3.setNumber(3);
        unit3.setLeters(new Character[]{'D', 'E', 'F'});
        units[3] = unit3;
        Unit unit4 = new Unit();
        unit4.setNumber(4);
        unit4.setLeters(new Character[]{'G', 'H', 'I'});
        units[4] = unit4;
        Unit unit5 = new Unit();
        unit5.setNumber(5);
        unit5.setLeters(new Character[]{'J', 'K', 'L'});
        units[5] = unit5;
        Unit unit6 = new Unit();
        unit6.setNumber(6);
        unit6.setLeters(new Character[]{'M', 'N', 'O'});
        units[6] = unit6;
        Unit unit7 = new Unit();
        unit7.setNumber(7);
        unit7.setLeters(new Character[]{'P', 'Q', 'R', 'S'});
        units[7] = unit7;
        Unit unit8 = new Unit();
        unit8.setNumber(8);
        unit8.setLeters(new Character[]{'T', 'U', 'V'});
        units[8] = unit8;
        Unit unit9 = new Unit();
        unit9.setNumber(9);
        unit9.setLeters(new Character[]{'W', 'X', 'Y', 'Z'});
        units[9] = unit9;
    }

    // 获取数字代表的字母数组
    public Character[] getCharsByNomber(int nomber){
        boolean has = false;
            Unit unit2 = null;
            for (Unit unit : units) {
                if (unit.getNumber()==nomber) {
                    //unit2= unit.getLeters();
                    unit2= unit;
                    has =true;
                    break;
                }
        }
        return has?unit2.getLeters():null;
    }
}
