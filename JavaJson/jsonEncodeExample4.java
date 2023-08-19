package JavaJson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsonEncodeExample4 {
    public static void main(String[] args) {
        
    String str = "{\n" +
                " \"balance\": 1000.21,\n" +
                " \"is_vip\": false,\n" +
                " \"num\": 100,\n" +
                " \"name\": \"foo\"\n" +
                " }";
    
    JSONParser parser = new JSONParser();
    Object jsonObj = parser.parse(str);
    JSONObject jsonObject = (JSONObject) jsonObj;

    String name = (String) jsonObject.get("name");
    System.out.println("Name = " + name);
    long num = (Long) jsonObject.get("num");
     System.out.println("Num = " + num);

    }
}

