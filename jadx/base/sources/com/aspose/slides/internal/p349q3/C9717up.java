package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.up */
/* JADX INFO: loaded from: classes4.dex */
public class C9717up extends C9681ne {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35130k4;

    /* JADX INFO: renamed from: kk */
    private String f35131kk;

    /* JADX INFO: renamed from: x1 */
    private long f35132x1;

    public C9717up(C9681ne c9681ne) {
        super(c9681ne);
        m47499x1(c9681ne.m47495h4());
        m47497kk(c9681ne.m47498m9());
    }

    @Override // com.aspose.slides.internal.p349q3.C9681ne, com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47736k4((C9717up) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9681ne, com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35130k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35132x1)) * 397;
        String str = this.f35131kk;
        return iHashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47732k4() {
        return this.f35130k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m47737kk() {
        return this.f35131kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47738x1() {
        return this.f35132x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47733k4(long j) {
        this.f35132x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47734k4(C12350uz c12350uz) {
        this.f35130k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47735k4(String str) {
        this.f35131kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47736k4(C9717up c9717up) {
        return m47496k4((C9681ne) c9717up) && C14067j2.m66728k4(this.f35130k4, c9717up.f35130k4) && this.f35132x1 == c9717up.f35132x1 && C14113y2.m67363du(this.f35131kk, c9717up.f35131kk);
    }
}
