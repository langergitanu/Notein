package com.aspose.slides.internal.p146g9;

import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p454v0.C11600k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.g9.kk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4229kk {

    /* JADX INFO: renamed from: h4 */
    private AbstractC12536x1 f11532h4;

    /* JADX INFO: renamed from: m9 */
    private final C4230to f11535m9;

    /* JADX INFO: renamed from: k4 */
    protected C12014ne f11533k4 = new C12014ne();

    /* JADX INFO: renamed from: x1 */
    protected int f11537x1 = 96;

    /* JADX INFO: renamed from: kk */
    protected int f11534kk = 96;

    /* JADX INFO: renamed from: to */
    protected C12023wl f11536to = new C12023wl();

    /* JADX INFO: renamed from: du */
    protected C12015qq f11531du = new C12015qq();

    public AbstractC4229kk(AbstractC12536x1 abstractC12536x1, C4230to c4230to) {
        if (abstractC12536x1 == null) {
            throw new ArgumentNullException("metafile");
        }
        if (c4230to == null) {
            throw new ArgumentNullException("settings");
        }
        this.f11532h4 = abstractC12536x1;
        this.f11535m9 = c4230to;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4229kk m17034k4(AbstractC12536x1 abstractC12536x1) {
        return m17035k4(abstractC12536x1, C4230to.m17042x1());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17031k4(Object obj, C11913yj c11913yj);

    /* JADX INFO: renamed from: kk */
    public C4230to m17040kk() {
        return this.f11535m9;
    }

    /* JADX INFO: renamed from: to */
    public C12009k4 mo17032to() {
        return mo17028k4(m17041x1().mo13502h4(), m17041x1().mo13504m9());
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12536x1 m17041x1() {
        return this.f11532h4;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4229kk m17035k4(AbstractC12536x1 abstractC12536x1, C4230to c4230to) {
        int iMo13625x1 = abstractC12536x1.mo13625x1();
        if (iMo13625x1 == 1 || iMo13625x1 == 2) {
            return new C4227du((C11600k4) abstractC12536x1, c4230to);
        }
        if (iMo13625x1 == 3 || iMo13625x1 == 4 || iMo13625x1 == 5) {
            return new C4228k4((C3180k4) abstractC12536x1, c4230to);
        }
        throw new ArgumentException("Invalid metafile type");
    }

    /* JADX INFO: renamed from: x1 */
    private void m17036x1(AbstractC12008jd abstractC12008jd) {
        if (C14093tq.m67296x1(m17040kk().m17045du(), null)) {
            abstractC12008jd.mo17495k4(m17040kk().m17045du().m67297k4().intValue());
        }
        if (C14093tq.m67296x1(m17040kk().m17048h4(), null)) {
            abstractC12008jd.mo17586x1(m17040kk().m17048h4().m67297k4().intValue());
        }
        if (C14093tq.m67296x1(m17040kk().m17056m9(), null)) {
            abstractC12008jd.mo17560kk(m17040kk().m17056m9().m67297k4().intValue());
        }
        if (C14093tq.m67296x1(m17040kk().m17047dy(), null)) {
            abstractC12008jd.mo17476du(m17040kk().m17047dy().m67297k4().intValue());
        }
        if (C14093tq.m67296x1(m17040kk().m17043c5(), null)) {
            abstractC12008jd.mo17481h4(m17040kk().m17043c5().m67297k4().intValue());
        }
        if (C14093tq.m67296x1(m17040kk().m17050jd(), null)) {
            abstractC12008jd.mo17478dy(m17040kk().m17050jd().m67297k4().intValue());
        }
        if (C14093tq.m67296x1(m17040kk().m17044ck(), null)) {
            abstractC12008jd.mo17569m9(m17040kk().m17044ck().m67297k4().intValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m17037k4(C12007ix c12007ix, C12007ix c12007ix2) {
        if (c12007ix2.equals(c12007ix.Clone())) {
            return new C11913yj();
        }
        if (c12007ix.m56550c5() == 0.0f || c12007ix.m56575x1() == 0.0f) {
            return new C11913yj();
        }
        return new C11913yj(c12007ix.Clone(), new C12025x6[]{new C12025x6(c12007ix2.m56557jd(), c12007ix2.m56551ck()), new C12025x6(c12007ix2.m56550c5(), c12007ix2.m56551ck()), new C12025x6(c12007ix2.m56557jd(), c12007ix2.m56575x1())});
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo17028k4(float f, float f2) {
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(f, 14), OooO.OooO00o(f2, 14));
        mo17030k4(c12009k4);
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55763k4(f / m17041x1().mo13502h4(), f2 / m17041x1().mo13504m9());
        c11913yj.m55777kk(-m17041x1().mo13497E_(), -m17041x1().mo13498F_());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            if (!m17040kk().m17054kk().m56504dy()) {
                abstractC12008jdM56582k4.mo17517k4(m17040kk().m17054kk().Clone());
            }
            abstractC12008jdM56582k4.mo17481h4(3);
            m17036x1(abstractC12008jdM56582k4);
            mo17031k4(abstractC12008jdM56582k4, c11913yj);
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
    public final C12014ne m17038k4() {
        return new C12014ne(this.f11532h4.mo13497E_(), this.f11532h4.mo13498F_(), this.f11532h4.mo13502h4(), this.f11532h4.mo13504m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17039k4(AbstractC12008jd abstractC12008jd) {
        mo17031k4(abstractC12008jd, new C11913yj());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo17029k4(AbstractC12008jd abstractC12008jd, C12009k4 c12009k4, C12007ix c12007ix) {
        mo17030k4(c12009k4);
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55777kk(c12007ix.m56571to(), c12007ix.m56554dy());
        c11913yj.m55763k4(c12007ix.m56550c5() / m17041x1().mo13502h4(), c12007ix.m56575x1() / m17041x1().mo13504m9());
        c11913yj.m55777kk(-m17041x1().mo13497E_(), -m17041x1().mo13498F_());
        mo17031k4(abstractC12008jd, c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo17030k4(C12009k4 c12009k4) {
    }
}
