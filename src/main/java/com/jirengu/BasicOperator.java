package com.jirengu;

public class BasicOperator {
    public static void main(String[] args) {
        //请完成下列所要求的计算：
        //Step 1：将num2乘以4
        //Step 2：将num1和上一步结果相加
        //Step 3：将上一步结果除以3
        //Step 4：将上一步结果对5求余
        //Step 5：用100减去上一步的结果，打印剩余的数值
        int num1 = 3;
        int num2 = 14;
        int step1 = num2 * 4;
        int step2 = num1 + step1;
        int step3 = step2 / 3;
        int step4 = step3 % 5;
        int step5 = 100 - step4;
//        int result = 100 - ((((num2 * 4) + num1) / 3) % 5);
        int result = step5;
        System.out.println(result);
    }
}
