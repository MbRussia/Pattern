package com.company.prototype;

import java.util.Objects;

public class Rectangle extends Shape {
    private int w;
    private int h;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if(rectangle != null){
            this.w = rectangle.w;
            this.h = rectangle.h;
        }
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return w == rectangle.w &&
                h == rectangle.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), w, h);
    }

    @Override
    public String toString() {

        final StringBuffer sb = new StringBuffer("Rectangle{");
        sb.append("w=").append(w);
        sb.append(", h=").append(h);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
