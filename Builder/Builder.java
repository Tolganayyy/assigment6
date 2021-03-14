package com.fei.Builder;


import java.util.ArrayList;
import java.util.List;

class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public List<Sender> getList() {
        return list;
    }

    public void produceEmailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new EmailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}

