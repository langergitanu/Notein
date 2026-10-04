package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C6070ne extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private long f17196k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4619du[] f17197x1;

    public C6070ne() {
        m24449x1((short) 16395);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC4619du[] m24588c5() {
        return this.f17197x1;
    }

    /* JADX INFO: renamed from: dy */
    public final long m24589dy() {
        return this.f17196k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24592k4((C6070ne) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 4;
        for (AbstractC4619du abstractC4619du : m24588c5()) {
            iMo19017h4 += abstractC4619du.mo19017h4();
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int i = ((int) this.f17196k4) * 397;
        AbstractC4619du[] abstractC4619duArr = this.f17197x1;
        return i ^ (abstractC4619duArr != null ? AbstractC14092to.m67208k4((Object) abstractC4619duArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24590k4(long j) {
        this.f17196k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24593kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final byte m24594to() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (AbstractC4619du abstractC4619du : m24588c5()) {
            c6765kp.m26792k4(C14113y2.m67408k4(abstractC4619du.toString(), ", "));
        }
        return C14113y2.m67402k4("{0}, Count: {1}, RectData: {2}", super.toString(), Long.valueOf(this.f17196k4), c6765kp.toString());
    }

    public C6070ne(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24591k4(AbstractC4619du[] abstractC4619duArr) {
        this.f17197x1 = abstractC4619duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24592k4(C6070ne c6070ne) {
        return this.f17196k4 == c6070ne.f17196k4 && C12530dy.m58334k4(this.f17197x1, c6070ne.f17197x1);
    }
}
