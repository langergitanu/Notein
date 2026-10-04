package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.json.reader.JsonWriter;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class JSONObject extends HashMap<String, Object> implements JSONAware, JSONAwareEx, JSONStreamAwareEx {
    private static final long serialVersionUID = -503443796854799292L;

    public JSONObject() {
    }

    public static String escape(String str) {
        return JSONValue.escape(str);
    }

    public static String toJSONString(Map<String, ? extends Object> map) {
        return toJSONString(map, JSONValue.COMPRESSION);
    }

    public static void writeJSON(Map<String, Object> map, Appendable appendable) throws IOException {
        writeJSON(map, appendable, JSONValue.COMPRESSION);
    }

    public void merge(Object obj) {
        merge(this, obj);
    }

    public String toString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStreamAware
    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSON(this, appendable, JSONValue.COMPRESSION);
    }

    public JSONObject(Map<String, ?> map) {
        super(map);
    }

    public static JSONObject merge(JSONObject jSONObject, Object obj) {
        if (obj == null) {
            return jSONObject;
        }
        if (obj instanceof JSONObject) {
            return merge(jSONObject, (JSONObject) obj);
        }
        throw new RuntimeException("JSON megre can not merge JSONObject with " + obj.getClass());
    }

    public static String toJSONString(Map<String, ? extends Object> map, JSONStyle jSONStyle) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSON(map, sb, jSONStyle);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (map == null) {
            appendable.append(CloudMetaExtra.DEFINE_NON_PARENT_ID);
        } else {
            JsonWriter.JSONMapWriter.writeJSONString(map, appendable, jSONStyle);
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStreamAwareEx
    public void writeJSONString(Appendable appendable, JSONStyle jSONStyle) throws IOException {
        writeJSON(this, appendable, jSONStyle);
    }

    private static JSONObject merge(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj2 != null) {
                if (obj instanceof JSONArray) {
                    jSONObject.put(str, merge((JSONArray) obj, obj2));
                } else if (obj instanceof JSONObject) {
                    jSONObject.put(str, merge((JSONObject) obj, obj2));
                } else if (!obj.equals(obj2)) {
                    if (obj.getClass().equals(obj2.getClass())) {
                        throw new RuntimeException("JSON merge can not merge two " + obj.getClass().getName() + " Object together");
                    }
                    throw new RuntimeException("JSON merge can not merge " + obj.getClass().getName() + " with " + obj2.getClass().getName());
                }
            }
        }
        for (String str2 : jSONObject2.keySet()) {
            if (!jSONObject.containsKey(str2)) {
                jSONObject.put(str2, jSONObject2.get(str2));
            }
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.shaded.json.JSONAware
    public String toJSONString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONAwareEx
    public String toJSONString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }

    public static JSONArray merge(JSONArray jSONArray, Object obj) {
        if (obj == null) {
            return jSONArray;
        }
        if (jSONArray != null) {
            return merge(jSONArray, (JSONArray) obj);
        }
        jSONArray.add(obj);
        return jSONArray;
    }

    private static JSONArray merge(JSONArray jSONArray, JSONArray jSONArray2) {
        jSONArray.addAll(jSONArray2);
        return jSONArray;
    }
}
