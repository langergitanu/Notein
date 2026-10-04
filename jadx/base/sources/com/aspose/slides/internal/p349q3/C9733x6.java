package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6283to;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9733x6 extends C9681ne {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35171k4;

    /* JADX INFO: renamed from: kk */
    private C6283to[] f35172kk;

    /* JADX INFO: renamed from: to */
    private byte[] f35173to;

    /* JADX INFO: renamed from: x1 */
    private long f35174x1;

    public C9733x6(C9681ne c9681ne) {
        super(c9681ne);
        m47499x1(c9681ne.m47495h4());
        m47497kk(c9681ne.m47498m9());
    }

    @Override // com.aspose.slides.internal.p349q3.C9681ne, com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47832k4((C9733x6) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9681ne, com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35171k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35174x1)) * 397;
        C6283to[] c6283toArr = this.f35172kk;
        int iHashCode3 = (iHashCode2 ^ (c6283toArr != null ? AbstractC14092to.m67208k4((Object) c6283toArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f35173to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47827k4() {
        return this.f35171k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C6283to[] m47833kk() {
        return this.f35172kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m47834to() {
        return this.f35173to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47835x1() {
        return this.f35174x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47828k4(long j) {
        this.f35174x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47829k4(C12350uz c12350uz) {
        this.f35171k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47830k4(byte[] bArr) {
        this.f35173to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47831k4(C6283to[] c6283toArr) {
        this.f35172kk = c6283toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47832k4(C9733x6 c9733x6) {
        return m47496k4((C9681ne) c9733x6) && C14067j2.m66728k4(this.f35171k4, c9733x6.f35171k4) && this.f35174x1 == c9733x6.f35174x1 && C12530dy.m58334k4(this.f35172kk, c9733x6.f35172kk) && C12530dy.m58330k4(this.f35173to, c9733x6.f35173to);
    }
}
