/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivo;

import clases.RegistroCuenta;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author majito1
 */
public class LeerArchivoTexto {
    private Scanner entrada;   
 
    public void abrirArchivo()
    {   
        try
        {     
            entrada = new Scanner( new File( "clientes.txt" ) );  
        } 
    
        catch ( FileNotFoundException ﬁleNotFoundException )   
        {    
            System.err.println( "Error al abrir el archivo." );
            System.exit( 1 );   
        } 
    }  

    public ArrayList<RegistroCuenta> leerRegistros()  
    {     
        ArrayList<RegistroCuenta> registros=new ArrayList<RegistroCuenta>();
        try     
        {     while ( entrada.hasNext() ) 
                {   RegistroCuenta registro = new RegistroCuenta();  
                    registro.establecerCuenta( entrada.nextInt() );            
                    registro.establecerPrimerNombre( entrada.next() );          
                    registro.establecerApellidoPaterno( entrada.next() );  
                    registro.establecerSaldo( entrada.nextDouble() );            
                    registros.add(registro);
                }   
        }    
        catch ( NoSuchElementException elementException )
        {     System.err.println( "El archivo no esta bien formado." );    
                entrada.close();
                System.exit( 1 );   
        }  
        catch ( IllegalStateException stateException )   
        {     System.err.println( "Error al leer del archivo." );     
                System.exit( 1 );
        } 
        return registros;
    } 
    

    public void cerrarArchivo()   
    {    if ( entrada != null )    
            entrada.close(); 
    } 
} 