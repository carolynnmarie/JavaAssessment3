package parsing_json;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;


public class ElementCollection extends ArrayList<Element> {

    public Element findByAtomicNumber(int atomic_number) throws IOException {
        Gson gson = new Gson();
        String x = Element.class.getResource("/periodic_table.json").getFile();
        JsonParser parser = new JsonParser();
        JsonArray jsonArray = parser.parse(x).getAsJsonArray();
        ArrayList<Element> al = gson.fromJson(jsonArray, ArrayList.class);
        Element element = new Element();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getNumber() == atomic_number) {
                element = al.get(i);
            }
        }
        return element;
    }

    public Element findByName(String name) {
        return null;
    }

    public ElementCollection where(String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {

        return null;
    }
}
