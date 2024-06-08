// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)


enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} has been enrolled in ${this.nome}.")
    }
}

fun main() {
    // Create educational contents
    val kotlinBasics = ConteudoEducacional("Kotlin Basics", 90)
    val kotlinAdvanced = ConteudoEducacional("Kotlin Advanced", 120)

    // Create formations
    val basicFormation = Formacao("Basic Kotlin Formation", listOf(kotlinBasics), Nivel.BASICO)
    val advancedFormation = Formacao("Advanced Kotlin Formation", listOf(kotlinAdvanced), Nivel.AVANCADO)

    // Create users
    val user1 = Usuario("Alice", "alice@example.com")
    val user2 = Usuario("Bob", "bob@example.com")

    // Enroll users in formations
    basicFormation.matricular(user1)
    advancedFormation.matricular(user2)

    // Print enrolled users
    println("Enrolled users in ${basicFormation.nome}: ${basicFormation.inscritos.map { it.nome }}")
    println("Enrolled users in ${advancedFormation.nome}: ${advancedFormation.inscritos.map { it.nome }}")
}
