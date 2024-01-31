package lesson11

class Category(val image: Image, val title: String, val description: String)
class Recipe(
    val cover: Image,
    var isFavorite: Boolean,
    val title: String,
    val ingredientsList: List<Ingredient>,
    var portions: Int
)

class Ingredient(val title: String, val amount: Int)

class Image(val id: Int, val src: String)