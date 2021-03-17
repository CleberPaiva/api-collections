package dio.cleberpaiva.collections

fun main() {
    val joao = Funcionarios(nome = "João", salario = 3000.0, tipoContratacao = "CLT")
    val pedro = Funcionarios(nome = "Pedro", salario = 4000.0, tipoContratacao = "PJ")
    val maria = Funcionarios(nome = "Maria", salario = 6000.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(joao.nome))

}