package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p396sc.C10199to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.t6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6080t6 extends AbstractC6081to {

    /* JADX INFO: renamed from: k4 */
    private C4616ca f17205k4;

    public C6080t6() {
        m24449x1((short) 16434);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24626k4((C6080t6) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return this.f17205k4.mo19017h4();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C4616ca c4616ca = this.f17205k4;
        return iHashCode ^ (c4616ca != null ? c4616ca.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24625k4(C4616ca c4616ca) {
        this.f17205k4 = c4616ca;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m24627kk() {
        return m24630k4();
    }

    /* JADX INFO: renamed from: to */
    public final C4616ca m24628to() {
        return this.f17205k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, ClipRect: {1}, Cm: {2}", super.toString(), this.f17205k4, C14042ak.m66410k4(C10199to.class, m24627kk()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24629x1(byte b) {
        m24631k4(b);
    }

    public C6080t6(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24626k4(C6080t6 c6080t6) {
        return m24438k4((C6045bz) c6080t6) && C14067j2.m66728k4(this.f17205k4, c6080t6.f17205k4);
    }
}
