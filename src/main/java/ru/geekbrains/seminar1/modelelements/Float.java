package ru.geekbrains.seminar1.modelelements;

// Мощность задается одним параметром. Значение = число с плавающей запятой

public class Float {

    private float x; // значение мощности

    public float getX() {
        return x;
    } // геттер+сеттер для изменения полей

    public float setX(float x) {
        this.x = x;
        return x;
    }

    public void Float(float x) // Конструктор для задания уровня мощности

    {
        this.x = x;
    }


    public Float(){} // создали базовую мощность с уровнем ноль

}
