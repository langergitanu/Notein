package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p396sc.C10180dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11901k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.bv */
/* JADX INFO: loaded from: classes.dex */
public class C4612bv extends AbstractC4615c6 {

    /* JADX INFO: renamed from: k4 */
    private int f12869k4;

    /* JADX INFO: renamed from: x1 */
    private C4609ar f12870x1;

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
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
        return m19040k4((C4612bv) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12870x1.mo19017h4() + 8;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public int hashCode() {
        int i = this.f12869k4 * 397;
        C4609ar c4609ar = this.f12870x1;
        return i ^ (c4609ar != null ? c4609ar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19037k4() {
        return this.f12869k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C11898h4 m19041kk() {
        if (m19037k4() == 1) {
            C4664v4 c4664v4 = (C4664v4) m19042x1();
            C11901k4 c11901k4 = new C11901k4(c4664v4.m19393k4(), c4664v4.m19405x1(), c4664v4.m19404to());
            c11901k4.m55664x1(c4664v4.m19400kk());
            c11901k4.m55604k4((int) c4664v4.m19388du(), (int) c4664v4.m19402m9());
            c11901k4.m55609x1(c4664v4.m19390dy());
            c11901k4.m55598du(c4664v4.m19392jd());
            return c11901k4;
        }
        C4641lr c4641lr = (C4641lr) m19042x1();
        C11898h4 c11898h4 = new C11898h4((c4641lr.m19209k4() & 1) > 0 ? c4641lr.m19207fa().m19510k4().m19022k4().m19486dy() : null, (c4641lr.m19209k4() & 2) > 0 ? c4641lr.m19207fa().m19514x1().m19346x1().m19486dy() : null);
        c11898h4.m55603k4((int) c4641lr.m19222x1());
        c11898h4.m55607to(c4641lr.m19216kk());
        c11898h4.m55604k4((int) c4641lr.m19220to(), (int) c4641lr.m19205du());
        c11898h4.m55609x1(c4641lr.m19219m9());
        c11898h4.m55598du(c4641lr.m19203c5());
        return c11898h4;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public String toString() {
        return C14113y2.m67402k4("{0}, Type: {1}, CustomLineCapData: {2}", super.toString(), C14042ak.m66410k4(C10180dy.class, this.f12869k4), this.f12870x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C4609ar m19042x1() {
        return this.f12870x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19038k4(int i) {
        this.f12869k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19039k4(C4609ar c4609ar) {
        this.f12870x1 = c4609ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19040k4(C4612bv c4612bv) {
        return this.f12869k4 == c4612bv.f12869k4 && C14067j2.m66728k4(this.f12870x1, c4612bv.f12870x1);
    }
}
