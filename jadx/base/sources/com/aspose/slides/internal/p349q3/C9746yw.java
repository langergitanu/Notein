package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.yw */
/* JADX INFO: loaded from: classes4.dex */
public class C9746yw extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private C12337ix[] f35206du;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35207k4;

    /* JADX INFO: renamed from: kk */
    private long f35208kk;

    /* JADX INFO: renamed from: to */
    private long[] f35209to;

    /* JADX INFO: renamed from: x1 */
    private long f35210x1;

    public C9746yw(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47912k4((C9746yw) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12337ix[] m47906h4() {
        return this.f35206du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35207k4;
        int iHashCode2 = (((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35210x1)) * 397) ^ ((int) this.f35208kk)) * 397;
        long[] jArr = this.f35209to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12337ix[] c12337ixArr = this.f35206du;
        return iHashCode3 ^ (c12337ixArr != null ? AbstractC14092to.m67208k4((Object) c12337ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47907k4() {
        return this.f35207k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47913kk() {
        return this.f35208kk;
    }

    /* JADX INFO: renamed from: to */
    public final long[] m47914to() {
        return this.f35209to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47915x1() {
        return this.f35210x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47908k4(long j) {
        this.f35210x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47916x1(long j) {
        this.f35208kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47909k4(C12350uz c12350uz) {
        this.f35207k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47910k4(long[] jArr) {
        this.f35209to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47911k4(C12337ix[] c12337ixArr) {
        this.f35206du = c12337ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47912k4(C9746yw c9746yw) {
        return m47765k4((C9723vw) c9746yw) && C14067j2.m66728k4(this.f35207k4, c9746yw.f35207k4) && this.f35210x1 == c9746yw.f35210x1 && this.f35208kk == c9746yw.f35208kk && C12530dy.m58333k4(this.f35209to, c9746yw.f35209to) && C12530dy.m58334k4(this.f35206du, c9746yw.f35206du);
    }
}
