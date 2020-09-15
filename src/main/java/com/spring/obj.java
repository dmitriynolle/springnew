package com.spring;

public class obj {
    private int id;
    private Integer parentId;

    public obj(int id, Integer parentId) {
        this.id = id;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public Integer getParentId() {
        return parentId;
    }

}