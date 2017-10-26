/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoalumno;

/**
 *
 * @author YANET
 */
import java.io.*;

public class Reader {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int leeInt() {
        int dato = 0;
        try {
            dato = Integer.parseInt(br.readLine());
        } catch (Exception ex) {
        }
        return dato;
    }

    public Long leeLong() {
        Long dato = 0L;
        try {
            dato = Long.parseLong(br.readLine());
        } catch (Exception ex) {
        }
        return dato;
    }

    public String leeString() {
        String dato = null;
        try {
            dato = br.readLine();
        } catch (Exception ex) {
        }
        return dato;
    }
}
