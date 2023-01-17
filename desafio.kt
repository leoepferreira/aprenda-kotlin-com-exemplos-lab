// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val cpf: String, val dataNascimento: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val formacao1 = Formacao("Kotlin", listOf(ConteudoEducacional("Introdução ao Kotlin",60,Nivel.BASICO),ConteudoEducacional("Programação funcional",75,Nivel.INTERMEDIARIO)), Nivel.BASICO)
    val formacao2 = Formacao("Java", listOf(ConteudoEducacional("Introdução ao Java",60,Nivel.BASICO),ConteudoEducacional("Programação Orientada a Objetos",75,Nivel.INTERMEDIARIO)), Nivel.INTERMEDIARIO)
    val formacao3 = Formacao("Python", listOf(ConteudoEducacional("Introdução ao Python",60,Nivel.BASICO),ConteudoEducacional("Programação para Data Science",75,Nivel.DIFICIL)), Nivel.DIFICIL)
    val aluno1 = Usuario("João","123.456.789-00","01/01/1990")
    val aluno2 = Usuario("Maria","987.654.321-00","01/01/1985")
    val aluno3 = Usuario("Lucas","111.222.333-00","01/01/1995")
    formacao1.matricular(aluno1)
    formacao1.matricular(aluno2)
    formacao2.matricular(aluno2)
    formacao2.matricular(aluno3)
    formacao3.matricular(aluno1)
    formacao3.matricular(aluno3)
    println("Formação: ${formacao1.nome}")
    println("Nível: ${formacao1.nivel}")
    println("Conteúdos: ${formacao1.conteudos.joinToString()}")
    println("Inscritos: ${formacao1.inscritos.joinToString {it.nome}}")
    println("\nFormação: ${formacao2.nome}")
    println("Nível: ${formacao2.nivel}")
    println("Conteúdos: ${formacao2.conteudos.joinToString()}")
    println("Inscritos: ${formacao2.inscritos.joinToString {it.nome}}")
	println("\nFormação: ${formacao3.nome}")
	println("Nível: ${formacao3.nivel}")
	println("Conteúdos: ${formacao3.conteudos.joinToString()}")
	println("Inscritos: ${formacao3.inscritos.joinToString {it.nome}}")
}
