/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seleniums;

import com.thoughtworks.selenium.*;
import junit.framework.Test;
import junit.framework.TestSuite;
import java.io.File;


public class ImágenesLocalizador {

    static Selenium selenium;
    public static final String TIMEOUT = "30000000";//tres mil segundos
    
    //static String baseURL="https://pruebatramites.oepm.es/"; //DESA
    static String baseURL="http://sitadex.oepm.es/";


    public static void setUp() throws Exception {

       	selenium = new DefaultSelenium("optimus", 4444,
                           "*firefox", baseURL);

        selenium.start();


	}
	
	public static void main(String[] args) throws Exception {
        System.out.println("Vamos a bajar marcas");

        setUp();

        for(int i=0;i<10000;i++){

//"http://www.oepm.es/imgLoc/marcas/000/M0008966.jpg";
            String url_raiz= "http://www.oepm.es/imgLoc/marcas/001/M00";


        /*
        selenium.open("/LocalizadorTMVIEW/locMarcas.action?tmid=M"+(1228136+i));
        selenium.waitForPageToLoad(TIMEOUT);
        if (selenium.isTextPresent("Si la imagen se presenta desproporcionada (Alto, Ancho), Pinche aquí")){
            selenium.waitForPageToLoad(TIMEOUT);
            String dest=selenium.getAttribute("//tr/td[1]/img@src");
            
            Rutinas.tomafoto("dsdsa");
*/
               int s= 10000 + i;
            FileDownload.download( url_raiz + s+ ".jpg", "C:\\Documents and Settings\\XXXXX\\Mis documentos\\Proyectos\\Matlab\\PCA\\Marcas\\"+i+".jpg");
            //UrlDownload.fileDownload(  dest,);

        }
        }

        //from urllib import urlretrieve

        //urlretrieve(url, filename)


	

}
