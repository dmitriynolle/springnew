package com.spring;

import java.util.ArrayList;

public class elementTree {
    elementTree parent;
    int number;
    ArrayList<elementTree> heirs = new ArrayList<>();

    public elementTree(int num){
        parent = null;
        this.number = num;
    }

    public elementTree addNew(int number)
    {
        elementTree tmp = new elementTree(number);
        tmp.number = number;
        tmp.parent = this;
        heirs.add(tmp);
        return tmp;
    }
}
