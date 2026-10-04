package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4615c6 extends AbstractC4623f9 {

    /* JADX INFO: renamed from: k4 */
    private C4659ts f12875k4;

    public AbstractC4615c6() {
        m19054k4(new C4659ts());
    }

    /* JADX INFO: renamed from: c5 */
    public final C4659ts m19053c5() {
        return this.f12875k4;
    }

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
        return m19055k4((AbstractC4615c6) obj);
    }

    public int hashCode() {
        C4659ts c4659ts = this.f12875k4;
        if (c4659ts != null) {
            return c4659ts.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19054k4(C4659ts c4659ts) {
        this.f12875k4 = c4659ts;
    }

    public String toString() {
        return C14113y2.m67402k4("Version: {0}", this.f12875k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19055k4(AbstractC4615c6 abstractC4615c6) {
        return C14067j2.m66728k4(this.f12875k4, abstractC4615c6.f12875k4);
    }
}
