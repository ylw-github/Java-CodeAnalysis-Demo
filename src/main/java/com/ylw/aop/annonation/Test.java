package com.ylw.aop.annonation;

import java.util.ArrayList;
import java.util.Date;

public class Test {

    @SuppressWarnings({ "all" })
    public void save() {
        java.util.List list = new ArrayList();
    }

    @Override
    public String toString() {
        long parse = new Date().parse("2019-10-31 18:30:00");
        return super.toString();
    }
}
