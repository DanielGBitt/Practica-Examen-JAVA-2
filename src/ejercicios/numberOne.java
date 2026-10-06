package ejercicios;

import java.util.Scanner;

public class numberOne {
    public static void main(String[] args) {

        //Variables
        String nombreUsuario = "";
        int usuariosRegistrados = 0;
        int clasesRegistradas = 0;
        int totalCostoClases = 0;

        byte opcionClase = 0;

        byte opcionPrincipal = 0;
        boolean salir = false;

        //Entrada
        Scanner in = new Scanner(System.in);


        System.out.println("Bienvenido al GYM");


        do {
            System.out.println("""
                       Ingrese la opcion deseada:
                       1) Registrar Usuario
                       2) Registra Clase
                       3) Mostrar total clases
                       4) Mostrar total ingresos
                       5) Salir
                    """);

            opcionPrincipal = in.nextByte();
            in.nextLine();

            switch (opcionPrincipal) {
                case 1:

                    if (usuariosRegistrados == 5) {
                        System.out.println("------------------------------------------------");
                        System.out.println("Limite registro de usuario permitido, alcanzado!!");
                        System.out.println("------------------------------------------------");
                    } else {
                        System.out.println("------------------------------");
                        System.out.println("Favor ingresar su nombre de usuario");

                        do {
                            nombreUsuario = in.nextLine();

                            if (nombreUsuario == "") {
                                System.out.println("Para poder continuar debes ingresar un usuario!!");
                            }
                            //Verificamos que devuelva cada vez que este vacio el nombre
                            // asegurando que no continue si no hay usuario registrado
                        } while (nombreUsuario == "");

                        usuariosRegistrados += 1;
                    }

                    //BREAK
                    break;


                case 2:

                    if (usuariosRegistrados == 0) {
                        System.out.println("------------------------------------------------");
                        System.out.println("Debe haber algun usuario registrado para continuar!!");
                        System.out.println("------------------------------------------------");
                    } else {

                        if (clasesRegistradas == 5) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Limite de clases registradas alcanzada!!");
                            System.out.println("------------------------------------------------");
                        } else {
                            System.out.println("""
                                    Seleccione la clase:
                                    ------------------
                                    1) Spinning ($30)
                                    2) Yoga ($25)
                                    3) CrossFit ($40)
                                    -------------------
                                    """);

                            opcionClase = in.nextByte();

                            if (opcionClase == 1 || opcionClase == 2 || opcionClase == 3) {
                                switch (opcionClase) {
                                    case 1:
                                        System.out.println("-----------------");
                                        System.out.println("Costo clase: $30");
                                        System.out.println("-----------------");
                                        totalCostoClases += 30;
                                        break;

                                    case 2:
                                        System.out.println("-----------------");
                                        System.out.println("Costo clase: $25");
                                        System.out.println("-----------------");
                                        totalCostoClases += 25;
                                        break;

                                    case 3:
                                        System.out.println("-----------------");
                                        System.out.println("Costo clase: $40");
                                        System.out.println("-----------------");
                                        totalCostoClases += 40;
                                        break;
                                }

                                clasesRegistradas += 1;
                            } else {
                                System.out.println("-----------------");
                                System.out.println("Ingresa un valor valido, vuelve a intentarlo!!");
                                System.out.println("-----------------");
                            }


                        }

                    }


                    break;


                case 3:

                    if (clasesRegistradas > 0) {
                        System.out.println("----------------------------------");
                        System.out.println("Total clase registrada: " + clasesRegistradas);
                        System.out.println("----------------------------------");

                    } else {
                        System.out.println("----------------------------------");
                        System.out.println("No haz realizado ningun registro de clases!!");
                        System.out.println("----------------------------------");
                    }

                    break;


                case 4:

                    if (clasesRegistradas > 0) {
                        System.out.println("----------------------------------");
                        System.out.println("Total ingresos: $" + totalCostoClases);
                        System.out.println("----------------------------------");
                    } else {
                        System.out.println("----------------------------------");
                        System.out.println("No haz realizado ningun registro de clases!!");
                        System.out.println("----------------------------------");
                    }

                    break;

                case 5:
                    salir = true;
                    break;
            }
        } while (salir == false);

        System.out.println("--------------------------------");
        System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA!");
        System.out.println("--------------------------------");

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