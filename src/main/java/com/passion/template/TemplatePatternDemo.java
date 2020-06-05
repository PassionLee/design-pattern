package com.passion.template;

/**
 * 模板模式
 *
 * @author lsl
 * @date 2020/6/4
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
