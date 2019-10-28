package com.bjsxt.staticproxy;

public class Visitor {
    public static void main(String[] args) {
        Secret secret = new Secret();
        secret.makeAims();
        secret.eat();
    }
}
