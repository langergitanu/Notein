package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10376bv;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10361au;
import com.aspose.slides.internal.p407st.C10431f3;
import com.aspose.slides.internal.p407st.C10451gi;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10553n2;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10602qb;
import com.aspose.slides.internal.p407st.C10618r9;
import com.aspose.slides.internal.p407st.C10634sc;
import com.aspose.slides.internal.p407st.C10676v0;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.internal.p407st.C10692wh;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
final class rpo {

    /* JADX INFO: renamed from: ar */
    private List<rpo> f48623ar;

    /* JADX INFO: renamed from: bv */
    private qxw f48624bv;

    /* JADX INFO: renamed from: c5 */
    private int f48625c5;

    /* JADX INFO: renamed from: ck */
    private C10602qb f48626ck;

    /* JADX INFO: renamed from: du */
    private gi8 f48627du;

    /* JADX INFO: renamed from: dy */
    private BaseSlide f48628dy;

    /* JADX INFO: renamed from: fa */
    private z9q f48629fa;

    /* JADX INFO: renamed from: h4 */
    private y2n f48630h4;

    /* JADX INFO: renamed from: ix */
    private C10495ji f48631ix;

    /* JADX INFO: renamed from: jd */
    private AbstractC10376bv f48632jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f48633k4;

    /* JADX INFO: renamed from: kk */
    private boolean f48634kk;

    /* JADX INFO: renamed from: m9 */
    private sdp f48636m9;

    /* JADX INFO: renamed from: ne */
    private C10676v0 f48637ne;

    /* JADX INFO: renamed from: um */
    private knj[] f48642um;

    /* JADX INFO: renamed from: x1 */
    private int f48647x1;

    /* JADX INFO: renamed from: x6 */
    private C10487j0 f48648x6;

    /* JADX INFO: renamed from: to */
    private C14093tq<Boolean> f48640to = new C14093tq<>();

    /* JADX INFO: renamed from: up */
    private final IGenericDictionary<Integer, rpo> f48643up = new Dictionary();

    /* JADX INFO: renamed from: yj */
    private IGenericDictionary<Object, uz3> f48649yj = new Dictionary();

    /* JADX INFO: renamed from: ks */
    private List<uz3> f48635ks = new List<>();

    /* JADX INFO: renamed from: rv */
    private List<kiv> f48639rv = new List<>();

    /* JADX INFO: renamed from: u4 */
    private int f48641u4 = -1;

    /* JADX INFO: renamed from: uz */
    private boolean f48644uz = false;

    /* JADX INFO: renamed from: wl */
    private C10692wh f48646wl = null;

    /* JADX INFO: renamed from: qq */
    private com.aspose.slides.internal.p332p7.ehe f48638qq = null;

    /* JADX INFO: renamed from: v4 */
    private BaseSlide f48645v4 = null;

    public rpo(BaseSlide baseSlide, y2n y2nVar) {
        this.f48628dy = baseSlide;
        this.f48630h4 = y2nVar;
        m70221kk(false);
        m70238x1(false);
        m70236x1(0);
        m70200wy();
    }

    /* JADX INFO: renamed from: ak */
    private void m70196ak() {
        if (C7019kk.m27469x1(this.f48628dy, MasterSlide.class)) {
            this.f48625c5 = 0;
        }
        if (C7019kk.m27469x1(this.f48628dy, Slide.class)) {
            this.f48625c5 = 4;
        }
        if (C7019kk.m27469x1(this.f48628dy, LayoutSlide.class)) {
            this.f48625c5 = 3;
            if (m70204bv()) {
                this.f48625c5 = 2;
            }
        }
        if (C7019kk.m27469x1(this.f48628dy, MasterNotesSlide.class)) {
            this.f48625c5 = 5;
        }
        if (C7019kk.m27469x1(this.f48628dy, NotesSlide.class)) {
            this.f48625c5 = 6;
        }
        if (C7019kk.m27469x1(this.f48628dy, MasterHandoutSlide.class)) {
            this.f48625c5 = 7;
        }
        this.f48630h4.m73706k4(this);
        this.f48629fa = new z9q(this);
    }

