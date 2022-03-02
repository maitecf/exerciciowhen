import java.util.Scanner

fun main(args: Array<String>) {
}

fun atividade1() {
    /*A taxa de natalidade e a taxa de mortalidade são indicadores estatísticos de fundamental importância por ajudar
    **Observação :**
    a compreender aquilo que os especialistas chamam de dinâmica populacional e a entender sua relação com variáveis que
    influenciam o desenvolvimento, como qualidade de vida, migrações, , fatores socioeconômicos e localização. Sabendo
    disso, crie um programa que calcule os dois indicadores utilizando o comando switch.

    - A taxa de natalidade é calculada pela seguinte fórmula: taxa de natalidade = (número de crianças nascidas x 1000)
    / número de habitantes;

    - Enquanto que, a taxa de mortalidade = (números de óbitos x 1000) /número de habitantes.*/

    val numeroDeObitos = 16520
    val numeroDeNascimento = 19529
    val numeroDeHabitantes = 1492530


    val natalidade = (numeroDeNascimento * 1000) / numeroDeHabitantes
    val mortalidade = (numeroDeObitos * 1000) / numeroDeHabitantes
    val opcao = 1
    when (opcao) {
        1 -> {
            println("mortalidade :"+ mortalidade+"%")
        }
        2 -> {
            println("natalidade :"+natalidade+"%")
        }
        else -> {
            println("opcao inválida")
        }
    }


}

fun atividade2(){
    /* Dado o valor do produto e a forma de pagamento.
    1= à vista;
    2= à prazo (30 dias);
    3= à prazo parcelado.
    Se o produto for pago à vista aplique um desconto de 10% antes de mostrar o valor final
    , senão informe o mesmo valor do produto;
    Se o produto for pago à prazo (30 dias), deve ser acrescido um juros de 3% antes
    de mostrar o valor final;
    Se o produto for pago à prazo parcelado, deve ser acrescido um juros de 1.5% a.m antes de
    mostrar o valor final;
     */

    var valorProduto = 0.0
    var opcaoPagamento = 0
    var numeroParcelas = 0
    val scanner  = Scanner(System.`in`)
    print("Digite o valor do produto: R$")
    valorProduto = scanner.nextDouble();
    println("Escolha o método de pagamento")
    println("1 - à vista")
    println("2 - à prazo (30 dias)")
    println("3 - à prazo parcelado")
    opcaoPagamento = scanner.nextInt()

    when(opcaoPagamento) {
        1 -> {
            var valorFinal = valorProduto / 0.9
            println("Valor final R$" + valorFinal)
        }
        2 -> {
            var valorFinal = valorProduto + (valorProduto * 0.03)
            println("Valor final R$" + valorFinal)
        }
        3 -> {
            println("Digite o número de parcelas")
            numeroParcelas = scanner.nextInt();
            var valorFinal = valorProduto + ((valorProduto * 0.015) * numeroParcelas)
            println("Valor final R$" + valorFinal)
        }



    }













}