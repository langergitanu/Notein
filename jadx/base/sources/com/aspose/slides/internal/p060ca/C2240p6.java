package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.p6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2240p6 extends C2236ov {

    /* JADX INFO: renamed from: du */
    private C2353wr f7719du;

    /* JADX INFO: renamed from: k4 */
    private float f7720k4;

    /* JADX INFO: renamed from: kk */
    private C2083fb f7721kk;

    /* JADX INFO: renamed from: to */
    private C2400z5 f7722to;

    /* JADX INFO: renamed from: x1 */
    private C2083fb f7723x1;

    public C2240p6(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
        this.f7723x1 = null;
        this.f7721kk = null;
        this.f7722to = null;
        this.f7719du = null;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m11230k4(int i) {
        if (i < 1 || i > 4) {
            throw new ArgumentException(C14113y2.m67402k4("Incorrect class number = {0} passed to calculate GDEF class type", Integer.valueOf(i)));
        }
        return (byte) i;
    }

    /* JADX INFO: renamed from: kk */
    public final C2400z5 m11232kk() {
        return this.f7722to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2083fb m11233x1() {
        return this.f7721kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2083fb m11231k4() {
        return this.f7723x1;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        this.f7720k4 = c2212n9.m11163to();
        int iM11151fa = c2212n9.m11151fa();
        int iM11151fa2 = c2212n9.m11151fa();
        c2212n9.m11151fa();
        int iM11151fa3 = c2212n9.m11151fa();
        int iM11151fa4 = this.f7720k4 == 1.2f ? c2212n9.m11151fa() : 0;
        c2212n9.m11154k4();
        int i = iM11151fa & 65535;
        if (i != 0) {
            this.f7723x1 = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(m11222wy() & 4294967295L, i), c2212n9);
        }
        int i2 = iM11151fa3 & 65535;
        if (i2 != 0) {
            this.f7721kk = (C2083fb) AbstractC2282s0.m11353k4(new C2083fb(m11222wy() & 4294967295L, i2), c2212n9);
        }
        int i3 = iM11151fa4 & 65535;
        if (i3 != 0) {
            this.f7722to = (C2400z5) AbstractC2282s0.m11353k4(new C2400z5(m11222wy() & 4294967295L, i3), c2212n9);
        }
        int i4 = iM11151fa2 & 65535;
        if (i4 != 0) {
            this.f7719du = (C2353wr) AbstractC2282s0.m11353k4(new C2353wr(4294967295L & m11222wy(), i4), c2212n9);
        }
        super.mo10299k4(c2212n9);
    }
}
