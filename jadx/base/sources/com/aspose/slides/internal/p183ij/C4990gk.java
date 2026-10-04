package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12508ix;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.gk */
/* JADX INFO: loaded from: classes.dex */
public class C4990gk extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13667k4;

    /* JADX INFO: renamed from: kk */
    private C12508ix[] f13668kk;

    /* JADX INFO: renamed from: x1 */
    private long f13669x1;

    public C4990gk(C5061vw c5061vw) {
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
        return m21083k4((C4990gk) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13667k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13669x1)) * 397;
        C12508ix[] c12508ixArr = this.f13668kk;
        return iHashCode2 ^ (c12508ixArr != null ? AbstractC14092to.m67208k4((Object) c12508ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21079k4() {
        return this.f13669x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12508ix[] m21084x1() {
        return this.f13668kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21080k4(long j) {
        this.f13669x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21081k4(C12521uz c12521uz) {
        this.f13667k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21082k4(C12508ix[] c12508ixArr) {
        this.f13668kk = c12508ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21083k4(C4990gk c4990gk) {
        return m21559k4((C5061vw) c4990gk) && C14067j2.m66728k4(this.f13667k4, c4990gk.f13667k4) && this.f13669x1 == c4990gk.f13669x1 && C3022m9.m12723k4(this.f13668kk, c4990gk.f13668kk);
    }
}
