/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seleniums;

import com.thoughtworks.selenium.*;
import junit.framework.Test;
import junit.framework.TestSuite;
import java.io.File;

public class ORANGE {

    static Selenium selenium;
    public static final String TIMEOUT = "30000000";//tres mil segundos
    //static String baseURL="http://oepmpc2804:7001/"; //DELIA
    //static String baseURL="https://pruebatramites.oepm.es/"; //DESA
    static String baseURL="http://orange.es/"; //PRE
    static String URLPATH="/"; //PRE

	
	public static void main(String[] args) throws Exception {

        Rutinas.ArrancaServidor(baseURL, URLPATH);
        selenium=Rutinas.selenium;

        selenium.waitForPageToLoad(TIMEOUT);
        selenium.click("user_m");
		selenium.type("user_m", "696377445");
		selenium.type("pwd_m", "");
		selenium.click("enviar_m");
		selenium.waitForPageToLoad(TIMEOUT);

      
        System.out.println(" Consumo "+selenium.getText("xpath=//*[@id=\"consumo\"]"));
        System.out.println(" Puntos "+selenium.getText("xpath=//*[@id=\"points\"]"));


	
	}
}