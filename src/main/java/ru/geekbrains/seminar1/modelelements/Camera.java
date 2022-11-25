package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;

public class Camera {

    //TODO: Доработать

    private Collection <Point3D> point3D; // получаем данные из коллекций
    private Collection<Angle3D> angle3DS;

    public Collection<Point3D> getPoint3D() { return point3D;}  // геттер для точек
    public Collection<Angle3D> getAngle3DS() { return angle3DS; } // геттер для углов

    public void setPoint3D(Collection<Point3D> point3D) { // сеттер для точек, можем менять
        this.point3D = point3D;
    }

    public void setAngle3DS(Collection<Angle3D> angle3DS) {// сеттер для углов, можем менять
        this.angle3DS = angle3DS;
    }

    // выводим информацию о положении камеры ( применяя составляющие точка и угол)
    public Camera(Collection<Point3D> point3D, Collection<Angle3D> angle3DS)

    {
        this.point3D = point3D;
        this.angle3DS = angle3DS;

    }
}
