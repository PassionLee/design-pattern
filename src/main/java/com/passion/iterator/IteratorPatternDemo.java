package com.passion.iterator;

/**
 * 迭代器模式
 *
 * @author lsl
 * @date 2020/6/4
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository(new String[]{"Robert", "John", "Julie", "Lora"});

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
