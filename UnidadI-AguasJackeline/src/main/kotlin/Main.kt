import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var opcionCurso = 1
    var menuCurso = 1

    do{
    println("========== Bienvenido al Sistema de Cursos ==========")
    println("==========               MENÚ              ==========")
    println("1. Registros de Cursos de Cocina")
    println("2. Registro de Cursos de Programación")
    println("3. Consultar los Cursos")
    println("4. Salir del Sistema")
    println("Ingresa la opcion de la acción que deseas realizar")
    opcionCurso = scanner.nextInt()

        when (opcionCurso) {
            1 -> {
                println("****** Acciones Disponibles para Cursos de Cocina **********")
                println("1. Registrar Participantes")
                println("2. Actualizar Participantes")
                println("3. Consultar Participantes")
                println("4. Volver al Menu Principal")
                println("Ingresa la opción de la acción que deseas realizar")
                menuCurso = scanner.nextInt()

                    when (menuCurso) {
                        1 -> {
                            println("")
                        }
                        2 -> {

                        }
                        3 -> {

                        }
                        4 -> {

                        }
                        else -> println("La opción ingresada no existe")
                    }




            }
            2 -> {
                println("****** Acciones Disponibles para Cursos de Programación ******")
                println("1. Registrar Participantes")
                println("2. Actualizar Participantes")
                println("3. Consultar Participantes")
                println("4. Volver al Menu Principal")
                println("Ingresa la opción de la acción que deseas realizar")
                menuCurso = scanner.nextInt()
                when (menuCurso) {
                    1 -> {

                    }
                    2 -> {

                    }
                    3 -> {

                    }
                    4 -> {

                    }
                    else -> println("La opción ingresada no existe")
                }
            }
            3 -> {

            }
            4 -> {
                println("**********Gracias por utlizar el Sistema de Cursos*********")
                println("**********         Integrantes de Equipo        ***********")
                println("1. Aguas Calderon Jackeline")
                println("2. Cantorán Molina Leonardo Jair")
                println("3. Castro Zúñiga Estefany Alexandra")
                println("4. Gonzalez Baltazar José Daniel ")
                println("5. Otañez González Michelle Dhamar")

            }
        }

    }while(menuCurso==4)
}