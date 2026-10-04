package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12508ix;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.yn */
/* JADX INFO: loaded from: classes.dex */
public class C5082yn extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13952k4;

    /* JADX INFO: renamed from: kk */
    private C12508ix[] f13953kk;

    /* JADX INFO: renamed from: x1 */
    private long f13954x1;

    public C5082yn(C5061vw c5061vw) {
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
        return m21672k4((C5082yn) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13952k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13954x1)) * 397;
        C12508ix[] c12508ixArr = this.f13953kk;
        return iHashCode2 ^ (c12508ixArr != null ? AbstractC14092to.m67208k4((Object) c12508ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21668k4() {
        return this.f13954x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12508ix[] m21673x1() {
        return this.f13953kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21669k4(long j) {
        this.f13954x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21670k4(C12521uz c12521uz) {
        this.f13952k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21671k4(C12508ix[] c12508ixArr) {
        this.f13953kk = c12508ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21672k4(C5082yn c5082yn) {
        return m21559k4((C5061vw) c5082yn) && C14067j2.m66728k4(this.f13952k4, c5082yn.f13952k4) && this.f13954x1 == c5082yn.f13954x1 && C3022m9.m12723k4(this.f13953kk, c5082yn.f13953kk);
    }
}
