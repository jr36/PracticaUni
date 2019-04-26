/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author Joserra
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Operaciones {
    
    ArrayList<Alumnos> añadir_alumno= new ArrayList();
    ArrayList<Profesores> añadir_profesor= new ArrayList();
    ArrayList<PAS> añadir_PAS= new ArrayList();
    
  void MostrarDatos(){
        System.out.println("Estos son los universitarios registrados: ");
        int i;
        for(i=0;i<añadir_alumno.size();i++){
            System.out.println("Alumno nº" +i+": ");
            System.out.println("Nombre: "+añadir_alumno.get(i).Nombre);
            System.out.println("Direccion: "+añadir_alumno.get(i).Direccion);
            System.out.println("Centro: "+añadir_alumno.get(i).Centro);
            System.out.println("_________________________________");
        }
        for(i=0;i<añadir_profesor.size();i++){
            System.out.println("Profesor nº" +i+": ");
            System.out.println("Nombre: "+añadir_profesor.get(i).Nombre);
            System.out.println("Direccion: "+añadir_profesor.get(i).Direccion);
            System.out.println("Departamento: "+añadir_profesor.get(i).Departamento);
            System.out.println("Numero de Registro: "+añadir_profesor.get(i).NumeroRegistro);
            System.out.println("_________________________________");
        }
        for(i=0;i<añadir_PAS.size();i++){
            System.out.println("PAS nº" +i+": ");
            System.out.println("Nombre: "+añadir_PAS.get(i).Nombre);
            System.out.println("Direccion: "+añadir_PAS.get(i).Direccion);
            System.out.println("Unidad Administrativa: "+añadir_PAS.get(i).UnidadAdministrativa);
            System.out.println("Numero de Registro: "+añadir_PAS.get(i).NumeroRegistro);
            System.out.println("_________________________________");
        }
        
        
    }
  void MatricularAlumno(ArrayList<Alumnos> universidad){
        int Numero_alumnos;
        String Nombre = null, Direccion = null, Centro = null;
        
        
       Alumnos aux= new Alumnos(Nombre,Direccion,Centro);
     
        
        Scanner scanf=new Scanner(System.in);
        Numero_alumnos=añadir_alumno.size();
        
        
        System.out.println("Nombre del alumno: ");
        aux.Nombre=scanf.nextLine();
        System.out.println("Direccion: ");
        aux.Direccion=scanf.nextLine();
        System.out.println("Centro: ");
        aux.Centro=scanf.nextLine();
        
        universidad.add(aux);
        
        añadir_alumno=universidad;
    }
  
  void AñadirProfesor(ArrayList<Profesores> universidad){
        int Numero_profesores;
        String Nombre = null, Direccion = null, NumeroRegistro = null, Departamento = null;
        
        Profesores aux1= new Profesores(Nombre, Direccion, NumeroRegistro, Departamento);
        
        
        Scanner scanf=new Scanner(System.in);
        Numero_profesores=añadir_profesor.size();
        
        System.out.println("Nombre del profesor: ");
        aux1.Nombre=scanf.nextLine();
        System.out.println("Direccion: ");
        aux1.Direccion=scanf.nextLine();
        System.out.println("Departamento: ");
        aux1.Departamento=scanf.nextLine();
        System.out.println("Numero de Registro: ");
        aux1.NumeroRegistro=scanf.nextLine();
        
        universidad.add(aux1);
        añadir_profesor=universidad;
    }
  void AñadirPAS(ArrayList<PAS> universidad){
        
        String Nombre = null, Direccion = null, NumeroRegistro = null, UnidadAdministrativa = null;
        
        
       PAS aux2= new PAS(Nombre,Direccion,NumeroRegistro,UnidadAdministrativa);
     
        
        Scanner scanf=new Scanner(System.in);
        
        
        
        System.out.println("Nombre del PAS: ");
        aux2.Nombre=scanf.nextLine();
        System.out.println("Direccion: ");
        aux2.Direccion=scanf.nextLine();
        System.out.println("Unidad Administrativa: ");
        aux2.UnidadAdministrativa=scanf.nextLine();
        System.out.println("Numero de Registro: ");
        aux2.NumeroRegistro=scanf.nextLine();
        
        universidad.add(aux2);
        
        añadir_PAS=universidad;
    }
  void ObtNumRegistro(){
      int i;
      String numero;
      Scanner scanf=new Scanner(System.in);
       System.out.println("Introduzca Numero de Registro para buscar empleado: ");
        numero=scanf.nextLine();
            for(i=0;i<añadir_profesor.size();i++){
                if(numero.equals(añadir_profesor.get(i).NumeroRegistro)){
                System.out.println("Profesor nº" +i+": ");
                System.out.println("Nombre: "+añadir_profesor.get(i).Nombre);
                System.out.println("Direccion: "+añadir_profesor.get(i).Direccion);
                System.out.println("Departamento: "+añadir_profesor.get(i).Departamento);
                System.out.println("_________________________________");
                }
        }for(i=0;i<añadir_PAS.size();i++){
            if(numero.equals(añadir_PAS.get(i).NumeroRegistro)){
                System.out.println("PAS nº" +i+": ");
                System.out.println("Nombre: "+añadir_profesor.get(i).Nombre);
                System.out.println("Direccion: "+añadir_profesor.get(i).Direccion);
                System.out.println("Unidad Administrativa: "+añadir_profesor.get(i).Departamento);
                System.out.println("_________________________________");
        }
        }    
  }
}

