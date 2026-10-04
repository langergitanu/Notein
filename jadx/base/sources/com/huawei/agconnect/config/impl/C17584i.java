package com.huawei.agconnect.config.impl;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.i */
/* JADX INFO: loaded from: classes8.dex */
public class C17584i implements ConfigReader {

    /* JADX INFO: renamed from: a */
    private final JSONObject f52022a;

    public C17584i(InputStream inputStream, String str) {
        this.f52022a = m75369a(inputStream);
        m75370a(str);
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m75369a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(Utils.toString(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: b */
    private JSONObject m75372b(String str) throws JSONException {
        JSONArray jSONArray = this.f52022a.getJSONArray("appInfos");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.getString("package_name").equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // com.huawei.agconnect.config.ConfigReader
    public String getString(String str, String str2) {
        if (!str.endsWith("/")) {
            String[] strArrSplit = str.split("/");
            try {
                JSONObject jSONObject = this.f52022a;
                for (int i = 1; i < strArrSplit.length; i++) {
                    if (i == strArrSplit.length - 1) {
                        str = jSONObject.get(strArrSplit[i]).toString();
                        return str;
                    }
                    jSONObject = jSONObject.getJSONObject(strArrSplit[i]);
                }
            } catch (JSONException unused) {
                Log.w("InputStreamReader", "JSONException when reading 'path': ".concat(str));
            }
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f52022a.toString().hashCode() + '}';
    }

    /* JADX INFO: renamed from: a */
    private void m75370a(String str) {
        try {
            JSONObject jSONObjectM75372b = m75372b(str);
            if (jSONObjectM75372b == null) {
                return;
            }
            String string = getString("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal(IdManager.DEFAULT_VERSION_NAME);
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused) {
                Log.d("InputStreamReader", "configuration_version to double error");
            }
            if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                this.f52022a.getJSONObject("client").put(HiAnalyticsConstant.BI_KEY_APP_ID, jSONObjectM75372b.getString(HiAnalyticsConstant.BI_KEY_APP_ID));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal(AuthenticationConstants.THREE_POINT_ZERO)) >= 0) {
                Iterator<String> itKeys = jSONObjectM75372b.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"package_name".equals(next)) {
                        m75371a(next, jSONObjectM75372b.get(next), this.f52022a);
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m75371a(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m75371a(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }
}
