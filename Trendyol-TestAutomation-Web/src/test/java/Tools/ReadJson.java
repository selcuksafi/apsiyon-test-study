package Tools;

import Libs.WebLibrary;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

public class ReadJson {

    public static String readJsonString(String key){

        //String fileName = "elements";
        //String resourcesName = String.format("/config/%s.json", fileName);

        String resourcesName = "/config/elements.json";
        String getData = null;

        InputStream getResources = WebLibrary.class.getResourceAsStream(resourcesName);

        if (getResources == null){
            throw new NullPointerException("Cannot find resource file " + resourcesName);
        }

        JSONTokener tokener = new JSONTokener(getResources);
        JSONObject object = new JSONObject(tokener);

        if (object.has(key)){

            getData = object.getString(key);
        }

        return getData;
    }

    public static String readConfigJson(String key){

        String resourcesName = "/config/config.json";
        String getData = null;

        InputStream getResources = WebLibrary.class.getResourceAsStream(resourcesName);

        if (getResources == null){
            throw new NullPointerException("Cannot find resource file " + resourcesName);
        }

        JSONTokener tokener = new JSONTokener(getResources);
        JSONObject object = new JSONObject(tokener);

        if (object.has(key)){

            getData = object.getString(key);
        }

        return getData;
    }
}
