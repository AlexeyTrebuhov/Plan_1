package ru.geekbrains.seminar1.modelelements;

// Класс Point3D. Зависит от трех координат в 3D пространстве

public class Point3D {

    private double x, y, z; // поля для точки в пространстве

    public double getX() {
        return x;
    } // геттер+сеттер для изменения полей

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void Point3D(double x, double y, double z) // Конструктор для задания координат точки
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(){} // создали базовую точку с координатами ноль

}
