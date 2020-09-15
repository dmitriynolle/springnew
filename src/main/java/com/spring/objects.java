package com.spring;

import java.util.List;

public class objects {
    private int id;
    private Integer parentId;
    private List<objects> children;

    public objects(int id, Integer parentId, List<objects> children) {
        this.id = id;
        this.parentId = parentId;
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public List<objects> getChildren() {
        return children;
    }

    public void setChildren(objects children) {
        this.children.add(children);
    }
}