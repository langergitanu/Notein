package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p624firebaseauthapi.zzaao;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzbh {
    private static final Logger zza = new Logger("JSONParser", new String[0]);

    private static List<Object> zza(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objZza = jSONArray.get(i);
            if (objZza instanceof JSONArray) {
                objZza = zza((JSONArray) objZza);
            } else if (objZza instanceof JSONObject) {
                objZza = zza((JSONObject) objZza);
            }
            arrayList.add(objZza);
        }
        return arrayList;
    }

    public static Map<String, Object> zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return zza(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaao(e);
        }
    }

    public static Map<String, Object> zza(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = com.google.android.gms.internal.p624firebaseauthapi.zzt.zza(FilenameUtils.EXTENSION_SEPARATOR).zza((CharSequence) str);
        if (listZza.size() < 2) {
            zza.m74920e(OooO00o.OooO00o("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            Map<String, Object> mapZzb = zzb(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), "UTF-8"));
            return mapZzb == null ? new HashMap() : mapZzb;
        } catch (UnsupportedEncodingException e) {
            zza.m74919e("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [OooOo.OooO00o, com.alipay.share.sdk.openapi.APMediaMessage$IMediaObject, java.util.Map<java.lang.String, java.lang.Object>] */
    private static Map<String, Object> zza(JSONObject jSONObject) throws JSONException {
        ?? oooO00o = new OooOo.OooO00o();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (obj instanceof JSONArray) {
                zza((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                zza((JSONObject) obj);
            }
            oooO00o.checkArgs();
        }
        return oooO00o;
    }
}
