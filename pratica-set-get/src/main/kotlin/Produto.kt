class Produto {
    var nome: String = ""
        set(value) {
            if(value.length < 4) {
                field = "N/D"
            } else field
            field = value
        }
    var preco: Double = 0.0

    var brinde: Boolean = false
}