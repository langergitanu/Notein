package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12342m9 extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private C12336h4 f41272k4;

    /* JADX INFO: renamed from: kk */
    private C12336h4 f41273kk;

    /* JADX INFO: renamed from: x1 */
    private C12336h4 f41274x1;

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
        return m57773k4((C12342m9) obj);
    }

    public int hashCode() {
        C12336h4 c12336h4 = this.f41272k4;
        int iHashCode = (c12336h4 != null ? c12336h4.hashCode() : 0) * 397;
        C12336h4 c12336h42 = this.f41274x1;
        int iHashCode2 = (iHashCode ^ (c12336h42 != null ? c12336h42.hashCode() : 0)) * 397;
        C12336h4 c12336h43 = this.f41273kk;
        return iHashCode2 ^ (c12336h43 != null ? c12336h43.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12336h4 m57771k4() {
        return this.f41272k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12336h4 m57774kk() {
        return this.f41273kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12336h4 m57776x1() {
        return this.f41274x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57772k4(C12336h4 c12336h4) {
        this.f41272k4 = c12336h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m57775kk(C12336h4 c12336h4) {
        this.f41273kk = c12336h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57777x1(C12336h4 c12336h4) {
        this.f41274x1 = c12336h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57773k4(C12342m9 c12342m9) {
        return C14067j2.m66728k4(this.f41272k4, c12342m9.f41272k4) && C14067j2.m66728k4(this.f41274x1, c12342m9.f41274x1) && C14067j2.m66728k4(this.f41273kk, c12342m9.f41273kk);
    }
}
