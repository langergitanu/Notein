package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1347ks;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.xk */
/* JADX INFO: loaded from: classes.dex */
public class C5073xk extends AbstractC5056uz {

    /* JADX INFO: renamed from: du */
    private C1347ks[] f13929du;

    /* JADX INFO: renamed from: h4 */
    private long f13930h4;

    /* JADX INFO: renamed from: k4 */
    private long f13931k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f13932kk;

    /* JADX INFO: renamed from: to */
    private int[] f13933to;

    /* JADX INFO: renamed from: x1 */
    private long f13934x1;

    public C5073xk(C5061vw c5061vw) {
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
        return m21629k4((C5073xk) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f13931k4)) * 397) ^ ((int) this.f13934x1)) * 397;
        byte[] bArr = this.f13932kk;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        int[] iArr = this.f13933to;
        int iHashCode3 = (iHashCode2 ^ (iArr != null ? AbstractC14092to.m67208k4((Object) iArr).hashCode() : 0)) * 397;
        C1347ks[] c1347ksArr = this.f13929du;
        return ((iHashCode3 ^ (c1347ksArr != null ? AbstractC14092to.m67208k4((Object) c1347ksArr).hashCode() : 0)) * 397) ^ ((int) this.f13930h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21626k4() {
        return this.f13931k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21630kk(long j) {
        this.f13930h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21631x1() {
        return this.f13934x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21627k4(long j) {
        this.f13931k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21632x1(long j) {
        this.f13934x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21628k4(int[] iArr) {
        if (this.f13933to != iArr) {
            this.f13929du = null;
        }
        this.f13933to = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21629k4(C5073xk c5073xk) {
        return m21559k4((C5061vw) c5073xk) && this.f13931k4 == c5073xk.f13931k4 && this.f13934x1 == c5073xk.f13934x1 && C3022m9.m12719k4(this.f13932kk, c5073xk.f13932kk) && C3022m9.m12721k4(this.f13933to, c5073xk.f13933to) && C3022m9.m12723k4(this.f13929du, c5073xk.f13929du) && this.f13930h4 == c5073xk.f13930h4;
    }
}
