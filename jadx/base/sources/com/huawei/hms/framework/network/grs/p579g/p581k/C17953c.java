package com.huawei.hms.framework.network.grs.p579g.p581k;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p578f.C17937b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.k.c */
/* JADX INFO: loaded from: classes7.dex */
public class C17953c {

    /* JADX INFO: renamed from: a */
    private final GrsBaseInfo f53741a;

    /* JADX INFO: renamed from: b */
    private final Context f53742b;

    /* JADX INFO: renamed from: c */
    private final Set<String> f53743c = new HashSet();

    public C17953c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f53741a = grsBaseInfo;
        this.f53742b = context;
    }

    /* JADX INFO: renamed from: e */
    private String m77132e() {
        Set<String> setM77053b = C17937b.m77046a(this.f53742b.getPackageName(), this.f53741a).m77053b();
        if (setM77053b.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = setM77053b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.m76964i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    private String m77133f() {
        Logger.m76965v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f53743c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.m76966v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public Context m77134a() {
        return this.f53742b;
    }

    /* JADX INFO: renamed from: b */
    public GrsBaseInfo m77136b() {
        return this.f53741a;
    }

    /* JADX INFO: renamed from: c */
    public String m77137c() {
        return this.f53743c.size() == 0 ? m77132e() : m77133f();
    }

    /* JADX INFO: renamed from: d */
    public Set<String> m77138d() {
        return this.f53743c;
    }

    /* JADX INFO: renamed from: a */
    public void m77135a(String str) {
        this.f53743c.add(str);
    }
}
