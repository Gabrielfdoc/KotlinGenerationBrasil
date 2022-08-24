abstract class Animal (
    var nome: String,
    var idade: String,
    var emiteSom: Boolean = true
        ) {

    abstract fun emitindoSom()

    abstract fun locomovendo()

}