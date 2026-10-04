package com.google.android.gms.internal.p624firebaseauthapi;

import android.util.Log;
import androidx.core.database.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzajk {
    public static zzacn zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbOooO0O0.append(message);
        Log.e(str, sbOooO0O0.toString());
        return new zzacn(OooO00o.OooO00o("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List<String> zza(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) throws JSONException {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
