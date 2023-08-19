package JavaJson;
import org.json.simple.JSONObject;

public class jsonEncodeExamlple2 {
    public static void main(String[] args) {
        JSONObject objInner =  new JSONObject();

        objInner.put("Name", "Foo");
        objInner.put("age", 30);
        objInner.put("City", "New York");

        JSONObject obj = new JSONObject();

        obj.put("Employee", objInner);

        System.out.println(obj);

    }
    
}
