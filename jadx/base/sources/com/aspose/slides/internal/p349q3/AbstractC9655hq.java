package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6285um;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.hq */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9655hq extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private C6285um f34918k4;

    public AbstractC9655hq(C9723vw c9723vw) {
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
        return m47268k4((AbstractC9655hq) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6285um c6285um = this.f34918k4;
        return iHashCode ^ (c6285um != null ? c6285um.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47267k4(C6285um c6285um) {
        this.f34918k4 = c6285um;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Xform: {1}", super.toString(), this.f34918k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final C6285um m47269x1() {
        return this.f34918k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47268k4(AbstractC9655hq abstractC9655hq) {
        return m47765k4((C9723vw) abstractC9655hq) && C14067j2.m66728k4(this.f34918k4, abstractC9655hq.f34918k4);
    }
}
