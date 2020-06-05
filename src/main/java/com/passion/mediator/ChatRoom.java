package com.passion.mediator;

import java.util.Date;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
