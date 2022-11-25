package ru.geekbrains.seminar1.modelelements;

// Текстуры считаются с ноля ( их может и не быть). Класс не предполагает наследование=ставим final.
// Переменная name будет использоваться вне класаа, значит ей нужна уникальность. Сделаем nametexture, чтобы
// в дальнейшем в коде было удобнее ее видеть и работать

// Не использовано имя и id
public class Texture { // текстура хранится в базе данных
    static int counter = 0; // присвоение очередного номера идентификатора
    private final int idtexture; // текстура имеет идентификатор
    private final String nametexture; //  текстура имеет наименование

    // Геттер для чтения значений. Сеттер не нужен. так как текстура создается один раз и лежит в базе
    public int getIdtexture() {
        return idtexture;
    }
    public String getNametexture() {
        return nametexture;
    }


    {
        idtexture = ++counter; // Идентификаторы для присвоения новым текстурам
    }

    public Texture(String nametexture)
    {
        this.nametexture = nametexture;
    } // выводим информацию о текстуре


}
