import java.util.Scanner

fun main(args: Array<String>) {
    /*
    Este programa solicita ao usuario a entrada de
    um número, então o programa verifica se este número
    é par ou ímpar. Este processo pode ser repetido quantas vezes
    o usuário desejar. Quando o usuário informa que
    não deseja mais realizar este processo, o programa é finalizado
     */
    val entrada=Scanner(System.`in`)

    var condicao : String
    println("Bem vindo a verificação de numeros pares e impares!")
    do{
        println("Informe um numero: ")
        var number=entrada.nextInt()
        entrada.nextLine()
        if(number%2==0){
            println("O numero é par")
        } else {
            println("O numero é impar")
        }
        println("Deseja verificar se mais um número é par? (S/N)")
        condicao=entrada.nextLine()
    }while (condicao=="S"||condicao=="s")

}