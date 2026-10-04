package com.huawei.hms.framework.network.grs.p579g.p580j;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17954d;
import com.huawei.hms.framework.network.grs.p582h.C17957c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.j.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17950a {

    /* JADX INFO: renamed from: a */
    private static final String f53737a = "a";

    /* JADX INFO: renamed from: b */
    private static C17954d f53738b;

    /* JADX INFO: renamed from: a */
    public static synchronized C17954d m77129a(Context context) {
        try {
            C17954d c17954d = f53738b;
            if (c17954d != null) {
                return c17954d;
            }
            String strM77155a = C17957c.m77155a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
            ArrayList arrayList = null;
            if (TextUtils.isEmpty(strM77155a)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM77155a).getJSONObject("grs_server");
                JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                if (jSONArray != null && jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.get(i).toString());
                    }
                }
                C17954d c17954d2 = new C17954d();
                f53738b = c17954d2;
                c17954d2.m77142a(arrayList);
                f53738b.m77144b(jSONObject.getString("grs_query_endpoint_1.0"));
                f53738b.m77141a(jSONObject.getString("grs_query_endpoint_2.0"));
                f53738b.m77140a(jSONObject.getInt("grs_query_timeout"));
            } catch (JSONException e) {
                Logger.m76969w(f53737a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
            return f53738b;
        } catch (Throwable th) {
            throw th;
        }
    }
}
