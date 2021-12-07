/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folderlock;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author omobamhuteew
 */
public class CompareTo {
    public static boolean comparePass(String p_initial,String p_final) {
        try {
//            p_initial = ;
//            p_final = ;
            JSONParser parser = new JSONParser();
            Object obj1 = parser.parse(p_initial);
            Object obj2 = parser.parse(p_final);
            JSONArray array1 = (JSONArray)obj1;
            JSONArray array2 = (JSONArray)obj2;
            for(int i =0; i<5;i++){
                JSONObject array1Sub = (JSONObject)array1.get(i);
                Long x0 = (Long) array1Sub.get("x");
                Long y0 = (Long) array1Sub.get("y");
                JSONObject array2Sub = (JSONObject)array2.get(i);
                Long x1 = (Long) array2Sub.get("x");
                Long y1 = (Long) array2Sub.get("y");
                
                if (x1>=(x0-15) && x1<=(x0+15)) {
                    if (y1>=(y0-15) && y1<=(y0+15)) {
                        
                    }else {
                        return false;
                    }
                }
                
            }
        } catch (ParseException ex) {
            Logger.getLogger(CompareTo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(comparePass("[{\"y\":165,\"x\":297},{\"y\":176,\"x\":266},{\"y\":194,\"x\":427},{\"y\":340,\"x\":359},{\"y\":209,\"x\":413}]","[{\"y\":142,\"x\":297},{\"y\":176,\"x\":266},{\"y\":194,\"x\":427},{\"y\":340,\"x\":359},{\"y\":209,\"x\":413}]"));
    }
    
}