    /* JADX INFO: renamed from: c6 */
    private void m70197c6() {
        AbstractC1165gx abstractC1165gxM1938ne;
        C10556n5 c10556n5;
        C10495ji c10495jiM50960k4;
        int i = this.f48625c5;
        if (i != 0) {
            switch (i) {
                case 2:
                    if (((LayoutSlide) C7019kk.m27452k4((Object) this.f48628dy, LayoutSlide.class)) == null) {
                        throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
                    }
                    C10678v6 c10678v6 = new C10678v6();
                    this.f48632jd = c10678v6;
                    c10678v6.m50512x1(true);
                    abstractC1165gxM1938ne = ((LayoutSlide) this.f48628dy).m1848ne();
                    break;
                    break;
                case 3:
                    if (((LayoutSlide) C7019kk.m27452k4((Object) this.f48628dy, LayoutSlide.class)) == null) {
                        throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
                    }
                    C10431f3 c10431f3 = new C10431f3();
                    this.f48632jd = c10431f3;
                    c10431f3.m50512x1(true);
                    c10495jiM50960k4 = this.f48630h4.m71950kk().m50960k4((C10431f3) this.f48632jd, ((LayoutSlide) this.f48628dy).m1848ne().m6932k4());
                    this.f48631ix = c10495jiM50960k4;
                    c10556n5 = (C10431f3) this.f48632jd;
                    this.f48648x6 = c10556n5.m51360qq();
                    m70201xk();
                case 4:
                    Slide slide = (Slide) C7019kk.m27452k4((Object) this.f48628dy, Slide.class);
                    if (slide == null) {
                        throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
                    }
                    C10431f3 c10431f32 = new C10431f3();
                    this.f48632jd = c10431f32;
                    c10431f32.m50512x1(true);
                    c10495jiM50960k4 = this.f48630h4.m71950kk().m50968x1((C10431f3) this.f48632jd, slide.m2688ix().m6932k4());
                    this.f48631ix = c10495jiM50960k4;
                    c10556n5 = (C10431f3) this.f48632jd;
                    this.f48648x6 = c10556n5.m51360qq();
                    m70201xk();
                case 5:
                    if (((MasterNotesSlide) C7019kk.m27452k4((Object) this.f48628dy, MasterNotesSlide.class)) == null) {
                        throw new ArgumentException("[!] The source DOM master notes slide doesn't correspond to the declared type.");
                    }
                    C10618r9 c10618r9 = new C10618r9();
                    this.f48632jd = c10618r9;
                    c10618r9.m50512x1(true);
                    C10495ji c10495ji = new C10495ji(null);
                    this.f48631ix = c10495ji;
                    c10495ji.m51013x1(1L);
                    this.f48630h4.m71953up().m51969x1().m52061k4(this.f48631ix);
                    this.f48631ix.m51008k4(this.f48630h4.m71950kk().m50958k4((C10618r9) this.f48632jd));
                    this.f48630h4.m71950kk().m50965m9().m51702du().m51934k4(this.f48631ix.m51012x1());
                    this.f48637ne = ((C10618r9) this.f48632jd).m51619c5();
                    m70201xk();
                case 6:
                    if (((NotesSlide) C7019kk.m27452k4((Object) this.f48628dy, NotesSlide.class)) == null) {
                        throw new ArgumentException("[!] The source DOM notes slide doesn't correspond to the declared type.");
                    }
                    C10618r9 c10618r92 = new C10618r9();
                    this.f48632jd = c10618r92;
                    c10618r92.m50512x1(true);
                    this.f48631ix = this.f48630h4.m71950kk().m50969x1((C10618r9) this.f48632jd);
                    this.f48637ne = ((C10618r9) this.f48632jd).m51619c5();
                    m70201xk();
                case 7:
                    if (((MasterHandoutSlide) C7019kk.m27452k4((Object) this.f48628dy, MasterHandoutSlide.class)) == null) {
                        throw new ArgumentException("[!] The source DOM master handout slide doesn't correspond to the declared type.");
                    }
                    C10634sc c10634sc = new C10634sc();
                    this.f48632jd = c10634sc;
                    c10634sc.m50512x1(true);
                    C10495ji c10495ji2 = new C10495ji(null);
                    this.f48631ix = c10495ji2;
                    c10495ji2.m51013x1(2L);
                    this.f48630h4.m71953up().m51969x1().m52061k4(this.f48631ix);
                    this.f48631ix.m51008k4(this.f48630h4.m71950kk().m50959k4((C10634sc) this.f48632jd));
                    this.f48630h4.m71950kk().m50965m9().m51702du().m51945x1(this.f48631ix.m51012x1());
                    m70201xk();
                default:
                    throw new NotImplementedException("[!] Unknown type of serialized slide.");
            }
        } else {
            if (((MasterSlide) C7019kk.m27452k4((Object) this.f48628dy, MasterSlide.class)) == null) {
                throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
            }
            C10678v6 c10678v62 = new C10678v6();
            this.f48632jd = c10678v62;
            c10678v62.m50512x1(true);
            abstractC1165gxM1938ne = ((MasterSlide) this.f48628dy).m1938ne();
        }
        this.f48631ix = this.f48630h4.m71950kk().m50961k4((C10678v6) this.f48632jd, abstractC1165gxM1938ne.m6932k4());
        c10556n5 = (C10678v6) this.f48632jd;
        this.f48648x6 = c10556n5.m51360qq();
        m70201xk();
    }

