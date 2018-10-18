package RequestUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Optional;

import static java.util.stream.Collectors.joining;

/**
 * Created by xyzer on 9/23/2018.
 */
public class RequestUtilities {

    public static StringBuffer parseResponse(InputStream response) throws IOException{
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response));
        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        return result;
    }

    public static String queryUrlAppend(Optional<HashMap<String,String>> params){
        return  params.get().entrySet()
                .stream()
                .map(Object::toString)
                .collect(joining("&"));
    }


}
