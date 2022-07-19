package emailvalidation;
import java.util.ArrayList;

public class searchElement {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("prashant122tiwari@gmail.com");
        emailID.add("prashant.tiwari@gla.ac.in");
        emailID.add("diyapandey@gmail.com");
        emailID.add("tiwariushakant@gmail.com");
        emailID.add("henrik.fiesler@gmx.com");
        emailID.add("laura.kramm@gmx.com");
        emailID.add("sabine.neuwirth@gmx.com");
        
   
        String searcElement = "prashant122tiwari@gmail.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if(searcElement==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID - " + searcElement + "  is validate");
                        
                        break;
                        
                    }
                }

    }

}
