package ru.geekbrains.seminar1.modelelements;

// Класс Angle3D. Зависит от направления двух векторов в 3D пространстве

public class Angle3D {

    private final Vector3D vector1; // поле для создания угла
    private final Vector3D vector2; // поле для создания угла
    private double angle; // задаем величину угла между ними

    public double getAngle() { // геттеры ( чтение) для угла и векторов
        return angle;
    }

    public Vector3D getVector1() {
        return vector1;
    }

    public Vector3D getVector2() {
        return vector2;
    }

    public Angle3D(Vector3D vector1, Vector3D vector2) // передаем данные угла
    {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }
}
