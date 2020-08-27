/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivo;

import clases.RegistroCuenta;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author majito1
 */
public class CrearArchivoTexto 
        {   
        private Formatter salida;   
 
        public void abrirArchivo() 
        {    
            try   
            { 
                salida = new Formatter( "clientes.txt" );   
            }    
            catch ( SecurityException securityException )    
            {     
                System.err.println("No tiene acceso de escritura a este archivo." );     
                System.exit( 1 );    
            }  
            catch ( FileNotFoundException ﬁlesNotFoundException )   
            {    
                System.err.println( "Error al crear el archivo." );   
                System.exit( 1 ); 
            } 
        }   


        public String agregarRegistros(int cuenta, String nombre, String apellido, double saldo) 
        {      
            RegistroCuenta registro = new RegistroCuenta();   
            String mensaje="";
             
                try     
                {          
                        
                    registro.establecerCuenta( cuenta );  
                    registro.establecerPrimerNombre( nombre );           
                    registro.establecerApellidoPaterno( apellido );  
                    registro.establecerSaldo( saldo );     
                    if ( registro.obtenerCuenta() > 0 )           
                    {                 
                                            
                            salida.format( "%d %s %s %.2f\n", registro.obtenerCuenta(),        
                                    registro.obtenerPrimerNombre(), registro.obtenerApellidoPaterno(),       
                                    registro.obtenerSaldo() );    
                            mensaje="Registro agregado";
                    }            
                    else         
                    {                
                        mensaje="El numero de cuenta debe ser mayor que 0." ;
                    }    
                }    
                catch ( FormatterClosedException formatterClosedException )     
                {           
                    mensaje= "Error al escribir en el archivo." ;
                      
                }   
                catch ( NoSuchElementException elementException )     
                {           
                    mensaje="Entrada invalida. Intente de nuevo." ;
                        
                }     
            return mensaje;
        } 


        public void cerrarArchivo() 
        {    
            if ( salida != null )  
                salida.close();  
        } 
}
