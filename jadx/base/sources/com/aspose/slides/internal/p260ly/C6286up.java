package com.aspose.slides.internal.p260ly;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.up */
/* JADX INFO: loaded from: classes4.dex */
public class C6286up extends C6272fa {

    /* JADX INFO: renamed from: k4 */
    private C6277kk f17861k4;

    public C6286up(C6272fa c6272fa) {
        super(c6272fa);
        m25505x1(c6272fa.m25506x6());
        m25501kk(c6272fa.m25502ne());
        m25503to(c6272fa.m25498ix());
        m25499k4(c6272fa.m25504u4());
    }

    @Override // com.aspose.slides.internal.p260ly.C6272fa, com.aspose.slides.internal.p260ly.C6269ck
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
        return m25651k4((C6286up) obj);
    }

    @Override // com.aspose.slides.internal.p260ly.C6272fa, com.aspose.slides.internal.p260ly.C6269ck
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6277kk c6277kk = this.f17861k4;
        return iHashCode ^ (c6277kk != null ? c6277kk.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25650k4(C6277kk c6277kk) {
        this.f17861k4 = c6277kk;
    }

    @Override // com.aspose.slides.internal.p260ly.C6272fa, com.aspose.slides.internal.p260ly.C6269ck
    public String toString() {
        return C14113y2.m67402k4("{0}, DesignVector: {1}", super.toString(), m25652uz());
    }

    /* JADX INFO: renamed from: uz */
    public final C6277kk m25652uz() {
        return this.f17861k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25651k4(C6286up c6286up) {
        return m25500k4((C6272fa) c6286up) && C14067j2.m66728k4(this.f17861k4, c6286up.f17861k4);
    }
}
