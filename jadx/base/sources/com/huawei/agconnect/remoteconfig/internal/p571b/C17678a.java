package com.huawei.agconnect.remoteconfig.internal.p571b;

import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import com.huawei.agconnect.remoteconfig.internal.p572c.C17681b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.b.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17678a {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f52278a = m75665b();

    /* JADX INFO: renamed from: b */
    private final String f52279b;

    public C17678a(AGConnectInstance aGConnectInstance) {
        this.f52279b = "customAttributesKey_" + aGConnectInstance.getIdentifier();
    }

    /* JADX INFO: renamed from: b */
    private Map<String, String> m75665b() {
        HashMap map = new HashMap();
        String str = (String) SharedPrefUtil.getInstance().get("com.huawei.agc.remoteconfig", this.f52279b, String.class, null, DefaultCrypto.class);
        if (!TextUtils.isEmpty(str)) {
            try {
                return C17681b.m75673a(new JSONObject(str));
            } catch (JSONException e) {
                Logger.m75327e("RemoteConfig", "processJsonToMap error:" + e.getMessage());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m75666a() {
        return this.f52278a;
    }

    /* JADX INFO: renamed from: a */
    public void m75667a(Map<String, String> map) {
        this.f52278a = map;
        if (map == null || map.size() == 0) {
            SharedPrefUtil.getInstance().remove("com.huawei.agc.remoteconfig", this.f52279b);
            return;
        }
        try {
            SharedPrefUtil.getInstance().put("com.huawei.agc.remoteconfig", this.f52279b, String.class, new JSONObject(map).toString(), DefaultCrypto.class);
        } catch (NullPointerException e) {
            Logger.m75327e("RemoteConfig", "map to json error:" + e.getMessage());
        }
    }
}
