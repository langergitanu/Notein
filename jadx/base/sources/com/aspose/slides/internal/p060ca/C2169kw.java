package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kw */
/* JADX INFO: loaded from: classes3.dex */
class C2169kw extends C2056dv {

    /* JADX INFO: renamed from: c5 */
    public int f7518c5;

    /* JADX INFO: renamed from: ck */
    public int f7519ck;

    /* JADX INFO: renamed from: du */
    public int f7520du;

    /* JADX INFO: renamed from: dy */
    public int f7521dy;

    /* JADX INFO: renamed from: fa */
    public int f7522fa;

    /* JADX INFO: renamed from: h4 */
    public int f7523h4;

    /* JADX INFO: renamed from: jd */
    public int f7524jd;

    /* JADX INFO: renamed from: k4 */
    public int f7525k4;

    /* JADX INFO: renamed from: kk */
    public int f7526kk;

    /* JADX INFO: renamed from: m9 */
    public int f7527m9;

    /* JADX INFO: renamed from: rv */
    private int f7528rv;

    /* JADX INFO: renamed from: to */
    public int f7529to;

    /* JADX INFO: renamed from: up */
    public int f7530up;

    /* JADX INFO: renamed from: x1 */
    public int f7531x1;

    /* JADX INFO: renamed from: x6 */
    private int f7532x6;

    public C2169kw(byte[] bArr) {
        super("maxp", bArr);
        C2364x6 c2364x6 = new C2364x6(bArr);
        int iM11667du = c2364x6.m11667du();
        this.f7525k4 = iM11667du;
        if (iM11667du != 20480 && iM11667du != 65536) {
            throw new InvalidOperationException(C14113y2.m67402k4("Version of 'maxp' table is incorrect: {0}, expected {1} for v0.5 or {2} for v1.0", Integer.valueOf(this.f7525k4), 20480, 65536));
        }
        this.f7531x1 = c2364x6.m11669h4();
        if (this.f7525k4 == 65536) {
            this.f7526kk = c2364x6.m11669h4();
            this.f7529to = c2364x6.m11669h4();
            this.f7520du = c2364x6.m11669h4();
            this.f7523h4 = c2364x6.m11669h4();
            this.f7527m9 = c2364x6.m11669h4();
            this.f7521dy = c2364x6.m11669h4();
            this.f7518c5 = c2364x6.m11669h4();
            this.f7524jd = c2364x6.m11669h4();
            this.f7519ck = c2364x6.m11669h4();
            this.f7522fa = c2364x6.m11669h4();
            this.f7528rv = c2364x6.m11669h4();
            this.f7532x6 = c2364x6.m11669h4();
            this.f7530up = c2364x6.m11669h4();
        }
        if (bArr.length != c2364x6.m11670k4()) {
            throw new InvalidOperationException("Incorrect length of 'maxp' table");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10990k4(int i) {
        m10433k4(C7019kk.m27462to((Object) 26, 8), i);
        this.f7528rv = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10991x1(int i) {
        m10433k4(C7019kk.m27462to((Object) 28, 8), i);
        this.f7532x6 = i;
    }
}
