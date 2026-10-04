package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1336ar;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.tl */
/* JADX INFO: loaded from: classes.dex */
public class C5046tl extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private long f13854k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f13855kk;

    /* JADX INFO: renamed from: x1 */
    private C1336ar[] f13856x1;

    public C5046tl(C5061vw c5061vw) {
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
        return m21469k4((C5046tl) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13854k4)) * 397;
        C1336ar[] c1336arArr = this.f13856x1;
        int iHashCode2 = (iHashCode ^ (c1336arArr != null ? AbstractC14092to.m67208k4((Object) c1336arArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f13855kk;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21465k4() {
        return this.f13854k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21466k4(long j) {
        this.f13854k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21467k4(byte[] bArr) {
        this.f13855kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21468k4(C1336ar[] c1336arArr) {
        this.f13856x1 = c1336arArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21469k4(C5046tl c5046tl) {
        return m21559k4((C5061vw) c5046tl) && this.f13854k4 == c5046tl.f13854k4 && C3022m9.m12723k4(this.f13856x1, c5046tl.f13856x1) && C3022m9.m12719k4(this.f13855kk, c5046tl.f13855kk);
    }
}
