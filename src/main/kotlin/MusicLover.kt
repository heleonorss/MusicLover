const val ITEM_PRICE = 100U
const val DISCOUNT = 100U
const val MUSIC_LOVER = true

fun main() {

    val itemCount = readLine()?.toUInt() ?: return
    var totalPrice = ITEM_PRICE * itemCount
    val discountLux = (totalPrice / 100U) * 5U


    if (totalPrice >= 10001U) {
        totalPrice -= discountLux
    } else if (totalPrice in 1001U..10000U) {
        totalPrice -= DISCOUNT
    } else totalPrice

    if (MUSIC_LOVER) {
        val discontMusicLover = (totalPrice / 100U) * 1U
        totalPrice -= discontMusicLover
    } else totalPrice

    println("Your check: $totalPrice")
}