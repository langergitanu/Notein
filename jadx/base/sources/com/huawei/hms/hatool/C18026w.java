package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hatool.w */
/* JADX INFO: loaded from: classes8.dex */
public class C18026w {
    /* JADX INFO: renamed from: a */
    public static Map<String, List<C18014q>> m77559a(Context context, String str) {
        if (context == null) {
            return null;
        }
        Map<String, ?> mapM77330a = C17986g0.m77330a(context, str);
        m77565b(mapM77330a);
        return m77561a(mapM77330a);
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, List<C18014q>> m77564b(Context context, String str, String str2) {
        String strM77329a = C17986g0.m77329a(context, str, str2, "");
        HashMap map = new HashMap();
        m77563a(str2, strM77329a, map);
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, List<C18014q>> m77560a(Context context, String str, String str2) {
        Map<String, List<C18014q>> mapM77559a;
        Map<String, List<C18014q>> mapM77559a2;
        if ("alltype".equals(str2) || TextUtils.isEmpty(str)) {
            C18030y.m77586c("hmsSdk", "read all event records");
            mapM77559a = m77559a(context, "stat_v2_1");
            mapM77559a2 = m77559a(context, "cached_v2_1");
        } else {
            String strM77547a = AbstractC18023u0.m77547a(str, str2);
            mapM77559a = m77564b(context, "stat_v2_1", strM77547a);
            mapM77559a2 = m77564b(context, "cached_v2_1", strM77547a);
        }
        return m77562a(mapM77559a, mapM77559a2);
    }

    /* JADX INFO: renamed from: b */
    public static void m77565b(Map<String, ?> map) {
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        Set<String> setM77549a = AbstractC18023u0.m77549a(AbstractC17970b.m77216b());
        while (it.hasNext()) {
            if (!setM77549a.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, List<C18014q>> m77561a(Map<String, ?> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                m77563a(key, (String) entry.getValue(), map2);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, List<C18014q>> m77562a(Map<String, List<C18014q>> map, Map<String, List<C18014q>> map2) {
        if (map.size() == 0 && map2.size() == 0) {
            return new HashMap();
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        map3.putAll(map2);
        return map3;
    }

    /* JADX INFO: renamed from: a */
    public static void m77563a(String str, String str2, Map<String, List<C18014q>> map) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                C18014q c18014q = new C18014q();
                try {
                    c18014q.m77502a(jSONArray.getJSONObject(i));
                    arrayList.add(c18014q);
                } catch (JSONException unused) {
                    C18030y.m77590e("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            map.put(str, arrayList);
        } catch (JSONException unused2) {
            C18030y.m77590e("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }
}
