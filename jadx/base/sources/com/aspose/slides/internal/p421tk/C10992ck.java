package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p026an.C1484jd;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p539z4.C13430yo;
import com.aspose.slides.internal.p539z4.C13431zj;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10992ck extends AbstractC11027u4 {

    /* JADX INFO: renamed from: du */
    private short[] f38303du;

    /* JADX INFO: renamed from: dy */
    private String f38304dy;

    /* JADX INFO: renamed from: h4 */
    private long f38305h4;

    /* JADX INFO: renamed from: k4 */
    private int f38306k4;

    /* JADX INFO: renamed from: kk */
    private int f38307kk;

    /* JADX INFO: renamed from: m9 */
    private C13430yo f38308m9;

    /* JADX INFO: renamed from: to */
    private C13431zj[] f38309to;

    /* JADX INFO: renamed from: x1 */
    private long f38310x1;

    public C10992ck(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: c5 */
    public final C13431zj[] m53220c5() {
        return this.f38309to;
    }

    /* JADX INFO: renamed from: ck */
    public final String m53221ck() {
        return this.f38304dy;
    }

    /* JADX INFO: renamed from: dy */
    public final int m53222dy() {
        return this.f38307kk;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53230k4((C10992ck) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m53223fa() {
        return m53198h4(15);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int i = ((((this.f38306k4 * 397) ^ ((int) this.f38310x1)) * 397) ^ this.f38307kk) * 397;
        C13431zj[] c13431zjArr = this.f38309to;
        int iHashCode = (i ^ (c13431zjArr != null ? AbstractC14092to.m67208k4((Object) c13431zjArr).hashCode() : 0)) * 397;
        short[] sArr = this.f38303du;
        int iHashCode2 = (((iHashCode ^ (sArr != null ? AbstractC14092to.m67208k4((Object) sArr).hashCode() : 0)) * 397) ^ ((int) this.f38305h4)) * 397;
        C13430yo c13430yo = this.f38308m9;
        return ((iHashCode2 ^ (c13430yo != null ? c13430yo.hashCode() : 0)) * 397) ^ (m53221ck() != null ? m53221ck().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final short[] m53224jd() {
        return this.f38303du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53225k4(long j) {
        this.f38310x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m53231kk() {
        return m53199ix();
    }

    /* JADX INFO: renamed from: m9 */
    public final long m53233m9() {
        return this.f38310x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m53234to() {
        return this.f38306k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, ObjectId: {1}, BrushId: {2}, DriverStringOptionsFlags: {3}, GlyphCount: {4}, GlyphPos: {5}, Glyphs: {6}, GlyphsString: {7}, IsColor: {8}, MatrixPresent: {9}, TransformMatrix: {10}", super.toString(), Byte.valueOf(m53231kk()), Integer.valueOf(m53234to()), C14042ak.m66410k4(C1484jd.class, m53233m9()), Integer.valueOf(m53222dy()), m53220c5(), m53224jd(), m53221ck(), Boolean.valueOf(m53223fa()), Long.valueOf(m53236up()), m53238yj());
    }

    /* JADX INFO: renamed from: up */
    public final long m53236up() {
        return this.f38305h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53237x1(long j) {
        this.f38305h4 = j;
    }

    /* JADX INFO: renamed from: yj */
    public final C13430yo m53238yj() {
        return this.f38308m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53226k4(C13430yo c13430yo) {
        this.f38308m9 = c13430yo;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53232kk(int i) {
        this.f38306k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m53235to(int i) {
        this.f38307kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53227k4(String str) {
        this.f38304dy = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53228k4(C13431zj[] c13431zjArr) {
        this.f38309to = c13431zjArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53229k4(short[] sArr) {
        this.f38303du = sArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53230k4(C10992ck c10992ck) {
        return this.f38306k4 == c10992ck.f38306k4 && this.f38310x1 == c10992ck.f38310x1 && this.f38307kk == c10992ck.f38307kk && C3022m9.m12723k4(this.f38309to, c10992ck.f38309to) && C3022m9.m12724k4(this.f38303du, c10992ck.f38303du) && this.f38305h4 == c10992ck.f38305h4 && C14067j2.m66728k4(this.f38308m9, c10992ck.f38308m9) && C14113y2.m67363du(m53221ck(), c10992ck.m53221ck());
    }
}
