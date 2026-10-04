package com.aspose.slides.internal.p539z4;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p026an.C1470b3;
import com.aspose.slides.internal.p026an.C1473c5;
import com.aspose.slides.internal.p026an.C1499u4;
import com.aspose.slides.internal.p026an.C1502uz;
import com.aspose.slides.internal.p026an.C1504wl;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.os */
/* JADX INFO: loaded from: classes5.dex */
public class C13397os extends AbstractC13376gf {

    /* JADX INFO: renamed from: c5 */
    private C13420wy f44825c5;

    /* JADX INFO: renamed from: ck */
    private C13418wl f44826ck;

    /* JADX INFO: renamed from: du */
    private float f44827du;

    /* JADX INFO: renamed from: dy */
    private float f44828dy;

    /* JADX INFO: renamed from: fa */
    private C13360b3 f44829fa;

    /* JADX INFO: renamed from: h4 */
    private int f44830h4;

    /* JADX INFO: renamed from: jd */
    private int f44831jd;

    /* JADX INFO: renamed from: k4 */
    private C13430yo f44832k4;

    /* JADX INFO: renamed from: kk */
    private long f44833kk;

    /* JADX INFO: renamed from: m9 */
    private int f44834m9;

    /* JADX INFO: renamed from: to */
    private int f44835to;

    /* JADX INFO: renamed from: up */
    private C13411um f44836up;

    /* JADX INFO: renamed from: x1 */
    private long f44837x1;

    /* JADX INFO: renamed from: c5 */
    public final float m62272c5() {
        return this.f44828dy;
    }

    /* JADX INFO: renamed from: ck */
    public final int m62273ck() {
        return this.f44831jd;
    }

    /* JADX INFO: renamed from: du */
    public final float m62274du() {
        return this.f44827du;
    }

