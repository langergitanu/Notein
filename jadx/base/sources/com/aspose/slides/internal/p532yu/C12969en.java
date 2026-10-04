package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.en */
/* JADX INFO: loaded from: classes5.dex */
public class C12969en extends C12943dd implements Cloneable {

    /* JADX INFO: renamed from: ck */
    private static C12969en f43623ck = m60395jd(2);

    /* JADX INFO: renamed from: fa */
    private static C12969en f43624fa = m60395jd(1);

    /* JADX INFO: renamed from: up */
    private static C12969en f43625up;

    /* JADX INFO: renamed from: c5 */
    private C13005gv f43626c5;

    /* JADX INFO: renamed from: du */
    private C13106mq f43627du;

    /* JADX INFO: renamed from: dy */
    private C13005gv f43628dy;

    /* JADX INFO: renamed from: jd */
    private C13106mq f43630jd;

    /* JADX INFO: renamed from: kk */
    private AbstractC12950dp f43632kk;

    /* JADX INFO: renamed from: m9 */
    private int f43633m9;

    /* JADX INFO: renamed from: to */
    private C12908be f43634to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC12983fc f43635x1;

    /* JADX INFO: renamed from: yj */
    private byte f43636yj;

    /* JADX INFO: renamed from: k4 */
    private int f43631k4 = 256;

    /* JADX INFO: renamed from: h4 */
    private AbstractC12950dp f43629h4 = AbstractC12950dp.f43531k4;

    static {
        C12969en c12969en = new C12969en();
        f43625up = c12969en;
        c12969en.m60228x1(new C13890ei("untypedAny", "http://www.w3.org/2003/11/XPath-datatypes"));
        f43625up.mo60230x1(true);
        f43625up.m60429x1(f43623ck.m60420ne());
        f43625up.m60212c5(3);
        f43625up.m60219k4(C13125nk.m61252h4());
        f43625up.m60226wp().m61435k4((C12943dd) f43625up);
        f43625up.m60226wp().m61269k4(m60402m9());
    }

    /* JADX INFO: renamed from: h4 */
    public static C12969en m60394h4() {
        return f43624fa;
    }

