package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1338ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C4979e0 extends AbstractC4967ca {

    /* JADX INFO: renamed from: k4 */
    private long f13627k4;

    /* JADX INFO: renamed from: x1 */
    private C1338ck f13628x1;

    public C4979e0(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m20995k4((C4979e0) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13627k4)) * 397;
        C1338ck c1338ck = this.f13628x1;
        return iHashCode ^ (c1338ck != null ? c1338ck.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20992k4() {
        return this.f13627k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhFonts: {1}, Elw: {2}", super.toString(), Long.valueOf(m20992k4()), m20996x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final C1338ck m20996x1() {
        return this.f13628x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20993k4(long j) {
        this.f13627k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20994k4(C1338ck c1338ck) {
        this.f13628x1 = c1338ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20995k4(C4979e0 c4979e0) {
        return m21559k4((C5061vw) c4979e0) && this.f13627k4 == c4979e0.f13627k4 && C14067j2.m66728k4(this.f13628x1, c4979e0.f13628x1);
    }
}
