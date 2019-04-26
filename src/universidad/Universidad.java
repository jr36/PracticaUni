/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joserra
 */
public class Universidad {

    ArrayList<Alumnos> añadir_alumno= new ArrayList();
    ArrayList<Profesores> añadir_profesor= new ArrayList();
    ArrayList<PAS> añadir_PAS= new ArrayList();
    
    public static void main(String[] args) {
    
         ArrayList<Alumnos> añadir_alumno= new ArrayList();
         ArrayList<Profesores> añadir_profesor= new ArrayList();
         ArrayList<PAS> añadir_PAS= new ArrayList();
    
    int opcion, fin=0; 
    String NumRegistro;
    Scanner teclado= new Scanner(System.in);    
    
    Operaciones gestion=new Operaciones();
    
    do{
        System.out.println("----Universidad Virtual----");
        System.out.println("1. Mostrar datos de los universitarios");
        System.out.println("2. Matricular alumno en centro");
        System.out.println("3. Añadir profesores a departamento");
        System.out.println("4. Añadir PAS a Unidad Administrativa");
        System.out.println("5. Obtener numero de registro de un empleado");
        System.out.println("6. Salir");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Introduce la opcion: ");
        opcion=teclado.nextInt();
        
        switch(opcion){
            case 1:
                
                gestion.MostrarDatos();
                break;
                
            case 2: 
                gestion.MatricularAlumno(añadir_alumno);
                break;
            case 3:
                gestion.AñadirProfesor(añadir_profesor);
                break;
            case 4:
                gestion.AñadirPAS(añadir_PAS);
                break;
            case 5:
                gestion.ObtNumRegistro();
                break;
            case 6:
                 fin=1;
                break;
            
        }
    }while (fin==0);
    }
    
}
