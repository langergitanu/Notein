package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p100e4.C3568kk;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p360qg.C9871m9;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C1344jd extends AbstractC1349ne implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private int f5843k4;

    /* JADX INFO: renamed from: kk */
    private long f5844kk;

    /* JADX INFO: renamed from: x1 */
    private C12505dy f5845x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m7932k4((C1344jd) obj);
    }

    public int hashCode() {
        int i = (this.f5843k4 & 65535) * 397;
        C12505dy c12505dy = this.f5845x1;
        return ((i ^ (c12505dy != null ? c12505dy.hashCode() : 0)) * 397) ^ ((int) this.f5844kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m7927k4() {
        return this.f5843k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m7933kk() {
        return this.f5844kk;
    }

    public String toString() {
        return C14113y2.m67402k4("[BrushStyle: {0}, ColorRef: {1}, BrushHatch: {2}]", C14042ak.m66410k4(C3568kk.class, this.f5843k4), this.f5845x1, C14042ak.m66410k4(C9871m9.class, this.f5844kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final C12505dy m7934x1() {
        return this.f5845x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12024x1 m7928k4(C4201h4 c4201h4) {
        if (m7927k4() == 0) {
            return new C11999ar(m7934x1().m58099k4().Clone());
        }
        if (m7927k4() != 2) {
            return null;
        }
        switch ((int) m7933kk()) {
            case 1:
                return new C11900jd(1, m7934x1().m58099k4().Clone(), c4201h4.m16739ne().Clone());
            case 2:
                return new C11900jd(2, m7934x1().m58099k4().Clone(), c4201h4.m16739ne().Clone());
            case 3:
                return new C11900jd(3, m7934x1().m58099k4().Clone(), c4201h4.m16739ne().Clone());
            case 4:
                return new C11900jd(4, m7934x1().m58099k4().Clone(), c4201h4.m16739ne().Clone());
            case 5:
                return new C11900jd(5, m7934x1().m58099k4().Clone(), c4201h4.m16739ne().Clone());
            case 6:
                return new C11999ar(m7934x1().m58099k4().Clone());
            case 7:
                C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDCLR");
                return new C11999ar(m7934x1().m58099k4().Clone());
            case 8:
                return new C11999ar(c4201h4.m16698ix().Clone());
            case 9:
                C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                return new C11999ar(c4201h4.m16698ix().Clone());
            case 10:
                return new C11999ar(c4201h4.m16739ne().Clone());
            case 11:
                C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                return new C11999ar(c4201h4.m16739ne().Clone());
            default:
                return new C11900jd(0, m7934x1().m58099k4().Clone(), c4201h4.m16739ne().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7929k4(int i) {
        this.f5843k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7930k4(long j) {
        this.f5844kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7931k4(C12505dy c12505dy) {
        this.f5845x1 = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7932k4(C1344jd c1344jd) {
        return this.f5843k4 == c1344jd.f5843k4 && C14067j2.m66728k4(this.f5845x1, c1344jd.f5845x1) && this.f5844kk == c1344jd.f5844kk;
    }
}
