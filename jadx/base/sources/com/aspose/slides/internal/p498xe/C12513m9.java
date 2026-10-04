package com.aspose.slides.internal.p498xe;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12513m9 extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private C12507h4 f41896k4;

    /* JADX INFO: renamed from: kk */
    private C12507h4 f41897kk;

    /* JADX INFO: renamed from: x1 */
    private C12507h4 f41898x1;

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
        return m58189k4((C12513m9) obj);
    }

    public int hashCode() {
        C12507h4 c12507h4 = this.f41896k4;
        int iHashCode = (c12507h4 != null ? c12507h4.hashCode() : 0) * 397;
        C12507h4 c12507h42 = this.f41898x1;
        int iHashCode2 = (iHashCode ^ (c12507h42 != null ? c12507h42.hashCode() : 0)) * 397;
        C12507h4 c12507h43 = this.f41897kk;
        return iHashCode2 ^ (c12507h43 != null ? c12507h43.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12507h4 m58187k4() {
        return this.f41896k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12507h4 m58190kk() {
        return this.f41897kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12507h4 m58192x1() {
        return this.f41898x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58188k4(C12507h4 c12507h4) {
        this.f41896k4 = c12507h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m58191kk(C12507h4 c12507h4) {
        this.f41897kk = c12507h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58193x1(C12507h4 c12507h4) {
        this.f41898x1 = c12507h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58189k4(C12513m9 c12513m9) {
        return C14067j2.m66728k4(this.f41896k4, c12513m9.f41896k4) && C14067j2.m66728k4(this.f41898x1, c12513m9.f41898x1) && C14067j2.m66728k4(this.f41897kk, c12513m9.f41897kk);
    }
}
