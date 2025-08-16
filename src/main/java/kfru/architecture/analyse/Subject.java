package kfru.architecture.analyse;

import kfru.architecture.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(Product product, double total) {
        for (Observer observer : observers) {
            observer.update(product, total);
        }
    }
}
