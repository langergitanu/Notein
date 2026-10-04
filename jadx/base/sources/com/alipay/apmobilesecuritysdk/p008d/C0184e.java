package com.alipay.apmobilesecuritysdk.p008d;

import OoooooO.C21445Oooo;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import o000ooo.C24746OooO00o;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0184e {

    /* JADX INFO: renamed from: a */
    public static Map<String, String> f131a;

    /* JADX INFO: renamed from: b */
    public static final String[] f132b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    /* JADX INFO: renamed from: a */
    public static String m145a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                str3 = "&";
            }
            stringBuffer.append(C21445Oooo.OooO0O0(sb, str3, str, "=", str2));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m148b(Context context, Map<String, String> map) {
        TreeMap treeMap;
        try {
            m146a(context, map);
            treeMap = new TreeMap();
            for (String str : f132b) {
                if (f131a.containsKey(str)) {
                    treeMap.put(str, f131a.get(str));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C24746OooO00o.OooO0OO(m145a(treeMap));
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m149c(Context context, Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        f131a = treeMap;
        treeMap.putAll(C0181b.m141a(context, map));
        f131a.putAll(C0183d.m144a(context));
        f131a.putAll(C0182c.m142a(context));
        f131a.putAll(C0180a.m140a(context, map));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized Map<String, String> m146a(Context context, Map<String, String> map) {
        try {
            if (f131a == null) {
                m149c(context, map);
            }
            f131a.putAll(C0183d.m143a());
        } catch (Throwable th) {
            throw th;
        }
        return f131a;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m147a() {
        f131a = null;
    }
}
