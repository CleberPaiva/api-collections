package dio.cleberpaiva.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 3240.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")


    println("------------------")
    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    salariosMaiorque2500.forEach { println(it)}


    println("------------------")
    println(salarios.count { it in 2000.0..5000.0})

    println("------------------")
    println(salarios.find { it == 3240.0})
    println(salarios.find { it == 3440.0})

    println("------------------")
    println(salarios.any { it == 1000.0})
    println(salarios.any { it == 500.0})
}