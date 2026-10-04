package com.huawei.hms.network.embedded;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18385v2 {

    /* JADX INFO: renamed from: h */
    public static final String f56336h = "A";

    /* JADX INFO: renamed from: i */
    public static final String f56337i = "AAAA";

    /* JADX INFO: renamed from: j */
    public static final long f56338j = 86400000;

    /* JADX INFO: renamed from: k */
    public static final int f56339k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f56340l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f56341m = 2;

    /* JADX INFO: renamed from: n */
    public static final String f56342n = "CNAME";

    /* JADX INFO: renamed from: f */
    public int f56348f;

    /* JADX INFO: renamed from: a */
    public String f56343a = "";

    /* JADX INFO: renamed from: b */
    public String f56344b = f56336h;

    /* JADX INFO: renamed from: c */
    public List<String> f56345c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public long f56346d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    public long f56347e = C18168f2.m78408a();

    /* JADX INFO: renamed from: g */
    public int f56349g = -1;

    /* JADX INFO: renamed from: a */
    public int m79673a() {
        return this.f56349g;
    }

    /* JADX INFO: renamed from: b */
    public long m79679b() {
        return this.f56346d;
    }

    /* JADX INFO: renamed from: c */
    public String m79684c() {
        return this.f56343a;
    }

    /* JADX INFO: renamed from: d */
    public List<String> m79686d() {
        return new ArrayList(this.f56345c);
    }

    /* JADX INFO: renamed from: e */
    public int m79687e() {
        return this.f56348f;
    }

    /* JADX INFO: renamed from: f */
    public int m79688f() {
        long jAbs = Math.abs(System.currentTimeMillis() - this.f56346d);
        if (jAbs < this.f56347e) {
            return 0;
        }
        return jAbs < f56338j ? 1 : 2;
    }

    /* JADX INFO: renamed from: g */
    public long m79689g() {
        return this.f56347e;
    }

    /* JADX INFO: renamed from: h */
    public String m79690h() {
        return this.f56344b;
    }

    /* JADX INFO: renamed from: i */
    public boolean m79691i() {
        return this.f56345c.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder, long] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String, void] */
    public String toString() {
        ?? sb = new StringBuilder("DomainResult{type='");
        sb.append(this.f56344b);
        sb.append('\'');
        sb.append(m79691i() ? ", addressList isEmpty" : ", addressList is not Empty");
        sb.append(", createTime=");
        sb.append(this.f56346d);
        sb.append(", source=");
        sb.append(C18126c2.m78048j().m78054a(this.f56348f));
        sb.append(", cache=");
        int i = this.f56349g;
        return Bundle.putLong(125, sb);
    }

    /* JADX INFO: renamed from: a */
    public void m79674a(int i) {
        this.f56349g = i;
    }

    /* JADX INFO: renamed from: b */
    public void m79680b(int i) {
        this.f56348f = i;
    }

    /* JADX INFO: renamed from: c */
    public void m79685c(String str) {
        this.f56344b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m79675a(long j) {
        this.f56346d = j;
    }

    /* JADX INFO: renamed from: b */
    public void m79681b(long j) {
        this.f56347e = j;
    }

    /* JADX INFO: renamed from: a */
    public void m79676a(String str) {
        this.f56345c.add(str);
    }

    /* JADX INFO: renamed from: b */
    public void m79682b(String str) {
        this.f56343a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m79677a(List<String> list) {
        list.addAll(list);
    }

    /* JADX INFO: renamed from: b */
    public void m79683b(List<String> list) {
        if (list == null) {
            this.f56345c = new ArrayList();
        } else {
            this.f56345c = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m79678a(C18385v2 c18385v2) {
        return c18385v2 == null || c18385v2.m79691i() || this.f56348f >= c18385v2.m79687e();
    }
}
