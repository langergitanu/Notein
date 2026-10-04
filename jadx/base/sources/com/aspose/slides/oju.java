package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class oju extends AbstractC7020m9<oju> {

    /* JADX INFO: renamed from: kk */
    public static final oju f47834kk = new oju(0.0f, 0.0f);

    /* JADX INFO: renamed from: to */
    public static final oju f47835to = new oju(1.0f, 1.0f);

    /* JADX INFO: renamed from: k4 */
    public float f47836k4;

    /* JADX INFO: renamed from: x1 */
    public float f47837x1;

    public oju() {
    }

    /* JADX INFO: renamed from: du */
    public static oju m68616du(oju ojuVar, oju ojuVar2) {
        return new oju(C14116yg.m67481k4(ojuVar.f47836k4, ojuVar2.f47836k4), C14116yg.m67481k4(ojuVar.f47837x1, ojuVar2.f47837x1));
    }

    /* JADX INFO: renamed from: x1 */
    public static oju m68622x1(oju ojuVar, oju ojuVar2) {
        return new oju(ojuVar.f47836k4 - ojuVar2.f47836k4, ojuVar.f47837x1 - ojuVar2.f47837x1);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof oju) {
            return m68623x1((oju) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f47836k4), Float.valueOf(this.f47837x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final oju m68624k4(float f, float f2) {
        return new oju(this.f47836k4 * f, this.f47837x1 * f2);
    }

    /* JADX INFO: renamed from: kk */
    public final double m68627kk() {
        float f = this.f47836k4;
        float f2 = this.f47837x1;
        return C14116yg.m67496rv((f2 * f2) + (f * f));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public oju Clone() {
        oju ojuVar = new oju();
        CloneTo(ojuVar);
        return ojuVar;
    }

    public String toString() {
        return C14113y2.m67402k4("X:{0}, Y:{1}", Float.valueOf(this.f47836k4), Float.valueOf(this.f47837x1));
    }

    public oju(float f, float f2) {
        this.f47836k4 = f;
        this.f47837x1 = f2;
    }

    /* JADX INFO: renamed from: k4 */
    public static oju m68617k4(oju ojuVar, float f) {
        return new oju(ojuVar.f47836k4 * f, ojuVar.f47837x1 * f);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m68620kk(oju ojuVar, oju ojuVar2) {
        return ojuVar.f47836k4 == ojuVar2.f47836k4 && ojuVar.f47837x1 == ojuVar2.f47837x1;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m68621to(oju ojuVar, oju ojuVar2) {
        return !m68620kk(ojuVar, ojuVar2);
    }

    /* JADX INFO: renamed from: x1 */
    public final tbp m68629x1() {
        return new tbp(this.f47836k4, this.f47837x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static oju m68618k4(oju ojuVar, int i) {
        float f = i;
        return new oju(ojuVar.f47836k4 / f, ojuVar.f47837x1 / f);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m68623x1(oju ojuVar) {
        return ojuVar.f47836k4 == this.f47836k4 && ojuVar.f47837x1 == this.f47837x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static oju m68619k4(oju ojuVar, oju ojuVar2) {
        return new oju(ojuVar.f47836k4 + ojuVar2.f47836k4, ojuVar.f47837x1 + ojuVar2.f47837x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68625k4() {
        float f = this.f47836k4;
        this.f47836k4 = this.f47837x1;
        this.f47837x1 = f;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(oju ojuVar) {
        ojuVar.f47836k4 = this.f47836k4;
        ojuVar.f47837x1 = this.f47837x1;
    }
}
