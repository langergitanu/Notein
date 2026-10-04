package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12508ix;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.yw */
/* JADX INFO: loaded from: classes.dex */
public class C5084yw extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private C12508ix[] f13959du;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13960k4;

    /* JADX INFO: renamed from: kk */
    private long f13961kk;

    /* JADX INFO: renamed from: to */
    private long[] f13962to;

    /* JADX INFO: renamed from: x1 */
    private long f13963x1;

    public C5084yw(C5061vw c5061vw) {
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
        return m21687k4((C5084yw) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13960k4;
        int iHashCode2 = (((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13963x1)) * 397) ^ ((int) this.f13961kk)) * 397;
        long[] jArr = this.f13962to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12508ix[] c12508ixArr = this.f13959du;
        return iHashCode3 ^ (c12508ixArr != null ? AbstractC14092to.m67208k4((Object) c12508ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21682k4() {
        return this.f13963x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long[] m21688kk() {
        return this.f13962to;
    }

    /* JADX INFO: renamed from: to */
    public final C12508ix[] m21689to() {
        return this.f13959du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21690x1() {
        return this.f13961kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21683k4(long j) {
        this.f13963x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21691x1(long j) {
        this.f13961kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21684k4(C12521uz c12521uz) {
        this.f13960k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21685k4(long[] jArr) {
        this.f13962to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21686k4(C12508ix[] c12508ixArr) {
        this.f13959du = c12508ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21687k4(C5084yw c5084yw) {
        return m21559k4((C5061vw) c5084yw) && C14067j2.m66728k4(this.f13960k4, c5084yw.f13960k4) && this.f13963x1 == c5084yw.f13963x1 && this.f13961kk == c5084yw.f13961kk && C3022m9.m12722k4(this.f13962to, c5084yw.f13962to) && C3022m9.m12723k4(this.f13959du, c5084yw.f13959du);
    }
}
