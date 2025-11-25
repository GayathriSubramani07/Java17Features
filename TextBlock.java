package com.demo;

public class TextBlock {
    public static void main(String[] args) {

        // Before Java 15 (Old Style)
        String jsonOld = "{\n" +
                "    \"name\": \"Gayathri\",\n" +
                "    \"role\": \"Developer\"\n" +
                "}";

        System.out.println("Before Text Block:\n" + jsonOld);

        // After Java 15 (Text Block)
        String jsonNew = """
                {
                    "name": "Gayathri",
                    "role": "Developer"
                }
                """;

        System.out.println("After Text Block:\n" + jsonNew);
    }
}
