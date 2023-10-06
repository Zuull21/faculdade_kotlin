import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog


fun main() {
    val lutador1 = Lutador()
    lutador1.nome = showInputDialog(null, "Vamos começar a luta! \n" +
            "Nome do 1°Lutador:")
    lutador1.forcaAtaque = showInputDialog(null,"Qual a força de atk do lutador?").toDouble()
    lutador1.forcaDefesa = showInputDialog(null, "Qual a defesa do lutador?").toDouble()

    val lutador2 = Lutador()
    lutador2.nome = showInputDialog(null, "Vamos começar a luta! \n" +
            "Nome do 2°Lutador:")
    lutador2.forcaAtaque = showInputDialog(null,"Qual a força de atk do lutador?").toDouble()
    lutador2.forcaDefesa = showInputDialog(null, "Qual a defesa do lutador?").toDouble()

for (round in 1 .. 3) {
    val batedor = JOptionPane.showInputDialog("""
            1 - Lutador 1 bate no Lutador 2
            2 - Lutador 2 bate no Lutador 1
            """. trimIndent()).toInt()

    if (batedor == 1) {
        lutador2.apanhar(lutador1)
    } else {
        lutador1.apanhar(lutador2)
    }

    lutador1.descrever()
    lutador2.descrever()


}
    val concentrador = JOptionPane.showInputDialog("""
            1 - Lutador 1 se concentra
            2 - Lutador 2 se concentra
            3 - NDA Nenhuma das alternativas
            """.trimIndent()).toInt()

    if (concentrador == 1) {
        lutador1.concentrar()
    } else {
        lutador2.concentrar()
    }

    if (lutador1.vidaAtual > 0.0 && lutador2.vidaAtual == 0.0) {
        JOptionPane.showMessageDialog(null, "O VENCEDOR É O LUTADOR ${lutador1.nome}")
    } else {
        JOptionPane.showMessageDialog(null, "O VENCEDOR É O LUTADOR ${lutador2.nome}")
    }
}