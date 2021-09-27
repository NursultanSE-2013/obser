package com.company;

public interface IObservable {

    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notify1(Integer postType);

}
