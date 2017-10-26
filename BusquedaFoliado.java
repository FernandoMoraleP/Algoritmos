/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4.ex;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BusquedaFoliado {

    /**
     * @param args the command line arguments
     */
    private static boolean IsInt(String cad){
        if(!cad.isEmpty()){
            try{
                if( cad.matches("^\\d+") )
                    return true;
                else
                    return false;
            }catch(NumberFormatException e){
                //e.printStackTrace();
            }
        }
        return false;
    }
    
    private static boolean IsCadena(String cad){
        if(!cad.isEmpty()){
            if( cad instanceof String )
                if( cad.length() > 1 )
                    return true;
        }
        return false;
    }
    
    public static String leeTeclado(){
        Scanner scNumCta = new Scanner(System.in);
        return scNumCta.nextLine();
    }
    
    public static String validaEntradaSrtring(String campo){
        String entrada = "";
        while( true ){
            System.out.print(campo + ": ");
            entrada = leeTeclado();
            if( IsCadena( entrada ) )
                break;
            else
                System.out.println("-" + campo + "- debe de ser una cadena de caracteres");
        }
        return entrada;
    }
    
    public static int validaEntradaInt(String campo){
        String entrada = "";
        while( true ){
            System.out.print(campo + ": ");
            entrada = leeTeclado();
            if( IsInt( entrada ) )
                return Integer.parseInt(entrada);
            else
                System.out.println("-" + campo + "- debe de ser un número entero");
        }
    }
    public static boolean buscaAlumno(ArrayList<Alumno> lista, String busqueda, int cont, boolean encontrado){
        if( cont < lista.size() ){
            if( IsInt(busqueda) ){
                if( lista.get(cont).getNumCta() == Integer.parseInt(busqueda) ){
                    ImprimeFichaAlumno( lista.get(cont) );
                    encontrado = true;
                }
            }else{
                if( lista.get(cont).getNombre().contains(busqueda)  ||
                    lista.get(cont).getApPaterno().contains(busqueda) ||
                    lista.get(cont).getApMaterno().contains(busqueda) ){
                        ImprimeFichaAlumno( lista.get(cont) );
                        encontrado = true;
                }
            }
            
            return buscaAlumno(lista, busqueda, (cont+1), encontrado);
        }else{
            if( !encontrado )
                System.out.println("El alumno con el criterio de busqueda: " + busqueda + " no fué encontado");
        }
        return false;
    }
    
    public static void ImprimeFichaAlumno(Alumno alumno){
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println("******************************************************************************************");
        System.out.println("* NOMBRE:\t" + alumno.getNombre() + " " + alumno.getApPaterno() + " " + alumno.getApMaterno() );
        
        Calendar hoy = GregorianCalendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - alumno.getfNac().get(Calendar.YEAR);
        System.out.println("* EDAD:\t\t" + edad );
        //System.out.println("* FEC DE NAC.:\t" + alumno.getFechaNac().getDate() + "/" + alumno.getFechaNac().getMonth() + "/" + alumno.getFechaNac().getYear());
        System.out.println("* FEC DE NAC.:\t" + sdf.format( alumno.getfNac().getTime() ) );
        System.out.println("* RFC:\t\t" + alumno.getRfc());
        System.out.println("******************************************************************************************");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Alumno> lista = new ArrayList<>();
        String opc = "";
        int cont = 1;
        do{
            String numCta = "", nombre = "", apPaterno ="", apMaterno ="";
            //Abstracta
            //Date fechaNac = new Date();
            Calendar fNac = new GregorianCalendar();
            System.out.println("Inroduce los datos del alumno " + cont );
            
            nombre = validaEntradaSrtring("Nombre");
            apPaterno = validaEntradaSrtring("Apellido Paterno");
            apMaterno = validaEntradaSrtring("Apellido Materno");
            
            int anio = 0, mes = 0, dia = 0;
            dia = validaEntradaInt("Día");
            mes = validaEntradaInt("Mes")-1;
            anio = validaEntradaInt("Año");
            fNac.set(anio, mes, dia);
            lista.add( new Alumno(cont, nombre, apPaterno, apMaterno, fNac) );
            cont++;
            
            System.out.print("Otro? (s/n) :");
            opc = leeTeclado();
            System.out.println("");
        }while(!opc.equals("n"));
        
        do{
            
            System.out.print("Alumno a buscar?:");
            String busqueda = leeTeclado();
            
            if( IsCadena(busqueda) || IsInt(busqueda) ){
                buscaAlumno(lista, busqueda, 0, false);
            }else{
                System.out.println("El criterio de búsqueda debe de ser numérico o bien una cadena de al menos 2 caracteres");
            }
            
            System.out.print("Otra búsqueda? (s/n) :");
            opc = leeTeclado();
            System.out.println("");
        }while(!opc.equals("n"));
    }
    
}
