package ru.geekbrains.seminar1.modelelements;

// Класс Vector3D. Зависит от положения двух точек в 3D пространстве. первая точка - начало системы координат.

public class Vector3D {


    private Point3D point;

    public Point3D getPoint() {
        return point;
    } // читаем направление ( геттер)

    public void setPoint(Point3D point) {
        this.point = point;
    } // можем менять направление (сеттер)


    public Vector3D(Point3D point) {
        this.point = point;
    } // передаем данные о векторе
}
