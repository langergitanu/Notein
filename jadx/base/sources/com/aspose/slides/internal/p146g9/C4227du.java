package com.aspose.slides.internal.p146g9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p123f5.AbstractC3860to;
import com.aspose.slides.internal.p123f5.C3854du;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3861x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p344pt.AbstractC9530rv;
import com.aspose.slides.internal.p377r9.C9989qq;
import com.aspose.slides.internal.p454v0.C11600k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.g9.du */
/* JADX INFO: loaded from: classes.dex */
public class C4227du extends AbstractC4229kk {

    /* JADX INFO: renamed from: h4 */
    private C3856h4 f11530h4;

    public C4227du(C11600k4 c11600k4, C4230to c4230to) {
        C3856h4 c3856h4;
        C12014ne c12014neM17038k4;
        super(c11600k4, c4230to);
        C3856h4 c3856h42 = new C3856h4(this);
        this.f11530h4 = c3856h42;
        c3856h42.m15500k4(new Object[c11600k4.m54628ck().m16111h4()]);
        c11600k4.m54630k4(new C3861x1(c11600k4, m17040kk()).m15563k4());
        this.f11533k4 = new C12014ne(new C12016rv(), c4230to.m17058to().Clone());
        this.f11530h4.m15503kk(m17037k4(C12007ix.m56544k4(m17038k4()).Clone(), m17027du().Clone()));
        C12023wl c12023wl = new C12023wl(this.f11533k4.m56663c5(), this.f11533k4.m56683x1());
        this.f11536to = c12023wl;
        m17026k4(c12023wl.Clone()).CloneTo(this.f11531du);
        this.f11530h4.m15483k4(this.f11536to.m56865x1() / this.f11531du.m56699x1());
        this.f11530h4.m15527x1(this.f11536to.m56862kk() / this.f11531du.m56697kk());
        this.f11530h4.m15484k4(8);
        if (this.f11530h4.m15525wy()) {
            c3856h4 = this.f11530h4;
            c12014neM17038k4 = m17038k4();
        } else if (c11600k4.m54633ks().length > 0) {
            this.f11530h4.m15532x1(c11600k4.m54634rv().m15547k4().Clone());
            this.f11530h4.m15489k4(this.f11533k4.Clone());
        } else {
            c3856h4 = this.f11530h4;
            c12014neM17038k4 = this.f11533k4;
        }
        c3856h4.m15532x1(c12014neM17038k4.Clone());
        this.f11530h4.m15489k4(this.f11533k4.Clone());
    }

    /* JADX INFO: renamed from: h4 */
    private int m17025h4() {
        if (m17041x1().mo13625x1() != 2 || (((C11600k4) m17041x1()).m54629fa().m16096kk() & 65535) <= 0) {
            return 96;
        }
        return ((C11600k4) m17041x1()).m54629fa().m16096kk() & 65535;
    }

    /* JADX INFO: renamed from: du */
    public final C12007ix m17027du() {
        return new C12007ix(0.0f, 0.0f, (m17041x1().mo13502h4() * this.f11537x1) / m17025h4(), (m17041x1().mo13504m9() * this.f11534kk) / m17025h4());
    }

    @Override // com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo17028k4(float f, float f2) {
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(f, 14), OooO.OooO00o(f2, 14));
        this.f11530h4.m15488k4(c12009k4);
        C11913yj c11913yj = new C11913yj(new C12007ix(0.0f, 0.0f, ((C11600k4) m17041x1()).m54634rv().m15548kk().m56663c5(), ((C11600k4) m17041x1()).m54634rv().m15548kk().m56683x1()).Clone(), new C12025x6[]{new C12025x6(0.0f, 0.0f), new C12025x6(f, 0.0f), new C12025x6(0.0f, f2)});
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            if (!m17040kk().m17054kk().m56504dy()) {
                abstractC12008jdM56582k4.mo17517k4(m17040kk().m17054kk().Clone());
            }
            abstractC12008jdM56582k4.mo17481h4(3);
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

    @Override // com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: to */
    public C12009k4 mo17032to() {
        return mo17028k4(((C11600k4) m17041x1()).m54635up(), ((C11600k4) m17041x1()).m54637yj());
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m17026k4(C12023wl c12023wl) {
        return new C12015qq((c12023wl.m56865x1() * 25.0f) / this.f11537x1, (c12023wl.m56862kk() * 25.0f) / this.f11534kk);
    }

    @Override // com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: k4 */
    public void mo17029k4(AbstractC12008jd abstractC12008jd, C12009k4 c12009k4, C12007ix c12007ix) {
        this.f11530h4.m15488k4(c12009k4);
        C11600k4 c11600k4 = (C11600k4) m17041x1();
        C11913yj c11913yjM55760h4 = abstractC12008jd.mo17577u4().m55760h4();
        c11913yjM55760h4.m55777kk(c12007ix.m56571to() + c11600k4.m54634rv().m15549to().m56681to(), c12007ix.m56554dy() + c11600k4.m54634rv().m15549to().m56666dy());
        c11913yjM55760h4.m55763k4(c12007ix.m56550c5() / c11600k4.m54634rv().m15548kk().m56663c5(), c12007ix.m56575x1() / c11600k4.m54634rv().m15548kk().m56683x1());
        mo17031k4(abstractC12008jd, c11913yjM55760h4);
    }

    @Override // com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: k4 */
    public void mo17030k4(C12009k4 c12009k4) {
        this.f11530h4.m15488k4(c12009k4);
    }

    @Override // com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: k4 */
    public void mo17031k4(Object obj, C11913yj c11913yj) {
        this.f11530h4.m15485k4(m17040kk());
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) C7019kk.m27452k4(obj, AbstractC12008jd.class);
        this.f11530h4.m15516to(abstractC12008jd.mo17577u4());
        this.f11530h4.m15491k4(abstractC12008jd.mo17480h4().m56768x1());
        this.f11530h4.m15529x1(c11913yj);
        abstractC12008jd.mo17573to();
        abstractC12008jd.mo17499k4(c11913yj.m55760h4());
        try {
            IGenericEnumerator<C12535to> it = m17041x1().m58364k4().iterator();
            while (it.hasNext()) {
                try {
                    C4047sv c4047sv = (C4047sv) it.next();
                    AbstractC3860to abstractC3860toM15408k4 = C3854du.m15408k4(c4047sv.m16063ks());
                    if (abstractC3860toM15408k4 == null) {
                        throw new Exception(C14113y2.m67408k4("Player for ", C14042ak.m66410k4(C9989qq.class, c4047sv.m16063ks()), " was not found."));
                    }
                    abstractC3860toM15408k4.mo15559k4(c4047sv, abstractC12008jd, this.f11530h4);
                    if (c4047sv.m16063ks() == 0 || c4047sv.m16063ks() == 65535) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } finally {
            if (this.f11530h4.m15518u4() != null && this.f11530h4.m15522uz()) {
                AbstractC9530rv.m46694k4(this.f11530h4);
            }
        }
    }
}
