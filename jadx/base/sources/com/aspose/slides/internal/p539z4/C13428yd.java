package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.yd */
/* JADX INFO: loaded from: classes5.dex */
public class C13428yd extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13358ak f44924k4;

    /* JADX INFO: renamed from: x1 */
    private C13404ss f44925x1;

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
        return m62495k4((C13428yd) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        C13358ak c13358ak = this.f44924k4;
        int iMo62023h4 = c13358ak != null ? c13358ak.mo62023h4() : 0;
        C13404ss c13404ss = this.f44925x1;
        return c13404ss != null ? c13404ss.mo62023h4() + iMo62023h4 : iMo62023h4;
    }

    public int hashCode() {
        C13358ak c13358ak = this.f44924k4;
        int iHashCode = (c13358ak != null ? c13358ak.hashCode() : 0) * 397;
        C13404ss c13404ss = this.f44925x1;
        return iHashCode ^ (c13404ss != null ? c13404ss.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13358ak m62492k4() {
        return this.f44924k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13404ss m62496x1() {
        return this.f44925x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62493k4(C13358ak c13358ak) {
        this.f44924k4 = c13358ak;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62494k4(C13404ss c13404ss) {
        this.f44925x1 = c13404ss;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62495k4(C13428yd c13428yd) {
        return C14067j2.m66728k4(this.f44924k4, c13428yd.f44924k4) && C14067j2.m66728k4(this.f44925x1, c13428yd.f44925x1);
    }
}
