package com.aspose.slides.internal.p260ly;

import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6284u4 extends AbstractC6280ne {

    /* JADX INFO: renamed from: k4 */
    private C6287uz f17853k4;

    /* JADX INFO: renamed from: x1 */
    private C12350uz[] f17854x1;

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
        return m25633k4((C6284u4) obj);
    }

    public int hashCode() {
        C6287uz c6287uz = this.f17853k4;
        int iHashCode = (c6287uz != null ? c6287uz.hashCode() : 0) * 397;
        C12350uz[] c12350uzArr = this.f17854x1;
        return iHashCode ^ (c12350uzArr != null ? AbstractC14092to.m67208k4((Object) c12350uzArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6287uz m25630k4() {
        return this.f17853k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12018u4 m25634kk() {
        C12018u4 c12018u4 = new C12018u4();
        c12018u4.m56764to();
        if (m25635x1() != null) {
            for (C12350uz c12350uz : m25635x1()) {
                c12018u4.m56760kk(c12350uz.m57842dy().Clone());
            }
        }
        return c12018u4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12350uz[] m25635x1() {
        return this.f17854x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25631k4(C6287uz c6287uz) {
        this.f17853k4 = c6287uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25632k4(C12350uz[] c12350uzArr) {
        this.f17854x1 = c12350uzArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25633k4(C6284u4 c6284u4) {
        return C14067j2.m66728k4(this.f17853k4, c6284u4.f17853k4) && C12530dy.m58334k4(this.f17854x1, c6284u4.f17854x1);
    }
}
