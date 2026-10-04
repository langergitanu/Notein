package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.vt */
/* JADX INFO: loaded from: classes.dex */
public class C5060vt extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13894k4;

    public C5060vt(C5061vw c5061vw) {
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
        return m21554k4((C5060vt) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13894k4;
        return iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21552k4() {
        return this.f13894k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Box: {1}", super.toString(), m21552k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21553k4(C12521uz c12521uz) {
        this.f13894k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21554k4(C5060vt c5060vt) {
        return m21559k4((C5061vw) c5060vt) && C14067j2.m66728k4(this.f13894k4, c5060vt.f13894k4);
    }
}
