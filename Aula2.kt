import javax.swing.JOptionPane

fun main() {
/*
     Como receber valores de "inputs" que o usuário
        digita na maneira "roots" (pela linha de comando)
 */
//    val sn = Scanner(System.`in`)
//
//    print("Digite seu nome: ")
//    val texto = sn.next()
//
//    println("\nO seu nome é $texto")

    // Estamos exibindo uma janela com uma caixa de texto
    // para perguntar ao usuário o seu nome
    val nomeUsuario =
        JOptionPane.showInputDialog("Digite seu nome!")

//    println("Seu nome é: $nomeUsuario")

    // Estamos exibindo uma janela somente com o texto
    // que é o nome que o usuário digitou
    JOptionPane.showMessageDialog(null, "O seu nome é $nomeUsuario")
}