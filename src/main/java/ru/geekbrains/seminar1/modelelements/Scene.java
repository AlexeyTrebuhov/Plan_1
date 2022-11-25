package ru.geekbrains.seminar1.modelelements;

import java.util.Collection;

public class Scene {

    static int counter = 1; // Тут отсчет идет с единицы
    private Collection<PoligonalModel> poligonalsModel;
    private int idScene;

      private Collection<PoligonalModel> poligonalModels; // Получаем данные из коллекции полигональных моделей
    private Collection<Flash> flashes; // Получаем данные из коллекции освещенности
    private Collection<Camera> cameras;// Получаем данные из коллекции положения камеры

    //TODO: Доработать класс

    // геттеры и сеттеры для всего. Сцена постоянно изменяется

    public Collection<PoligonalModel> getModels() {return poligonalsModel; }

    public void setModels(Collection<PoligonalModel> models) {this.poligonalsModel = models;}

    public Collection<Flash> getFlashes() { return flashes;}

    public void setFlashes(Collection<Flash> flashes) { this.flashes = flashes; }

    public Collection<Camera> getCameras() { return cameras; }

    public void setCameras(Collection<Camera> cameras) { this.cameras = cameras; }

    {
        idScene = ++counter; // Идентификаторы для присвоения номера новым сценам
    }

    // выводим информацию о сцене ( прменяя составляющие)
    public Scene(Collection<PoligonalModel> poligonalModels, Collection<Flash> flashes)
    {
        this.poligonalsModel = poligonalModels;
        this.flashes = flashes;
    }

}
