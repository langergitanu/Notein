package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C13395ne extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private int f44807k4;

    /* JADX INFO: renamed from: kk */
    private int f44808kk;

    /* JADX INFO: renamed from: x1 */
    private int f44809x1;

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
        return m62235k4((C13395ne) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 12;
    }

    public int hashCode() {
        return (((this.f44807k4 * 397) ^ this.f44809x1) * 397) ^ this.f44808kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62234k4(int i) {
        this.f44807k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62236kk(int i) {
        this.f44808kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62237x1(int i) {
        this.f44809x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62235k4(C13395ne c13395ne) {
        return this.f44807k4 == c13395ne.f44807k4 && this.f44809x1 == c13395ne.f44809x1 && this.f44808kk == c13395ne.f44808kk;
    }
}
