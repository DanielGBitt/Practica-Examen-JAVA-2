package ejercicios;

import java.util.Scanner;

public class numberOne {
    public static void main(String[] args) {

        //Variables
        String nombreUsuario = "";
        int usuariosRegistrados = 0;

        byte opcionClase = 0;

        //Entrada
        Scanner in = new Scanner(System.in);


        System.out.println("Bienvenido al GYM");
        System.out.println("------------------------------");
        do {
            System.out.println("Favor ingresar su nombre de usuario");
            nombreUsuario = in.nextLine();

            if (nombreUsuario == ""){
                System.out.println("Para poder continuar debes ingresar un nombre!!");
            }

        }while(nombreUsuario == "");

        System.out.println("""
                Seleccione la clase:
                ------------------
                Spinning ($30)
                Yoga ($25)
                CrossFit ($40)
                -------------------
                """);

    }
}
/*

📝 Simulacro — Gestión de Gimnasio

Se requiere un programa en Java que funcione como un sistema básico de gestión para un gimnasio.
El programa debe mostrar un menú con las siguientes opciones:

Opciones:

1. Registrar un usuario.

Pedir el nombre del usuario.
No permitir que el nombre esté vacío.
El programa podrá registrar hasta 5 usuarios.
Si ya se registraron 5 usuarios, mostrar un mensaje indicando que ya no se pueden registrar más.

2. Registrar una clase.

Verificar que haya al menos un usuario registrado.

Mostrar las clases disponibles:
Spinning ($30)
Yoga ($25)
CrossFit ($40)
Permitir al usuario elegir una clase.

Mostrar el costo de la clase seleccionada.
Llevar un conteo de cuántas clases se han registrado en total.
El programa podrá registrar hasta 5 clases.
Si ya se registraron 5 clases, mostrar un mensaje indicando que ya no se pueden registrar más.
Validar que la opción de clase sea correcta.

3. Mostrar total de clases registradas.

Mostrar la cantidad total de clases registradas.

4. Mostrar total de ingresos.

Mostrar el total acumulado de dinero generado por las clases.

5. Salir del programa.

Notas:
Usar Scanner para las entradas.
Validar que el nombre del usuario no esté vacío.
Validar que la opción de clase sea correcta.
Llevar el conteo de usuarios.
Llevar el conteo de clases.
Llevar un acumulador para los ingresos.
El menú debe continuar mostrándose hasta que el usuario seleccione la opción para salir.
*/