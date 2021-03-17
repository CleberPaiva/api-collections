package dio.cleberpaiva.collections

fun main() {
    val joao = Funcionarios(nome = "João", salario = 3000.0, tipoContratacao = "CLT")
    val pedro = Funcionarios(nome = "Pedro", salario = 4000.0, tipoContratacao = "PJ")
    val maria = Funcionarios(nome = "Maria", salario = 6000.0, tipoContratacao = "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("-----------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-----------------------------")
    funcionarios.remove(maria)
    funcionarios.forEach { println(it) }

    println("------------SET---------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }


}