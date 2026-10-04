package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.qw */
/* JADX INFO: loaded from: classes.dex */
public class C5033qw extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13820k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f13821kk;

    /* JADX INFO: renamed from: x1 */
    private long f13822x1;

    public C5033qw(C5061vw c5061vw) {
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
        return m21404k4((C5033qw) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13820k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13822x1)) * 397;
        byte[] bArr = this.f13821kk;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21400k4() {
        return this.f13822x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21401k4(long j) {
        this.f13822x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21402k4(C12521uz c12521uz) {
        this.f13820k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21403k4(byte[] bArr) {
        this.f13821kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21404k4(C5033qw c5033qw) {
        return m21559k4((C5061vw) c5033qw) && C14067j2.m66728k4(this.f13820k4, c5033qw.f13820k4) && this.f13822x1 == c5033qw.f13822x1 && C3022m9.m12719k4(this.f13821kk, c5033qw.f13821kk);
    }
}