    /* JADX INFO: renamed from: dq */
    private void m70198dq() {
        rpo rpoVarM70199k4;
        LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) this.f48628dy, LayoutSlide.class);
        if (layoutSlide != null && (rpoVarM70199k4 = m70199k4((MasterSlide) layoutSlide.getMasterSlide())) != null) {
            rpoVarM70199k4.m70227rv().addItem(this);
        }
        Slide slide = (Slide) C7019kk.m27452k4((Object) this.f48628dy, Slide.class);
        if (slide != null) {
            m70199k4((LayoutSlide) slide.getLayoutSlide());
            m70199k4((MasterSlide) slide.getLayoutSlide().getMasterSlide());
            if (slide.getNotesSlideManager().getNotesSlide() != null) {
                m70224m9().addItem(6, new rpo((BaseSlide) slide.getNotesSlideManager().getNotesSlide(), this.f48630h4));
            }
        }
        MasterNotesSlide masterNotesSlide = (MasterNotesSlide) C7019kk.m27452k4((Object) this.f48628dy, MasterNotesSlide.class);
        if (masterNotesSlide != null) {
            m70199k4((MasterSlide) masterNotesSlide.getPresentation().getMasters().get_Item(0));
        }
        NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) this.f48628dy, NotesSlide.class);
        if (notesSlide != null) {
            rpo rpoVarM73696g8 = m70215k4().m73696g8();
            if (rpoVarM73696g8 != null) {
                m70224m9().addItem(Integer.valueOf(rpoVarM73696g8.m70220kk()), rpoVarM73696g8);
            }
            m70199k4((Slide) notesSlide.getParentSlide());
        }
        MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) C7019kk.m27452k4((Object) this.f48628dy, MasterHandoutSlide.class);
        if (masterHandoutSlide != null) {
            m70199k4((MasterSlide) masterHandoutSlide.getPresentation().getMasters().get_Item(0));
        }
    }

    /* JADX INFO: renamed from: wy */
    private void m70200wy() {
        m70196ak();
        m70198dq();
    }

    /* JADX INFO: renamed from: xk */
    private void m70201xk() {
        this.f48632jd.m50512x1(true);
        C10451gi c10451gi = new C10451gi();
        this.f48632jd.m50507k4(c10451gi);
        this.f48626ck = new C10602qb();
        c10451gi.m50513yj().addItem(this.f48626ck);
        this.f48626ck.m50512x1(true);
        this.f48626ck.m51561x1();
    }

    /* JADX INFO: renamed from: ar */
    public final C10692wh m70202ar() {
        if (this.f48646wl == null) {
            this.f48646wl = new C10692wh();
        }
        return this.f48646wl;
    }

    /* JADX INFO: renamed from: b3 */
    public final gi8 m70203b3() {
        return this.f48627du;
    }

    /* JADX INFO: renamed from: bv */
    public final boolean m70204bv() {
        return this.f48630h4.m73697gi();
    }

    /* JADX INFO: renamed from: c5 */
    public final List<uz3> m70205c5() {
        return this.f48635ks;
    }

    /* JADX INFO: renamed from: ck */
    public final C10676v0 m70206ck() {
        return this.f48637ne;
    }

    /* JADX INFO: renamed from: du */
    public final C10602qb m70207du() {
        if (this.f48626ck == null) {
            m70197c6();
        }
        return this.f48626ck;
    }

    /* JADX INFO: renamed from: dy */
    public final IGenericDictionary<Object, uz3> m70208dy() {
        return this.f48649yj;
    }

    /* JADX INFO: renamed from: fa */
    public final C10495ji m70209fa() {
        return this.f48631ix;
    }

    /* JADX INFO: renamed from: h4 */
    public final z9q m70210h4() {
        if (this.f48629fa == null) {
            m70197c6();
        }
        return this.f48629fa;
    }

    /* JADX INFO: renamed from: ix */
    public final sdp m70211ix() {
        if (this.f48636m9 == null) {
            this.f48636m9 = new sdp(this.f48628dy, this.f48630h4.m73713ks(), null);
        }
        return this.f48636m9;
    }

    /* JADX INFO: renamed from: jd */
    public final C10487j0 m70212jd() {
        return this.f48648x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m70213k4(boolean z) {
        return this.f48630h4.m73730x1(z);
    }

    /* JADX INFO: renamed from: kk */
    public final int m70220kk() {
        return this.f48625c5;
    }

    /* JADX INFO: renamed from: ks */
    public final List<kiv> m70222ks() {
        return this.f48639rv;
    }

    /* JADX INFO: renamed from: lr */
    public final C14093tq<Boolean> m70223lr() {
        return this.f48640to.Clone();
    }

    /* JADX INFO: renamed from: m9 */
    public final IGenericDictionary<Integer, rpo> m70224m9() {
        return this.f48643up;
    }

    /* JADX INFO: renamed from: ne */
    public final void m70225ne() {
        if (this.f48641u4 >= 0) {
            return;
        }
        int i = this.f48625c5;
        if (i == 0 || i == 1) {
            this.f48641u4 = m70215k4().m73693dq();
        }
    }

    /* JADX INFO: renamed from: qq */
    public final int m70226qq() {
        return this.f48647x1;
    }

    /* JADX INFO: renamed from: rv */
    public final List<rpo> m70227rv() {
        if (this.f48623ar == null) {
            this.f48623ar = new List<>();
        }
        return this.f48623ar;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC10376bv m70228to() {
        if (this.f48632jd == null) {
            m70197c6();
        }
        return this.f48632jd;
    }

    /* JADX INFO: renamed from: u4 */
    public final qxw m70229u4() {
        if (this.f48624bv == null) {
            this.f48624bv = qxw.m69802k4(this.f48628dy);
        }
        return this.f48624bv;
    }

    /* JADX INFO: renamed from: um */
    public final BaseSlide m70230um() {
        return this.f48645v4;
    }

    /* JADX INFO: renamed from: up */
    public final int m70231up() {
        return this.f48641u4;
    }

    /* JADX INFO: renamed from: uz */
    public final boolean m70232uz() {
        int i = this.f48625c5;
        return i == 0 || i == 2 || i == 3 || i == 5 || i == 6 || i == 7;
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m70233v4() {
        return this.f48634kk;
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m70234wl() {
        return this.f48644uz;
    }

    /* JADX INFO: renamed from: x1 */
    public final BaseSlide m70235x1() {
        return this.f48628dy;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m70239x6() {
        return this.f48633k4;
    }

    /* JADX INFO: renamed from: yd */
    public final com.aspose.slides.internal.p332p7.ehe m70240yd() {
        if (this.f48638qq == null) {
            this.f48638qq = new com.aspose.slides.internal.p332p7.ehe();
        }
        return this.f48638qq;
    }

    /* JADX INFO: renamed from: yj */
    public final knj[] m70241yj() {
        if (this.f48642um == null) {
            this.f48642um = new knj[9];
        }
        return this.f48642um;
    }

    /* JADX INFO: renamed from: k4 */
    public final rpo m70214k4(int i) {
        if (this.f48643up.containsKey(Integer.valueOf(i))) {
            return this.f48643up.get_Item(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final void m70221kk(boolean z) {
        this.f48634kk = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70236x1(int i) {
        this.f48647x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private rpo m70199k4(BaseSlide baseSlide) {
        if (baseSlide == null || !this.f48630h4.m73718rv().containsKey(baseSlide)) {
            return null;
        }
        rpo rpoVar = this.f48630h4.m73718rv().get_Item(baseSlide);
        m70224m9().addItem(Integer.valueOf(rpoVar.m70220kk()), rpoVar);
        return rpoVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70237x1(uz3 uz3Var) {
        this.f48635ks.addItem(uz3Var);
        Shape shapeMo64936jd = uz3Var.mo64936jd();
        if (shapeMo64936jd != null) {
            if (m70215k4().m73690bv().containsKey(Long.valueOf(shapeMo64936jd.m2584wp()))) {
                m70215k4().m73690bv().set_Item(Long.valueOf(shapeMo64936jd.m2584wp()), uz3Var);
            } else {
                m70215k4().m73690bv().addItem(Long.valueOf(shapeMo64936jd.m2584wp()), uz3Var);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final y2n m70215k4() {
        return this.f48630h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70238x1(boolean z) {
        this.f48633k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70216k4(gi8 gi8Var) {
        this.f48627du = gi8Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70217k4(C14093tq<Boolean> c14093tq) {
        this.f48640to = c14093tq.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70218k4(rpo rpoVar) {
        if (rpoVar == null) {
            return;
        }
        this.f48632jd = rpoVar.m70228to();
        this.f48644uz = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70219k4(uz3 uz3Var) {
        if (uz3Var.mo64936jd() == null) {
            return;
        }
        this.f48649yj.addItem(uz3Var.mo64936jd(), uz3Var);
        C10358am c10358amM72007um = uz3Var.m72007um();
        c10358amM72007um.m50507k4(new C10361au());
        C10553n2 c10553n2 = new C10553n2();
        c10553n2.m51347k4(this.f48630h4.m73729wy());
        c10358amM72007um.m50507k4(c10553n2);
    }
}
