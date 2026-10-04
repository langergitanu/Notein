package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.yg */
/* JADX INFO: loaded from: classes4.dex */
public class C9742yg extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private C12343ne[] f35192du;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35193k4;

    /* JADX INFO: renamed from: kk */
    private long f35194kk;

    /* JADX INFO: renamed from: to */
    private long[] f35195to;

    /* JADX INFO: renamed from: x1 */
    private long f35196x1;

    public C9742yg(C9723vw c9723vw) {
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
        return m47879k4((C9742yg) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12343ne[] m47873h4() {
        return this.f35192du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35193k4;
        int iHashCode2 = (((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35196x1)) * 397) ^ ((int) this.f35194kk)) * 397;
        long[] jArr = this.f35195to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12343ne[] c12343neArr = this.f35192du;
        return iHashCode3 ^ (c12343neArr != null ? AbstractC14092to.m67208k4((Object) c12343neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47874k4() {
        return this.f35193k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47880kk() {
        return this.f35194kk;
    }

    /* JADX INFO: renamed from: to */
    public final long[] m47881to() {
        return this.f35195to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47882x1() {
        return this.f35196x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47875k4(long j) {
        this.f35196x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47883x1(long j) {
        this.f35194kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47876k4(C12350uz c12350uz) {
        this.f35193k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47877k4(long[] jArr) {
        this.f35195to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47878k4(C12343ne[] c12343neArr) {
        this.f35192du = c12343neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47879k4(C9742yg c9742yg) {
        return m47765k4((C9723vw) c9742yg) && C14067j2.m66728k4(this.f35193k4, c9742yg.f35193k4) && this.f35196x1 == c9742yg.f35196x1 && this.f35194kk == c9742yg.f35194kk && C12530dy.m58333k4(this.f35195to, c9742yg.f35195to) && C12530dy.m58334k4(this.f35192du, c9742yg.f35192du);
    }
}
