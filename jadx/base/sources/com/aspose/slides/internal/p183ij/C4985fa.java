package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.fa */
/* JADX INFO: loaded from: classes.dex */
public class C4985fa extends C4996ix {

    /* JADX INFO: renamed from: k4 */
    private byte[] f13640k4;

    public C4985fa(C4996ix c4996ix) {
        super(c4996ix);
        m21112to(c4996ix.m21111to());
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21023k4((C4985fa) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        byte[] bArr = this.f13640k4;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21022k4(byte[] bArr) {
        this.f13640k4 = bArr;
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, PrivateData: {1}", super.toString(), this.f13640k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21023k4(C4985fa c4985fa) {
        return m21110k4((C4996ix) c4985fa) && C3022m9.m12719k4(this.f13640k4, c4985fa.f13640k4);
    }
}
