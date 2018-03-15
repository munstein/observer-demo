package core

import interfaces.IObservable
import interfaces.IObserver

class RainStation : IObservable{

    var observers : ArrayList<IObserver>
    var willRain : Boolean
        get() = this.willRain
        set(value) {
            this.willRain = value
            notifyObservers()
        }

    init {
        willRain = false
        observers = ArrayList()
    }

    override fun add(observer: IObserver) {
        observers.add(observer)
    }

    override fun remove(observer: IObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (o in observers){
            o.update()
        }
    }




}