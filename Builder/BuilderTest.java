package com.fei.Builder;

import java.util.List;

public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceEmailSender(5);
        builder.produceSmsSender(5);
        List<Sender> list = builder.getList();
        for (int i = 0; i < list.size(); i++) {
            Sender sender = list.get(i);
            System.out.println(sender);
            sender.send();
        }
    }

}
