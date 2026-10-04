package com.aspose.slides.internal.p356qb;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.ks */
/* JADX INFO: loaded from: classes4.dex */
class C9824ks extends AbstractC9822k4 {

    /* JADX INFO: renamed from: du */
    private int f35589du;

    /* JADX INFO: renamed from: to */
    private long f35590to = 0;

    public C9824ks(int i) {
        this.f35589du = i;
    }

    /* JADX INFO: renamed from: to */
    private long m48418to() {
        if ((((this.f35590to & 4294967295L) + 1) & 4294967295L) > this.f35586k4.length - 1) {
            m48417kk();
        }
        while (true) {
            long[] jArr = this.f35586k4;
            long j = this.f35590to;
            if ((jArr[(int) j] & 4294967295L) == 4294967295L) {
                return j;
            }
            this.f35590to = j + 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48419k4(long j, C9829yj c9829yj, InterfaceC9821jd interfaceC9821jd) {
        long[] jArrM48416k4 = c9829yj.m48416k4(j);
        this.f35586k4 = new long[jArrM48416k4.length * interfaceC9821jd.mo48368k4(0).m48445k4().length];
        for (long j2 : jArrM48416k4) {
            C9827up c9827upMo48368k4 = interfaceC9821jd.mo48368k4((int) j2);
            if (c9827upMo48368k4 != null) {
                m48414k4(c9827upMo48368k4, c9827upMo48368k4.m48445k4().length);
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final long m48420kk(int i) {
        long jM48421x1 = m48421x1(4294967290L);
        long jM48421x12 = jM48421x1;
        for (int i2 = 1; i2 < i; i2++) {
            jM48421x12 = m48421x1(jM48421x12);
        }
        return jM48421x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m48421x1(long j) {
        long[] jArrM48416k4 = (4294967295L & j) < 4294967290L ? m48416k4(j) : new long[0];
        long jM48418to = m48418to();
        if (jArrM48416k4.length != 0) {
            this.f35586k4[(int) jArrM48416k4[jArrM48416k4.length - 1]] = jM48418to;
        }
        this.f35586k4[(int) jM48418to] = 4294967294L;
        return jM48418to;
    }
}
