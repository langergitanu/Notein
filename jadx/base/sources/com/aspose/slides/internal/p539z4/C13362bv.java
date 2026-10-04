package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1478dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11901k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.bv */
/* JADX INFO: loaded from: classes5.dex */
public class C13362bv extends AbstractC13365c6 {

    /* JADX INFO: renamed from: k4 */
    private int f44722k4;

    /* JADX INFO: renamed from: x1 */
    private C13359ar f44723x1;

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
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
        return m62044k4((C13362bv) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44723x1.mo62023h4() + 8;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public int hashCode() {
        int i = this.f44722k4 * 397;
        C13359ar c13359ar = this.f44723x1;
        return i ^ (c13359ar != null ? c13359ar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62041k4() {
        return this.f44722k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C11898h4 m62045kk() {
        if (m62041k4() == 1) {
            C13414v4 c13414v4 = (C13414v4) m62046x1();
            C11901k4 c11901k4 = new C11901k4(c13414v4.m62377k4(), c13414v4.m62389x1(), c13414v4.m62388to());
            c11901k4.m55664x1(c13414v4.m62384kk());
            c11901k4.m55604k4((int) c13414v4.m62374du(), (int) c13414v4.m62386m9());
            c11901k4.m55609x1(c13414v4.m62376dy());
            c11901k4.m55598du(c13414v4.m62373c5());
            return c11901k4;
        }
        C13391lr c13391lr = (C13391lr) m62046x1();
        C11898h4 c11898h4 = new C11898h4((c13391lr.m62202k4() & 1) > 0 ? c13391lr.m62199c5().m62492k4().m62028k4().m62467c5() : null, (c13391lr.m62202k4() & 2) > 0 ? c13391lr.m62199c5().m62496x1().m62334x1().m62467c5() : null);
        c11898h4.m55603k4((int) c13391lr.m62215x1());
        c11898h4.m55607to(c13391lr.m62209kk());
        c11898h4.m55604k4((int) c13391lr.m62213to(), (int) c13391lr.m62200du());
        c11898h4.m55609x1(c13391lr.m62212m9());
        c11898h4.m55598du(c13391lr.m62201dy());
        return c11898h4;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public String toString() {
        return C14113y2.m67402k4("{0}, Type: {1}, CustomLineCapData: {2}", super.toString(), C14042ak.m66410k4(C1478dy.class, this.f44722k4), this.f44723x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13359ar m62046x1() {
        return this.f44723x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62042k4(int i) {
        this.f44722k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62043k4(C13359ar c13359ar) {
        this.f44723x1 = c13359ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62044k4(C13362bv c13362bv) {
        return this.f44722k4 == c13362bv.f44722k4 && C14067j2.m66728k4(this.f44723x1, c13362bv.f44723x1);
    }
}
