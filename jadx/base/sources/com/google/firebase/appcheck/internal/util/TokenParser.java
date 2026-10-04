package com.google.firebase.appcheck.internal.util;

import OooOo.OooO00o;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class TokenParser {
    private static Map<String, Object> parseJsonIntoMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return toMap(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Logger.getLogger().m75261d("Failed to parse JSONObject into Map:\n" + e);
            return Collections.EMPTY_MAP;
        }
    }

    public static Map<String, Object> parseTokenClaims(String str) {
        Preconditions.checkNotEmpty(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            Logger.getLogger().m75263e("Invalid token (too few subsections):\n".concat(str));
            return Collections.EMPTY_MAP;
        }
        try {
            Map<String, Object> jsonIntoMap = parseJsonIntoMap(new String(Base64.decode(strArrSplit[1], 11), "UTF-8"));
            return jsonIntoMap == null ? Collections.EMPTY_MAP : jsonIntoMap;
        } catch (UnsupportedEncodingException e) {
            Logger.getLogger().m75263e("Unable to decode token (charset unknown):\n" + e);
            return Collections.EMPTY_MAP;
        }
    }

    private static List<Object> toList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object map = jSONArray.get(i);
            if (map instanceof JSONArray) {
                map = toList((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [OooOo.OooO00o, com.alipay.share.sdk.openapi.APMediaMessage$IMediaObject, java.util.Map<java.lang.String, java.lang.Object>] */
    private static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        ?? oooO00o = new OooO00o();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (obj instanceof JSONArray) {
                toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                toMap((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
            }
            oooO00o.checkArgs();
        }
        return oooO00o;
    }
}
