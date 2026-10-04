package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1354um;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.hq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4993hq extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private C1354um f13671k4;

    public AbstractC4993hq(C5061vw c5061vw) {
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
        return m21089k4((AbstractC4993hq) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1354um c1354um = this.f13671k4;
        return iHashCode ^ (c1354um != null ? c1354um.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21088k4(C1354um c1354um) {
        this.f13671k4 = c1354um;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Xform: {1}", super.toString(), this.f13671k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final C1354um m21090x1() {
        return this.f13671k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21089k4(AbstractC4993hq abstractC4993hq) {
        return m21559k4((C5061vw) abstractC4993hq) && C14067j2.m66728k4(this.f13671k4, abstractC4993hq.f13671k4);
    }
}
