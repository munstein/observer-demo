package core

import interfaces.IObserver

class RainNotifier(rainStation : RainStation) : IObserver {

    var rainStation : RainStation

    init {
        this.rainStation = rainStation
    }

    override fun update() {
        println("It will rain")
    }
}