package core

import interfaces.IObserver

class NotificadorChuva(rainStation : RainStation) : IObserver {

    var rainStation : RainStation

    init {
        this.rainStation = rainStation
    }

    override fun update() {
        if(rainStation.willRain)
            println("Vai chover.")
        else
            println("Não vai chover.")
    }
}