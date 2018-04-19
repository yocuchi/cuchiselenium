/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seleniums;
import com.thoughtworks.selenium.*;
import java.io.File;


/**
 *
 * @author fhernan1
 */
public class Rutinas extends SeleneseTestCase{
    
    static Selenium selenium;
    static String UrlPath="/track/tracker.asp?medio=GOOGL&cod=DE870";
    static String baseURL="http://www.ingdirect.es/"; //PRO

    public static final String TIMEOUT = "30000000";//tres mil segundos
    /**
     * @param args the command line arguments
     */
    public static void maina(String[] args) throws Exception{

        selenium = new DefaultSelenium("optimus", 4444,
                           "*firefox", baseURL);

       selenium.start();
       selenium.open(UrlPath);
      

        //que el ciudadano seleccione los codigos:
        

        // TODO code application logic here
    }
 public  static void tomafoto(String s) throws Exception{
    File f= File.createTempFile(s, ".png");
    String CadenaRemota="\\\\XXXPC\\"+f.getAbsolutePath().replace("C:", "C$");
    f.delete();
    selenium.captureEntirePageScreenshot(CadenaRemota,"background=#FFFFFF");
    System.out.println(CadenaRemota);

    }
   

}
