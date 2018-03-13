package interfaces

interface IObservable {
    fun add(observer : IObserver)
    fun remove(observer: IObserver)
    fun notifyObservers()
}