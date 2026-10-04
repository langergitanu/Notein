package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.sz */
/* JADX INFO: loaded from: classes.dex */
public class C5044sz extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13850k4;

    public C5044sz(C5061vw c5061vw) {
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
        return m21460k4((C5044sz) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13850k4;
        return iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21458k4() {
        return this.f13850k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21459k4(C12521uz c12521uz) {
        this.f13850k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21460k4(C5044sz c5044sz) {
        return m21559k4((C5061vw) c5044sz) && C14067j2.m66728k4(this.f13850k4, c5044sz.f13850k4);
    }
}
