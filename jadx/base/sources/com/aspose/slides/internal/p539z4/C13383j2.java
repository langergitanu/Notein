package com.aspose.slides.internal.p539z4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.j2 */
/* JADX INFO: loaded from: classes5.dex */
public class C13383j2 extends AbstractC13365c6 {

    /* JADX INFO: renamed from: k4 */
    private int f44769k4;

    /* JADX INFO: renamed from: kk */
    private C13402rv f44770kk;

    /* JADX INFO: renamed from: x1 */
    private C13417w6 f44771x1;

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
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
        return m62157k4((C13383j2) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return m62159x1().mo62023h4() + m62153k4().mo62023h4() + 8;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ this.f44769k4) * 397;
        C13417w6 c13417w6 = this.f44771x1;
        int iHashCode2 = (iHashCode ^ (c13417w6 != null ? c13417w6.hashCode() : 0)) * 397;
        C13402rv c13402rv = this.f44770kk;
        return iHashCode2 ^ (c13402rv != null ? c13402rv.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13417w6 m62153k4() {
        return this.f44771x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C12026yj m62158kk() {
        C12026yj c12026yj = new C12026yj(m62159x1().m62322kk());
        c12026yj.m56926kk(m62153k4().m62424x1());
        C13397os c13397osM62423kk = m62153k4().m62423kk();
        if ((m62153k4().m62417k4() & 128) > 0) {
            c12026yj.m56918k4(c13397osM62423kk.m62272c5());
        }
        if ((m62153k4().m62417k4() & 1) > 0) {
            c12026yj.m56922k4(c13397osM62423kk.m62278k4().m62505k4());
        }
        if ((m62153k4().m62417k4() & 2) > 0) {
            c12026yj.m56932to((int) c13397osM62423kk.m62295x1());
        }
        if ((m62153k4().m62417k4() & 4) > 0) {
            c12026yj.m56909du((int) c13397osM62423kk.m62289kk());
        }
        if ((m62153k4().m62417k4() & 8) > 0) {
            c12026yj.m56914h4(c13397osM62423kk.m62292to());
        }
        if ((m62153k4().m62417k4() & 16) > 0) {
            c12026yj.m56936x1(c13397osM62423kk.m62274du());
        }
        if ((m62153k4().m62417k4() & 512) > 0) {
            c12026yj.m56919k4(c13397osM62423kk.m62273ck());
        }
        if ((m62153k4().m62417k4() & 1024) > 0) {
            c12026yj.m56924k4(c13397osM62423kk.m62276fa().m62428k4());
        }
        if ((m62153k4().m62417k4() & 32) > 0) {
            c12026yj.m56927kk(c13397osM62423kk.m62291m9());
        }
        if ((m62153k4().m62417k4() & 256) > 0) {
            c12026yj.m56927kk(5);
            c12026yj.m56939x1(c13397osM62423kk.m62277jd().m62440k4());
        }
        if ((m62153k4().m62417k4() & 64) > 0) {
            c12026yj.m56937x1(c13397osM62423kk.m62275dy());
        }
        if ((m62153k4().m62417k4() & 2048) > 0) {
            c12026yj.m56938x1(c13397osM62423kk.m62294up().m62032k4().m62045kk());
        }
        if ((m62153k4().m62417k4() & 4096) > 0) {
            c12026yj.m56921k4(c13397osM62423kk.m62299yj().m62361k4().m62045kk());
        }
        return c12026yj;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public String toString() {
        return C14113y2.m67402k4("{0}, Type: {1}, PenData: [{2}], BrushObject: [{3}]", super.toString(), Integer.valueOf(this.f44769k4), this.f44771x1, this.f44770kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13402rv m62159x1() {
        return this.f44770kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62154k4(int i) {
        if (i != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f44769k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62155k4(C13402rv c13402rv) {
        this.f44770kk = c13402rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62156k4(C13417w6 c13417w6) {
        this.f44771x1 = c13417w6;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62157k4(C13383j2 c13383j2) {
        return m62059k4((AbstractC13365c6) c13383j2) && this.f44769k4 == c13383j2.f44769k4 && C14067j2.m66728k4(this.f44771x1, c13383j2.f44771x1) && C14067j2.m66728k4(this.f44770kk, c13383j2.f44770kk);
    }
}
