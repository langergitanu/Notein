package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13365c6 extends AbstractC13373f9 {

    /* JADX INFO: renamed from: k4 */
    private C13409ts f44728k4;

    public AbstractC13365c6() {
        m62058k4(new C13409ts());
    }

    /* JADX INFO: renamed from: dy */
    public final C13409ts m62057dy() {
        return this.f44728k4;
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
        return m62059k4((AbstractC13365c6) obj);
    }

    public int hashCode() {
        C13409ts c13409ts = this.f44728k4;
        if (c13409ts != null) {
            return c13409ts.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62058k4(C13409ts c13409ts) {
        this.f44728k4 = c13409ts;
    }

    public String toString() {
        return C14113y2.m67402k4("Version: {0}", this.f44728k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62059k4(AbstractC13365c6 abstractC13365c6) {
        return C14067j2.m66728k4(this.f44728k4, abstractC13365c6.f44728k4);
    }
}
