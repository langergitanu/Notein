package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3871ks;
import com.aspose.slides.internal.p260ly.C6284u4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C9705sv extends AbstractC9627c5 {

    /* JADX INFO: renamed from: k4 */
    private long f35094k4;

    /* JADX INFO: renamed from: kk */
    private C6284u4 f35095kk;

    /* JADX INFO: renamed from: x1 */
    private long f35096x1;

    public C9705sv(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47652k4((C9705sv) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f35094k4)) * 397) ^ ((int) this.f35096x1)) * 397;
        C6284u4 c6284u4 = this.f35095kk;
        return iHashCode ^ (c6284u4 != null ? c6284u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47649k4() {
        return this.f35094k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C6284u4 m47653kk() {
        return this.f35095kk;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, RgnDataSize: {1}, RegionMode: {2}, RgnData: {3}", super.toString(), Long.valueOf(m47649k4()), C14042ak.m66410k4(C3871ks.class, m47654x1()), m47653kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47654x1() {
        return this.f35096x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47650k4(long j) {
        this.f35094k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47655x1(long j) {
        this.f35096x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47651k4(C6284u4 c6284u4) {
        this.f35095kk = c6284u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47652k4(C9705sv c9705sv) {
        return m47765k4((C9723vw) c9705sv) && this.f35094k4 == c9705sv.f35094k4 && this.f35096x1 == c9705sv.f35096x1 && C14067j2.m66728k4(this.f35095kk, c9705sv.f35095kk);
    }
}
