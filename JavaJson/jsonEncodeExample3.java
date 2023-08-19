package JavaJson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import OOPJAVA.Main;

public class jsonEncodeExample3 {
    public static void main(String[] args) {
        JSONArray arr = new JSONArray();
        
        arr.add("Sanaz");
        arr.add("&");
        arr.add("Revanza");

        JSONObject obj = new JSONObject();
        obj.put("Emloye", arr);
        System.out.println(obj);
    }
    
}
