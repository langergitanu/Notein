package com.huawei.agconnect.abtest.p568a;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.agconnect.abtest.ABTestException;
import com.huawei.agconnect.common.api.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.agconnect.abtest.a.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17565a {

    /* JADX INFO: renamed from: a */
    private String f51965a;

    /* JADX INFO: renamed from: b */
    private String f51966b;

    /* JADX INFO: renamed from: c */
    private String f51967c;

    /* JADX INFO: renamed from: d */
    private String f51968d;

    /* JADX INFO: renamed from: e */
    private boolean f51969e;

    /* JADX INFO: renamed from: a */
    public static C17565a m75305a(Map<String, String> map) throws ABTestException {
        String str = map.get(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID);
        if (str == null) {
            throw new ABTestException("not exist experimentId key", 2);
        }
        String str2 = map.get("variantId");
        if (str2 == null) {
            throw new ABTestException("not exist variantId key", 2);
        }
        String str3 = map.get("startTime");
        String str4 = map.get("triggerEventId");
        C17565a c17565a = new C17565a();
        c17565a.f51965a = str;
        c17565a.f51966b = str2;
        c17565a.f51967c = str3;
        c17565a.f51968d = str4;
        c17565a.f51969e = false;
        return c17565a;
    }

    /* JADX INFO: renamed from: b */
    public String m75309b() {
        return this.f51966b;
    }

    /* JADX INFO: renamed from: c */
    public String m75310c() {
        return this.f51968d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m75311d() {
        return this.f51969e;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m75312e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, this.f51965a);
            jSONObject.put("variantId", this.f51966b);
            jSONObject.put("startTime", this.f51967c);
            jSONObject.put("triggerEventId", this.f51968d);
            jSONObject.put("isTriggerEventReport", this.f51969e);
            return jSONObject;
        } catch (JSONException e) {
            Logger.m75328e("ABTest", "json error", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C17565a m75306a(JSONObject jSONObject) {
        String str;
        if (jSONObject.opt(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID) == null) {
            str = "not exist experimentId";
        } else if (jSONObject.opt("variantId") == null) {
            str = "not exist variantId";
        } else {
            if (jSONObject.opt("startTime") != null) {
                String strOptString = jSONObject.optString(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID);
                String strOptString2 = jSONObject.optString("variantId");
                String strOptString3 = jSONObject.optString("startTime");
                String strOptString4 = jSONObject.optString("triggerEventId");
                boolean zOptBoolean = jSONObject.optBoolean("isTriggerEventReport");
                C17565a c17565a = new C17565a();
                c17565a.f51965a = strOptString;
                c17565a.f51966b = strOptString2;
                c17565a.f51967c = strOptString3;
                c17565a.f51968d = strOptString4;
                c17565a.f51969e = zOptBoolean;
                return c17565a;
            }
            str = "not exist startTime key or format error";
        }
        Logger.m75327e("ABTest", str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String m75307a() {
        return this.f51965a;
    }

    /* JADX INFO: renamed from: a */
    public void m75308a(boolean z) {
        this.f51969e = z;
    }
}
