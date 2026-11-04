package _2condicionales;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner telclado = new Scanner(System.in);

        String usuariosecreto = "root";
        String passwordsecreta = "toor";
        String usuario, password;

        System.out.print("Dime el nombre de usuario: ");
        usuario = telclado.nextLine();
        System.out.print("Dime la contraseña: ");
        password = telclado.nextLine();

        //OPCION 1 - condicion doble

        if (usuario.equals(usuariosecreto) && password.equals(passwordsecreta)){
            //condicion doble, la añado con &&
            //Cojo el equals para concadenar las cadenas y que funcione el codigo

            System.out.println("Login Correcto. Welcome.");
        }
        else {
            System.out.println("OP1:Error de login");
        }
        //OPCION 2 - usando if...else
        if (usuario.equals(usuariosecreto)){
            //si entro, es pq el usuario esta correcto.
            if (password.equals(passwordsecreta)){
                System.out.println("OP2: Login correcto. welcome");
            }
            else {
                System.out.println("OP2: Error de password");
            }
        }
        else {
            System.out.println("OP2: Error de usuario");
            // Este else, va con el primer if por lo que tiene que ir en la
            // primera fila. El error q habia tenido era ponerlo con el
            // segund if.
        }

        //OPCIÓN 3 - usando booleano.
        boolean usuarioOK;
        boolean passOK;

        //Primero analizo el usuario.

        if (usuario.equals(usuariosecreto)){
            usuarioOK = true;
        }
        else {
            usuarioOK = false;
        }

        //Segundo analizo la contraseña.
        if (password.equals(passwordsecreta)){
            passOK = true;
        }
        else {
            passOK = false;
        }
        // Analizo las dos variables booleanas
        if (usuarioOK == true && passOK == true ){
            System.out.println("OP3: Login correcto");
        } else if (usuarioOK == true && passOK == false ) {
            System.out.println("OP3: Error password incorrecta");
        } else if (usuarioOK == false && passOK == true) {
            System.out.println("OP3: Error usuario incorrecto");
        }
        else{ //(usuarioOK == false && passOK == false)
            System.out.println("OP3: Error total. Password y usuario " +
                    "incorrecto");
        }
    }
}

