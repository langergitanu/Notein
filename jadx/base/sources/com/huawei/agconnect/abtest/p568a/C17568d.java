package com.huawei.agconnect.abtest.p568a;

import com.huawei.agconnect.abtest.BuildConfig;
import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.agconnect.abtest.a.d */
/* JADX INFO: loaded from: classes8.dex */
class C17568d {

    /* JADX INFO: renamed from: a */
    private static C17568d f51972a = new C17568d();

    /* JADX INFO: renamed from: b */
    private Map<String, List<C17565a>> f51973b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized List<C17565a> m75320a(String str) {
        List<C17565a> list;
        try {
            list = f51972a.f51973b.get(str);
        } catch (Throwable th) {
            throw th;
        }
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m75324b() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f51972a.f51973b.keySet()) {
            List<C17565a> list = f51972a.f51973b.get(str);
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < list.size(); i++) {
                    jSONArray.put(list.get(i).m75312e());
                }
                try {
                    jSONObject.put(str, jSONArray);
                } catch (JSONException e) {
                    Logger.m75328e("ABTest", "json error", e);
                }
            }
        }
        SharedPrefUtil.getInstance().put(BuildConfig.LIBRARY_PACKAGE_NAME, "experiments", String.class, jSONObject.toString(), AgcCrypto.class);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized Set<String> m75325c() {
        return f51972a.f51973b.keySet();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m75321a() {
        try {
            String str = (String) SharedPrefUtil.getInstance().get(BuildConfig.LIBRARY_PACKAGE_NAME, "experiments", String.class, "", AgcCrypto.class);
            if (str != null && str.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            C17565a c17565aM75306a = C17565a.m75306a((JSONObject) jSONArray.get(i));
                            if (c17565aM75306a != null) {
                                arrayList.add(c17565aM75306a);
                            }
                        }
                        f51972a.f51973b.put(next, arrayList);
                    }
                } catch (JSONException e) {
                    Logger.m75328e("ABTest", "json error", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m75322a(C17565a c17565a) {
        if (c17565a == null) {
            return;
        }
        Iterator<String> it = f51972a.f51973b.keySet().iterator();
        while (it.hasNext()) {
            List<C17565a> list = f51972a.f51973b.get(it.next());
            if (list != null) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (list.get(i).m75307a().equals(c17565a.m75307a())) {
                        list.remove(i);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m75323a(C17565a c17565a, String str) {
        try {
            List<C17565a> arrayList = f51972a.f51973b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                f51972a.f51973b.put(str, arrayList);
            }
            arrayList.add(c17565a);
        } catch (Throwable th) {
            throw th;
        }
    }
}
