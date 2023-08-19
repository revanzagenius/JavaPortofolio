package ExamWeek5;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Soal3Decode {
    public static void main(String[] args) throws ParseException {
        
        String str = "{\"mahasiswa\":[{\"name\":\"John\",\"Nilai\":[7,8,9]},{\"name\":\"Anna\",\"Nilai\":[9,7,7]},{\"name\":\"Peter\",\"Nilai\":[6,5,6]}]}";

        // ubah string json menjadi json object
        JSONParser parser = new JSONParser();
        Object jsonObj = parser.parse(str);
        JSONObject jsonObject = (JSONObject) jsonObj;

        JSONArray jsonArrayMhs = (JSONArray) jsonObject.get("mahasiswa");
        for (int i = 0; i < jsonArrayMhs.size(); i++) {
            JSONObject jsonObjectMhs = (JSONObject) jsonArrayMhs.get(i);
            System.out.print("Nilai " + jsonObjectMhs.get("name") + ": ");
            System.out.println();
            JSONArray jsonArrayNilai = (JSONArray) jsonObjectMhs.get("Nilai");
            for (int j = 0; j < jsonArrayNilai.size(); j++) {
                System.out.println(jsonArrayNilai.get(j));
            }
        }
    }
}