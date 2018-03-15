package core

import interfaces.IObserver

class NotificadorChuva(rainStation : RainStation) : IObserver {

    var rainStation : RainStation

    init {
        this.rainStation = rainStation
    }

    override fun update() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}