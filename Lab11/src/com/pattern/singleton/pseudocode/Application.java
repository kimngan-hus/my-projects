package com.pattern.singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM K66A5");
        foo.query("DROP TABLE CSDL");
        foo.query("CREATE TABLE K66A5");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM K66A4");

        System.out.println(foo == bar);
    }
}
