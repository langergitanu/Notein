package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.xw */
/* JADX INFO: loaded from: classes.dex */
public class C5074xw extends AbstractC5002jw {

    /* JADX INFO: renamed from: k4 */
    private long f13935k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13936x1;

    public C5074xw(C5061vw c5061vw) {
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
        return m21635k4((C5074xw) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13935k4)) * 397;
        byte[] bArr = this.f13936x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21633k4(long j) {
        this.f13935k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21634k4(byte[] bArr) {
        this.f13936x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21635k4(C5074xw c5074xw) {
        return m21559k4((C5061vw) c5074xw) && this.f13935k4 == c5074xw.f13935k4 && C3022m9.m12719k4(this.f13936x1, c5074xw.f13936x1);
    }
}
