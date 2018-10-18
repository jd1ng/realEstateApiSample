package RequestUtil;

import java.io.File;
import java.nio.file.Files;

public class ReadFileUtil {

    public static String readFile(String filePath){
        File inputFile = new File(filePath);
        String result = "";
        try {
            result = new String(Files.readAllBytes(inputFile.toPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
