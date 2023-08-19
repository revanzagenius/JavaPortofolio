package ExamWeek5;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class Soal2Encode {
    public static void main(String[] args) {
        JSONArray encode = new JSONArray();
    
        JSONObject data1 = new JSONObject();
        data1.put("Name", "jhon");
        data1.put("Age", 30);
        data1.put("City", "New York");
        encode.add(data1);

        JSONObject data2 = new JSONObject();
        data2.put("Name", "Anna");
        data2.put("Age", 25);
        data2.put("City", "London");
        encode.add(data2);

        JSONObject data3 = new JSONObject();
        data3.put("Name", "Petter");
        data3.put("Age", 36);
        data3.put("City", "NMadrid");
        encode.add(data3);
        
        JSONObject obj = new JSONObject();
        obj.put("Employe", encode);
        System.out.println(obj);
    }
    
}
