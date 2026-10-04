package com.aspose.slides.internal.p260ly;

import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p124f7.C3872m9;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p377r9.C9985kk;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6275jd extends AbstractC6280ne implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private int f17827k4;

    /* JADX INFO: renamed from: kk */
    private long f17828kk;

    /* JADX INFO: renamed from: x1 */
    private C12334dy f17829x1;

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
        return m25572k4((C6275jd) obj);
    }

    public int hashCode() {
        int i = (this.f17827k4 & 65535) * 397;
        C12334dy c12334dy = this.f17829x1;
        return ((i ^ (c12334dy != null ? c12334dy.hashCode() : 0)) * 397) ^ ((int) this.f17828kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m25567k4() {
        return this.f17827k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m25573kk() {
        return this.f17828kk;
    }

    public String toString() {
        return C14113y2.m67402k4("[BrushStyle: {0}, ColorRef: {1}, BrushHatch: {2}]", C14042ak.m66410k4(C9985kk.class, this.f17827k4), this.f17829x1, C14042ak.m66410k4(C3872m9.class, this.f17828kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final C12334dy m25574x1() {
        return this.f17829x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12024x1 m25568k4(C3585h4 c3585h4) {
        if (m25567k4() == 0) {
            return new C11999ar(m25574x1().m57666h4().Clone());
        }
        if (m25567k4() != 2) {
            return null;
        }
        switch ((int) m25573kk()) {
            case 1:
                return new C11900jd(1, m25574x1().m57666h4().Clone(), c3585h4.m14539ne().Clone());
            case 2:
                return new C11900jd(2, m25574x1().m57666h4().Clone(), c3585h4.m14539ne().Clone());
            case 3:
                return new C11900jd(3, m25574x1().m57666h4().Clone(), c3585h4.m14539ne().Clone());
            case 4:
                return new C11900jd(4, m25574x1().m57666h4().Clone(), c3585h4.m14539ne().Clone());
            case 5:
                return new C11900jd(5, m25574x1().m57666h4().Clone(), c3585h4.m14539ne().Clone());
            case 6:
                return new C11999ar(m25574x1().m57666h4().Clone());
            case 7:
                C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDCLR");
                return new C11999ar(m25574x1().m57666h4().Clone());
            case 8:
                return new C11999ar(c3585h4.m14498ix().Clone());
            case 9:
                C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                return new C11999ar(c3585h4.m14498ix().Clone());
            case 10:
                return new C11999ar(c3585h4.m14539ne().Clone());
            case 11:
                C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                return new C11999ar(c3585h4.m14539ne().Clone());
            default:
                return new C11900jd(0, m25574x1().m57666h4().Clone(), c3585h4.m14539ne().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25569k4(int i) {
        this.f17827k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25570k4(long j) {
        this.f17828kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25571k4(C12334dy c12334dy) {
        this.f17829x1 = c12334dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25572k4(C6275jd c6275jd) {
        return this.f17827k4 == c6275jd.f17827k4 && C14067j2.m66728k4(this.f17829x1, c6275jd.f17829x1) && this.f17828kk == c6275jd.f17828kk;
    }
}
