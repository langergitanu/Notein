package com.huawei.hms.network.embedded;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v1 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18384v1 {

    /* JADX INFO: renamed from: a */
    public String f56333a;

    /* JADX INFO: renamed from: b */
    public EnumC18371u1 f56334b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f56335c;

    public AbstractC18384v1() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public Object m79665a(String str) {
        if (str == null) {
            return null;
        }
        return this.f56335c.get(str);
    }

    /* JADX INFO: renamed from: b */
    public abstract EnumC18436z1 mo79669b();

    /* JADX INFO: renamed from: c */
    public EnumC18371u1 m79670c() {
        return this.f56334b;
    }

    /* JADX INFO: renamed from: d */
    public String m79671d() {
        Object obj = this.f56335c.get(this.f56333a);
        return obj instanceof String ? (String) obj : "";
    }

    /* JADX INFO: renamed from: e */
    public int m79672e() {
        String str = (String) this.f56335c.get(this.f56333a);
        if (str == null) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (Integer.parseInt(str2) < 9) {
                sb.append("0");
            }
            sb.append(str2);
        }
        return Integer.parseInt(sb.toString());
    }

    public AbstractC18384v1(EnumC18371u1 enumC18371u1) {
        this.f56333a = "version";
        this.f56334b = enumC18371u1;
        this.f56335c = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m79666a() {
        return this.f56335c;
    }

    /* JADX INFO: renamed from: a */
    public void m79667a(EnumC18371u1 enumC18371u1) {
        this.f56334b = enumC18371u1;
    }

    /* JADX INFO: renamed from: a */
    public void m79668a(String str, Object obj) {
        if (str == null) {
            return;
        }
        this.f56335c.put(str.toLowerCase(Locale.ENGLISH), obj);
    }
}
