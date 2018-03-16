import core.NotificadorChuva
import core.RainNotifier
import core.RainStation

fun main(args : Array<String>){
    val rainStation = RainStation()
    val rainNotifier = RainNotifier(rainStation)
    val notificadorChuva = NotificadorChuva(rainStation)

    rainStation.add(rainNotifier)
    rainStation.add(notificadorChuva)

    rainStation.willRain = true

}