package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.t6 */
/* JADX INFO: loaded from: classes.dex */
public class C5045t6 extends AbstractC5002jw {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13851k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f13852kk;

    /* JADX INFO: renamed from: x1 */
    private long f13853x1;

    public C5045t6(C5061vw c5061vw) {
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
        return m21464k4((C5045t6) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13851k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13853x1)) * 397;
        byte[] bArr = this.f13852kk;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21461k4(long j) {
        this.f13853x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21462k4(C12521uz c12521uz) {
        this.f13851k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21463k4(byte[] bArr) {
        this.f13852kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21464k4(C5045t6 c5045t6) {
        return m21559k4((C5061vw) c5045t6) && C14067j2.m66728k4(this.f13851k4, c5045t6.f13851k4) && this.f13853x1 == c5045t6.f13853x1 && C3022m9.m12719k4(this.f13852kk, c5045t6.f13852kk);
    }
}
