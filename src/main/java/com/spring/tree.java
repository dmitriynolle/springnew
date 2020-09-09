package com.spring;

public class tree {
    public static void main(String[] args) {
        elementTree a,b,c, tmp;
        a = new elementTree(1);
        b = new elementTree(2);
        c = new elementTree(5);
        tmp = a.addNew(3);
        tmp.addNew(4);
        tmp.addNew(6);
        b.addNew(7);
        c.addNew(8);
    }
}