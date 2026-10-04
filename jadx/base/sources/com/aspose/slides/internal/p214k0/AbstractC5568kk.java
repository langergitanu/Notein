package com.aspose.slides.internal.p214k0;

import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p186in.C5105k4;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.k0.kk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5568kk {

    /* JADX INFO: renamed from: h4 */
    private AbstractC3024x1 f15329h4;

    /* JADX INFO: renamed from: m9 */
    private final C5569to f15332m9;

    /* JADX INFO: renamed from: k4 */
    protected C12014ne f15330k4 = new C12014ne();

    /* JADX INFO: renamed from: x1 */
    protected int f15334x1 = 96;

    /* JADX INFO: renamed from: kk */
    protected int f15331kk = 96;

    /* JADX INFO: renamed from: to */
    protected C12023wl f15333to = new C12023wl();

    /* JADX INFO: renamed from: du */
    protected C12015qq f15328du = new C12015qq();

    public AbstractC5568kk(AbstractC3024x1 abstractC3024x1, C5569to c5569to) {
        if (abstractC3024x1 == null) {
            throw new ArgumentNullException("metafile");
        }
        if (c5569to == null) {
            throw new ArgumentNullException("settings");
        }
        this.f15329h4 = abstractC3024x1;
        this.f15332m9 = c5569to;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5568kk m22887k4(AbstractC3024x1 abstractC3024x1) {
        return m22888k4(abstractC3024x1, C5569to.m22895k4());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract <TSurface> void mo22884k4(TSurface tsurface, C11913yj c11913yj);

    /* JADX INFO: renamed from: kk */
    public C5569to m22893kk() {
        return this.f15332m9;
    }

    /* JADX INFO: renamed from: to */
    public C12009k4 mo22885to() {
        return mo22883k4(m22894x1().mo21943h4(), m22894x1().mo21949m9());
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC3024x1 m22894x1() {
        return this.f15329h4;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5568kk m22888k4(AbstractC3024x1 abstractC3024x1, C5569to c5569to) {
        int iMo12733x1 = abstractC3024x1.mo12733x1();
        if (iMo12733x1 == 1 || iMo12733x1 == 2) {
            return new C5566du((C5105k4) abstractC3024x1, c5569to);
        }
        if (iMo12733x1 == 3 || iMo12733x1 == 4 || iMo12733x1 == 5) {
            return new C5567k4((C9966k4) abstractC3024x1, c5569to);
        }
        throw new ArgumentException("Invalid metafile type");
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m22890k4(C12007ix c12007ix, C12007ix c12007ix2) {
        if (c12007ix2.equals(c12007ix.Clone())) {
            return new C11913yj();
        }
        if (c12007ix.m56550c5() == 0.0f || c12007ix.m56575x1() == 0.0f) {
            return new C11913yj();
        }
        return new C11913yj(c12007ix.Clone(), new C12025x6[]{new C12025x6(c12007ix2.m56557jd(), c12007ix2.m56551ck()), new C12025x6(c12007ix2.m56550c5(), c12007ix2.m56551ck()), new C12025x6(c12007ix2.m56557jd(), c12007ix2.m56575x1())});
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo22883k4(float f, float f2) {
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(f, 14), OooO.OooO00o(f2, 14));
        mo22892k4(c12009k4);
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55763k4(f / m22894x1().mo21943h4(), f2 / m22894x1().mo21949m9());
        c11913yj.m55777kk(-m22894x1().as_(), -m22894x1().at_());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            if (!m22893kk().m22904x1().m56504dy()) {
                abstractC12008jdM56582k4.mo17517k4(m22893kk().m22904x1().Clone());
            }
            abstractC12008jdM56582k4.mo17481h4(3);
            m22889k4(abstractC12008jdM56582k4);
            mo22884k4(abstractC12008jdM56582k4, c11913yj);
            abstractC12008jdM56582k4.dispose();
            return c12009k4;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12014ne m22891k4() {
        return new C12014ne(this.f15329h4.as_(), this.f15329h4.at_(), this.f15329h4.mo21943h4(), this.f15329h4.mo21949m9());
    }

    /* JADX INFO: renamed from: k4 */
    private void m22889k4(AbstractC12008jd abstractC12008jd) {
        if (m22893kk().m22903to().m67302x1()) {
            abstractC12008jd.mo17495k4(m22893kk().m22903to().m67297k4().intValue());
        }
        if (m22893kk().m22897du().m67302x1()) {
            abstractC12008jd.mo17586x1(m22893kk().m22897du().m67297k4().intValue());
        }
        if (m22893kk().m22899h4().m67302x1()) {
            abstractC12008jd.mo17560kk(m22893kk().m22899h4().m67297k4().intValue());
        }
        if (m22893kk().m22902m9().m67302x1()) {
            abstractC12008jd.mo17476du(m22893kk().m22902m9().m67297k4().intValue());
        }
        if (m22893kk().m22898dy().m67302x1()) {
            abstractC12008jd.mo17481h4(m22893kk().m22898dy().m67297k4().intValue());
        }
        if (m22893kk().m22896c5().m67302x1()) {
            abstractC12008jd.mo17478dy(m22893kk().m22896c5().m67297k4().intValue());
        }
        if (m22893kk().m22900jd().m67302x1()) {
            abstractC12008jd.mo17569m9(m22893kk().m22900jd().m67297k4().intValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22892k4(C12009k4 c12009k4) {
    }
}
