package ru.geekbrains.seminar1.modelelements;

// Полигональная модель состоит из коллекции полигонов и коллекции текстур

import java.util.Collection;

public class PoligonalModel {

    private final Collection<Poligon> poligons; // Получаем данные из коллекции полигонов

    private Collection<Texture> textures; // Получаем данные из коллекции текстур

    public Collection<Poligon> getPoligons() { return poligons; } //  чтение ( геттер)  для полигонов

    public Collection<Texture> getTextures() {
        return textures;
    } //  чтение ( геттер)  для текстур

    // сеттер только для текстур (их мы можем менять)
    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }


    // выводим информацию о полигональной модели ( прменяя текстуры и полигоны)
    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures)
    {
        this.poligons = poligons;
        this.textures = textures;
    }
}
