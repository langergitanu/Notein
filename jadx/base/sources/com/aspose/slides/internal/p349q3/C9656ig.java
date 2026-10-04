package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ig */
/* JADX INFO: loaded from: classes4.dex */
public class C9656ig extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34919k4;

    /* JADX INFO: renamed from: kk */
    private C12343ne[] f34920kk;

    /* JADX INFO: renamed from: x1 */
    private long f34921x1;

    public C9656ig(C9723vw c9723vw) {
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
        return m47274k4((C9656ig) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34919k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f34921x1)) * 397;
        C12343ne[] c12343neArr = this.f34920kk;
        return iHashCode2 ^ (c12343neArr != null ? AbstractC14092to.m67208k4((Object) c12343neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47270k4() {
        return this.f34919k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12343ne[] m47275kk() {
        return this.f34920kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47276x1() {
        return this.f34921x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47271k4(long j) {
        this.f34921x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47272k4(C12350uz c12350uz) {
        this.f34919k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47273k4(C12343ne[] c12343neArr) {
        this.f34920kk = c12343neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47274k4(C9656ig c9656ig) {
        return m47765k4((C9723vw) c9656ig) && C14067j2.m66728k4(this.f34919k4, c9656ig.f34919k4) && this.f34921x1 == c9656ig.f34921x1 && C12530dy.m58334k4(this.f34920kk, c9656ig.f34920kk);
    }
}
