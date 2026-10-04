package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.tu */
/* JADX INFO: loaded from: classes3.dex */
class C2312tu extends C2056dv {

    /* JADX INFO: renamed from: c5 */
    private short f7986c5;

    /* JADX INFO: renamed from: ck */
    private short f7987ck;

    /* JADX INFO: renamed from: du */
    public short f7988du;

    /* JADX INFO: renamed from: dy */
    private short f7989dy;

    /* JADX INFO: renamed from: fa */
    private short f7990fa;

    /* JADX INFO: renamed from: h4 */
    public short f7991h4;

    /* JADX INFO: renamed from: jd */
    private int f7992jd;

    /* JADX INFO: renamed from: k4 */
    public int f7993k4;

    /* JADX INFO: renamed from: kk */
    public short f7994kk;

    /* JADX INFO: renamed from: m9 */
    public int f7995m9;

    /* JADX INFO: renamed from: to */
    public short f7996to;

    /* JADX INFO: renamed from: up */
    private short f7997up;

    /* JADX INFO: renamed from: x1 */
    public short f7998x1;

    public C2312tu(byte[] bArr) {
        super("hhea", bArr);
        C2364x6 c2364x6 = new C2364x6(bArr);
        int iM11667du = c2364x6.m11667du();
        this.f7993k4 = iM11667du;
        if (iM11667du != 65536) {
            throw new InvalidOperationException(C14113y2.m67402k4("Version of 'hhea' table is incorrect: {0}, expected {1} for v1.0", Integer.valueOf(this.f7993k4), 65536));
        }
        this.f7989dy = c2364x6.m11673m9();
        this.f7986c5 = c2364x6.m11673m9();
        this.f7998x1 = c2364x6.m11673m9();
        this.f7992jd = c2364x6.m11669h4();
        this.f7987ck = c2364x6.m11673m9();
        this.f7990fa = c2364x6.m11673m9();
        this.f7997up = c2364x6.m11673m9();
        this.f7994kk = c2364x6.m11673m9();
        this.f7996to = c2364x6.m11673m9();
        this.f7988du = c2364x6.m11673m9();
        for (int i = 0; i < 4; i++) {
            c2364x6.m11673m9();
        }
        this.f7991h4 = c2364x6.m11673m9();
        this.f7995m9 = c2364x6.m11669h4();
        if (bArr.length != c2364x6.m11670k4()) {
            throw new InvalidOperationException("Incorrect length of 'hhea' table");
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m11459du(short s) {
        m10435k4(C7019kk.m27462to((Object) (byte) 16, 6), s);
        this.f7997up = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m11460k4() {
        return this.f7989dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11463kk(short s) {
        m10435k4(C7019kk.m27462to((Object) (byte) 12, 6), s);
        this.f7987ck = s;
    }

    /* JADX INFO: renamed from: to */
    public final void m11464to(short s) {
        m10435k4(C7019kk.m27462to((Object) (byte) 14, 6), s);
        this.f7990fa = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final short m11465x1() {
        return this.f7986c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11461k4(int i) {
        m10433k4(C7019kk.m27462to((Object) (byte) 10, 6), i);
        this.f7992jd = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11466x1(short s) {
        m10435k4(C7019kk.m27462to((Object) (byte) 6, 6), s);
        this.f7986c5 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11462k4(short s) {
        m10435k4(C7019kk.m27462to((Object) (byte) 4, 6), s);
        this.f7989dy = s;
    }
}
