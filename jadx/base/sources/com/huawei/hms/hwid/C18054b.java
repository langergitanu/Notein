package com.huawei.hms.hwid;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hwid.b */
/* JADX INFO: loaded from: classes8.dex */
public class C18054b extends AbstractC18047am {
    /* JADX INFO: renamed from: a */
    public static C18054b m77662a(String str) throws JSONException {
        return new C18054b().m77663a(new JSONObject(str));
    }

    /* JADX INFO: renamed from: a */
    public C18054b m77663a(JSONObject jSONObject) {
        this.f53954a = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID, null);
        this.f53955b = jSONObject.optString("packageName", null);
        this.f53956c = jSONObject.optLong("hmsSdkVersion");
        this.f53957d = jSONObject.optString("subAppId", null);
        return this;
    }
}
