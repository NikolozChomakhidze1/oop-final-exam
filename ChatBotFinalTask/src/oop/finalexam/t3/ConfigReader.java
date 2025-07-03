package oop.finalexam.t3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigReader {
    private Map<String, String> config = new HashMap<>();

    public ConfigReader(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.trim().isEmpty() || !line.contains("=")) continue;
                String[] parts = line.split("=", 2);
                config.put(parts[0].trim(), parts[1].trim());
            }
        }
    }

    public String getUrl() {
        return config.get("url");
    }

    public String getBotName() {
        return config.get("botName");
    }
}
