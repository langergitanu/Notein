package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.x5 */
/* JADX INFO: loaded from: classes.dex */
public class C5070x5 extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13920k4;

    /* JADX INFO: renamed from: kk */
    private C12514ne[] f13921kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13922to;

    /* JADX INFO: renamed from: x1 */
    private long f13923x1;

    public C5070x5(C5061vw c5061vw) {
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
        return m21614k4((C5070x5) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13920k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13923x1)) * 397;
        C12514ne[] c12514neArr = this.f13921kk;
        int iHashCode3 = (iHashCode2 ^ (c12514neArr != null ? AbstractC14092to.m67208k4((Object) c12514neArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f13922to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21609k4() {
        return this.f13923x1;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m21615kk() {
        return this.f13922to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12514ne[] m21616x1() {
        return this.f13921kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21610k4(long j) {
        this.f13923x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21611k4(C12521uz c12521uz) {
        this.f13920k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21612k4(byte[] bArr) {
        this.f13922to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21613k4(C12514ne[] c12514neArr) {
        this.f13921kk = c12514neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21614k4(C5070x5 c5070x5) {
        return m21559k4((C5061vw) c5070x5) && C14067j2.m66728k4(this.f13920k4, c5070x5.f13920k4) && this.f13923x1 == c5070x5.f13923x1 && C3022m9.m12723k4(this.f13921kk, c5070x5.f13921kk) && C3022m9.m12719k4(this.f13922to, c5070x5.f13922to);
    }
}
