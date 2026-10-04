package com.huawei.hms.network.embedded;

import java.util.Date;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18238k2 {

    /* JADX INFO: renamed from: a */
    public String f55399a;

    /* JADX INFO: renamed from: b */
    public String f55400b;

    /* JADX INFO: renamed from: c */
    public long f55401c;

    /* JADX INFO: renamed from: d */
    public long f55402d;

    /* JADX INFO: renamed from: e */
    public int f55403e;

    public C18238k2() {
        this.f55401c = C18168f2.m78408a();
    }

    /* JADX INFO: renamed from: b */
    private long m78961b() {
        return new Date().getTime();
    }

    /* JADX INFO: renamed from: a */
    public boolean m78962a() {
        long jM78961b = m78961b() - this.f55402d;
        return jM78961b > C18385v2.f56338j || jM78961b < -86400000;
    }

    public String toString() {
        return "Address{domain='" + this.f55399a + "', ip=" + this.f55400b + ", ttl=" + this.f55401c + ", createTime=" + this.f55402d + ", source=" + C18126c2.m78048j().m78054a(this.f55403e) + '}';
    }

    public C18238k2(String str, String str2) {
        this.f55401c = C18168f2.m78408a();
        this.f55399a = str;
        this.f55400b = str2;
    }

    public C18238k2(String str, String str2, long j) {
        C18168f2.m78408a();
        this.f55399a = str;
        this.f55400b = str2;
        this.f55401c = j;
    }
}
