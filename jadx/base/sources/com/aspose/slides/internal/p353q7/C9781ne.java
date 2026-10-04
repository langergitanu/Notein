package com.aspose.slides.internal.p353q7;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C9781ne {

    /* JADX INFO: renamed from: c5 */
    public short f35335c5;

    /* JADX INFO: renamed from: ck */
    public int f35336ck;

    /* JADX INFO: renamed from: du */
    public int f35337du;

    /* JADX INFO: renamed from: dy */
    public short f35338dy;

    /* JADX INFO: renamed from: fa */
    public int f35339fa;

    /* JADX INFO: renamed from: h4 */
    public int f35340h4;

    /* JADX INFO: renamed from: jd */
    public short f35341jd;

    /* JADX INFO: renamed from: k4 */
    public long f35342k4;

    /* JADX INFO: renamed from: kk */
    public long f35343kk;

    /* JADX INFO: renamed from: ks */
    public short f35344ks;

    /* JADX INFO: renamed from: m9 */
    public short f35345m9;

    /* JADX INFO: renamed from: to */
    public long f35346to;

    /* JADX INFO: renamed from: up */
    public short f35347up;

    /* JADX INFO: renamed from: x1 */
    public long f35348x1;

    /* JADX INFO: renamed from: yj */
    public short f35349yj;

    public C9781ne(C12564kk c12564kk) {
        long jM58604kk = c12564kk.m58604kk();
        this.f35342k4 = jM58604kk;
        if ((jM58604kk & 4294967295L) != 65536) {
            throw new NotSupportedException("Unsupported font head version.");
        }
        this.f35348x1 = c12564kk.m58604kk();
        this.f35343kk = c12564kk.m58604kk();
        long jM58604kk2 = c12564kk.m58604kk();
        this.f35346to = jM58604kk2;
        if ((jM58604kk2 & 4294967295L) != 1594834165) {
            throw new NotSupportedException("Unsupported font head magic number.");
        }
        this.f35337du = c12564kk.m58600du();
        this.f35340h4 = c12564kk.m58600du();
        c12564kk.m58606x1();
        c12564kk.m58606x1();
        c12564kk.m58606x1();
        c12564kk.m58606x1();
        this.f35345m9 = c12564kk.m58605to();
        this.f35338dy = c12564kk.m58605to();
        this.f35335c5 = c12564kk.m58605to();
        this.f35341jd = c12564kk.m58605to();
        this.f35336ck = c12564kk.m58600du();
        this.f35339fa = c12564kk.m58600du();
        this.f35347up = c12564kk.m58605to();
        this.f35349yj = c12564kk.m58605to();
        this.f35344ks = c12564kk.m58605to();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48130k4() {
        int i = this.f35336ck;
        return ((i & 1) != 0 ? 1 : 0) | ((i & 2) != 0 ? 2 : 0) | ((i & 4) != 0 ? 4 : 0);
    }
}
