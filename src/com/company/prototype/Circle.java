package com.company.prototype;

import java.util.Objects;

public class Circle extends Shape {
    private int r;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.r = circle.r;
        }
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("r=").append(r);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
