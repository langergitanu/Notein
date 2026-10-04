package com.huawei.hms.drive;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: renamed from: com.huawei.hms.drive.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C17878m {

    /* JADX INFO: renamed from: a */
    private String f53430a;

    /* JADX INFO: renamed from: b */
    private String f53431b;

    /* JADX INFO: renamed from: c */
    private String f53432c = "Unknown Reason";

    /* JADX INFO: renamed from: d */
    private String f53433d = GrsBaseInfo.CountryCodeSource.UNKNOWN;

    /* JADX INFO: renamed from: e */
    private int f53434e = 0;

    /* JADX INFO: renamed from: f */
    private long f53435f;

    public C17878m(String str) {
        m76817a(str);
    }

    /* JADX INFO: renamed from: a */
    public String m76815a() {
        return this.f53430a;
    }

    /* JADX INFO: renamed from: b */
    public String m76819b() {
        return this.f53431b;
    }

    /* JADX INFO: renamed from: c */
    public String m76821c() {
        return this.f53432c;
    }

    /* JADX INFO: renamed from: d */
    public String m76822d() {
        return this.f53433d;
    }

    /* JADX INFO: renamed from: e */
    public int m76823e() {
        return this.f53434e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17878m) {
            return this.f53430a.equals(((C17878m) obj).f53430a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f53430a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.f53430a, "");
    }

    /* JADX INFO: renamed from: a */
    public void m76816a(long j) {
        this.f53435f = j;
    }

    /* JADX INFO: renamed from: b */
    public void m76820b(String str) {
        this.f53432c = str;
    }

    /* JADX INFO: renamed from: a */
    public void m76817a(String str) {
        this.f53430a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m76818a(boolean z) {
        this.f53434e = z ? 1 : 0;
    }
}
