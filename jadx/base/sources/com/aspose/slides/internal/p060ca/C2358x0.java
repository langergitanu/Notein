package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.x0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2358x0 extends C2056dv {

    /* JADX INFO: renamed from: c5 */
    public short f8185c5;

    /* JADX INFO: renamed from: ck */
    private long f8186ck;

    /* JADX INFO: renamed from: du */
    public long f8187du;

    /* JADX INFO: renamed from: dy */
    public int f8188dy;

    /* JADX INFO: renamed from: fa */
    private int f8189fa;

    /* JADX INFO: renamed from: h4 */
    public long f8190h4;

    /* JADX INFO: renamed from: ix */
    private short f8191ix;

    /* JADX INFO: renamed from: jd */
    public short f8192jd;

    /* JADX INFO: renamed from: k4 */
    public int f8193k4;

    /* JADX INFO: renamed from: kk */
    public long f8194kk;

    /* JADX INFO: renamed from: m9 */
    public int f8195m9;

    /* JADX INFO: renamed from: ne */
    private short f8196ne;

    /* JADX INFO: renamed from: rv */
    private short f8197rv;

    /* JADX INFO: renamed from: to */
    public int f8198to;

    /* JADX INFO: renamed from: up */
    private short f8199up;

    /* JADX INFO: renamed from: x1 */
    public int f8200x1;

    /* JADX INFO: renamed from: x6 */
    private short f8201x6;

    public C2358x0(byte[] bArr) {
        super("head", bArr);
        C2364x6 c2364x6 = new C2364x6(bArr);
        int iM11667du = c2364x6.m11667du();
        this.f8193k4 = iM11667du;
        if (iM11667du != 65536) {
            throw new InvalidOperationException(C14113y2.m67402k4("Version of 'head' table is incorrect: {0}, expected {1} for v1.0", Integer.valueOf(this.f8193k4), 65536));
        }
        this.f8200x1 = c2364x6.m11667du();
        m11636k4(0L);
        c2364x6.m11671k4(c2364x6.m11670k4() + 4);
        long jM11674to = c2364x6.m11674to();
        this.f8194kk = jM11674to;
        if ((jM11674to & 4294967295L) != 1594834165) {
            throw new InvalidOperationException(C14113y2.m67402k4("Magic number of 'head' table is incorrect: {0}, expected {1}", Long.valueOf(this.f8194kk), 1594834165));
        }
        this.f8189fa = c2364x6.m11669h4();
        this.f8198to = c2364x6.m11669h4();
        this.f8187du = c2364x6.m11672kk();
        this.f8190h4 = c2364x6.m11672kk();
        this.f8199up = c2364x6.m11673m9();
        this.f8197rv = c2364x6.m11673m9();
        this.f8201x6 = c2364x6.m11673m9();
        this.f8196ne = c2364x6.m11673m9();
        this.f8195m9 = c2364x6.m11669h4();
        this.f8188dy = c2364x6.m11669h4();
        this.f8185c5 = c2364x6.m11673m9();
        this.f8191ix = c2364x6.m11673m9();
        this.f8192jd = c2364x6.m11673m9();
        if (bArr.length != c2364x6.m11670k4()) {
            throw new InvalidOperationException("Incorrect length of 'head' table");
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m11633du(short s) {
        m10435k4(50, s);
        this.f8191ix = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11634k4() {
        return this.f8189fa;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11639kk(short s) {
        m10435k4(40, s);
        this.f8201x6 = s;
    }

    /* JADX INFO: renamed from: to */
    public final void m11640to(short s) {
        m10435k4(42, s);
        this.f8196ne = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final short m11641x1() {
        return this.f8197rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11635k4(int i) {
        m10433k4(16, i);
        this.f8189fa = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11642x1(short s) {
        m10435k4(38, s);
        this.f8197rv = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11636k4(long j) {
        m10434k4(8, j);
        this.f8186ck = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11637k4(short s) {
        m10435k4(36, s);
        this.f8199up = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11638k4(boolean z) {
        int iM11634k4;
        int i;
        if (z) {
            i = 65535;
            iM11634k4 = (m11634k4() & 65535) | 16;
        } else {
            iM11634k4 = m11634k4();
            i = 65519;
        }
        m11635k4(iM11634k4 & i);
    }
}
