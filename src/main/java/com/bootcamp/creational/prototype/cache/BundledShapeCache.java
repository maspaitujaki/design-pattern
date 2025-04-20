package com.bootcamp.creational.prototype.cache;

import com.bootcamp.creational.prototype.shapes.Circle;
import com.bootcamp.creational.prototype.shapes.Rectangle;
import com.bootcamp.creational.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();

        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        circle.color = "red";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 20;
        rectangle.y = 20;
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        cache.put("Big red circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape){
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
