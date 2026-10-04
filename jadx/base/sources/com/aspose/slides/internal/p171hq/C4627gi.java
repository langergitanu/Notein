package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.gi */
/* JADX INFO: loaded from: classes.dex */
public final class C4627gi extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4680yo f12897k4;

    /* JADX INFO: renamed from: x1 */
    private C4620dy[] f12898x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4627gi.class) && m19107k4((C4627gi) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        C4680yo c4680yo = this.f12897k4;
        int iMo19017h4 = c4680yo != null ? c4680yo.mo19017h4() : 0;
        if (this.f12898x1 != null) {
            for (C4620dy c4620dy : m19111x1()) {
                if (c4620dy != null) {
                    iMo19017h4 = c4620dy.mo19017h4() + iMo19017h4;
                }
            }
        }
        return iMo19017h4;
    }

    public int hashCode() {
        C4680yo c4680yo = this.f12897k4;
        int iHashCode = (c4680yo != null ? c4680yo.hashCode() : 0) * 397;
        C4620dy[] c4620dyArr = this.f12898x1;
        return iHashCode ^ (c4620dyArr != null ? AbstractC14092to.m67208k4((Object) c4620dyArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4680yo m19108k4() {
        return this.f12897k4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (C4620dy c4620dy : m19111x1()) {
            c6765kp.m26792k4(C14113y2.m67408k4(c4620dy.toString(), ", "));
        }
        return C14113y2.m67402k4("TransformMatrix: {0}, BlendPattern: {1}", this.f12897k4, c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final C4620dy[] m19111x1() {
        return this.f12898x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19109k4(C4680yo c4680yo) {
        this.f12897k4 = c4680yo;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19110k4(C4620dy[] c4620dyArr) {
        this.f12898x1 = c4620dyArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19107k4(C4627gi c4627gi) {
        return C14067j2.m66728k4(this.f12897k4, c4627gi.f12897k4) && C12530dy.m58334k4(this.f12898x1, c4627gi.f12898x1);
    }
}
