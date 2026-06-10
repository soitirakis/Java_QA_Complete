package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import testdata.classes.UserData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {
    private static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT);

    public static Path buildJsonPath(String fileNameNoExt) {
        return Paths.get(System.getProperty("user.dir"),
                "src", "main", "java", "testdata", "files", fileNameNoExt + ".json");
    }

    public static void writeValidNewUser(UserData user, String fileNameNoExt) {
        Path jsonPath = buildJsonPath(fileNameNoExt);

        try {
            Path parent = jsonPath.getParent();
            if (parent != null) Files.createDirectories(parent);

            MAPPER.writeValue(jsonPath.toFile(), user);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write JSON to: " + jsonPath, e);
        }
    }
}
