package org.jaroso.ProyectMaven;

import org.apache.commons.codec.digest.DigestUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String mensaje = "Hello World!";
        System.out.println(DigestUtils.sha256Hex(mensaje));
    }
}
