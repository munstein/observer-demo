package core

import interfaces.IObserver

class RainNotifier(rainStation: RainStation) : IObserver {

    var rainStation: RainStation

    init {
        this.rainStation = rainStation
    }

    override fun update() {
        if (rainStation.willRain)
            println("It will rain")
        else
            println("It won't rain")
    }
}