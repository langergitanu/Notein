package com.aspose.slides.internal.p347px;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p437u9.C11296k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C9596rv {

    /* JADX INFO: renamed from: c5 */
    public short f34691c5;

    /* JADX INFO: renamed from: ck */
    public int f34692ck;

    /* JADX INFO: renamed from: du */
    public int f34693du;

    /* JADX INFO: renamed from: dy */
    public short f34694dy;

    /* JADX INFO: renamed from: fa */
    public int f34695fa;

    /* JADX INFO: renamed from: h4 */
    public int f34696h4;

    /* JADX INFO: renamed from: jd */
    public short f34697jd;

    /* JADX INFO: renamed from: k4 */
    public long f34698k4;

    /* JADX INFO: renamed from: kk */
    public long f34699kk;

    /* JADX INFO: renamed from: ks */
    public short f34700ks;

    /* JADX INFO: renamed from: m9 */
    public short f34701m9;

    /* JADX INFO: renamed from: to */
    public long f34702to;

    /* JADX INFO: renamed from: up */
    public short f34703up;

    /* JADX INFO: renamed from: x1 */
    public long f34704x1;

    /* JADX INFO: renamed from: yj */
    public short f34705yj;

    public C9596rv(C11296k4 c11296k4) {
        long jM54278kk = c11296k4.m54278kk();
        this.f34698k4 = jM54278kk;
        if ((jM54278kk & 4294967295L) != 65536) {
            throw new NotSupportedException("Unsupported font head version.");
        }
        this.f34704x1 = c11296k4.m54278kk();
        this.f34699kk = c11296k4.m54278kk();
        long jM54278kk2 = c11296k4.m54278kk();
        this.f34702to = jM54278kk2;
        if ((jM54278kk2 & 4294967295L) != 1594834165) {
            throw new NotSupportedException("Unsupported font head magic number.");
        }
        this.f34693du = c11296k4.m54274du();
        this.f34696h4 = c11296k4.m54274du();
        c11296k4.m54280x1();
        c11296k4.m54280x1();
        c11296k4.m54280x1();
        c11296k4.m54280x1();
        this.f34701m9 = c11296k4.m54279to();
        this.f34694dy = c11296k4.m54279to();
        this.f34691c5 = c11296k4.m54279to();
        this.f34697jd = c11296k4.m54279to();
        this.f34692ck = c11296k4.m54274du();
        this.f34695fa = c11296k4.m54274du();
        this.f34703up = c11296k4.m54279to();
        this.f34705yj = c11296k4.m54279to();
        this.f34700ks = c11296k4.m54279to();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m46875k4() {
        int i = this.f34692ck;
        return ((i & 1) != 0 ? 1 : 0) | ((i & 2) != 0 ? 2 : 0) | ((i & 4) != 0 ? 4 : 0);
    }
}
