enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Aluno(val cpf: String, val nome: String, val idade: Short)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
    }

    fun mostrarAlunos() {
        for (i in inscritos) {
            println(i)
        }
    }

    fun mostrarConteudos() {
        for (i in conteudos) {
            println(i)
        }
    }
}

fun main() {
    val aluno1 = Aluno("156.452.135-32", "Tiago Orlando", 27)
    val aluno2 = Aluno("451.112.200-56", "Clara Assis", 23)
    val aluno3 = Aluno("555.451.325-22", "Rafael Gomes", 22)
    val aluno4 = Aluno("354.484.154-44", "Jonas da Silva", 33)

    val conteudos = listOf(
        ConteudoEducacional("Iniciação ao Kotlin", 4),
        ConteudoEducacional("Orientacao a objetos com Kotlin", 4),
        ConteudoEducacional("API REST Com Spring Boot Kotlin", 10),
        ConteudoEducacional("Modelagem de Dados em SQL", 9)
    )


    val formacao = Formacao("Backend Kotlin Developer", Nivel.INTERMEDIARIO, conteudos)

    formacao.matricular(aluno1)
    formacao.matricular(aluno2)
    formacao.matricular(aluno3)
    formacao.matricular(aluno4)

    formacao.mostrarAlunos()
    println("\n\n")
    formacao.mostrarConteudos()
}