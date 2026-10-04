package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.yj */
/* JADX INFO: loaded from: classes4.dex */
public final class C6898yj extends AbstractC6897x1 {

    /* JADX INFO: renamed from: du */
    private C6885c5 f18847du;

    /* JADX INFO: renamed from: h4 */
    private int f18848h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC6888dy f18849k4;

    /* JADX INFO: renamed from: kk */
    private C12007ix f18850kk;

    /* JADX INFO: renamed from: to */
    private int f18851to;

    /* JADX INFO: renamed from: x1 */
    private C11913yj f18852x1;

    private C6898yj() {
        this.f18852x1 = new C11913yj();
        this.f18850kk = new C12007ix();
        this.f18851to = 0;
        this.f18848h4 = 0;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C6898yj c6898yj = new C6898yj();
        c6898yj.f18849k4 = this.f18849k4;
        c6898yj.f18851to = this.f18851to;
        c6898yj.f18847du = this.f18847du;
        this.f18850kk.CloneTo(c6898yj.f18850kk);
        c6898yj.f18852x1 = this.f18852x1.m55760h4();
        return c6898yj;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f18849k4.dispose();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C6898yj.class) && m27025k4((C6898yj) obj);
    }

    public int hashCode() {
        AbstractC6888dy abstractC6888dy = this.f18849k4;
        int iHashCode = (abstractC6888dy != null ? abstractC6888dy.hashCode() : 0) * 397;
        C11913yj c11913yj = this.f18852x1;
        int iHashCode2 = (((((iHashCode ^ (c11913yj != null ? c11913yj.hashCode() : 0)) * 397) ^ this.f18850kk.hashCode()) * 397) ^ this.f18851to) * 397;
        C6885c5 c6885c5 = this.f18847du;
        return iHashCode2 ^ (c6885c5 != null ? c6885c5.hashCode() : 0);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC12024x1 mo26959k4() {
        int iMo13502h4;
        int iMo13504m9;
        if (!C7019kk.m27469x1(this.f18849k4, C3180k4.class)) {
            C6895to c6895to = (C6895to) C7019kk.m27452k4((Object) this.f18849k4, C6895to.class);
            int i = this.f18848h4;
            C12012lr c12012lr = i == 0 ? new C12012lr(c6895to.m27022k4()) : i == 1 ? new C12012lr(c6895to.m27022k4(), this.f18851to) : i == 2 ? new C12012lr(c6895to.m27022k4(), this.f18850kk.Clone()) : i == 3 ? new C12012lr(c6895to.m27022k4(), this.f18851to, this.f18850kk.Clone()) : new C12012lr(c6895to.m27022k4(), this.f18850kk.Clone(), this.f18847du.m26951kk());
            c12012lr.m56623kk(this.f18852x1);
            return c12012lr;
        }
        if (this.f18848h4 > 1) {
            iMo13502h4 = C7019kk.m27462to(Float.valueOf(this.f18850kk.m56550c5()), 13);
            iMo13504m9 = C7019kk.m27462to(Float.valueOf(this.f18850kk.m56575x1()), 13);
        } else {
            iMo13502h4 = this.f18849k4.mo13502h4();
            iMo13504m9 = this.f18849k4.mo13504m9();
        }
        C12009k4 c12009k4 = new C12009k4(iMo13502h4, iMo13504m9);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            C11913yj c11913yj = new C11913yj();
            if (iMo13502h4 != this.f18849k4.mo13502h4() || iMo13504m9 != this.f18849k4.mo13504m9()) {
                c11913yj.m55763k4(iMo13502h4 / this.f18849k4.mo13502h4(), iMo13504m9 / this.f18849k4.mo13504m9());
            }
            AbstractC4229kk.m17034k4((C3180k4) this.f18849k4).mo17031k4(abstractC12008jdM56582k4, c11913yj);
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            int i2 = this.f18848h4;
            C12012lr c12012lr2 = i2 == 0 ? new C12012lr(c12009k4) : i2 == 1 ? new C12012lr(c12009k4, this.f18851to) : i2 == 2 ? new C12012lr(c12009k4, this.f18850kk.Clone()) : i2 == 3 ? new C12012lr(c12009k4, this.f18851to, this.f18850kk.Clone()) : new C12012lr(c12009k4, this.f18850kk.Clone(), this.f18847du.m26951kk());
            c12012lr2.m56623kk(this.f18852x1);
            return c12012lr2;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final int m27027kk() {
        return this.f18851to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11913yj m27028x1() {
        return this.f18852x1;
    }

    public C6898yj(AbstractC6888dy abstractC6888dy) {
        this.f18852x1 = new C11913yj();
        this.f18850kk = new C12007ix();
        this.f18851to = 0;
        this.f18848h4 = 0;
        this.f18849k4 = abstractC6888dy;
        this.f18850kk = new C12007ix(0.0f, 0.0f, abstractC6888dy.mo13502h4(), abstractC6888dy.mo13504m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27026k4(C11913yj c11913yj) {
        this.f18852x1 = c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m27025k4(C6898yj c6898yj) {
        return C14067j2.m66728k4(this.f18849k4, c6898yj.f18849k4) && C14067j2.m66728k4(this.f18852x1, c6898yj.f18852x1) && this.f18850kk.equals(c6898yj.f18850kk.Clone()) && this.f18851to == c6898yj.f18851to && C14067j2.m66728k4(this.f18847du, c6898yj.f18847du);
    }
}
