package kotlinForProfi.Part4

fun main() {
    println("Название меча")
    println(forgeItem("frostmorn", "still", quantity = 2))
    println("_______")
    forgeItem(
        itemName = "Sword",
        material = " Metal",
        withJewel = false, // дефолтно без
        quantity = 1
    )
}

fun forgeItem(
    itemName: String,
    material: String,
    withJewel: Boolean = false, // дефолтно без
    quantity: Int = 1
) {
    println("$itemName $material $withJewel $quantity")
}

