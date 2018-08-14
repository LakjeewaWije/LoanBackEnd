package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonServiceUtil {
    private JsonServiceUtil(){

    }

    public static JsonNode toJsonNode(String string) throws IOException {
        ObjectMapper om = new ObjectMapper();
        JsonNode n = om.readTree(string);
        om=null;
        return n;
    }

    public static JsonNode toJsonNode(Object object){
        ObjectMapper om = new ObjectMapper();
        JsonNode n = om.convertValue(object, JsonNode.class);
        om=null;
        return n;

    }


}
