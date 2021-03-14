package com.fei.Builder;


class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("use SMS to send....");
    }
}

