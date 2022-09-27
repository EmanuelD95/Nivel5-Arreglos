fun main() {
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
    ejercicio7()
    ejercicio8()
    ejercicio9()
    ejercicio10()
}

/*Nivel 5: Arreglos o Vectores.*/
fun ejercicio1() {
    println("\n1. Hacer un programa que rellene un arreglo con los 10 primeros números enteros y los muestre en pantalla en orden ascendente.\n")
    val numeros = mutableListOf<Int>()

    for (i in 1..10) {
        numeros.add(i)
    }
    println("Numeros: $numeros")
}
fun ejercicio2() {
    println("\n2. Hacer un programa que rellene un arreglo con los 10 primeros números enteros y los muestre en pantalla en orden descendente. (Propuesto)\n")
    val numeros = mutableListOf<Int>()

    for (i in 1..10) {
        numeros.add(i)
    }
    numeros.sortDescending()
    println("Numeros: $numeros")
}
fun ejercicio3() {
    println("\n3. Hacer un programa que rellene un arreglo con los números pares comprendidos entre 1 y 20 y los muestre en pantalla en orden ascendente.\n")
    val numeros = mutableListOf<Int>()

    for (i in 0..20 step 2) {
        numeros.add(i)
    }
    println("Numeros: $numeros")
    //val arrayPares = IntRange(2, 20).step(2).toList().toIntArray()
    //println("ArrayPares: ${arrayPares.toMutableList()}")
}
fun ejercicio4() {
    println("\n4. Hacer un programa que rellene un array con los números impares comprendidos entre 1 y 20 y los muestre en pantalla en orden descendente. (Propuesto)\n")
    val numeros = mutableListOf<Int>()

    for (i in 1..20 step 2) {
        numeros.add(i)
    }
    numeros.sortDescending()
    println("Numeros: $numeros")
}
fun ejercicio5() {
    println("\n5. Hacer un programa que lea 5 números por teclado, los almacene en un array y muestre la suma, resta, multiplicación y división de todos.\n")

    val listaDeNumeros = mutableListOf<Int>()
    var numero: Int = 0
    var multiplicacion: Int = 1

    repeat(5) {
        print("Ingrese numero: ")
        numero = readLine()!!.toInt()
        listaDeNumeros.add(numero)
    }
    println("Lista de numeros: $listaDeNumeros")
    println("Suma: ${listaDeNumeros.sum()} ")
    for (i in 0 until listaDeNumeros.size)
        multiplicacion *= listaDeNumeros[i]
    println("Multiplicacion: $multiplicacion")
}
fun ejercicio6() {
    println("\n6. Hacer un programa que lea 10 números por teclado, 5 para un array y 5 para otro array distinto. Mostrar los 10 números en pantalla mediante un solo array. (Propuesto)\n")

    val primeraLista = mutableListOf<Int>()
    var numero: Int = 0

    repeat(5) {
        print("Ingrese numero: ")
        numero = readLine()!!.toInt()
        primeraLista.add(numero)
    }

    val segundaLista = mutableListOf<Int>()
    var numeros: Int = 0

    repeat(5) {
        print("Ingrese numero: ")
        numeros = readLine()!!.toInt()
        segundaLista.add(numeros)
    }
    println(primeraLista+segundaLista)
}
fun ejercicio7() {
    println("\n7. Hacer un programa que lea 5 números por teclado, los almacene en un array y los ordene de forma ascendente.\n")
    val numeros = mutableListOf<Int>()
    var numero: Int = 0


    repeat(5) {
        print("Ingrese numero: ")
        numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    numeros.sort()
    println("Numeros: $numeros")
}
fun ejercicio8() {
    println("\n8. Hacer un programa que lea 5 números por teclado, los copie a otro array multiplicados por 2 y muestre el segundo array. (Propuesto)\n")

    val primeraLista = mutableListOf<Int>()
    var numero: Int = 0

    val segundaLista = mutableListOf<Int>()

    repeat(5) {
        print("Ingrese numero: ")
        numero = readLine()!!.toInt()
        primeraLista.add(numero)
    }

    primeraLista.forEach {// 1 2 3 4 5
        segundaLista.add(it*2)
    }
    println(segundaLista)
}
fun ejercicio9() {
    println("\n9. Hacer un programa que rellene un array con los 100 primeros números pares y muestre su suma.\n")
    val numeros = mutableListOf<Int>()

    for (i in 1..100) {
        numeros.add(i*2)
    }
    println("Numeros: $numeros")
    println("Suma: ${numeros.sum()} ")
}
fun ejercicio10() {
    println("\n10. Hacer un programa que lea 10 números por teclado, los almacene en un array y muestre la media. (Propuesto)\n")
    val numeros = mutableListOf<Int>()
    var numero: Int = 0
    repeat(10) {
        print("Ingrese numero: ")
        numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    println("La media es: ${numeros.sum().toDouble()/10}")
}