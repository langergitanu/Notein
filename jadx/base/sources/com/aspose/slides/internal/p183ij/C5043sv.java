package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1353u4;
import com.aspose.slides.internal.p360qg.C9870ks;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.sv */
/* JADX INFO: loaded from: classes.dex */
public class C5043sv extends AbstractC4965c5 {

    /* JADX INFO: renamed from: k4 */
    private long f13847k4;

    /* JADX INFO: renamed from: kk */
    private C1353u4 f13848kk;

    /* JADX INFO: renamed from: x1 */
    private long f13849x1;

    public C5043sv(C5061vw c5061vw) {
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
        return m21454k4((C5043sv) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f13847k4)) * 397) ^ ((int) this.f13849x1)) * 397;
        C1353u4 c1353u4 = this.f13848kk;
        return iHashCode ^ (c1353u4 != null ? c1353u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21451k4() {
        return this.f13847k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C1353u4 m21455kk() {
        return this.f13848kk;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, RgnDataSize: {1}, RegionMode: {2}, RgnData: {3}", super.toString(), Long.valueOf(m21451k4()), C14042ak.m66410k4(C9870ks.class, m21456x1()), m21455kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21456x1() {
        return this.f13849x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21452k4(long j) {
        this.f13847k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21457x1(long j) {
        this.f13849x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21453k4(C1353u4 c1353u4) {
        this.f13848kk = c1353u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21454k4(C5043sv c5043sv) {
        return m21559k4((C5061vw) c5043sv) && this.f13847k4 == c5043sv.f13847k4 && this.f13849x1 == c5043sv.f13849x1 && C14067j2.m66728k4(this.f13848kk, c5043sv.f13848kk);
    }
}
