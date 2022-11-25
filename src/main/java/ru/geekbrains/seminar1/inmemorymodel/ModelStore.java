package ru.geekbrains.seminar1.inmemorymodel;

import ru.geekbrains.seminar1.modelelements.*;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {

    //TODO: Доработать

    private Collection<PoligonalModel> poligonalModels ; // получаем значния из коллекций

    private Collection <Scene> scenes;
    private Collection <Flash> flashes;
    private Collection <Camera> cameras;


    // гет+сет. можем менять cцену

    public Collection<Scene> getScenes() {return scenes;}    // можем менять сцену

    // Можно только наблюдать
    public void setChangeObservers(Collection<ModelChangedObserver> changeObservers) {this.changeObservers = changeObservers; }
    public void setPoligonalModels(Collection<PoligonalModel> poligonalModels) {this.poligonalModels = poligonalModels; }
    public void setFlashes(Collection<Flash> flashes) { this.flashes = flashes; }
    public void setCameras(Collection<Camera> cameras) {this.cameras = cameras;}

    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
    }

    @Override
    public void NotifyChange() {
    }
}