    /* JADX INFO: renamed from: jd */
    private static C12969en m60395jd(int i) {
        C12969en c12969en = new C12969en();
        c12969en.m60228x1(AbstractC13279x6.f44531x1);
        C12989fu c12989fu = new C12989fu();
        c12989fu.m60246k4(C14046bv.f47165du.Clone());
        c12989fu.m60250x1(C14046bv.f47170x1.Clone());
        c12989fu.m60629k4(i);
        c12989fu.m60631kk(null);
        C13193s0 c13193s0 = new C13193s0();
        c13193s0.mo61012k4().m60092k4(c12989fu);
        c12969en.m60429x1(c13193s0);
        c12969en.m60212c5(3);
        c12969en.m60219k4(C13125nk.m61252h4());
        c12969en.m60226wp().m61435k4((C12943dd) c12969en);
        C13123nh c13123nh = new C13123nh(3);
        c13123nh.m61241du();
        c13123nh.m61244h4();
        c13123nh.m61246k4(c12989fu.m60627h4(), c12989fu);
        c13123nh.m61245jd();
        c13123nh.m61250m9();
        c12969en.m60226wp().m61269k4(c13123nh.m61251x1(true));
        C13106mq c13106mq = new C13106mq();
        c13106mq.m61187k4(i);
        c13106mq.m61189kk(null);
        c12969en.m60430x1(c13106mq);
        c12969en.m60226wp().m61268k4(c13106mq);
        return c12969en;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m60396k4(C13282xc c13282xc, C13021hu c13021hu) {
        return (c13021hu.m60699ck() != 0 || c13282xc == null) ? c13021hu.m60699ck() : c13282xc.m61722to();
    }

    /* JADX INFO: renamed from: kp */
    private void m60401kp() {
        this.f43626c5 = null;
        this.f43628dy = null;
        this.f43630jd = null;
        this.f43629h4 = AbstractC12950dp.f43531k4;
        this.f43633m9 = 256;
    }

    /* JADX INFO: renamed from: m9 */
    public static C13192rv m60402m9() {
        return f43623ck.m60226wp().m61276rv();
    }

    /* JADX INFO: renamed from: x1 */
    public static C12908be m60403x1(C12908be c12908be) {
        AbstractC13018hl abstractC13018hlMo60427wy;
        if (!m60400kk(c12908be)) {
            return c12908be;
        }
        C12908be c12908beM60096x1 = c12908be.m60096x1();
        for (int i = 0; i < c12908be.size(); i++) {
            AbstractC13018hl abstractC13018hl = c12908be.get_Item(i);
            C13161q1 c13161q1 = (C13161q1) C7019kk.m27452k4((Object) abstractC13018hl, C13161q1.class);
            if (c13161q1 != null) {
                C13161q1 c13161q12 = (C13161q1) c13161q1.mo60427wy();
                c13161q12.m61410k4(c13161q1.m61409k4().m65282du());
                abstractC13018hlMo60427wy = c13161q12;
            } else {
                C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) abstractC13018hl, C13146p4.class);
                if (!c13146p4.m61358dy().m65287kk() || !c13146p4.m61355c5().m65287kk()) {
                    abstractC13018hlMo60427wy = c13146p4.mo60427wy();
                }
            }
            c12908beM60096x1.m60095k4(i, abstractC13018hlMo60427wy);
        }
        return c12908beM60096x1;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public Object af_() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final int m60406c5() {
        return this.f43631k4;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC12983fc m60407ck() {
        return this.f43635x1;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m60408dy() {
        return (this.f43636yj & 4) != 0;
    }

    /* JADX INFO: renamed from: fa */
    public final AbstractC12950dp m60409fa() {
        return this.f43632kk;
    }

    /* JADX INFO: renamed from: ix */
    public final int m60410ix() {
        return this.f43633m9;
    }

    /* JADX INFO: renamed from: kk */
    public final void m60418kk(boolean z) {
        this.f43636yj = (byte) (z ? (this.f43636yj & 255) | 1 : this.f43636yj & 254);
    }

    /* JADX INFO: renamed from: ks */
    public final int m60419ks() {
        return m60222sv();
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC12950dp m60420ne() {
        return this.f43629h4;
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m60421qq() {
        return (this.f43636yj & 1) != 0;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m60422to(boolean z) {
        AbstractC12892ae abstractC12892aeM61377yj;
        Iterator it = m60423u4().m60648kk().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it.next();
                if (c13146p4.m61356ck() != 2 && (abstractC12892aeM61377yj = c13146p4.m61377yj()) != null && abstractC12892aeM61377yj.mo60020fa() == 37 && (i = i + 1) > 1) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return z ? i > 1 : i > 0;
    }

    /* JADX INFO: renamed from: u4 */
    public final C13005gv m60423u4() {
        if (this.f43626c5 == null) {
            this.f43626c5 = new C13005gv();
        }
        return this.f43626c5;
    }

    /* JADX INFO: renamed from: up */
    public final C12908be m60424up() {
        if (this.f43634to == null) {
            this.f43634to = new C12908be();
        }
        return this.f43634to;
    }

    /* JADX INFO: renamed from: uz */
    public final C13106mq m60425uz() {
        return this.f43630jd;
    }

    /* JADX INFO: renamed from: wl */
    public final C13005gv m60426wl() {
        if (this.f43628dy == null) {
            this.f43628dy = new C13005gv();
        }
        return this.f43628dy;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        return m60411k4((C13282xc) null);
    }

    /* JADX INFO: renamed from: yj */
    public final C13106mq m60431yj() {
        return this.f43627du;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12908be m60397k4(C12908be c12908be, C13282xc c13282xc) {
        C12908be c12908beM60096x1 = c12908be.m60096x1();
        for (int i = 0; i < c12908be.size(); i++) {
            c12908beM60096x1.m60095k4(i, m60398k4((AbstractC12950dp) c12908be.get_Item(i), c13282xc));
        }
        return c12908beM60096x1;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m60400kk(C12908be c12908be) {
        for (int i = 0; i < c12908be.size(); i++) {
            if (C7019kk.m27469x1(c12908be.get_Item(i), C13161q1.class)) {
                return true;
            }
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908be.get_Item(i), C13146p4.class);
            if (!c13146p4.m61358dy().m65287kk() || !c13146p4.m61355c5().m65287kk()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12969en m60404x1() {
        return f43625up;
    }

    @Override // com.aspose.slides.internal.p532yu.C12943dd
    /* JADX INFO: renamed from: jd */
    public boolean mo60216jd() {
        return (this.f43636yj & 2) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12950dp m60398k4(AbstractC12950dp abstractC12950dp, C13282xc c13282xc) {
        AbstractC13054jn abstractC13054jn = (AbstractC13054jn) C7019kk.m27452k4((Object) abstractC12950dp, AbstractC13054jn.class);
        if (abstractC13054jn != null) {
            C12908be c12908beM60397k4 = m60397k4(abstractC13054jn.mo61012k4(), c13282xc);
            AbstractC13054jn abstractC13054jn2 = (AbstractC13054jn) abstractC13054jn.mo60427wy();
            abstractC13054jn2.mo61013k4(c12908beM60397k4);
            return abstractC13054jn2;
        }
        if (!C7019kk.m27469x1(abstractC12950dp, C12990fw.class)) {
            C13021hu c13021hu = (C13021hu) C7019kk.m27452k4((Object) abstractC12950dp, C13021hu.class);
            return c13021hu != null ? (c13021hu.m60720ne().m65287kk() && c13021hu.m60724u4().m65287kk() && m60396k4(c13282xc, c13021hu) != 1) ? abstractC12950dp : (C13021hu) c13021hu.m60707k4(c13282xc) : abstractC12950dp;
        }
        C12990fw c12990fw = (C12990fw) abstractC12950dp.mo60427wy();
        c12990fw.m60638k4(c12990fw.m60635k4().m65282du());
        return c12990fw;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60428x1(int i) {
        this.f43633m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12969en m60399k4() {
        return f43623ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60429x1(AbstractC12950dp abstractC12950dp) {
        this.f43629h4 = abstractC12950dp;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13018hl m60411k4(C13282xc c13282xc) {
        C12969en c12969en = (C12969en) af_();
        if (c12969en.m60407ck() != null) {
            C13268wr c13268wr = (C13268wr) C7019kk.m27452k4((Object) c12969en.m60407ck(), C13268wr.class);
            if (c13268wr != null) {
                C13268wr c13268wr2 = (C13268wr) c13268wr.mo60427wy();
                C13025i2 c13025i2 = (C13025i2) C7019kk.m27452k4((Object) c13268wr.m61663k4(), C13025i2.class);
                if (c13025i2 != null) {
                    C13025i2 c13025i22 = (C13025i2) c13025i2.mo60427wy();
                    c13025i22.m60744k4(c13025i2.m60741k4().m65282du());
                    c13025i22.m60742k4(m60403x1(c13025i2.m60745x1()));
                    c13268wr2.m61664k4((AbstractC13101mc) c13025i22);
                } else {
                    C13039iv c13039iv = (C13039iv) c13268wr.m61663k4();
                    C13039iv c13039iv2 = (C13039iv) c13039iv.mo60427wy();
                    c13039iv2.m60756k4(c13039iv.m60752k4().m65282du());
                    c13039iv2.m60753k4(m60403x1(c13039iv.m60757m9()));
                    c13268wr2.m61664k4((AbstractC13101mc) c13039iv2);
                }
                c12969en.m60415k4((AbstractC12983fc) c13268wr2);
            } else {
                C12935cx c12935cx = (C12935cx) c12969en.m60407ck();
                C12935cx c12935cx2 = (C12935cx) c12935cx.mo60427wy();
                C13258w2 c13258w2 = (C13258w2) C7019kk.m27452k4((Object) c12935cx.m60148x1(), C13258w2.class);
                if (c13258w2 != null) {
                    C13258w2 c13258w22 = (C13258w2) c13258w2.mo60427wy();
                    c13258w22.m61649k4(c13258w2.m61645k4().m65282du());
                    c13258w22.m61646k4(m60403x1(c13258w2.m61644h4()));
                    if (m60405x1(c13258w2.m61651x1(), c13282xc)) {
                        c13258w22.m61647k4(m60398k4(c13258w2.m61651x1(), c13282xc));
                    }
                    c12935cx2.m60145k4((AbstractC13101mc) c13258w22);
                } else {
                    C12913br c12913br = (C12913br) C7019kk.m27452k4((Object) c12935cx.m60148x1(), C12913br.class);
                    C12913br c12913br2 = (C12913br) c12913br.mo60427wy();
                    c12913br2.m60103k4(c12913br.m60099k4().m65282du());
                    c12913br2.m60100k4(m60403x1(c12913br.m60098h4()));
                    if (m60405x1(c12913br2.m60105x1(), c13282xc)) {
                        c12913br2.m60101k4(m60398k4(c12913br2.m60105x1(), c13282xc));
                    }
                    c12935cx2.m60145k4((AbstractC13101mc) c12913br2);
                }
                c12969en.m60415k4((AbstractC12983fc) c12935cx2);
            }
        } else {
            if (m60405x1(c12969en.m60409fa(), c13282xc)) {
                c12969en.m60414k4(m60398k4(c12969en.m60409fa(), c13282xc));
            }
            c12969en.m60413k4(m60403x1(c12969en.m60424up()));
        }
        c12969en.m60401kp();
        return c12969en;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60430x1(C13106mq c13106mq) {
        this.f43630jd = c13106mq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60412k4(int i) {
        this.f43631k4 = i;
    }

    @Override // com.aspose.slides.internal.p532yu.C12943dd
    /* JADX INFO: renamed from: x1 */
    public void mo60230x1(boolean z) {
        this.f43636yj = (byte) (z ? (this.f43636yj & 255) | 2 : this.f43636yj & 253);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m60405x1(AbstractC12950dp abstractC12950dp, C13282xc c13282xc) {
        C13021hu c13021hu;
        AbstractC13054jn abstractC13054jn = (AbstractC13054jn) C7019kk.m27452k4((Object) abstractC12950dp, AbstractC13054jn.class);
        int i = 0;
        if (abstractC13054jn == null) {
            return C7019kk.m27469x1(abstractC12950dp, C12990fw.class);
        }
        boolean zM60405x1 = false;
        while (i < abstractC13054jn.mo61012k4().size() && !zM60405x1) {
            int i2 = i + 1;
            AbstractC12950dp abstractC12950dp2 = (AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i);
            zM60405x1 = (!C7019kk.m27469x1(abstractC12950dp2, C12990fw.class) && ((c13021hu = (C13021hu) C7019kk.m27452k4((Object) abstractC12950dp2, C13021hu.class)) == null || (c13021hu.m60720ne().m65287kk() && c13021hu.m60724u4().m65287kk() && m60396k4(c13282xc, c13021hu) != 1))) ? m60405x1(abstractC12950dp2, c13282xc) : true;
            i = i2;
        }
        return zM60405x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60413k4(C12908be c12908be) {
        this.f43634to = c12908be;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60414k4(AbstractC12950dp abstractC12950dp) {
        this.f43632kk = abstractC12950dp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60415k4(AbstractC12983fc abstractC12983fc) {
        this.f43635x1 = abstractC12983fc;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60416k4(C13106mq c13106mq) {
        this.f43627du = c13106mq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60417k4(boolean z) {
        this.f43636yj = (byte) (z ? (this.f43636yj & 255) | 4 : this.f43636yj & 251);
    }
}
