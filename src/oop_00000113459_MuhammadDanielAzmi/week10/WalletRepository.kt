package oop_00000113459_MuhammadDanielAzmi.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun <T: Any> findItem(predicate: (T) -> Boolean): T? {
        return (items as List<T>).find(predicate)
    }
}