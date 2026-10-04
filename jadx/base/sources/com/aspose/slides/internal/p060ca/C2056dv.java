package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dv */
/* JADX INFO: loaded from: classes3.dex */
class C2056dv {

    /* JADX INFO: renamed from: k4 */
    private C2214ne f7099k4;

    /* JADX INFO: renamed from: ks */
    public byte[] f7100ks;

    /* JADX INFO: renamed from: yj */
    public C2175ld f7101yj;

    public C2056dv(String str, byte[] bArr) {
        C2175ld c2175ld = new C2175ld();
        this.f7101yj = c2175ld;
        c2175ld.f7567k4 = str;
        c2175ld.f7569to = C7019kk.m27435du(Integer.valueOf(bArr.length), 9);
        this.f7100ks = bArr;
        this.f7099k4 = new C2214ne(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10433k4(int i, int i2) {
        this.f7099k4.m11170k4(i);
        this.f7099k4.m11173kk(i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10434k4(int i, long j) {
        this.f7099k4.m11170k4(i);
        this.f7099k4.m11171k4(j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10435k4(int i, short s) {
        this.f7099k4.m11170k4(i);
        this.f7099k4.m11172k4(s);
    }
}