    /* JADX INFO: renamed from: dy */
    public final int m62275dy() {
        return this.f44834m9;
    }

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
        return m62287k4((C13397os) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final C13418wl m62276fa() {
        return this.f44826ck;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        throw new NotSupportedException("Use overloaded methos with EmfPlusPenDataFlags param");
    }

    public int hashCode() {
        C13430yo c13430yo = this.f44832k4;
        int iHashCode = (((((((((((((((c13430yo != null ? c13430yo.hashCode() : 0) * 397) ^ ((int) this.f44837x1)) * 397) ^ ((int) this.f44833kk)) * 397) ^ this.f44835to) * 397) ^ C14064he.m66708k4(this.f44827du)) * 397) ^ this.f44830h4) * 397) ^ this.f44834m9) * 397) ^ C14064he.m66708k4(this.f44828dy)) * 397;
        C13420wy c13420wy = this.f44825c5;
        int iHashCode2 = (((iHashCode ^ (c13420wy != null ? c13420wy.hashCode() : 0)) * 397) ^ this.f44831jd) * 397;
        C13418wl c13418wl = this.f44826ck;
        int iHashCode3 = (iHashCode2 ^ (c13418wl != null ? c13418wl.hashCode() : 0)) * 397;
        C13360b3 c13360b3 = this.f44829fa;
        int iHashCode4 = (iHashCode3 ^ (c13360b3 != null ? c13360b3.hashCode() : 0)) * 397;
        C13411um c13411um = this.f44836up;
        return iHashCode4 ^ (c13411um != null ? c13411um.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C13420wy m62277jd() {
        return this.f44825c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13430yo m62278k4() {
        return this.f44832k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m62288kk(long j) {
        int iMo62023h4 = ((1 & j) <= 0 || this.f44832k4 == null) ? 0 : 24;
        if ((2 & j) > 0) {
            iMo62023h4 += 4;
        }
        if ((4 & j) > 0) {
            iMo62023h4 += 4;
        }
        if ((8 & j) > 0) {
            iMo62023h4 += 4;
        }
        if ((16 & j) > 0) {
            iMo62023h4 += 4;
        }
        if ((32 & j) > 0) {
            iMo62023h4 += 4;
        }
        if ((64 & j) > 0) {
            iMo62023h4 += 4;
        }
        if ((128 & j) > 0) {
            iMo62023h4 += 4;
        }
        if ((j & 512) > 0) {
            iMo62023h4 += 4;
        }
        if (m62277jd() != null) {
            iMo62023h4 += m62277jd().mo62023h4();
        }
        if (m62276fa() != null) {
            iMo62023h4 += m62276fa().mo62023h4();
        }
        if (m62294up() != null) {
            iMo62023h4 += m62294up().mo62023h4();
        }
        return m62299yj() != null ? m62299yj().mo62023h4() + iMo62023h4 : iMo62023h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m62291m9() {
        return this.f44830h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m62292to() {
        return this.f44835to;
    }

    public String toString() {
        return C14113y2.m67402k4("TransformMatrix: {0}, StartCap: {1}, EndCap: {2}, Join: {3}, MiterLimit: {4}, LineStyle: {5}, DashedLineCapType: {6}, DashOffset: {7}, DashedLineData: {8}, PenAlignment: {9}, CompoundLineData: {10}, CustomStartCapData: {11}, CustomEndCapData: {12}", this.f44832k4, C14042ak.m66410k4(C1499u4.class, this.f44837x1), C14042ak.m66410k4(C1499u4.class, this.f44833kk), C14042ak.m66410k4(C1502uz.class, this.f44835to), Float.valueOf(this.f44827du), C14042ak.m66410k4(C1504wl.class, this.f44830h4), C14042ak.m66410k4(C1473c5.class, this.f44834m9), Float.valueOf(this.f44828dy), this.f44825c5, C14042ak.m66410k4(C1470b3.class, this.f44831jd), this.f44826ck, this.f44829fa, this.f44836up);
    }

    /* JADX INFO: renamed from: up */
    public final C13360b3 m62294up() {
        return this.f44829fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62295x1() {
        return this.f44837x1;
    }

    /* JADX INFO: renamed from: yj */
    public final C13411um m62299yj() {
        return this.f44836up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62279k4(float f) {
        this.f44827du = f;
    }

    /* JADX INFO: renamed from: kk */
    public final long m62289kk() {
        return this.f44833kk;
    }

    /* JADX INFO: renamed from: to */
    public final void m62293to(int i) {
        this.f44831jd = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62296x1(float f) {
        this.f44828dy = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62280k4(int i) {
        this.f44835to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62290kk(int i) {
        this.f44834m9 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62297x1(int i) {
        this.f44830h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62281k4(long j) {
        this.f44837x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62298x1(long j) {
        this.f44833kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62282k4(C13360b3 c13360b3) {
        this.f44829fa = c13360b3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62283k4(C13411um c13411um) {
        this.f44836up = c13411um;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62284k4(C13418wl c13418wl) {
        this.f44826ck = c13418wl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62285k4(C13420wy c13420wy) {
        this.f44825c5 = c13420wy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62286k4(C13430yo c13430yo) {
        this.f44832k4 = c13430yo;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62287k4(C13397os c13397os) {
        return C14067j2.m66728k4(this.f44832k4, c13397os.f44832k4) && this.f44837x1 == c13397os.f44837x1 && this.f44833kk == c13397os.f44833kk && this.f44835to == c13397os.f44835to && C14064he.m66718x1(this.f44827du, c13397os.f44827du) && this.f44830h4 == c13397os.f44830h4 && this.f44834m9 == c13397os.f44834m9 && C14064he.m66718x1(this.f44828dy, c13397os.f44828dy) && C14067j2.m66728k4(this.f44825c5, c13397os.f44825c5) && this.f44831jd == c13397os.f44831jd && C14067j2.m66728k4(this.f44826ck, c13397os.f44826ck) && C14067j2.m66728k4(this.f44829fa, c13397os.f44829fa) && C14067j2.m66728k4(this.f44836up, c13397os.f44836up);
    }
}
