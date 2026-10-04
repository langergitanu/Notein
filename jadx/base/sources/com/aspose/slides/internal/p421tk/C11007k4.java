package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p026an.C1495ss;
import com.aspose.slides.internal.p539z4.C13366ca;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11007k4 extends AbstractC10991ca {

    /* JADX INFO: renamed from: k4 */
    private C13366ca f38333k4;

    /* JADX INFO: renamed from: kk */
    private long f38334kk;

    /* JADX INFO: renamed from: x1 */
    private C13366ca f38335x1;

    public C11007k4() {
        m53208x1((short) 16423);
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
        return m53308k4((C11007k4) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return ((((m53311x1() != null ? m53311x1().hashCode() : 0) * 397) ^ (m53309kk() != null ? m53309kk().hashCode() : 0)) * 397) ^ ((int) m53310to());
    }

    /* JADX INFO: renamed from: k4 */
    public final int m53305k4() {
        return m53205ne() & 255;
    }

    /* JADX INFO: renamed from: kk */
    public final C13366ca m53309kk() {
        return this.f38335x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m53310to() {
        return this.f38334kk;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PageUnit: {1}, DestRect: {2}, SrcRect: {3}, StackIndex: {4}", super.toString(), C14042ak.m66410k4(C1495ss.class, m53305k4()), m53311x1(), m53309kk(), Long.valueOf(m53310to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final C13366ca m53311x1() {
        return this.f38333k4;
    }

    public C11007k4(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53306k4(long j) {
        this.f38334kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53312x1(C13366ca c13366ca) {
        this.f38335x1 = c13366ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53307k4(C13366ca c13366ca) {
        this.f38333k4 = c13366ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53308k4(C11007k4 c11007k4) {
        return C14067j2.m66728k4(m53311x1(), c11007k4.m53311x1()) && C14067j2.m66728k4(m53309kk(), c11007k4.m53309kk()) && m53310to() == c11007k4.m53310to();
    }
}
