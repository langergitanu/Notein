package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12508ix;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.yo */
/* JADX INFO: loaded from: classes.dex */
public class C5083yo extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13955k4;

    /* JADX INFO: renamed from: kk */
    private C12508ix[] f13956kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13957to;

    /* JADX INFO: renamed from: x1 */
    private long f13958x1;

    public C5083yo(C5061vw c5061vw) {
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
        return m21679k4((C5083yo) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13955k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13958x1)) * 397;
        C12508ix[] c12508ixArr = this.f13956kk;
        int iHashCode3 = (iHashCode2 ^ (c12508ixArr != null ? AbstractC14092to.m67208k4((Object) c12508ixArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f13957to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21674k4() {
        return this.f13958x1;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m21680kk() {
        return this.f13957to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12508ix[] m21681x1() {
        return this.f13956kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21675k4(long j) {
        this.f13958x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21676k4(C12521uz c12521uz) {
        this.f13955k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21677k4(byte[] bArr) {
        this.f13957to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21678k4(C12508ix[] c12508ixArr) {
        this.f13956kk = c12508ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21679k4(C5083yo c5083yo) {
        return m21559k4((C5061vw) c5083yo) && C14067j2.m66728k4(this.f13955k4, c5083yo.f13955k4) && this.f13958x1 == c5083yo.f13958x1 && C3022m9.m12723k4(this.f13956kk, c5083yo.f13956kk) && C3022m9.m12719k4(this.f13957to, c5083yo.f13957to);
    }
}
