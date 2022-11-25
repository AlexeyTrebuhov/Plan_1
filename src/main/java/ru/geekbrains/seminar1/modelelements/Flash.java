package ru.geekbrains.seminar1.modelelements;

// Класс Flash. Зависит от точки размещения, угла направления, цвета, мощности источника. Может поворачиваться и менять точку

import javafx.geometry.Point3D;
import java.util.Collection;

public class Flash {

        //TODO: Доработать

    private Collection<Point3D> point3D; // получаем данные из коллекций
    private Collection<Angle3D> angle3DS;
    private final Collection<Color> color;
    private final Collection<Float> floats;

    public Collection<Point3D> getPoint3D() { return point3D;}  // геттер для точек
    public Collection<Angle3D> getAngle3DS() { return angle3DS; } // геттер для углов
    public Collection<Color> getColor() { return color; }// геттер для цвета
    public Collection<Float> getFloats() { return floats;}// геттер для мощности

    public void setPoint3D(Collection<Point3D> point3D) { // сеттер для точек, можем менять
        this.point3D = point3D;
    }

    public void setAngle3DS(Collection<Angle3D> angle3DS) {// сеттер для углов, можем менять
        this.angle3DS = angle3DS;
    }

    // выводим информацию о свете ( применяя составляющие)
    public Flash(Collection<Point3D> point3D, Collection<Angle3D> angle3DS, Collection <Color> color, Collection <Float> floats)

    {
        this.point3D = point3D;
        this.angle3DS = angle3DS;
        this.color = color;
        this.floats = floats;
    }

    }
