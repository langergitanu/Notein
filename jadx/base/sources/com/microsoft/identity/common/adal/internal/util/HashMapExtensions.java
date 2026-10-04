package com.microsoft.identity.common.adal.internal.util;

import android.text.TextUtils;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.adal.internal.net.HttpWebResponse;
import com.microsoft.identity.common.logging.Logger;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class HashMapExtensions {
    private static final String TAG = "HashMapExtensions";

    private HashMapExtensions() {
    }

    public static HashMap<String, String> getJsonResponse(HttpWebResponse httpWebResponse) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        if (httpWebResponse != null && !TextUtils.isEmpty(httpWebResponse.getBody())) {
            JSONObject jSONObject = new JSONObject(httpWebResponse.getBody());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        }
        return map;
    }

    public static HashMap<String, String> jsonStringAsMap(String str) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        if (!StringExtensions.isNullOrBlank(str)) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        }
        return map;
    }

    public static HashMap<String, List<String>> jsonStringAsMapList(String str) throws JSONException {
        HashMap<String, List<String>> map = new HashMap<>();
        if (!StringExtensions.isNullOrBlank(str)) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray(jSONObject.getString(next));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.get(i).toString());
                }
                map.put(next, arrayList);
            }
        }
        return map;
    }

    public static HashMap<String, String> urlFormDecode(String str) {
        return urlFormDecodeData(str, "&");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x001d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap<String, String> urlFormDecodeData(String str, String str2) {
        String strUrlFormDecode;
        String strUrlFormDecode2;
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":urlFormDecodeData");
        HashMap<String, String> map = new HashMap<>();
        if (!StringExtensions.isNullOrBlank(str)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
            while (stringTokenizer.hasMoreTokens()) {
                String[] strArrSplit = stringTokenizer.nextToken().split("=");
                if (strArrSplit.length == 2) {
                    try {
                        strUrlFormDecode = StringExtensions.urlFormDecode(strArrSplit[0].trim());
                        strUrlFormDecode2 = StringExtensions.urlFormDecode(strArrSplit[1].trim());
                        if (StringExtensions.isNullOrBlank(strUrlFormDecode)) {
                            map.put(strUrlFormDecode, strUrlFormDecode2);
                        }
                    } catch (UnsupportedEncodingException e) {
                        Logger.errorPII(strOooO0OO, "Encoding format is not supported", e);
                    }
                } else {
                    if (strArrSplit.length == 1) {
                        try {
                            strUrlFormDecode = StringExtensions.urlFormDecode(strArrSplit[0].trim());
                            strUrlFormDecode2 = "";
                        } catch (UnsupportedEncodingException e2) {
                            Logger.errorPII(strOooO0OO, "Encoding format is not supported", e2);
                        }
                    } else {
                        strUrlFormDecode = null;
                        strUrlFormDecode2 = null;
                    }
                    if (StringExtensions.isNullOrBlank(strUrlFormDecode)) {
                    }
                }
            }
        }
        return map;
    }
}
