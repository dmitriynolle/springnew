package com.spring;

import java.util.ArrayList;
import java.util.List;

public class tree {
    public static void main(String[] args) {
        List<obj> objects = new ArrayList<>();
        List<objects> newObjects = new ArrayList<>();
        objects.add(new obj(9, 6));
        objects.add(new obj(1, null));
        objects.add(new obj(2, null));
        objects.add(new obj(3, 1));
        objects.add(new obj(4, 3));
        objects.add(new obj(5, null));
        objects.add(new obj(6, 3));
        objects.add(new obj(7, 2));
        objects.add(new obj(8, 5));

        int size = objects.size();
        while (objects.size() != 0) {
            for (int i = 0; i < size; i++) {
                if (objects.get(i).getParentId() == null) {
                    newObjects.add(new objects(objects.get(i).getId(), objects.get(i).getParentId(), new ArrayList<objects>()));
                    objects.remove(i);
                    size--;
                    i--;
                } else {
                    if (findParrent(newObjects, objects.get(i))) {
                        objects.remove(i);
                        size--;
                        i--;
                    }
                }
            }
        }
    }

    private static boolean findParrent(List<objects> newObjects, obj obj) {
        for (objects newObj : newObjects) {
            if (obj.getParentId() == newObj.getId()) {
                newObj.setChildren(new objects(obj.getId(), obj.getParentId(), new ArrayList<objects>()));
                return true;
            }
            if (!newObj.getChildren().isEmpty()) {
                if (findParrent(newObj.getChildren(), obj)) return true;
            }
        }
        return false;
    }
}