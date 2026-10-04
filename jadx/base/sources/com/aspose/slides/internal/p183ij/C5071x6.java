package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1352to;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C5071x6 extends C5019ne {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13924k4;

    /* JADX INFO: renamed from: kk */
    private C1352to[] f13925kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13926to;

    /* JADX INFO: renamed from: x1 */
    private long f13927x1;

    public C5071x6(C5019ne c5019ne) {
        super(c5019ne);
        m21310x1(c5019ne.m21309x1());
        m21308kk(c5019ne.m21307kk());
    }

    @Override // com.aspose.slides.internal.p183ij.C5019ne, com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21621k4((C5071x6) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5019ne, com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13924k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13927x1)) * 397;
        C1352to[] c1352toArr = this.f13925kk;
        int iHashCode3 = (iHashCode2 ^ (c1352toArr != null ? AbstractC14092to.m67208k4((Object) c1352toArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f13926to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21617k4(long j) {
        this.f13927x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21618k4(C12521uz c12521uz) {
        this.f13924k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21619k4(byte[] bArr) {
        this.f13926to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21620k4(C1352to[] c1352toArr) {
        this.f13925kk = c1352toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21621k4(C5071x6 c5071x6) {
        return m21306k4((C5019ne) c5071x6) && C14067j2.m66728k4(this.f13924k4, c5071x6.f13924k4) && this.f13927x1 == c5071x6.f13927x1 && C3022m9.m12723k4(this.f13925kk, c5071x6.f13925kk) && C3022m9.m12719k4(this.f13926to, c5071x6.f13926to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1352to[] m21622k4() {
        return this.f13925kk;
    }
}
