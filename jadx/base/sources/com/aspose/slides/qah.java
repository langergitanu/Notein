package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8713ru;
import com.aspose.slides.internal.p407st.AbstractC10376bv;
import com.aspose.slides.internal.p407st.AbstractC10458gz;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10355ai;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10361au;
import com.aspose.slides.internal.p407st.C10366b5;
import com.aspose.slides.internal.p407st.C10396d3;
import com.aspose.slides.internal.p407st.C10433f7;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10504k5;
import com.aspose.slides.internal.p407st.C10511kn;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10553n2;
import com.aspose.slides.internal.p407st.C10560nh;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10617r7;
import com.aspose.slides.internal.p407st.C10662u5;
import com.aspose.slides.internal.p407st.C10684vt;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p407st.C10749ze;
import com.aspose.slides.internal.p407st.InterfaceC10392cw;
import com.aspose.slides.internal.p464vq.C11708b5;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class qah {

    /* JADX INFO: renamed from: c5 */
    private ri7 f48275c5;

    /* JADX INFO: renamed from: ck */
    private C11708b5 f48276ck;

    /* JADX INFO: renamed from: du */
    private sil f48277du;

    /* JADX INFO: renamed from: fa */
    private C8713ru f48279fa;

    /* JADX INFO: renamed from: k4 */
    private boolean f48282k4;

    /* JADX INFO: renamed from: kk */
    private C10462h9 f48283kk;

    /* JADX INFO: renamed from: ks */
    private C0946ee f48284ks;

    /* JADX INFO: renamed from: to */
    private m4c f48286to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC10458gz f48288x1;

    /* JADX INFO: renamed from: h4 */
    private int f48280h4 = -1;

    /* JADX INFO: renamed from: m9 */
    private long f48285m9 = 0;

    /* JADX INFO: renamed from: dy */
    private long f48278dy = 0;

    /* JADX INFO: renamed from: jd */
    private qah f48281jd = null;

    /* JADX INFO: renamed from: up */
    private boolean f48287up = false;

    /* JADX INFO: renamed from: yj */
    private boolean f48289yj = false;

    public qah(AbstractC10458gz abstractC10458gz, Object obj) {
        this.f48288x1 = abstractC10458gz;
        m69488k4(true);
        m69470k4(obj);
        m69486k4();
        m69472ne();
        m69478x6();
    }

    /* JADX INFO: renamed from: ar */
    private void m69467ar() {
        C10462h9 c10462h9;
        C10358am c10358amMo50862jd = m69489kk().mo50862jd();
        if (c10358amMo50862jd != null) {
            C10553n2 c10553n2M50433rv = c10358amMo50862jd.m50433rv();
            C10361au c10361auM50432ne = c10358amMo50862jd.m50432ne();
            if (c10553n2M50433rv == null || c10361auM50432ne == null) {
                return;
            }
            if (m69493to().m64714fa() >= 2) {
                m4c m4cVarM64713dy = m69493to().m64713dy();
                if (m4cVarM64713dy.m64706ar().containsKey(Long.valueOf(c10553n2M50433rv.m51348x1())) && (c10462h9 = (C10462h9) C7019kk.m27452k4((Object) m4cVarM64713dy.m64706ar().get_Item(Long.valueOf(c10553n2M50433rv.m51348x1())).m69489kk(), C10462h9.class)) != null && c10361auM50432ne.m50444k4(c10462h9.mo50862jd().m50432ne())) {
                    m69488k4(false);
                    return;
                }
                return;
            }
            if (!m69493to().m64706ar().containsKey(Long.valueOf(c10553n2M50433rv.m51348x1()))) {
                m69493to().m64706ar().addItem(Long.valueOf(c10553n2M50433rv.m51348x1()), this);
            } else if (m69493to().m64706ar().get_Item(Long.valueOf(c10553n2M50433rv.m51348x1())).m69489kk().mo50864to().m52040kk()) {
                m69493to().m64706ar().set_Item(Long.valueOf(c10553n2M50433rv.m51348x1()), this);
            }
        }
    }

    /* JADX INFO: renamed from: bv */
    private void m69468bv() {
        if (m69489kk() == null) {
            return;
        }
        a3u a3uVarM64712du = m69493to().m64712du();
        if (m69490ks()) {
            byte[] bArrM66934jd = C14080ne.m66934jd(this.f48279fa.m40563x1());
            if (this.f48284ks == null) {
                this.f48284ks = new C0946ee(this);
            }
            boolean zM5501k4 = this.f48284ks.m5501k4(bArrM66934jd, false);
            this.f48289yj = zM5501k4;
            if (!zM5501k4) {
                this.f48289yj = this.f48284ks.m5501k4(bArrM66934jd, true) | zM5501k4;
            }
            if (this.f48289yj) {
                return;
            }
            a3uVarM64712du.f3770x1++;
            if (this.f48284ks.m5499h4().size() > 0) {
                if (this.f48284ks.m5499h4().size() == 1) {
                    a3uVarM64712du.m3184k4(C14113y2.m67408k4("Problem description | ", this.f48284ks.m5499h4().get_Item(0)));
                    return;
                }
                List.Enumerator<String> it = this.f48284ks.m5499h4().iterator();
                while (it.hasNext()) {
                    try {
                        a3uVarM64712du.m3184k4(C14113y2.m67408k4(C14113y2.m67389k4(ControlChar.SPACE_CHAR, 25), it.next()));
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ix */
    private boolean m69469ix() {
        if (!m69489kk().mo50863m9().m51975to()) {
            return false;
        }
        this.f48280h4 = 4;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX INFO: renamed from: ne */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m69472ne() {
        if (this.f48280h4 == 1) {
            if (m69489kk().mo50863m9() == null || m69469ix()) {
                return;
            }
            m69474u4();
            return;
        }
        C10534m3 c10534m3Mo50859du = m69489kk().mo50859du();
        int iM52025c5 = m69489kk().mo50864to().m52025c5();
        if (this.f48277du == null && m69489kk().mo50864to().m52042m9()) {
            this.f48280h4 = 0;
            return;
        }
        boolean z = C7019kk.m27452k4((Object) m69484h4(), zsn.class) != null;
        if (iM52025c5 != 0) {
            if (iM52025c5 == 1 || iM52025c5 == 3) {
                if (z) {
                    this.f48280h4 = 5;
                    return;
                }
                this.f48280h4 = 3;
            } else if (iM52025c5 != 20) {
                if (iM52025c5 != 75) {
                    if (iM52025c5 != 202) {
                        if (iM52025c5 < 32 || iM52025c5 > 40) {
                            this.f48280h4 = 3;
                        } else {
                            this.f48280h4 = 8;
                        }
                    }
                    if (z) {
                    }
                    this.f48280h4 = 3;
                } else if (c10534m3Mo50859du == null || C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.INTENSE_EMPHASIS, C10355ai.class) == null) {
                    this.f48280h4 = 3;
                } else {
                    this.f48280h4 = 9;
                }
            } else {
                if (z) {
                    this.f48280h4 = 6;
                    return;
                }
                this.f48280h4 = 8;
            }
        } else if (c10534m3Mo50859du == null || !c10534m3Mo50859du.m51263x1().m50931x1(StyleIdentifier.LIST_TABLE_4)) {
            this.f48280h4 = 2;
        }
        if (((C10462h9) m69489kk()).m50882ks() != 0) {
            this.f48280h4 = 9;
        }
        C10433f7 c10433f7M51703h4 = m69493to().m64712du().m71951m9().m51703h4();
        if (m69489kk().mo50862jd() == null || m69489kk().mo50862jd().m50426du() == null || c10433f7M51703h4 == null) {
            return;
        }
        long jM51229x1 = m69489kk().mo50862jd().m50426du().m51229x1();
        InterfaceC10392cw interfaceC10392cwM50781k4 = c10433f7M51703h4.m50781k4(jM51229x1);
        if (interfaceC10392cwM50781k4 != 0 && interfaceC10392cwM50781k4.mo50535to() != null) {
            C10504k5 c10504k5M50963kk = m69493to().m64712du().m71950kk().m50963kk(interfaceC10392cwM50781k4.mo50535to().m50734to());
            if (c10504k5M50963kk != null) {
                AbstractC10376bv abstractC10376bv = (AbstractC10376bv) interfaceC10392cwM50781k4;
                int iM51404bv = abstractC10376bv.m51404bv() & 65535;
                if (iM51404bv == 4044 || iM51404bv == 4046) {
                    this.f48280h4 = 14;
                    c9v c9vVar = new c9v(this);
                    this.f48275c5 = c9vVar;
                    c9vVar.m4519k4(abstractC10376bv, c10504k5M50963kk);
                    return;
                }
                if (iM51404bv != 4078) {
                    throw new ArgumentOutOfRangeException("pptExContainer");
                }
                this.f48280h4 = 15;
                oei oeiVar = new oei(this);
                this.f48275c5 = oeiVar;
                oeiVar.m4519k4(abstractC10376bv, c10504k5M50963kk);
                return;
            }
        }
        C10396d3 c10396d3M50784x1 = c10433f7M51703h4.m50784x1(jM51229x1);
        if (c10396d3M50784x1 != null) {
            this.f48280h4 = 13;
            nk4 nk4Var = new nk4(this);
            this.f48275c5 = nk4Var;
            nk4Var.m68064k4(c10396d3M50784x1);
            return;
        }
        AbstractC10376bv abstractC10376bvM50782kk = c10433f7M51703h4.m50782kk(jM51229x1);
        if (abstractC10376bvM50782kk != null) {
            C10366b5 c10366b5 = (C10366b5) C7019kk.m27452k4((Object) abstractC10376bvM50782kk, C10366b5.class);
            C10617r7 c10617r7 = (C10617r7) C7019kk.m27452k4((Object) abstractC10376bvM50782kk, C10617r7.class);
            if (c10366b5 != null) {
                this.f48280h4 = 10;
                nk4 nk4Var2 = new nk4(this);
                this.f48275c5 = nk4Var2;
                nk4Var2.m68064k4(c10366b5);
                return;
            }
            if (c10617r7 != null) {
                this.f48280h4 = 11;
                nk4 nk4Var3 = new nk4(this);
                this.f48275c5 = nk4Var3;
                nk4Var3.m68064k4(c10617r7);
                return;
            }
            return;
        }
        C10560nh c10560nh = (C10560nh) C7019kk.m27452k4((Object) c10433f7M51703h4.m50783to(jM51229x1), C10560nh.class);
        if (c10560nh != null) {
            this.f48280h4 = 11;
            nk4 nk4Var4 = new nk4(this);
            this.f48275c5 = nk4Var4;
            nk4Var4.m68064k4(c10560nh);
            return;
        }
        C10662u5 c10662u5 = (C10662u5) C7019kk.m27452k4((Object) c10433f7M51703h4.m50779du(jM51229x1), C10662u5.class);
        if (c10662u5 != null) {
            this.f48280h4 = 12;
            nk4 nk4Var5 = new nk4(this);
            this.f48275c5 = nk4Var5;
            nk4Var5.m68064k4(c10662u5);
        }
    }

    /* JADX INFO: renamed from: qq */
    private void m69473qq() {
        C10609qn c10609qn;
        if (m69489kk().mo50864to() != null) {
            long jM52045x1 = m69489kk().mo50864to().m52045x1();
            this.f48285m9 = jM52045x1;
            if ((jM52045x1 & 4294967295L) >= (m69493to().m64712du().m3177bv() & 4294967295L)) {
                m69493to().m64712du().m3198x1(((this.f48285m9 & 4294967295L) + 1) & 4294967295L);
            }
        }
        C10534m3 c10534m3Mo50859du = m69489kk().mo50859du();
        if (c10534m3Mo50859du == null || (c10609qn = (C10609qn) c10534m3Mo50859du.m51263x1().m50923k4(769)) == null || (4294967295L & c10609qn.m51597ar()) == 0 || !m69493to().m64712du().m3178ix().containsKey(Long.valueOf(c10609qn.m51597ar()))) {
            return;
        }
        this.f48281jd = m69493to().m64712du().m3178ix().get_Item(Long.valueOf(c10609qn.m51597ar()));
    }

    /* JADX INFO: renamed from: u4 */
    private boolean m69474u4() {
        C10749ze c10749ze;
        if (!m69489kk().mo50863m9().m51976x1().m50931x1(1280) || (c10749ze = (C10749ze) C7019kk.m27452k4((Object) m69489kk().mo50863m9().m51976x1().m50923k4(1284), C10749ze.class)) == null || (c10749ze.m52134to() & 65535) < 1 || m69476uz()) {
            return false;
        }
        this.f48280h4 = 7;
        return true;
    }

    /* JADX INFO: renamed from: um */
    private void m69475um() {
        if (m69493to() == null) {
            return;
        }
        C10711xc c10711xcMo50863m9 = m69489kk().mo50863m9();
        if (m69493to().m64743xk() || c10711xcMo50863m9 == null || C7019kk.m27452k4((Object) c10711xcMo50863m9.m51976x1().m50923k4(937), C10355ai.class) == null) {
            return;
        }
        m69493to().m64712du().f3762k4++;
        String strM67400k4 = C14113y2.m67400k4(C14113y2.m67400k4(m69493to().m64709c5() != null ? C14113y2.m67400k4("[+] ", C14113y2.m67408k4("Slide: 0x", C14114y9.m67460k4(m69493to().m64709c5().m51011to(), "X6"), " | ")) : "[+] ", C14113y2.m67408k4("ShapeID: 0x", C14114y9.m67460k4(m69479c5(), "X4"), " | ")), C14113y2.m67408k4("Type: 0x", C14057f9.m66587k4(m69489kk().mo50864to().m52025c5(), "X4"), " [", C14042ak.m66410k4(C10684vt.class, m69489kk().mo50864to().m52025c5()), "]"));
        C10355ai c10355ai = (C10355ai) C7019kk.m27452k4((Object) c10711xcMo50863m9.m51976x1().m50923k4(937), C10355ai.class);
        if (c10355ai == null || c10355ai.mo50423x1().length <= 1) {
            return;
        }
        try {
            C11708b5 c11708b5 = new C11708b5(new C3152yj(c10355ai.mo50423x1()), new AbstractC3174jd() { // from class: com.aspose.slides.qah.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(qah.this.m69493to().m64712du().m71955yj()) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                }

                @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                /* JADX INFO: renamed from: k4 */
                public void mo4791k4() {
                    qah.this.m69493to().m64712du().m71955yj().throwIfInterruptionRequested();
                }
            });
            this.f48276ck = c11708b5;
            this.f48279fa = new C14671vb(c11708b5.m55284up(), m69493to().m64712du().m3188ks()).m72163k4();
            m69471k4(strM67400k4);
        } catch (RuntimeException e) {
            m69493to().m64712du().m3184k4(strM67400k4);
            m69493to().m64712du().m3184k4(C14113y2.m67408k4("    Exception on loading of ModernBlob package: ", e.getMessage()));
        }
        if (this.f48287up) {
            m69468bv();
        }
    }

    /* JADX INFO: renamed from: uz */
    private boolean m69476uz() {
        C10511kn c10511kn = (C10511kn) C7019kk.m27452k4((Object) this.f48288x1, C10511kn.class);
        if (c10511kn == null) {
            return true;
        }
        List list = new List();
        com.aspose.slides.internal.p284mx.OooO0O0.OooO00o(75, list, 3, 1, 2);
        com.aspose.slides.internal.p284mx.OooO0O0.OooO00o(23, list, 8, 42, 20);
        list.addItem(32);
        list.addItem(33);
        list.addItem(34);
        List.Enumerator<AbstractC10571o4> it = c10511kn.m50513yj().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                if (z) {
                    C10462h9 c10462h9 = (C10462h9) C7019kk.m27452k4((Object) next, C10462h9.class);
                    if (c10462h9 == null) {
                        return true;
                    }
                    if (c10462h9.mo50864to() == null) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return true;
                    }
                    if (!list.containsItem(Integer.valueOf(c10462h9.mo50864to().m52025c5()))) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return true;
                    }
                } else {
                    z = true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return false;
    }

    /* JADX INFO: renamed from: wl */
    private void m69477wl() {
        int i = this.f48280h4;
        this.f48275c5 = i != 0 ? i != 1 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? new ri7(this) : new g9n(this) : new gyt(this) : new nsh(this) : new zsn(this) : new sil(this) : new cct(this);
    }

    /* JADX INFO: renamed from: x6 */
    private void m69478x6() {
        if (m69493to() == null || m69484h4() == null) {
            return;
        }
        if ((this.f48285m9 & 4294967295L) == 0) {
            m69487k4(m69493to().m64712du().m3189lr());
        }
        m69493to().m64722k4(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final long m69479c5() {
        return this.f48285m9;
    }

    /* JADX INFO: renamed from: ck */
    public final qah m69480ck() {
        return this.f48281jd;
    }

    /* JADX INFO: renamed from: du */
    public final ri7 m69481du() {
        if (this.f48275c5 == null) {
            m69477wl();
        }
        return this.f48275c5;
    }

    /* JADX INFO: renamed from: dy */
    public final int m69482dy() {
        return this.f48280h4;
    }

    /* JADX INFO: renamed from: fa */
    public final C11708b5 m69483fa() {
        return this.f48276ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final sil m69484h4() {
        return this.f48277du;
    }

    /* JADX INFO: renamed from: jd */
    public final long m69485jd() {
        return this.f48278dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m69486k4() {
        C10462h9 c10462h9 = (C10462h9) C7019kk.m27452k4((Object) this.f48288x1, C10462h9.class);
        this.f48283kk = c10462h9;
        if (c10462h9 == null) {
            this.f48280h4 = 1;
            this.f48283kk = (C10462h9) C7019kk.m27452k4((Object) this.f48288x1.m50513yj().get_Item(0), C10462h9.class);
        }
        if (this.f48283kk == null) {
            throw new NullReferenceException("Shape container with data not found!");
        }
        m69473qq();
        m69475um();
        m69467ar();
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC10458gz m69489kk() {
        return this.f48283kk;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m69490ks() {
        C8713ru c8713ru = this.f48279fa;
        return (c8713ru == null || C14113y2.m67411k4(c8713ru.m40563x1())) ? false : true;
    }

    /* JADX INFO: renamed from: m9 */
    public final ShapeCollection m69491m9() {
        return m69484h4().m70645m9();
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m69492rv() {
        return this.f48282k4;
    }

    /* JADX INFO: renamed from: to */
    public final m4c m69493to() {
        return this.f48286to;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m69494up() {
        return this.f48287up;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC10458gz m69495x1() {
        return this.f48288x1;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m69497yj() {
        return this.f48289yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69487k4(long j) {
        this.f48285m9 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69496x1(long j) {
        this.f48278dy = j;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69470k4(Object obj) {
        this.f48286to = (m4c) C7019kk.m27452k4(obj, m4c.class);
        sil silVar = (sil) C7019kk.m27452k4(obj, sil.class);
        this.f48277du = silVar;
        if (silVar != null) {
            this.f48286to = silVar.m70149up();
            this.f48277du.m70642h4().addItem(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m69471k4(String str) {
        if (m69489kk() == null) {
            return;
        }
        a3u a3uVarM64712du = m69493to().m64712du();
        if (this.f48284ks == null) {
            this.f48284ks = new C0946ee(this);
        }
        boolean zM5500k4 = this.f48284ks.m5500k4(C14080ne.m66934jd(this.f48279fa.m40558k4()));
        this.f48287up = zM5500k4;
        if (zM5500k4) {
            return;
        }
        a3uVarM64712du.f3770x1++;
        if (this.f48284ks.m5499h4().size() > 0) {
            if (this.f48284ks.m5499h4().size() == 1) {
                a3uVarM64712du.m3184k4(C14113y2.m67408k4("Problem description | ", this.f48284ks.m5499h4().get_Item(0)));
                return;
            }
            List.Enumerator<String> it = this.f48284ks.m5499h4().iterator();
            while (it.hasNext()) {
                try {
                    a3uVarM64712du.m3184k4(C14113y2.m67408k4(C14113y2.m67389k4(ControlChar.SPACE_CHAR, 25), it.next()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69488k4(boolean z) {
        this.f48282k4 = z;
    }
}
