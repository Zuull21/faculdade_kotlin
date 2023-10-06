class Lutador {
    var nome: String = ""
    var forcaAtaque: Double = 0.0
    var forcaDefesa: Double = 0.0
    var vidaAtual: Double = 100.0
    var golpesSofridos: MutableList<Double> = mutableListOf()

    fun concentrar(): Double {
        return vidaAtual + (vidaAtual * 0.5)
    }

    fun treinarLeve(semanas: Int) {
        forcaAtaque += (1*semanas)
    }

    fun treinarForte(semanas: Int) {
        forcaAtaque += (3*semanas)
    }

    fun apanhar(quemBate: Lutador) {
        if(quemBate.forcaAtaque > forcaDefesa) {
            vidaAtual -= (quemBate.forcaAtaque - forcaDefesa)
            golpesSofridos.add(quemBate.forcaAtaque)
        }
        if(vidaAtual < 0.0) {
            vidaAtual = 0.0
        }

    }
    fun descrever(): String {
        return("Lutador $nome, tem $vidaAtual de vida e já recebeu ${golpesSofridos.size} golpes")
    }

}