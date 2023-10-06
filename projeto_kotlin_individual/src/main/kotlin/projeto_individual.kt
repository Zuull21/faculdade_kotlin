fun main() {
    val tokenCorreto = "03231024"
    var tentativasErradas = 0

    while (tentativasErradas < 3) {
        print("Digite o token: ")
        val tokenDigitado = readlnOrNull()

        if (tokenDigitado == tokenCorreto) {
            println("Acesso permitido!")
            break
        } else {
            tentativasErradas++
            println("Token incorreto. Tentativas restantes: ${3 - tentativasErradas}")
        }
    }

    if (tentativasErradas >= 3) {
        println("A máquina foi bloqueada. Entre em contato com o suporte para liberar um novo login na máquina.")
    }
}