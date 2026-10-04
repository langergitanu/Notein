package com.nimbusds.jose.util;

import OooOO0.OooO0OO;
import OooOoo.C20593OooO0Oo;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class JSONObjectUtils {
    private JSONObjectUtils() {
    }

    public static Base64URL getBase64URL(Map<String, Object> map, String str) throws ParseException {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        return new Base64URL(string);
    }

    public static boolean getBoolean(Map<String, Object> map, String str) throws ParseException {
        Boolean bool = (Boolean) getGeneric(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static double getDouble(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.doubleValue();
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static float getFloat(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.floatValue();
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    private static <T> T getGeneric(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t = (T) map.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("Unexpected type of JSON object member with key \"", str, "\""), 0);
    }

    public static int getInt(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static List<Object> getJSONArray(Map<String, Object> map, String str) throws ParseException {
        return (List) getGeneric(map, str, List.class);
    }

    public static Map<String, Object> getJSONObject(Map<String, Object> map, String str) throws ParseException {
        return (Map) getGeneric(map, str, JSONObject.class);
    }

    public static long getLong(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static String getString(Map<String, Object> map, String str) throws ParseException {
        return (String) getGeneric(map, str, String.class);
    }

    public static String[] getStringArray(Map<String, Object> map, String str) throws ParseException {
        List<Object> jSONArray = getJSONArray(map, str);
        if (jSONArray == null) {
            return null;
        }
        try {
            return (String[]) jSONArray.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException(C20593OooO0Oo.OooO0O0("JSON object member with key \"", str, "\" is not an array of strings"), 0);
        }
    }

    public static List<String> getStringList(Map<String, Object> map, String str) throws ParseException {
        String[] stringArray = getStringArray(map, str);
        if (stringArray == null) {
            return null;
        }
        return Arrays.asList(stringArray);
    }

    public static URI getURI(Map<String, Object> map, String str) throws ParseException {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static Map<String, Object> newJSONObject() {
        return new HashMap();
    }

    public static Map<String, Object> parse(String str) throws ParseException {
        try {
            Object obj = new JSONParser(640).parse(str);
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e) {
            throw new ParseException("Invalid JSON: " + e.getMessage(), 0);
        } catch (Exception e2) {
            throw new ParseException(OooO0OO.OooO0Oo(e2, new StringBuilder("Unexpected exception: ")), 0);
        }
    }

    @Deprecated
    public static Map<String, Object> parseJSONObject(String str) throws ParseException {
        return parse(str);
    }

    public static String toJSONString(Map<String, ?> map) {
        return JSONObject.toJSONString((Map<String, ? extends Object>) map);
    }
}
