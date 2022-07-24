package jsonparser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Json {
    private static ObjectMapper objectMapper = getDfaultObject();
    private static ObjectMapper getDfaultObject(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        //--//
        return defaultObjectMapper;
    }
    public static JsonNode parse(String data) throws IOException {
        return objectMapper.readTree(data);
    }

    public static <A>A fromJson(JsonNode node,  Class<A>clazz) throws JsonProcessingException {
        return objectMapper.treeToValue(node,clazz);
    }

}
