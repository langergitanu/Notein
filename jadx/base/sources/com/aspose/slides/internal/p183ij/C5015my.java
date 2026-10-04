package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12508ix;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.my */
/* JADX INFO: loaded from: classes.dex */
public class C5015my extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private C12508ix[] f13757du;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13758k4;

    /* JADX INFO: renamed from: kk */
    private long f13759kk;

    /* JADX INFO: renamed from: to */
    private long[] f13760to;

    /* JADX INFO: renamed from: x1 */
    private long f13761x1;

    public C5015my(C5061vw c5061vw) {
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
        return m21271k4((C5015my) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13758k4;
        int iHashCode2 = (((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13761x1)) * 397) ^ ((int) this.f13759kk)) * 397;
        long[] jArr = this.f13760to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12508ix[] c12508ixArr = this.f13757du;
        return iHashCode3 ^ (c12508ixArr != null ? AbstractC14092to.m67208k4((Object) c12508ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21266k4() {
        return this.f13761x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long[] m21272kk() {
        return this.f13760to;
    }

    /* JADX INFO: renamed from: to */
    public final C12508ix[] m21273to() {
        return this.f13757du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21274x1() {
        return this.f13759kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21267k4(long j) {
        this.f13761x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21275x1(long j) {
        this.f13759kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21268k4(C12521uz c12521uz) {
        this.f13758k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21269k4(long[] jArr) {
        this.f13760to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21270k4(C12508ix[] c12508ixArr) {
        this.f13757du = c12508ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21271k4(C5015my c5015my) {
        return m21559k4((C5061vw) c5015my) && C14067j2.m66728k4(this.f13758k4, c5015my.f13758k4) && this.f13761x1 == c5015my.f13761x1 && this.f13759kk == c5015my.f13759kk && C3022m9.m12722k4(this.f13760to, c5015my.f13760to) && C3022m9.m12723k4(this.f13757du, c5015my.f13757du);
    }
}
