package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1340dy;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.em */
/* JADX INFO: loaded from: classes.dex */
public class C4981em extends C5025os {

    /* JADX INFO: renamed from: k4 */
    private C1340dy f13630k4;

    public C4981em(C5025os c5025os) {
        super(c5025os);
        this.f13630k4 = new C1340dy();
        m21366k4(c5025os.m21365h4());
    }

    /* JADX INFO: renamed from: dy */
    public final C1340dy m21000dy() {
        return this.f13630k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5025os, com.aspose.slides.internal.p183ij.C5062w6, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21001k4((C4981em) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5025os, com.aspose.slides.internal.p183ij.C5062w6, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1340dy c1340dy = this.f13630k4;
        return iHashCode ^ (c1340dy != null ? c1340dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21001k4(C4981em c4981em) {
        return m21367k4((C5025os) c4981em) && C14067j2.m66728k4(this.f13630k4, c4981em.f13630k4);
    }
}
