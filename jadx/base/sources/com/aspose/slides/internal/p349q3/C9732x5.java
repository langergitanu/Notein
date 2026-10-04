package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.x5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9732x5 extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35167k4;

    /* JADX INFO: renamed from: kk */
    private C12343ne[] f35168kk;

    /* JADX INFO: renamed from: to */
    private byte[] f35169to;

    /* JADX INFO: renamed from: x1 */
    private long f35170x1;

    public C9732x5(C9723vw c9723vw) {
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
        return m47823k4((C9732x5) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35167k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35170x1)) * 397;
        C12343ne[] c12343neArr = this.f35168kk;
        int iHashCode3 = (iHashCode2 ^ (c12343neArr != null ? AbstractC14092to.m67208k4((Object) c12343neArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f35169to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47818k4() {
        return this.f35167k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12343ne[] m47824kk() {
        return this.f35168kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m47825to() {
        return this.f35169to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47826x1() {
        return this.f35170x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47819k4(long j) {
        this.f35170x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47820k4(C12350uz c12350uz) {
        this.f35167k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47821k4(byte[] bArr) {
        this.f35169to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47822k4(C12343ne[] c12343neArr) {
        this.f35168kk = c12343neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47823k4(C9732x5 c9732x5) {
        return m47765k4((C9723vw) c9732x5) && C14067j2.m66728k4(this.f35167k4, c9732x5.f35167k4) && this.f35170x1 == c9732x5.f35170x1 && C12530dy.m58334k4(this.f35168kk, c9732x5.f35168kk) && C12530dy.m58330k4(this.f35169to, c9732x5.f35169to);
    }
}
