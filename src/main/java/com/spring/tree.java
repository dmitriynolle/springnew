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

//1   2
//2   3
//3   null
//4   3
//5   null
//6   5
//7   null
//8   5
//9   4
//10  7
//11  12
//12  7
//13  8
//14  8
//15  12
//16  12
