package JavaJson;
import java.io.StringWriter;
import org.json.simple.JSONObject;

public class JsonEncodeExample {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name" , "foo");
        obj.put("num", new Integer(100));
        obj.put("Balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));
        StringWriter out = new StringWriter();
        // obj.writerJSONObject(out);
        // String jsonText = out,toString();
        System.out.println(obj);

    }
    
}
