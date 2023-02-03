package com.sun;

import org.mybatis.generator.api.ShellRunner;

import java.util.List;
import java.util.Scanner;

/**
 * @Author sungw
 * @Date 2023/2/3 16:57
 **/
// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {

    public static void main(String[] args) {

        String config = CodeGenerator.class.getClassLoader()
                .getResource("generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" };
        ShellRunner.main(arg);
    }

}
