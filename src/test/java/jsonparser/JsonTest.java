package jsonparser;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {

    private String simpleTestJsonSource = "{\"title\": \"Coder From Scratch\"}";

    @org.junit.jupiter.api.Test
    void parse() throws IOException {
        JsonNode node= Json.parse(simpleTestJsonSource);
        assertEquals(node.get("title").asText(), "Coder From Scratch");
    }
}