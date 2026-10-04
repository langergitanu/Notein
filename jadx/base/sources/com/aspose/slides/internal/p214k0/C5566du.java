package com.aspose.slides.internal.p214k0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p100e4.C3572qq;
import com.aspose.slides.internal.p186in.C5105k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p277mm.C6400x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p441ui.AbstractC11319to;
import com.aspose.slides.internal.p441ui.C11313du;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11320x1;
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
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.k0.du */
/* JADX INFO: loaded from: classes.dex */
public class C5566du extends AbstractC5568kk {

    /* JADX INFO: renamed from: h4 */
    private C11315h4 f15327h4;

    public C5566du(C5105k4 c5105k4, C5569to c5569to) {
        C11315h4 c11315h4;
        C12014ne c12014neM22891k4;
        super(c5105k4, c5569to);
        C11315h4 c11315h42 = new C11315h4(this);
        this.f15327h4 = c11315h42;
        c11315h42.m54430k4(new Object[c5105k4.m21944jd().m9444h4()]);
        c5105k4.m21947k4(new C11320x1(c5105k4, m22893kk()).m54489k4());
        this.f15330k4 = new C12014ne(new C12016rv(), c5569to.m22901kk().Clone());
        this.f15327h4.m54433kk(m22890k4(C12007ix.m56544k4(m22891k4()).Clone(), m22882du().Clone()));
        C12023wl c12023wl = new C12023wl(this.f15330k4.m56663c5(), this.f15330k4.m56683x1());
        this.f15333to = c12023wl;
        m22881k4(c12023wl.Clone()).CloneTo(this.f15328du);
        this.f15327h4.m54413k4(this.f15333to.m56865x1() / this.f15328du.m56699x1());
        this.f15327h4.m54457x1(this.f15333to.m56862kk() / this.f15328du.m56697kk());
        this.f15327h4.m54414k4(8);
        if (this.f15327h4.m54467yd()) {
            c11315h4 = this.f15327h4;
            c12014neM22891k4 = m22891k4();
        } else if (c5105k4.m21951yj().length > 0) {
            this.f15327h4.m54461x1(c5105k4.m21948ks().m54475k4().Clone());
            this.f15327h4.m54420k4(this.f15330k4.Clone());
        } else {
            c11315h4 = this.f15327h4;
            c12014neM22891k4 = this.f15330k4;
        }
        c11315h4.m54461x1(c12014neM22891k4.Clone());
        this.f15327h4.m54420k4(this.f15330k4.Clone());
    }

    /* JADX INFO: renamed from: h4 */
    private int m22880h4() {
        if (m22894x1().mo12733x1() == 2) {
            return ((C5105k4) m22894x1()).m21940ck().m9431x1() & 65535;
        }
        return 96;
    }

    /* JADX INFO: renamed from: du */
    public final C12007ix m22882du() {
        return new C12007ix(0.0f, 0.0f, (m22894x1().mo21943h4() * this.f15334x1) / m22880h4(), (m22894x1().mo21949m9() * this.f15331kk) / m22880h4());
    }

    @Override // com.aspose.slides.internal.p214k0.AbstractC5568kk
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo22883k4(float f, float f2) {
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(f, 14), OooO.OooO00o(f2, 14));
        this.f15327h4.m54419k4(c12009k4);
        C11913yj c11913yj = new C11913yj(new C12007ix(0.0f, 0.0f, ((C5105k4) m22894x1()).m21942fa(), ((C5105k4) m22894x1()).m21950up()).Clone(), new C12025x6[]{new C12025x6(0.0f, 0.0f), new C12025x6(f, 0.0f), new C12025x6(0.0f, f2)});
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            if (!m22893kk().m22904x1().m56504dy()) {
                abstractC12008jdM56582k4.mo17517k4(m22893kk().m22904x1().Clone());
            }
            abstractC12008jdM56582k4.mo17481h4(3);
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

    @Override // com.aspose.slides.internal.p214k0.AbstractC5568kk
    /* JADX INFO: renamed from: to */
    public C12009k4 mo22885to() {
        return mo22883k4(((C5105k4) m22894x1()).m21942fa(), ((C5105k4) m22894x1()).m21950up());
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m22881k4(C12023wl c12023wl) {
        return new C12015qq((c12023wl.m56865x1() * 25.0f) / this.f15334x1, (c12023wl.m56862kk() * 25.0f) / this.f15331kk);
    }

    @Override // com.aspose.slides.internal.p214k0.AbstractC5568kk
    /* JADX INFO: renamed from: k4 */
    public <TSurface> void mo22884k4(TSurface tsurface, C11913yj c11913yj) {
        this.f15327h4.m54416k4(m22893kk());
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) C7019kk.m27452k4((Object) tsurface, AbstractC12008jd.class);
        C6005k4.m24261k4(abstractC12008jd != null);
        this.f15327h4.m54446to(abstractC12008jd.mo17577u4());
        this.f15327h4.m54422k4(abstractC12008jd.mo17480h4().m56768x1());
        this.f15327h4.m54459x1(c11913yj);
        abstractC12008jd.mo17573to();
        abstractC12008jd.mo17499k4(c11913yj.m55760h4());
        IGenericEnumerator<C3023to> it = m22894x1().m12729k4().iterator();
        while (it.hasNext()) {
            try {
                C1752sv c1752sv = (C1752sv) it.next();
                AbstractC11319to abstractC11319toM54344k4 = C11313du.m54344k4(c1752sv.m9405yj());
                if (abstractC11319toM54344k4 == null) {
                    throw new Exception(C14113y2.m67408k4("Player for ", C14042ak.m66410k4(C3572qq.class, c1752sv.m9405yj()), " was not found."));
                }
                abstractC11319toM54344k4.mo26873k4(c1752sv, abstractC12008jd, this.f15327h4);
                if (c1752sv.m9405yj() == 0) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C6400x1.m26264k4();
    }
}
