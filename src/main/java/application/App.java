package application;

import entity.Model;
import entity.Result;

import java.util.ArrayList;

import java.util.List;

/**
 * 计算类
 * <p>
 * Created  by  renxingWei  on  2020/9/21 0021
 **/
public class App{

    private Model model = new Model();

    private Integer[] input;

    private List<String> output = new ArrayList<String>();

    private Result result = new Result();

    public App(Integer[] input, int model) {
        this.input = input;
        System.out.print("你的输入数字是：[");
        for (int i=0;i<input.length;i++) {
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(input[i]);
        }
        System.out.print("]");
        for (Integer integer : input) {
            if (integer < 0 || integer > model) {
                result.setMessage("无法组合，请输入0~" + model + "(包含)之间的数字！");
                result.setHasError(true);
                return;
            }
        }
        if(input.length<1){
            result.setMessage("无法组合，请输入数字！");
            result.setHasError(true);
            return;
        }
        // 递归计算结果
        celculate(1, "");
        if (output.size() < 1) {
            result.setMessage("无法组合，请检查你的输入！");
            result.setHasError(true);
        } else {
            result.setMessage("组合成功！");
            result.setHasError(false);
            result.setLeterResult(output);
        }
    }

    private void celculate(int step, String pre) {
        int nuber = this.input[step - 1];
        nuber = nuber > 9 ? nuber % 10 : nuber;
        Character[] characters = model.getCharsByNomber(nuber);
        if (characters == null) {
            if (step < this.input.length) {
                celculate(step + 1, pre);
            } else {
                output.add(pre);
            }
        } else {
            if (step == this.input.length) {
                for (Character character : characters) {
                    output.add(pre + String.valueOf(character).toLowerCase());
                }
                return;
            }
            for (Character character : characters) {
                celculate(step + 1, pre + String.valueOf(character).toLowerCase());
            }
        }
    }
    public Result getResult() {
        return result;
    }
}
