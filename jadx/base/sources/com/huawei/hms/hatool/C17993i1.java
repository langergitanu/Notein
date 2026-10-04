package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.i1 */
/* JADX INFO: loaded from: classes8.dex */
public final class C17993i1 {

    /* JADX INFO: renamed from: c */
    public static C17993i1 f53806c;

    /* JADX INFO: renamed from: a */
    public Context f53807a;

    /* JADX INFO: renamed from: b */
    public final Object f53808b = new Object();

    /* JADX INFO: renamed from: a */
    public static C17993i1 m77362a() {
        if (f53806c == null) {
            m77363b();
        }
        return f53806c;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m77363b() {
        if (f53806c == null) {
            f53806c = new C17993i1();
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m77364a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                C18030y.m77583b("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m77365a(Context context) {
        synchronized (this.f53808b) {
            try {
                if (this.f53807a == null) {
                    this.f53807a = context;
                    C17989h0.m77341a().m77343a(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77366a(String str, int i) {
        C17989h0.m77341a().m77344a(str, i);
    }

    /* JADX INFO: renamed from: a */
    public void m77367a(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        C17989h0.m77341a().m77345a(str, i, str2, m77364a(linkedHashMap));
    }

    /* JADX INFO: renamed from: a */
    public void m77368a(String str, Context context, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            C17989h0.m77341a().m77345a(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            C18030y.m77591f("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }
}
