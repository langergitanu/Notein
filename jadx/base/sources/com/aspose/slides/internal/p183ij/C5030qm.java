package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.qm */
/* JADX INFO: loaded from: classes.dex */
public class C5030qm extends AbstractC4966c6 {

    /* JADX INFO: renamed from: k4 */
    private long f13814k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13815x1;

    public C5030qm(C5061vw c5061vw) {
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
        return m21389k4((C5030qm) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4966c6, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13814k4)) * 397;
        byte[] bArr = this.f13815x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21386k4() {
        return this.f13814k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21387k4(long j) {
        this.f13814k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21388k4(byte[] bArr) {
        this.f13815x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21389k4(C5030qm c5030qm) {
        return m20854k4((AbstractC4966c6) c5030qm) && this.f13814k4 == c5030qm.f13814k4 && C3022m9.m12719k4(this.f13815x1, c5030qm.f13815x1);
    }
}
