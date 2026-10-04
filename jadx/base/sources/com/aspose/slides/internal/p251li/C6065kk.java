package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4637k4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6065kk extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private C4637k4 f17187k4;

    public C6065kk() {
        m24449x1((short) 16393);
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
        return m24558k4((C6065kk) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        C4637k4 c4637k4 = this.f17187k4;
        if (c4637k4 != null) {
            return c4637k4.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4637k4 m24556k4() {
        return this.f17187k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("[{0}, Color: {1}]", super.toString(), this.f17187k4);
    }

    public C6065kk(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24557k4(C4637k4 c4637k4) {
        this.f17187k4 = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24558k4(C6065kk c6065kk) {
        return C14067j2.m66728k4(this.f17187k4, c6065kk.f17187k4);
    }
}
