package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;


// Полигоны считаются с единицы. Класс не предполагает наследование=ставим final.
//// Переменная name будет использоваться вне класаа, значит ей нужна уникальность. Сделаем namepoligon.
//// Полигон может применяться на разных объектах, вне класса. Значит уникальность => namepoligon
//
//// Не использовано имя и id
public class Poligon {

    static int counter = 1;
    private final int idpoligon;
    private String namepoligon;

    public int getIdpoligon() {
        return idpoligon;
    }
    public String getNamepoligon() {
        return namepoligon;
    }

    {
        idpoligon = ++counter;
    }

    private Collection<Point3D> points; // Коллекция точек из которых состоит полигон

    public Collection<Point3D> getPoint() {return points; } // Геттер + сеттер для создания коллекции точек

    public Poligon(Collection<Point3D> point) {
        this.points = point;
    }
}
