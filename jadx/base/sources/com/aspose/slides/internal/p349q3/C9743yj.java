package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C9743yj extends C9658ix {

    /* JADX INFO: renamed from: k4 */
    private long f35197k4;

    /* JADX INFO: renamed from: x1 */
    private C6045bz[] f35198x1;

    public C9743yj() {
        m47763ck(70L);
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47887k4((C9743yj) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35197k4)) * 397;
        C6045bz[] c6045bzArr = this.f35198x1;
        return iHashCode ^ (c6045bzArr != null ? AbstractC14092to.m67208k4((Object) c6045bzArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47884k4() {
        return this.f35197k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47888kk() {
        int iM24445u4 = 4;
        for (C6045bz c6045bz : this.f35198x1) {
            iM24445u4 += c6045bz.m24445u4();
        }
        m47292to(((long) iM24445u4) & 4294967295L);
        m47762c5((int) ((m47290dy() & 4294967295L) + 12));
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26804kk();
        for (C6045bz c6045bz : m47889x1()) {
            c6765kp.m26810x1(C14113y2.m67408k4("\t\t", c6045bz.toString()));
        }
        return C14113y2.m67402k4("{0}, CommentIdentifier: {1}, EmfPlusRecords: {2}", super.toString(), C14042ak.m66410k4(C9658ix.k4.class, this.f35197k4), c6765kp.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final C6045bz[] m47889x1() {
        return this.f35198x1;
    }

    public C9743yj(C9658ix c9658ix) {
        super(c9658ix);
        m47292to(c9658ix.m47290dy());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47885k4(long j) {
        this.f35197k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47886k4(C6045bz[] c6045bzArr) {
        this.f35198x1 = c6045bzArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47887k4(C9743yj c9743yj) {
        return m47291k4((C9658ix) c9743yj) && this.f35197k4 == c9743yj.f35197k4 && C12530dy.m58334k4(this.f35198x1, c9743yj.f35198x1);
    }
}
