
package LAB4_20495193_A1;

import LAB4_20495193_A1.modelo.Stack;
import LAB4_20495193_A1.modelo.Pregunta;
import LAB4_20495193_A1.vista.MainMenu;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        //primero se incluyen todas las estructuras de ejemplo solicitadas
        //1 stack inicial
        Stack stackPrincipal = new Stack();
        //4 usuarios registrados de ejemplo
        stackPrincipal.agregarUsuario("usuario1", "contrasena1",500);
        stackPrincipal.agregarUsuario("usuario2", "contrasena2",200);
        stackPrincipal.agregarUsuario("usuario3", "contrasena3",10);
        stackPrincipal.agregarUsuario("usuario4", "contrasena4",27);
        //4 etiquetas de ejemplo
        stackPrincipal.agregarEtiqueta("java","lenguaje orientado a objetos");
        stackPrincipal.agregarEtiqueta("prolog","lenguaje de paradigma logico");
        stackPrincipal.agregarEtiqueta("scheme","lenguaje de paradigma funcional");
        stackPrincipal.agregarEtiqueta("c++","lenguaje orientado a objetos");
        //auxiliares para generar 5 preguntas con sus etiquetas respectivas
        ArrayList<String> etiqueta1 = new ArrayList<>();
        etiqueta1.add("java");
        ArrayList<String> etiqueta2 = new ArrayList<>();
        etiqueta1.add("prolog");
        ArrayList<String> etiqueta3 = new ArrayList<>();
        etiqueta1.add("scheme");
        ArrayList<String> etiqueta4 = new ArrayList<>();
        etiqueta1.add("c++");
        //5 preguntas de ejemplo
        
        stackPrincipal.agregarPregunta(1,2,etiqueta1, "titulo1", "contenido1" , "fechaDePublicacion1", "usuario1", "cerrada", 0);
        stackPrincipal.agregarPregunta(2,0,etiqueta2, "titulo2", "contenido2" , "fechaDePublicacion2", "usuario2", "abierta", 15);
        stackPrincipal.agregarPregunta(3,5,etiqueta3, "titulo3", "contenido3" , "fechaDePublicacion3", "usuario3", "cerrada", 0);
        stackPrincipal.agregarPregunta(4,1,etiqueta1, "titulo4", "contenido4" , "fechaDePublicacion4", "usuario4", "abierta", 0);
        stackPrincipal.agregarPregunta(5,6,etiqueta4, "titulo5", "contenido5" , "fechaDePublicacion4", "usuario1", "cerrada", 0);

        //10 respuestas de ejemplo
        stackPrincipal.agregarRespuesta(1,1, "usuario1", "27/07/2020", "contenido1");
        stackPrincipal.agregarRespuesta(2,2, "usuario1", "07/01/2021", "contenido2");
        stackPrincipal.agregarRespuesta(3,1, "usuario2", "10/07/2020", "contenido3");
        stackPrincipal.agregarRespuesta(2,1, "usuario2", "27/03/2020", "contenido4");
        stackPrincipal.agregarRespuesta(1,2, "usuario2", "02/01/2021", "contenido5");
        stackPrincipal.agregarRespuesta(3,2, "usuario3", "30/11/2020", "contenido6");
        stackPrincipal.agregarRespuesta(2,3, "usuario3", "20/09/2020", "contenido7");
        stackPrincipal.agregarRespuesta(2,4, "usuario3", "12/12/2020", "contenido8");
        stackPrincipal.agregarRespuesta(4,5, "usuario4", "06/07/2020", "contenido9");
        stackPrincipal.agregarRespuesta(5,5, "usuario4", "15/01/2020", "contenido10");
        */
       MainMenu menu = new MainMenu();
       menu.setVisible(true);
    }
}