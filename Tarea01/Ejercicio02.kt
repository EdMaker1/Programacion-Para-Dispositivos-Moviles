/*Piedra, Papel, Tijera. Escriba un programa que realice el juego de piedra, papel o tijera.
La computadora debe elegir de manera aleatoria la opción a elegir. Después debe preguntar al usuario
que opción quiere. Imprimir si ganó, perdió o empató.

Autor: Edwin Eduardo Ccama Pari
Fecha: 04/04/2025*/

fun main() {
    val opcion = arrayOf("piedra", "papel", "tijera")
    val random = java.util.Random()

    val pc = opcion[random.nextInt(opcion.size)]

    println("Elige una opción (piedra, papel o tijera):")
	//lee y convierte la opción en minusculas
    val person = readLine()?.toLowerCase()
	
	//verifica si opción elegia es piedra, papel o tijera
    if (person in opcion) {
        println("La pc eligió: $pc")
        println("elegiste: $person")
		
		//compara las elecciones para que salga el resultado
        if (person == pc) {
            println("empate")
        } else if ((person == "piedra" && pc == "tijera") ||
            (person == "papel" && pc == "piedra") ||
            (person == "tijera" && pc == "papel")
        ) {
            println("Ganaste")
        } else {
            println("Perdiste")
        }
    } else {
        println("Opción no válida")
    }
}