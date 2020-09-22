import application.App;

/**
 * Junit test class
 * 测试类
 * <p>
 * Created  by  renxingWei  on  2020/9/21
 **/

public class Test {


    // 单个给定0~9情况测试
    @org.junit.Test
    public void test0_9() {
        Integer[] input = new Integer[]{0, 2, 3};
        App application = new App(input, 9);
        application.getResult().printResult();
    }

    // 单个给定0~99情况测试
    @org.junit.Test
    public void testWhith0_99() {
        Integer[] input = new Integer[]{12, 6, 33};
        App application = new App(input, 99);
        application.getResult().printResult();
    }

    // 随机生成（-1~11）情况测试
    @org.junit.Test
    public void random9() {
        int num = (int) (Math.random() * 10);
        Integer[] input = new Integer[num];
        for (int i = 0; i < num; i++) {
            input[i]=(int) (Math.random() * 12)-1;
        }
        App application = new App(input, 9);
        application.getResult().printResult();
    }

    // 随机生成（-2~12）情况测试
    @org.junit.Test
    public void random99() {
        int num = (int) (Math.random() * 10);
        Integer[] input = new Integer[num];
        for (int i = 0; i < num; i++) {
            input[i]=(int) (Math.random() * 105)-4;
        }
        App application = new App(input, 99);
        application.getResult().printResult();
    }

}
