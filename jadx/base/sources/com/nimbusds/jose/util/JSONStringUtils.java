package com.nimbusds.jose.util;

import com.nimbusds.jose.shaded.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class JSONStringUtils {
    private JSONStringUtils() {
    }

    public static String toJSONString(String str) {
        return "\"" + JSONObject.escape(str) + "\"";
    }
}
