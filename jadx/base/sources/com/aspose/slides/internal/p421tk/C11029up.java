package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p026an.C1495ss;
import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.internal.p539z4.C13366ca;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.up */
/* JADX INFO: loaded from: classes4.dex */
public class C11029up extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private long f38358k4;

    /* JADX INFO: renamed from: kk */
    private C13366ca f38359kk;

    /* JADX INFO: renamed from: to */
    private int f38360to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13369du f38361x1;

    public C11029up(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: c5 */
    public final C13366ca m53394c5() {
        return this.f38359kk;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC13369du m53395dy() {
        return this.f38361x1;
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
        return m53400k4((C11029up) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int i = ((int) this.f38358k4) * 397;
        AbstractC13369du abstractC13369du = this.f38361x1;
        int iHashCode = (i ^ (abstractC13369du != null ? abstractC13369du.hashCode() : 0)) * 397;
        C13366ca c13366ca = this.f38359kk;
        return ((iHashCode ^ (c13366ca != null ? c13366ca.hashCode() : 0)) * 397) ^ this.f38360to;
    }

    /* JADX INFO: renamed from: jd */
    public final int m53396jd() {
        return this.f38360to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53397k4(long j) {
        this.f38358k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53401kk(int i) {
        this.f38360to = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m53403m9() {
        return this.f38358k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte m53404to() {
        return m53199ix();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Compressed: {1}, ObjectId: {2}, ImageAttributesId: {3}, RectData: {4}, SrcRect: {5}, SrcUnit: {6}", super.toString(), Boolean.valueOf(m53402kk()), Byte.valueOf(m53404to()), Long.valueOf(m53403m9()), m53395dy(), m53394c5(), C14042ak.m66410k4(C1495ss.class, m53396jd()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53398k4(C13366ca c13366ca) {
        this.f38359kk = c13366ca;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53402kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53399k4(AbstractC13369du abstractC13369du) {
        this.f38361x1 = abstractC13369du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53400k4(C11029up c11029up) {
        return this.f38358k4 == c11029up.f38358k4 && C14067j2.m66728k4(this.f38361x1, c11029up.f38361x1) && C14067j2.m66728k4(this.f38359kk, c11029up.f38359kk) && this.f38360to == c11029up.f38360to;
    }
}
