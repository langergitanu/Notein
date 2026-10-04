package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.up */
/* JADX INFO: loaded from: classes3.dex */
public class C1355up extends C1341fa {

    /* JADX INFO: renamed from: k4 */
    private C1346kk f5877k4;

    public C1355up(C1341fa c1341fa) {
        super(c1341fa);
        m7891x1(c1341fa.m7889rv());
        m7887kk(c1341fa.m7892x6());
        m7890to(c1341fa.m7888ne());
        m7885k4(c1341fa.m7884ix());
    }

    @Override // com.aspose.slides.internal.p019ac.C1341fa, com.aspose.slides.internal.p019ac.C1338ck
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
        return m7995k4((C1355up) obj);
    }

    @Override // com.aspose.slides.internal.p019ac.C1341fa, com.aspose.slides.internal.p019ac.C1338ck
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1346kk c1346kk = this.f5877k4;
        return iHashCode ^ (c1346kk != null ? c1346kk.hashCode() : 0);
    }

    @Override // com.aspose.slides.internal.p019ac.C1341fa, com.aspose.slides.internal.p019ac.C1338ck
    /* JADX INFO: renamed from: k4 */
    public C12013m9 mo7856k4(C4201h4 c4201h4) {
        return super.mo7856k4(c4201h4);
    }

    @Override // com.aspose.slides.internal.p019ac.C1341fa, com.aspose.slides.internal.p019ac.C1338ck
    public String toString() {
        return C14113y2.m67402k4("{0}, DesignVector: {1}", super.toString(), m7996u4());
    }

    /* JADX INFO: renamed from: u4 */
    public final C1346kk m7996u4() {
        return this.f5877k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7994k4(C1346kk c1346kk) {
        this.f5877k4 = c1346kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7995k4(C1355up c1355up) {
        return m7886k4((C1341fa) c1355up) && C14067j2.m66728k4(this.f5877k4, c1355up.f5877k4);
    }
}
