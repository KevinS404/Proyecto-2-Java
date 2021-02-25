/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4_20495193_A1.controlador;

import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Login {
    /*
    public int Login(Stack stackPrincipal,Usuario user){
        //le indicamos al usuario que esta en el proceso de logeo
        System.out.println("PROCESO DE LOGEO\n");
        String nombreInicio;
        //le pedimos que ingrese su usuario por pantalla
        System.out.println("Ingrese su usuario: ");
        Scanner opcion = new Scanner(System.in);
        nombreInicio = opcion.nextLine();
        this.nombre = nombreInicio;
        //hacemos lo mismo para la contraseña del usuario
        String contrasenaInicio;
        System.out.println("Ingrese su contrasena: ");
        Scanner password = new Scanner(System.in);
        contrasenaInicio = password.nextLine();
        this.contrasena = contrasenaInicio;
        /**
         * Una vez se tienen las variables de nombre y contrasena se genera un verificador que
         * nos dira si es que el usuario pudo ser logeado o no. Esto se hace mediante un ciclo en
         * el cual se itera toda la lista de usuarios buscando si el nombre y la contraseña ya se encuentra ingresado,
         * si es que se encuentran entonces cambiamos el valor del user creado en main al usuario guardado
         * a la vez que cambiamos el valor del verificador.
         */
    /*
        int verificador = 1;
        for(int i = 0; i < stackPrincipal.getUsuarios().size();i++){
            if(user.getNombre().equals(stackPrincipal.getUsuarios().get(i).getNombre()) && user.getContrasena().equals(stackPrincipal.getUsuarios().get(i).getContrasena())){
                user = stackPrincipal.getUsuarios().get(i);
                verificador = 0;
           }
        }
        /**
         * Una vez listo este proceso el programa verifica que valor tiene el verificador
         * si este tiene el valor de 1 entonces no se encontro que el usuario o la contraseña
         * estuviera registrado por lo que se le dira que los datos no son validos
         */
    /*
        if(verificador == 1){
            System.out.println("Datos invalidos\n");
            return 1;
        }
        else if(verificador == 0) {
            System.out.println("Usuario logeado: " + user.getNombre());
            return 0;
        }
        return 0;
    }
*/
}
