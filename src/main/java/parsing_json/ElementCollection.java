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


public class ElementCollection extends ArrayList {


    public Element findByAtomicNumber(int atomic_number) throws IOException {

        Gson gson = new Gson();


    }
    public Element findByName(String name) {
        return null;
    }

    public ElementCollection where(String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
//        ElementCollection =
//        Element el = new Element();
//        Field f = el.getClass().getField(fieldName);
//        value = f.get(el);






        return null;
    }
}
