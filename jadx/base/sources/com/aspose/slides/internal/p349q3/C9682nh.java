package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6289x1;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.nh */
/* JADX INFO: loaded from: classes4.dex */
public class C9682nh extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C6289x1 f35025k4;

    public C9682nh(C9723vw c9723vw) {
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
        return m47502k4((C9682nh) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6289x1 c6289x1 = this.f35025k4;
        return iHashCode ^ (c6289x1 != null ? c6289x1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6289x1 m47500k4() {
        return this.f35025k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47501k4(C6289x1 c6289x1) {
        this.f35025k4 = c6289x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47502k4(C9682nh c9682nh) {
        return m47765k4((C9723vw) c9682nh) && C14067j2.m66728k4(this.f35025k4, c9682nh.f35025k4);
    }
}
