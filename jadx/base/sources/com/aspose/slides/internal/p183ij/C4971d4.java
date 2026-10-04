package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p498xe.C12508ix;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.d4 */
/* JADX INFO: loaded from: classes.dex */
public class C4971d4 extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13585k4;

    /* JADX INFO: renamed from: kk */
    private C12508ix[] f13586kk;

    /* JADX INFO: renamed from: x1 */
    private long f13587x1;

    public C4971d4(C5061vw c5061vw) {
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
        return m20912k4((C4971d4) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13585k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13587x1)) * 397;
        C12508ix[] c12508ixArr = this.f13586kk;
        return iHashCode2 ^ (c12508ixArr != null ? AbstractC14092to.m67208k4((Object) c12508ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20908k4() {
        return this.f13587x1;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (C12508ix c12508ix : m20913x1()) {
            c6765kp.m26792k4(c12508ix.toString());
            c6765kp.m26792k4(", ");
        }
        return C14113y2.m67402k4("{0}, Bounds: {1}, Count: {2}, APoints: {3}", super.toString(), this.f13585k4, Long.valueOf(this.f13587x1), c6765kp.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12508ix[] m20913x1() {
        return this.f13586kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20909k4(long j) {
        this.f13587x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20910k4(C12521uz c12521uz) {
        this.f13585k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20911k4(C12508ix[] c12508ixArr) {
        this.f13586kk = c12508ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20912k4(C4971d4 c4971d4) {
        return m21559k4((C5061vw) c4971d4) && C14067j2.m66728k4(this.f13585k4, c4971d4.f13585k4) && this.f13587x1 == c4971d4.f13587x1 && C3022m9.m12723k4(this.f13586kk, c4971d4.f13586kk);
    }
}
