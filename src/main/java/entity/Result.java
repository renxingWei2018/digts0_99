package entity;

import java.util.List;

/**
 * 结果类
 * <p>
 * Created  by  renxingWei  on  2020/9/21
 **/
public class Result {

    // 结果集合
    private List<String> leterResult;

    // 标志是否符合规范
    private boolean hasError = false;

    // 计算结果描述
    private String message;

    public void setHasError(boolean hasError){
        this.hasError = hasError;
    }

    // 直接打印结果
    public void printResult(){
        System.out.println("\n"+message);
        if (hasError){
            System.out.println("没有组合字母结果！");
        }else {
            System.out.println("总共有"+leterResult.size()+"种组合，如下：");
            for (String s : leterResult) {
                System.out.print(s);
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    public void setLeterResult(List<String> leterResult) {
        this.leterResult = leterResult;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
