package com.alipay.android.phone.mrpc.core;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0164p extends C0169u {

    /* JADX INFO: renamed from: c */
    public int f88c;

    /* JADX INFO: renamed from: d */
    public String f89d;

    /* JADX INFO: renamed from: e */
    public long f90e;

    /* JADX INFO: renamed from: f */
    public long f91f;

    /* JADX INFO: renamed from: g */
    public String f92g;

    /* JADX INFO: renamed from: h */
    public HttpUrlHeader f93h;

    public C0164p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.f93h = httpUrlHeader;
        this.f88c = i;
        this.f89d = str;
        this.f114a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final HttpUrlHeader m93a() {
        return this.f93h;
    }

    /* JADX INFO: renamed from: b */
    public final void m96b(long j) {
        this.f91f = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m94a(long j) {
        this.f90e = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m95a(String str) {
        this.f92g = str;
    }
}
