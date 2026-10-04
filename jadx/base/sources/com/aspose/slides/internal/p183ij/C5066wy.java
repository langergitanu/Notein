package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.wy */
/* JADX INFO: loaded from: classes.dex */
public class C5066wy extends AbstractC4966c6 {

    /* JADX INFO: renamed from: k4 */
    private long f13911k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13912x1;

    public C5066wy(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4966c6, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21593k4((C5066wy) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4966c6, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13911k4)) * 397;
        byte[] bArr = this.f13912x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21590k4() {
        return this.f13911k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21591k4(long j) {
        this.f13911k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21592k4(byte[] bArr) {
        this.f13912x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21593k4(C5066wy c5066wy) {
        return m20854k4((AbstractC4966c6) c5066wy) && this.f13911k4 == c5066wy.f13911k4 && C3022m9.m12719k4(this.f13912x1, c5066wy.f13912x1);
    }
}
