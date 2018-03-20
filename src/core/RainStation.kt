package core

import interfaces.IObservable
import interfaces.IObserver

class RainStation : IObservable {

    var observers: ArrayList<IObserver>
    var willRain: Boolean = false
        get() = field
        set(value) {
            field = value
            notifyObservers()
        }

    init {
        observers = ArrayList<IObserver>()
    }

    override fun add(observer: IObserver) {
        observers.add(observer)
    }

    override fun remove(observer: IObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (o in observers) {
            o.update()
        }
    }


}