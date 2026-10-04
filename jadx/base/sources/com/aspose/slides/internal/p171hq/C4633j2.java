package com.aspose.slides.internal.p171hq;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.j2 */
/* JADX INFO: loaded from: classes.dex */
public class C4633j2 extends AbstractC4615c6 {

    /* JADX INFO: renamed from: k4 */
    private int f12916k4;

    /* JADX INFO: renamed from: kk */
    private C4652rv f12917kk;

    /* JADX INFO: renamed from: x1 */
    private C4667w6 f12918x1;

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
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
        return m19158k4((C4633j2) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return m19159kk().mo19017h4() + m19161x1().mo19017h4() + 8;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ this.f12916k4) * 397;
        C4667w6 c4667w6 = this.f12918x1;
        int iHashCode2 = (iHashCode ^ (c4667w6 != null ? c4667w6.hashCode() : 0)) * 397;
        C4652rv c4652rv = this.f12917kk;
        return iHashCode2 ^ (c4652rv != null ? c4652rv.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19154k4() {
        return this.f12916k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4652rv m19159kk() {
        return this.f12917kk;
    }

    /* JADX INFO: renamed from: to */
    public final C12026yj m19160to() {
        C12026yj c12026yj = new C12026yj(m19159kk().m19333kk());
        c12026yj.m56926kk(m19161x1().m19439kk());
        C4647os c4647osM19440to = m19161x1().m19440to();
        if ((m19161x1().m19433k4() & 128) > 0) {
            c12026yj.m56918k4(c4647osM19440to.m19279c5());
        }
        if ((m19161x1().m19433k4() & 1) > 0) {
            c12026yj.m56922k4(c4647osM19440to.m19285k4().m19523dy());
        }
        if ((m19161x1().m19433k4() & 2) > 0) {
            c12026yj.m56932to((int) c4647osM19440to.m19302x1());
        }
        if ((m19161x1().m19433k4() & 4) > 0) {
            c12026yj.m56909du((int) c4647osM19440to.m19296kk());
        }
        if ((m19161x1().m19433k4() & 8) > 0) {
            c12026yj.m56914h4(c4647osM19440to.m19299to());
        }
        if ((m19161x1().m19433k4() & 16) > 0) {
            c12026yj.m56936x1(c4647osM19440to.m19281du());
        }
        if ((m19161x1().m19433k4() & 512) > 0) {
            c12026yj.m56919k4(c4647osM19440to.m19280ck());
        }
        if ((m19161x1().m19433k4() & 1024) > 0) {
            c12026yj.m56924k4(c4647osM19440to.m19283fa().m19445k4());
        }
        if ((m19161x1().m19433k4() & 32) > 0) {
            c12026yj.m56927kk(c4647osM19440to.m19298m9());
        }
        if ((m19161x1().m19433k4() & 256) > 0) {
            c12026yj.m56927kk(5);
            c12026yj.m56939x1(c4647osM19440to.m19284jd().m19457k4());
        }
        if ((m19161x1().m19433k4() & 64) > 0) {
            c12026yj.m56937x1(c4647osM19440to.m19282dy());
        }
        if ((m19161x1().m19433k4() & 2048) > 0) {
            c12026yj.m56938x1(c4647osM19440to.m19301up().m19027k4().m19041kk());
        }
        if ((m19161x1().m19433k4() & 4096) > 0) {
            c12026yj.m56921k4(c4647osM19440to.m19306yj().m19374k4().m19041kk());
        }
        return c12026yj;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public String toString() {
        return C14113y2.m67402k4("{0}, Type: {1}, PenData: [{2}], BrushObject: [{3}]", super.toString(), Integer.valueOf(this.f12916k4), this.f12918x1, this.f12917kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final C4667w6 m19161x1() {
        return this.f12918x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19155k4(int i) {
        if (i != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f12916k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19156k4(C4652rv c4652rv) {
        this.f12917kk = c4652rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19157k4(C4667w6 c4667w6) {
        this.f12918x1 = c4667w6;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19158k4(C4633j2 c4633j2) {
        return m19055k4((AbstractC4615c6) c4633j2) && this.f12916k4 == c4633j2.f12916k4 && C14067j2.m66728k4(this.f12918x1, c4633j2.f12918x1) && C14067j2.m66728k4(this.f12917kk, c4633j2.f12917kk);
    }
}
