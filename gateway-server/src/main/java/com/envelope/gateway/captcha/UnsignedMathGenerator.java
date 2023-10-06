package com.envelope.gateway.captcha;


import cn.hutool.captcha.generator.CodeGenerator;

/**
 * 无符号计算生成器
 *
 */
public class UnsignedMathGenerator implements CodeGenerator {

    private static final long serialVersionUID = -5514819971774091076L;

    private static final String OPERATORS = "+-*";

    /**
     * 参与计算数字最大长度
     */
    private final int numberLength;

    /**
     *
     *
     *
     *
     * 
     * 构造
     */
    public UnsignedMathGenerator() {
        this(2);
    }

    /**
     * 构造
     *
     * @param numberLength 参与计算最大数字位数
     */
    public UnsignedMathGenerator(int numberLength) {
        this.numberLength = numberLength;
    }


    @Override
    public String generate() {
        return null;
    }

    @Override
    public boolean verify(String s, String s1) {
        return false;
    }
}
