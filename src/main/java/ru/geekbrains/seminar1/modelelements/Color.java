package ru.geekbrains.seminar1.modelelements;

public class Color {

    private int r, g, b; // цвет задается тремя основными цветами от 0 до 255

    public int getR() {
        return r;
    } // геттер+сеттер для изменения полей

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void Color (int r, int g, int b) // Конструктор для задания координат точки
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Color(){} // создали базовый цвет (белый)
}
