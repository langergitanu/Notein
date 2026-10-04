package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10456gv;
import com.aspose.slides.internal.p407st.AbstractC10458gz;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10395d2;
import com.aspose.slides.internal.p407st.C10431f3;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10477i9;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10510kk;
import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10601q9;
import com.aspose.slides.internal.p407st.C10602qb;
import com.aspose.slides.internal.p407st.C10618r9;
import com.aspose.slides.internal.p407st.C10634sc;
import com.aspose.slides.internal.p407st.C10635sd;
import com.aspose.slides.internal.p407st.C10652to;
import com.aspose.slides.internal.p407st.C10676v0;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.internal.p407st.C10703x1;
import com.aspose.slides.internal.p407st.C10706x4;
import com.aspose.slides.internal.p407st.C10738yu;
import com.aspose.slides.internal.p505xn.C12577yj;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class m4c {

    /* JADX INFO: renamed from: c5 */
    private List<C10395d2> f46138c5;

    /* JADX INFO: renamed from: ck */
    private C10510kk f46139ck;

    /* JADX INFO: renamed from: dq */
    private int f46140dq;

    /* JADX INFO: renamed from: du */
    private bjs f46141du;

    /* JADX INFO: renamed from: dy */
    private C10706x4 f46142dy;

    /* JADX INFO: renamed from: fa */
    private BaseSlide f46143fa;

    /* JADX INFO: renamed from: h4 */
    private C10495ji f46144h4;

    /* JADX INFO: renamed from: ix */
    private C10635sd f46145ix;

    /* JADX INFO: renamed from: jd */
    private C10652to f46146jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f46147k4;

    /* JADX INFO: renamed from: kk */
    private boolean f46148kk;

    /* JADX INFO: renamed from: ne */
    private cct f46152ne;

    /* JADX INFO: renamed from: to */
    private a3u f46155to;

    /* JADX INFO: renamed from: u4 */
    private C10738yu f46156u4;

    /* JADX INFO: renamed from: um */
    private qxw f46157um;

    /* JADX INFO: renamed from: up */
    private int f46158up;

    /* JADX INFO: renamed from: wy */
    private int f46162wy;

    /* JADX INFO: renamed from: x1 */
    private boolean f46163x1;

    /* JADX INFO: renamed from: x6 */
    private sil f46164x6;

    /* JADX INFO: renamed from: xk */
    private IGenericDictionary<Byte, Placeholder> f46165xk;

    /* JADX INFO: renamed from: yj */
    private C10602qb f46167yj;

    /* JADX INFO: renamed from: m9 */
    private long f46151m9 = 0;

    /* JADX INFO: renamed from: ks */
    private jio[] f46149ks = new jio[9];

    /* JADX INFO: renamed from: rv */
    private final IGenericDictionary<Integer, m4c> f46154rv = new Dictionary();

    /* JADX INFO: renamed from: uz */
    private final Dictionary<Long, qah> f46159uz = new Dictionary<>();

    /* JADX INFO: renamed from: wl */
    private final List<qah> f46161wl = new List<>();

    /* JADX INFO: renamed from: qq */
    private final Dictionary<IShape, C10703x1> f46153qq = new Dictionary<>();

    /* JADX INFO: renamed from: ar */
    private SortedList<Long, qah> f46135ar = null;

    /* JADX INFO: renamed from: bv */
    private List<Long> f46137bv = null;

    /* JADX INFO: renamed from: v4 */
    private BaseSlide f46160v4 = null;

    /* JADX INFO: renamed from: lr */
    private final SortedList<Integer, LayoutSlide> f46150lr = new SortedList<>();

    /* JADX INFO: renamed from: yd */
    private C14093tq<Long> f46166yd = new C14093tq<>();

    /* JADX INFO: renamed from: b3 */
    private C14093tq<Long> f46136b3 = new C14093tq<>();

    /* JADX INFO: renamed from: ak */
    private boolean f46134ak = false;

    public m4c(C10495ji c10495ji, a3u a3uVar) {
        this.f46144h4 = c10495ji;
        this.f46155to = a3uVar;
        m64723k4(false);
        m64741x1(false);
        m64725kk(false);
        m64695c6();
        m64702ts();
    }

    /* JADX INFO: renamed from: bz */
    private void m64694bz() {
        long jM51558x1;
        C10678v6 c10678v6 = (C10678v6) C7019kk.m27452k4((Object) this.f46146jd, C10678v6.class);
        if (c10678v6 != null) {
            C10477i9 c10477i9M51362uz = c10678v6.m51362uz();
            if (c10477i9M51362uz != null) {
                jM51558x1 = c10477i9M51362uz.m50910x1();
                this.f46155to.m3181k4(jM51558x1, -1, this);
            } else {
                jM51558x1 = 0;
            }
            C10601q9 c10601q9M51363wl = c10678v6.m51363wl();
            if (c10601q9M51363wl != null) {
                jM51558x1 = c10601q9M51363wl.m51558x1();
            }
            if (c10678v6.m51846rv() != null) {
                IGenericEnumerator<Integer> it = c10678v6.m51846rv().getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        this.f46155to.m3181k4(jM51558x1, ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue(), this);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c6 */
    private void m64695c6() {
        C10495ji c10495ji = this.f46144h4;
        if (c10495ji == null) {
            throw new ArgumentNullException("slidePersistAtom", "Can't deserialize a slide without SlidePersistAtom!");
        }
        this.f46151m9 = c10495ji.m51012x1();
        this.f46142dy = (C10706x4) this.f46144h4.m51402ak();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[RETURN] */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m64696e0() {
        int i;
        short sM51408lr = this.f46142dy.m51408lr();
        if (sM51408lr == 0) {
            i = 4;
        } else {
            if (sM51408lr == 1) {
                this.f46158up = 0;
                if ((this.f46146jd.m51404bv() & 65535) != 1016) {
                    i = 3;
                }
                if (m64708bv()) {
                    C10556n5 c10556n5 = (C10556n5) C7019kk.m27452k4((Object) this.f46146jd, C10556n5.class);
                    if (c10556n5 == null) {
                        throw new NullReferenceException("Wrong type of source SlideContainer!");
                    }
                    this.f46139ck = c10556n5.m51360qq();
                    this.f46156u4 = ((C10556n5) this.f46146jd).m51359ne();
                }
                if (m64737v4()) {
                    return;
                }
                C10618r9 c10618r9 = (C10618r9) C7019kk.m27452k4((Object) this.f46146jd, C10618r9.class);
                if (c10618r9 == null) {
                    throw new NullReferenceException("Wrong type of source NotesContainer!");
                }
                this.f46139ck = c10618r9.m51619c5();
                return;
            }
            if (sM51408lr == 2) {
                i = 6;
            } else {
                if (sM51408lr != 255) {
                    throw new ArgumentOutOfRangeException("Unknown parent SlidesList!");
                }
                int iM51011to = (int) this.f46144h4.m51011to();
                if (iM51011to == 1) {
                    i = 5;
                } else {
                    if (iM51011to != 2) {
                        throw new ArgumentOutOfRangeException("Unknown service slide type!");
                    }
                    i = 7;
                }
            }
        }
        this.f46158up = i;
        if (m64708bv()) {
        }
        if (m64737v4()) {
        }
    }

    /* JADX INFO: renamed from: g8 */
    private void m64697g8() {
        List.Enumerator<AbstractC10571o4> it = this.f46167yj.m50513yj().iterator();
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                AbstractC10458gz abstractC10458gz = (AbstractC10458gz) C7019kk.m27452k4((Object) next, AbstractC10458gz.class);
                qah qahVar = abstractC10458gz != null ? new qah(abstractC10458gz, this) : null;
                switch (next.m51404bv()) {
                    case 61443:
                        if (this.f46164x6 == null && qahVar != null) {
                            this.f46164x6 = (sil) qahVar.m69481du();
                        }
                        break;
                    case 61444:
                        if (this.f46152ne == null && qahVar != null) {
                            C10462h9 c10462h9 = (C10462h9) next;
                            if (c10462h9.mo50864to() != null && c10462h9.mo50864to().m52042m9()) {
                                this.f46152ne = (cct) qahVar.m69481du();
                            }
                        }
                        break;
                    case 61445:
                        if (this.f46145ix == null) {
                            this.f46145ix = (C10635sd) next;
                        }
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: qm */
    private void m64699qm() {
        C10678v6 c10678v6;
        MasterSlide masterSlide = (MasterSlide) C7019kk.m27452k4((Object) this.f46143fa, MasterSlide.class);
        if (masterSlide == null || (c10678v6 = (C10678v6) C7019kk.m27452k4((Object) this.f46146jd, C10678v6.class)) == null) {
            return;
        }
        for (C10536m5 c10536m5 : c10678v6.m51841ck()) {
            jio jioVar = new jio(c10536m5, this);
            int iM63329h4 = jioVar.m63329h4();
            jioVar.m63331k4(iM63329h4 != 0 ? iM63329h4 != 1 ? iM63329h4 != 2 ? iM63329h4 != 4 ? iM63329h4 != 5 ? iM63329h4 != 6 ? new TextStyle(masterSlide) : masterSlide.f2696jd : masterSlide.f2692ck : masterSlide.f2694fa : masterSlide.f2691c5 : masterSlide.f2693dy : masterSlide.f2698m9);
        }
    }

    /* JADX INFO: renamed from: ss */
    private void m64700ss() {
        Slide slide;
        LayoutSlide layoutSlideM2687bv;
        if (this.f46158up != 4 || (slide = (Slide) C7019kk.m27452k4((Object) m64735up(), Slide.class)) == null || (layoutSlideM2687bv = slide.m2687bv()) == null) {
            return;
        }
        List<Shape> listM64704x1 = m64704x1(layoutSlideM2687bv);
        this.f46165xk = new Dictionary();
        if (listM64704x1.size() == 0) {
            return;
        }
        List.Enumerator<Shape> it = listM64704x1.iterator();
        while (it.hasNext()) {
            try {
                Placeholder placeholder = (Placeholder) it.next().getPlaceholder();
                if ((placeholder.getIndex() & 4294967295L) >= 0 && !this.f46165xk.containsKey(Byte.valueOf(placeholder.getType()))) {
                    this.f46165xk.addItem(Byte.valueOf(placeholder.getType()), placeholder);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: sv */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m64701sv() {
        BaseSlide masterSlide;
        Presentation presentationM71946k4 = m64712du().m71946k4();
        switch (this.f46158up) {
            case 0:
            case 1:
                presentationM71946k4.m2351fa().m68396x1(this.f46144h4.m51011to());
                this.f46143fa = new MasterSlide((MasterSlideCollection) presentationM71946k4.getMasters());
                ((MasterSlideCollection) presentationM71946k4.getMasters()).m1949k4((MasterSlide) this.f46143fa);
                if (this.f46143fa != null) {
                    if (this.f46142dy.m51408lr() < 4) {
                        if (this.f46144h4.m51011to() == 4294967295L) {
                            this.f46143fa.mo404to().m6933k4(presentationM71946k4.m2351fa().m68390um());
                        } else {
                            this.f46143fa.mo404to().m6933k4(this.f46144h4.m51011to());
                        }
                    }
                    m64699qm();
                    return;
                }
                return;
            case 2:
                if (!this.f46155to.m3176ar()) {
                    throw new ArgumentException("Illegal instance of CompositMaster.");
                }
                presentationM71946k4.m2351fa().m68396x1(this.f46144h4.m51011to());
                masterSlide = new MasterSlide((MasterSlideCollection) presentationM71946k4.getMasters());
                this.f46143fa = masterSlide;
                if (this.f46143fa != null) {
                }
                break;
            case 3:
                presentationM71946k4.m2351fa().m68396x1(this.f46144h4.m51011to());
                MasterSlide masterSlide2 = (MasterSlide) C7019kk.m27452k4((Object) m64713dy().m64735up(), MasterSlide.class);
                LayoutSlide layoutSlide = (LayoutSlide) masterSlide2.getLayoutSlides().getByType((byte) 0);
                this.f46143fa = layoutSlide;
                if (layoutSlide == null) {
                    masterSlide = (LayoutSlide) masterSlide2.m1943x1((byte) 0);
                    this.f46143fa = masterSlide;
                }
                if (this.f46143fa != null) {
                }
                break;
            case 4:
                presentationM71946k4.m2351fa().m68367k4(this.f46144h4.m51011to());
                this.f46143fa = new Slide((SlideCollection) presentationM71946k4.getSlides());
                this.f46162wy = presentationM71946k4.getSlides().size();
                ((SlideCollection) presentationM71946k4.getSlides()).m2733k4((Slide) this.f46143fa);
                m64703wp();
                if (this.f46143fa != null) {
                }
                break;
            case 5:
                IMasterNotesSlide defaultMasterNotesSlide = presentationM71946k4.getMasterNotesSlideManager().setDefaultMasterNotesSlide();
                defaultMasterNotesSlide.getThemeManager().setOverrideThemeEnabled(false);
                hy0.m7330k4(defaultMasterNotesSlide.getThemeManager().getOverrideTheme());
                defaultMasterNotesSlide.getThemeManager().setOverrideThemeEnabled(true);
                masterSlide = (MasterNotesSlide) defaultMasterNotesSlide;
                this.f46143fa = masterSlide;
                if (this.f46143fa != null) {
                }
                break;
            case 6:
                m4c m4cVarM64718k4 = m64718k4(4);
                if (m4cVarM64718k4 != null) {
                    masterSlide = (NotesSlide) ((Slide) C7019kk.m27452k4((Object) m4cVarM64718k4.m64735up(), Slide.class)).getNotesSlideManager().addNotesSlide();
                    this.f46143fa = masterSlide;
                }
                if (this.f46143fa != null) {
                }
                break;
            case 7:
                IMasterHandoutSlide defaultMasterHandoutSlide = presentationM71946k4.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
                defaultMasterHandoutSlide.getThemeManager().setOverrideThemeEnabled(false);
                hy0.m7330k4(defaultMasterHandoutSlide.getThemeManager().getOverrideTheme());
                defaultMasterHandoutSlide.getThemeManager().setOverrideThemeEnabled(true);
                masterSlide = (MasterHandoutSlide) defaultMasterHandoutSlide;
                this.f46143fa = masterSlide;
                if (this.f46143fa != null) {
                }
                break;
            default:
                throw new ArgumentException(C14113y2.m67408k4("Unprocessed slide type: ", C14042ak.m66410k4(e7g.class, this.f46158up)));
        }
    }

    /* JADX INFO: renamed from: ts */
    private void m64702ts() {
        a3u a3uVar = this.f46155to;
        if (a3uVar == null) {
            throw new ArgumentNullException("deserializationContext", "Something is wrong! DeserializationContext is not found!");
        }
        this.f46141du = new bjs(a3uVar.m3188ks(), null);
        C10652to c10652toM50970x1 = this.f46155to.m71950kk().m50970x1(this.f46151m9);
        this.f46146jd = c10652toM50970x1;
        if (c10652toM50970x1 == null) {
            throw new ArgumentOutOfRangeException("Can't recognize a Slide Container!");
        }
        this.f46167yj = c10652toM50970x1.m51763x1().m50827x1();
        if (this.f46146jd.m51762to() != null) {
            this.f46137bv = this.f46146jd.m51762to().m51835x1();
        }
        m64696e0();
        m64694bz();
        m64697g8();
        if (this.f46158up >= 4) {
            m64732to();
        }
        if (m64708bv()) {
            this.f46155to.m3199x1(this);
        }
    }

    /* JADX INFO: renamed from: wp */
    private void m64703wp() {
        MasterSlide masterSlide;
        Shape shapeM391k4;
        C10431f3 c10431f3 = (C10431f3) this.f46146jd;
        m4c m4cVarM64718k4 = m64718k4(0);
        if (m4cVarM64718k4 == null) {
            m4cVarM64718k4 = m64718k4(3);
        }
        m4c m4cVarM64718k42 = m64718k4(2);
        if (m4cVarM64718k42 == null) {
            m4cVarM64718k42 = m64718k4(1);
        }
        if (m4cVarM64718k42 == null && m4cVarM64718k4 != null && m4cVarM64718k4.m64714fa() == 2) {
            m4cVarM64718k42 = m4cVarM64718k4;
        }
        LayoutSlide layoutSlideM72530k4 = null;
        if (m4cVarM64718k42 != null) {
            if (this.f46155to.m3176ar() && m4cVarM64718k42.m64714fa() == 2) {
                m4cVarM64718k42 = m4cVarM64718k42.m64718k4(1);
            }
            if (m4cVarM64718k42 == null) {
                throw new NullReferenceException("Haven't original master for composite master slide!");
            }
            if (c10431f3.m50777jd() != null) {
                int iM51151kk = c10431f3.m50777jd().m51151kk();
                if (m4cVarM64718k42.m64726ks().containsKey(Integer.valueOf(iM51151kk))) {
                    layoutSlideM72530k4 = m4cVarM64718k42.m64726ks().get_Item(Integer.valueOf(iM51151kk));
                }
            }
            if (m4cVarM64718k4 == null) {
                throw new NullReferenceException("MasterSlide couldn't be empty.");
            }
            if (layoutSlideM72530k4 == null && m4cVarM64718k4.m64726ks().size() == 1) {
                layoutSlideM72530k4 = m4cVarM64718k4.m64726ks().getValues().get_Item(0);
            }
        }
        if (m4cVarM64718k42 != null) {
            m4cVarM64718k4 = m4cVarM64718k42;
        }
        if (m4cVarM64718k4 == null) {
            throw new NullReferenceException("Can't find any assigned MasterSlide!");
        }
        if (layoutSlideM72530k4 == null) {
            layoutSlideM72530k4 = (LayoutSlide) C7019kk.m27452k4((Object) m4cVarM64718k4.m64735up(), LayoutSlide.class);
        }
        if (layoutSlideM72530k4 == null && (masterSlide = (MasterSlide) C7019kk.m27452k4((Object) m4cVarM64718k4.m64735up(), MasterSlide.class)) != null) {
            byte bM6650k4 = gh7.m6650k4((C10487j0) this.f46139ck);
            layoutSlideM72530k4 = (LayoutSlide) masterSlide.getLayoutSlides().getByType(bM6650k4);
            if (layoutSlideM72530k4 == null) {
                layoutSlideM72530k4 = vtn.m72530k4(masterSlide, bM6650k4, m64712du());
                List.Enumerator<Shape> it = m64704x1(masterSlide).iterator();
                long j = 10;
                while (it.hasNext()) {
                    try {
                        Placeholder placeholder = (Placeholder) C7019kk.m27452k4((Object) it.next().getPlaceholder(), Placeholder.class);
                        if (hi8.m7179k4(placeholder) && (shapeM391k4 = layoutSlideM72530k4.m391k4(placeholder.getType())) != null) {
                            long j2 = 1 + j;
                            ((Placeholder) shapeM391k4.getPlaceholder()).m2270k4(j);
                            j = j2;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                ((SlideShowTransition) layoutSlideM72530k4.getSlideShowTransition()).m2752x1(masterSlide.getSlideShowTransition());
            }
        }
        if (layoutSlideM72530k4 == null) {
            throw new NullReferenceException("Can't find a Layout Slide!!!");
        }
        ((Slide) this.f46143fa).m2701k4(layoutSlideM72530k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static List<Shape> m64704x1(BaseSlide baseSlide) {
        List<Shape> list = new List<>();
        if (baseSlide != null) {
            m64698k4(baseSlide.f1077kk, list);
        }
        return list;
    }

    /* JADX INFO: renamed from: ak */
    public final List<Long> m64705ak() {
        return this.f46137bv;
    }

    /* JADX INFO: renamed from: ar */
    public final SortedList<Long, qah> m64706ar() {
        if (this.f46135ar == null) {
            this.f46135ar = new SortedList<>();
        }
        return this.f46135ar;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m64707b3() {
        return this.f46163x1;
    }

    /* JADX INFO: renamed from: bv */
    public final boolean m64708bv() {
        return this.f46158up <= 4;
    }

    /* JADX INFO: renamed from: c5 */
    public final C10495ji m64709c5() {
        return this.f46144h4;
    }

    /* JADX INFO: renamed from: ck */
    public final C10510kk m64710ck() {
        return this.f46139ck;
    }

    /* JADX INFO: renamed from: dq */
    public final IGenericDictionary<Byte, Placeholder> m64711dq() {
        if (this.f46165xk == null) {
            m64700ss();
        }
        return this.f46165xk;
    }

    /* JADX INFO: renamed from: du */
    public final a3u m64712du() {
        return this.f46155to;
    }

    /* JADX INFO: renamed from: dy */
    public final m4c m64713dy() {
        m4c m4cVarM64718k4 = m64718k4(1);
        return m4cVarM64718k4 == null ? m64718k4(0) : m4cVarM64718k4;
    }

    /* JADX INFO: renamed from: fa */
    public final int m64714fa() {
        return this.f46158up;
    }

    /* JADX INFO: renamed from: h4 */
    public final bjs m64715h4() {
        return this.f46141du;
    }

    /* JADX INFO: renamed from: ix */
    public final C10635sd m64716ix() {
        return this.f46145ix;
    }

    /* JADX INFO: renamed from: jd */
    public final C10652to m64717jd() {
        return this.f46146jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final m4c m64718k4(int i) {
        if (this.f46154rv.containsKey(Integer.valueOf(i))) {
            return this.f46154rv.get_Item(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final int m64724kk() {
        int i = this.f46140dq;
        this.f46140dq = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: ks */
    public final SortedList<Integer, LayoutSlide> m64726ks() {
        return this.f46150lr;
    }

    /* JADX INFO: renamed from: lr */
    public final boolean m64727lr() {
        return this.f46158up >= 7;
    }

    /* JADX INFO: renamed from: m9 */
    public final IGenericDictionary<Integer, m4c> m64728m9() {
        return this.f46154rv;
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC10456gv m64729ne() {
        return this.f46146jd.m51756du();
    }

    /* JADX INFO: renamed from: qq */
    public final Dictionary<IShape, C10703x1> m64730qq() {
        return this.f46153qq;
    }

    /* JADX INFO: renamed from: rv */
    public final cct m64731rv() {
        return this.f46152ne;
    }

    /* JADX INFO: renamed from: to */
    public final void m64732to() {
        IGenericDictionary<Integer, m4c> iGenericDictionaryM64728m9;
        int i;
        if (this.f46134ak) {
            return;
        }
        this.f46134ak = true;
        if (m64708bv()) {
            C10487j0 c10487j0 = (C10487j0) this.f46139ck;
            if ((c10487j0.m50978c5() & 4294967295L) != 0 && this.f46155to.m3193u4().containsKey(Long.valueOf(c10487j0.m50978c5()))) {
                m4c m4cVar = (m4c) C7019kk.m27452k4((Object) this.f46155to.m3193u4().get_Item(Long.valueOf(c10487j0.m50978c5())), m4c.class);
                if (m4cVar.m64714fa() == 3) {
                    iGenericDictionaryM64728m9 = m64728m9();
                    i = 3;
                } else {
                    iGenericDictionaryM64728m9 = m64728m9();
                    i = 0;
                }
                iGenericDictionaryM64728m9.addItem(i, m4cVar);
            }
        }
        if (m64737v4()) {
            C10676v0 c10676v0 = (C10676v0) this.f46139ck;
            if (this.f46155to.m3193u4().containsKey(Long.valueOf(c10676v0.m51837m9()))) {
                m4c m4cVar2 = (m4c) C7019kk.m27452k4((Object) this.f46155to.m3193u4().get_Item(Long.valueOf(c10676v0.m51837m9())), m4c.class);
                if (m64714fa() == 5) {
                    m64728m9().addItem(0, m4cVar2);
                    return;
                } else {
                    m64728m9().addItem(4, m4cVar2);
                    m4cVar2.m64728m9().addItem(6, this);
                    return;
                }
            }
            return;
        }
        if (m64727lr() && ((C10634sc) C7019kk.m27452k4((Object) this.f46146jd, C10634sc.class)) == null) {
            throw new NullReferenceException("Wrong type of source HandoutContainer!");
        }
        C10678v6 c10678v6 = (C10678v6) C7019kk.m27452k4((Object) this.f46146jd, C10678v6.class);
        if (c10678v6 != null) {
            if (c10678v6.m51363wl() != null && this.f46155to.m3176ar()) {
                m4c m4cVar3 = this.f46155to.m3195uz().get_Item(Long.valueOf(c10678v6.m51363wl().m51558x1())).m3202k4().get_Item(-1);
                if (m4cVar3 != this) {
                    this.f46158up = 2;
                    m64728m9().addItem(1, m4cVar3);
                }
            }
            if (c10678v6.m51846rv() != null && !m64707b3() && this.f46158up != 2) {
                this.f46158up = 1;
            }
        }
        C10431f3 c10431f3 = (C10431f3) C7019kk.m27452k4((Object) this.f46146jd, C10431f3.class);
        if (c10431f3 != null) {
            if (c10431f3.m50777jd() != null) {
                long jM51152x1 = c10431f3.m50777jd().m51152x1();
                if (this.f46155to.m3195uz().containsKey(Long.valueOf(jM51152x1))) {
                    m64728m9().addItem(1, this.f46155to.m3195uz().get_Item(Long.valueOf(jM51152x1)).m3202k4().get_Item(-1));
                }
            }
            if (c10431f3.m51363wl() != null) {
                long jM51558x1 = c10431f3.m51363wl().m51558x1();
                if (this.f46155to.m3195uz().containsKey(Long.valueOf(jM51558x1))) {
                    m64728m9().addItem(2, this.f46155to.m3195uz().get_Item(Long.valueOf(jM51558x1)).m3202k4().get_Item(-1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final List<C10395d2> m64733u4() {
        List<C10395d2> list = this.f46138c5;
        if (list != null) {
            return list;
        }
        List<C10395d2> listM52057k4 = this.f46142dy.m51969x1().m52057k4(this.f46151m9);
        this.f46138c5 = listM52057k4;
        if (listM52057k4 == null) {
            this.f46138c5 = new List<>();
        }
        return this.f46138c5;
    }

    /* JADX INFO: renamed from: um */
    public final BaseSlide m64734um() {
        return this.f46160v4;
    }

    /* JADX INFO: renamed from: up */
    public final BaseSlide m64735up() {
        if (this.f46143fa == null) {
            m64701sv();
        }
        return this.f46143fa;
    }

    /* JADX INFO: renamed from: uz */
    public final com.aspose.slides.Collections.Generic.IGenericCollection<qah> m64736uz() {
        if (this.f46164x6.m70643k4()) {
            this.f46164x6.m70647x1();
        }
        return this.f46161wl;
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m64737v4() {
        int i = this.f46158up;
        return i == 5 || i == 6;
    }

    /* JADX INFO: renamed from: wl */
    public final Dictionary<Long, qah> m64738wl() {
        return this.f46159uz;
    }

    /* JADX INFO: renamed from: wy */
    public final qxw m64739wy() {
        if (this.f46157um == null) {
            this.f46157um = qxw.m69802k4(this.f46143fa);
        }
        return this.f46157um;
    }

    /* JADX INFO: renamed from: x6 */
    public final C10738yu m64742x6() {
        return this.f46156u4;
    }

    /* JADX INFO: renamed from: xk */
    public final boolean m64743xk() {
        return this.f46155to.m3191qq();
    }

    /* JADX INFO: renamed from: yd */
    public final int m64744yd() {
        return this.f46162wy;
    }

    /* JADX INFO: renamed from: yj */
    public final jio[] m64745yj() {
        if (this.f46158up <= 3) {
            return this.f46149ks;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64719k4() {
        jio jioVar;
        yiz.m73915x1(this);
        for (jio jioVar2 : this.f46149ks) {
            if (jioVar2 != null && !jioVar2.m63326c5()) {
                int iM63328dy = jioVar2.m63328dy();
                if (iM63328dy >= 0 && (jioVar = this.f46149ks[iM63328dy]) != null) {
                    jioVar.m63330k4();
                    jioVar2.m63333k4(jioVar);
                }
                jioVar2.m63330k4();
                jioVar2.m63337x1();
            }
        }
        td3.m71107k4(this);
        for (jio jioVar3 : this.f46149ks) {
            if (jioVar3 != null) {
                jha.m63319x1(jioVar3);
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m64725kk(boolean z) {
        this.f46148kk = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64740x1() {
        BaseSlide baseSlide = this.f46160v4;
        if (baseSlide == null) {
            return;
        }
        this.f46143fa = baseSlide;
        this.f46160v4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64720k4(BaseSlide baseSlide) {
        if (baseSlide != null && this.f46160v4 == null) {
            this.f46160v4 = this.f46143fa;
            this.f46143fa = baseSlide;
            this.f46157um = null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64741x1(boolean z) {
        this.f46163x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64721k4(SortedList<Integer, m4c> sortedList) {
        m64732to();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64698k4(GroupShape groupShape, List<Shape> list) {
        IGenericEnumerator<IShape> it = groupShape.f2428k4.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                GroupShape groupShape2 = (GroupShape) C7019kk.m27452k4((Object) next, GroupShape.class);
                if (groupShape2 != null) {
                    m64698k4(groupShape2, list);
                } else if (next.getPlaceholder() != null) {
                    list.addItem((Shape) next);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64722k4(qah qahVar) {
        long jM69479c5 = qahVar.m69479c5();
        C12577yj<Long, qah> c12577yjM3178ix = m64712du().m3178ix();
        if (c12577yjM3178ix.containsKey(Long.valueOf(jM69479c5))) {
            jM69479c5 = m64712du().m3189lr();
            qahVar.m69487k4(jM69479c5);
        }
        c12577yjM3178ix.addItem(Long.valueOf(jM69479c5), qahVar);
        m64738wl().addItem(Long.valueOf(jM69479c5), qahVar);
        if (qahVar.m69484h4() == null || qahVar.m69484h4().m70151wl() == 4 || qahVar.m69484h4().m70151wl() == 7) {
            return;
        }
        this.f46161wl.addItem(qahVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64723k4(boolean z) {
        this.f46147k4 = z;
    }
}
