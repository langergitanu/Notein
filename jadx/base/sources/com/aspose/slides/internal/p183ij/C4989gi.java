package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1353u4;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.gi */
/* JADX INFO: loaded from: classes.dex */
public class C4989gi extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13663k4;

    /* JADX INFO: renamed from: kk */
    private long f13664kk;

    /* JADX INFO: renamed from: to */
    private C1353u4 f13665to;

    /* JADX INFO: renamed from: x1 */
    private long f13666x1;

    public C4989gi(C5061vw c5061vw) {
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
        return m21074k4((C4989gi) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13663k4;
        int iHashCode2 = (((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13666x1)) * 397) ^ ((int) this.f13664kk)) * 397;
        C1353u4 c1353u4 = this.f13665to;
        return iHashCode2 ^ (c1353u4 != null ? c1353u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21070k4() {
        return this.f13663k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m21075kk() {
        return this.f13664kk;
    }

    /* JADX INFO: renamed from: to */
    public final C1353u4 m21076to() {
        return this.f13665to;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Bounds: {1}, RgnDataSize: {2}, IhBrush: {3}, RgnData: {4}", super.toString(), m21070k4(), Long.valueOf(m21077x1()), Long.valueOf(m21075kk()), m21076to());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21077x1() {
        return this.f13666x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21071k4(long j) {
        this.f13666x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21078x1(long j) {
        this.f13664kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21072k4(C1353u4 c1353u4) {
        this.f13665to = c1353u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21073k4(C12521uz c12521uz) {
        this.f13663k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21074k4(C4989gi c4989gi) {
        return m21559k4((C5061vw) c4989gi) && C14067j2.m66728k4(this.f13663k4, c4989gi.f13663k4) && this.f13666x1 == c4989gi.f13666x1 && this.f13664kk == c4989gi.f13664kk && this.f13665to.equals(c4989gi.f13665to);
    }
}
