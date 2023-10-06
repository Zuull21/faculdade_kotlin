fun main() {

    mensagemInicial() // aqui estamos INVOCANDO a função

    // Inicializamos essa variável com o valor de café.
    // A nossa xicara tem o valor de café dentro e nada impede que alguém mude o valor em algum momento
    var xicara = "Café"

    // Aqui temos a invocação de uma função/método com responsabilidade única (exibir uma mensagem)
    // Também passamos um argumento para a nossa função
    entregarParaAlguem(xicara)

    esquentar(xicara)
}

// Posso ter várias funções no arquivo kotlin
// e todas podem ser chamadas pela main()
fun mensagemInicial() {
    println("Bom dia!")
}

// Ao declarar uma função que recebe parâmetros,
// precisamos obrigatoriamente definir o tipo desse parâmetro
// como String, Double, Boolean, Int (nosso parâmetro só irá receber valores do mesmo tipo)
fun entregarParaAlguem(conteudoXicara: String) {
    println("Você entregou o seu $conteudoXicara pra fulano esquentar e ele levou para o microondas")
}

// Podemos receber um parâmetro com o nome que quisermos,
// o que virá de fato é o valor
fun esquentar(conteudoXicara: String) {
    println("Esquentando xicara com $conteudoXicara...")
    println("Vrumm Vrumm Vrumm...")
    println("A xicara com $conteudoXicara está quente!")
}