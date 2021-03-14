package com.fei.Builder;


class EmailSender implements Sender {

    @Override
    public void send() {
        System.out.println("use emal to send....");
    }

}

