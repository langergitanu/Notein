package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13849aa;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13858b3;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13972s7;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.zz */
/* JADX INFO: loaded from: classes5.dex */
public final class C13334zz extends C12957dy {

    /* JADX INFO: renamed from: c5 */
    private C13858b3 f44691c5;

    /* JADX INFO: renamed from: ck */
    private C13890ei f44692ck;

    /* JADX INFO: renamed from: fa */
    private C13950o3 f44693fa;

    /* JADX INFO: renamed from: jd */
    private Hashtable f44694jd;

    /* JADX INFO: renamed from: ks */
    private C13256vw f44695ks;

    /* JADX INFO: renamed from: rv */
    private C12915bu f44696rv;

    /* JADX INFO: renamed from: up */
    private boolean f44697up;

    /* JADX INFO: renamed from: yj */
    private Hashtable f44698yj;

    public C13334zz(C12957dy c12957dy) {
        super(c12957dy);
        this.f44692ck = C13890ei.f46456k4;
        this.f44697up = false;
        this.f44696rv = null;
        m61976ks();
    }

    /* JADX INFO: renamed from: ar */
    private void m61968ar() {
        if (this.f43552to.f44256dy.m61288yj()) {
            for (int i = 0; i < this.f43552to.f44256dy.m61279u4().size(); i++) {
                this.f43554x1.m65033k4((C13061k5) this.f43552to.f44256dy.m61279u4().get_Item(i));
            }
        }
        if (this.f43552to.f44256dy.m61273ks()) {
            try {
                this.f43552to.f44256dy.m61265k4(this.f44694jd, this.f43554x1.m65043s7());
            } catch (XmlSchemaException e) {
                e.setSource(this.f43554x1.mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
                m60268k4(e);
            }
        }
        if (this.f43552to.f44256dy.m61429b3() != null) {
            this.f43544dy = true;
            this.f43551m9 = false;
            this.f43546h4 = C14113y2.f47374k4;
            this.f43543du.m26801k4(0);
        }
    }

    /* JADX INFO: renamed from: bv */
    private void m61969bv() {
        if (this.f44691c5.m65182to() > 1) {
            this.f44691c5.m65183x1();
            this.f43552to = (C13190rs) this.f44691c5.m65181kk();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r7.f43548k4.m61882k4(r1, m60261ck());
        m60262du().m61750k4(r4, r1, null, false);
     */
    /* JADX INFO: renamed from: ix */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61970ix() {
        if (this.f44696rv.m60116to()) {
            return;
        }
        this.f44696rv.m60112k4();
        C13322zd c13322zdM60115kk = this.f44696rv.m60115kk();
        if (c13322zdM60115kk != null && c13322zdM60115kk.m61889rv() == 0) {
            Dictionary.KeyCollection.Enumerator<String, Boolean> it = c13322zdM60115kk.m61872fa().getKeys().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!this.f43548k4.m61886kk(next)) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        this.f44696rv = null;
    }

    /* JADX INFO: renamed from: ks */
    private void m61976ks() {
        C13950o3 c13950o3Mo65017bz = this.f43554x1.mo65017bz();
        this.f44693fa = c13950o3Mo65017bz;
        if (c13950o3Mo65017bz == null) {
            this.f44693fa = new C13950o3(m60265h4());
            this.f44697up = true;
        }
        this.f44691c5 = new C13858b3(10);
        this.f43543du = new C6765kp();
        C13890ei c13890ei = C13890ei.f46456k4;
        this.f44692ck = c13890ei;
        this.f44694jd = new Hashtable();
        m61972k4(c13890ei);
        this.f43548k4 = new C13322zd();
        this.f43544dy = false;
    }

    /* JADX INFO: renamed from: ne */
    private boolean m61977ne() {
        return this.f44696rv != null;
    }

    /* JADX INFO: renamed from: qq */
    private void m61978qq() {
        C13849aa c13849aa;
        Object objM61429b3;
        C13125nk c13125nk = this.f43552to.f44256dy;
        if (c13125nk != null) {
            if (c13125nk.m61451yd() != null) {
                c13849aa = this.f43554x1;
                objM61429b3 = this.f43552to.f44256dy.m61451yd();
            } else {
                c13849aa = this.f43554x1;
                objM61429b3 = this.f43552to.f44256dy.m61429b3();
            }
            c13849aa.m65032k4(objM61429b3);
            if (this.f43554x1.mo65048u4()) {
                C13190rs c13190rs = this.f43552to;
                if (!c13190rs.f44260k4 && c13190rs.f44256dy.m61431dq() != null) {
                    this.f43554x1.m65056x1(this.f43552to.f44256dy.m61431dq());
                    this.f43552to.f44260k4 = true;
                }
            }
            if (this.f43552to.f44256dy.m61273ks()) {
                this.f44694jd.clear();
            }
        }
        if (this.f43554x1.mo65035kk()) {
            do {
                if (this.f43554x1.mo65050up() != m60279m9().f43916du) {
                    try {
                        this.f43554x1.m65032k4((Object) null);
                        C13061k5 c13061k5M61875k4 = this.f43548k4.m61875k4(this.f43552to.f44256dy, m61986x1(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up()));
                        if (c13061k5M61875k4 != null) {
                            C13125nk c13125nk2 = this.f43552to.f44256dy;
                            if (c13125nk2 != null && c13125nk2.m61273ks()) {
                                this.f44694jd.addItem(c13061k5M61875k4.m61443qq(), c13061k5M61875k4);
                            }
                            this.f43554x1.m65032k4(c13061k5M61875k4.m61451yd() != null ? c13061k5M61875k4.m61451yd() : c13061k5M61875k4.m61429b3());
                            if (c13061k5M61875k4.m61429b3() != null) {
                                m61973k4(this.f43554x1.mo65042rv(), c13061k5M61875k4);
                            }
                        }
                    } catch (XmlSchemaException e) {
                        e.setSource(this.f43554x1.mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
                        m60268k4(e);
                    }
                }
            } while (this.f43554x1.mo65047to());
            this.f43554x1.mo65020du();
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m61979rv() {
        this.f43549kk.m65290x1(this.f43554x1.mo65023fa(), AbstractC12892ae.m60011k4(this.f43554x1.mo65050up(), m60265h4(), m60279m9()));
        m61987x6();
        if (!m60279m9().m61016kk(this.f43549kk.m65289x1(), this.f43549kk.m65284k4()) || this.f43554x1.mo65058x6() <= 0) {
            m61981u4();
            return;
        }
        C12915bu c12915bu = new C12915bu(2, m60265h4(), m60279m9(), m60261ck());
        this.f44696rv = c12915bu;
        c12915bu.m60118x1(this.f43554x1, null);
        this.f44696rv.m60116to();
    }

    /* JADX INFO: renamed from: to */
    private void m61980to(String str) throws Throwable {
        if (this.f43548k4.m61872fa().containsKey(str) || m60260c5() == null) {
            return;
        }
        C13322zd c13322zdM61756x1 = m60262du() != null ? m60262du().m61756x1(str) : null;
        if (c13322zdM61756x1 == null) {
            m61975kk(str);
        } else {
            if (c13322zdM61756x1.m61869ck() != 2) {
                throw new XmlException("Unsupported combination of validation types.", C14113y2.f47374k4, m60263dy().ah_(), m60263dy().ai_());
            }
            this.f43548k4.m61882k4(c13322zdM61756x1, m60261ck());
        }
    }

    /* JADX INFO: renamed from: u4 */
    private void m61981u4() {
        m61972k4(this.f43549kk);
        if (this.f44697up) {
            this.f44693fa.mo65709to();
        }
        this.f43552to.f44256dy = m61985wl();
        if (this.f43552to.f44256dy != null) {
            m61978qq();
            m61968ar();
            C13190rs c13190rs = this.f43552to;
            c13190rs.f44261kk = true;
            c13190rs.f44256dy.m61276rv().mo60052k4(this.f43552to);
        }
    }

    /* JADX INFO: renamed from: um */
    private boolean m61982um() {
        return this.f43548k4.m61869ck() != 0;
    }

    /* JADX INFO: renamed from: uz */
    private void m61983uz() {
        if (this.f44697up) {
            this.f44693fa.mo65709to();
        }
        C13190rs c13190rs = this.f43552to;
        C13125nk c13125nk = c13190rs.f44256dy;
        if (c13125nk != null) {
            if (c13190rs.f44261kk && !c13125nk.m61276rv().mo60053x1(this.f43552to)) {
                C13190rs c13190rs2 = this.f43552to;
                AbstractC13319z7 abstractC13319z7M60261ck = m60261ck();
                C13849aa c13849aa = this.f43554x1;
                C12962eb.m60314k4(c13190rs2, abstractC13319z7M60261ck, c13849aa, c13849aa.mo65040ne(), m60263dy().ah_(), m60263dy().ai_(), (C13129ny) null);
            }
            if (this.f43544dy) {
                m61973k4(!this.f43551m9 ? this.f43546h4 : this.f43543du.toString(), (C13061k5) null);
                this.f43544dy = false;
                this.f43543du.m26801k4(0);
                this.f43546h4 = C14113y2.f47374k4;
            }
        }
        m61969bv();
    }

    /* JADX INFO: renamed from: v4 */
    private void m61984v4() {
        C13256vw c13256vw = this.f44695ks;
        while (c13256vw != null) {
            if (mo60267k4(c13256vw.f44431k4) == null) {
                m60268k4(new XmlSchemaException("Reference to undeclared ID is '{0}'.", c13256vw.f44431k4, this.f43554x1.mo65040ne(), c13256vw.f44434x1, c13256vw.f44432kk));
            }
            C13256vw c13256vw2 = c13256vw.f44433to;
            c13256vw.f44433to = null;
            c13256vw = c13256vw2;
        }
        this.f44695ks = null;
    }

    /* JADX INFO: renamed from: wl */
    private C13125nk m61985wl() throws Throwable {
        if (this.f43554x1.mo65058x6() == 0) {
            m61980to(C14113y2.f47374k4);
        }
        if (this.f43554x1.mo65035kk()) {
            do {
                String strMo65050up = this.f43554x1.mo65050up();
                String strMo65023fa = this.f43554x1.mo65023fa();
                if (C13851ai.m65152k4(strMo65050up, m60279m9().f43916du)) {
                    m61980to(this.f43554x1.mo65042rv());
                    if (this.f44697up) {
                        this.f44693fa.mo65707k4(this.f43554x1.mo65060yj().length() == 0 ? C14113y2.f47374k4 : this.f43554x1.mo65023fa(), this.f43554x1.mo65042rv());
                    }
                }
                if (C13851ai.m65152k4(strMo65050up, m60279m9().f43936ix.m65284k4()) && C13851ai.m65152k4(strMo65023fa, m60279m9().f43936ix.m65289x1())) {
                    C13849aa c13849aa = this.f43554x1;
                    c13849aa.m65032k4(AbstractC12892ae.m60013x1(c13849aa.mo65042rv()));
                }
            } while (this.f43554x1.mo65047to());
            this.f43554x1.mo65020du();
        }
        C13125nk c13125nkM61894x1 = this.f43548k4.m61894x1(this.f43549kk);
        if (c13125nkM61894x1 == null && this.f43548k4.m61872fa().containsKey(this.f43552to.f44254ck)) {
            C13190rs c13190rs = this.f43552to;
            m60273k4("The '{0}' element is not declared.", C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck));
        }
        return c13125nkM61894x1;
    }

    /* JADX INFO: renamed from: x1 */
    private C13890ei m61986x1(String str, String str2) {
        return new C13890ei(str, AbstractC12892ae.m60011k4(str2, m60265h4(), m60279m9()));
    }

    /* JADX INFO: renamed from: x6 */
    private void m61987x6() {
        C13190rs c13190rs = this.f43552to;
        if (c13190rs.f44261kk) {
            int[] iArr = {0};
            c13190rs.f44256dy.m61276rv().mo60051k4(this.f43549kk, this.f43552to, iArr);
            if (iArr[0] < 0) {
                C13890ei c13890ei = this.f43549kk;
                C13190rs c13190rs2 = this.f43552to;
                AbstractC13319z7 abstractC13319z7M60261ck = m60261ck();
                C13849aa c13849aa = this.f43554x1;
                C12962eb.m60316k4(c13890ei, c13190rs2, abstractC13319z7M60261ck, c13849aa, c13849aa.mo65040ne(), m60263dy().ah_(), m60263dy().ai_(), null);
            }
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: k4 */
    public Object mo60267k4(String str) {
        Hashtable hashtable = this.f44698yj;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get_Item(str);
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: kk */
    public void mo60278kk() {
        if (m61982um()) {
            m61984v4();
        } else {
            m60269k4(new XmlSchemaException("No validation occurred.", C14113y2.f47374k4), 1);
        }
    }

    public C13334zz(C13849aa c13849aa, C13287xo c13287xo, InterfaceC13972s7 interfaceC13972s7) {
        super(c13849aa, c13287xo, interfaceC13972s7);
        this.f44692ck = C13890ei.f46456k4;
        this.f44697up = false;
        this.f44696rv = null;
        m61976ks();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61971k4(int i, String str) {
        if (i == 1) {
            if (mo60267k4(str) != null) {
                m60273k4("'{0}' is already used as an ID.", str);
                return;
            } else {
                m61988k4(str, (Object) this.f43552to.f44259jd);
                return;
            }
        }
        if (i != 2) {
            if (i != 4) {
                return;
            }
            C12957dy.m60258k4(this.f43548k4, str, this, m60261ck(), this.f43554x1.mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
        } else if (mo60267k4(str) == null) {
            this.f44695ks = new C13256vw(this.f44695ks, str, m60263dy().ah_(), m60263dy().ai_());
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0068: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:14:0x0068 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[PHI: r5
      0x0084: PHI (r5v4 com.aspose.slides.ms.System.Xml.ms) = (r5v3 com.aspose.slides.ms.System.Xml.ms), (r5v5 com.aspose.slides.ms.System.Xml.ms) binds: [B:26:0x0082, B:29:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61975kk(String str) throws Throwable {
        C13938ms c13938ms;
        AbstractC13912i5 abstractC13912i5;
        C13322zd c13322zdM60115kk;
        if (C13206so.m61582x1(str)) {
            AbstractC13912i5 abstractC13912i52 = null;
            try {
                try {
                    C14062gk c14062gkMo65674k4 = m60260c5().mo65674k4(m60266jd(), C14113y2.m67422kk(str, 9));
                    c13938ms = new C13938ms(c14062gkMo65674k4.toString(), (AbstractC3150x6) m60260c5().mo5312k4(c14062gkMo65674k4, null, null), m60265h4());
                    try {
                        c13938ms.m65615k4(m60260c5());
                        C12915bu c12915bu = new C12915bu(2, m60265h4(), m60279m9(), m60261ck());
                        c12915bu.m60114k4(m60260c5());
                        c12915bu.m60113k4(c13938ms, str);
                        while (c13938ms.mo65026h4()) {
                        }
                        c13322zdM60115kk = c12915bu.m60115kk();
                        c13938ms.mo65049um();
                    } catch (XmlSchemaException e) {
                        e = e;
                        m60276k4("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{str, e.getMessage()}, 0);
                        if (c13938ms != null) {
                            c13938ms.mo65049um();
                        }
                        c13322zdM60115kk = null;
                    } catch (RuntimeException e2) {
                        e = e2;
                        m60276k4("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{str, e.getMessage()}, 1);
                        if (c13938ms != null) {
                        }
                        c13322zdM60115kk = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    abstractC13912i52 = abstractC13912i5;
                    if (abstractC13912i52 != null) {
                        abstractC13912i52.mo65049um();
                    }
                    throw th;
                }
            } catch (XmlSchemaException e3) {
                e = e3;
                c13938ms = null;
            } catch (RuntimeException e4) {
                e = e4;
                c13938ms = null;
            } catch (Throwable th2) {
                th = th2;
                if (abstractC13912i52 != null) {
                }
                throw th;
            }
            if (c13322zdM60115kk == null || c13322zdM60115kk.m61889rv() != 0) {
                return;
            }
            this.f43548k4.m61882k4(c13322zdM60115kk, m60261ck());
            m60262du().m61750k4(str, c13322zdM60115kk, null, false);
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: x1 */
    public void mo60282x1() {
        if (m61977ne()) {
            m61970ix();
            return;
        }
        int iMo65028jd = this.f43554x1.mo65028jd();
        if (iMo65028jd == 1) {
            m61979rv();
            if (this.f43554x1.mo65048u4()) {
                m61983uz();
                return;
            }
            return;
        }
        if (iMo65028jd != 3 && iMo65028jd != 4) {
            switch (iMo65028jd) {
                case 13:
                    m60284yj();
                    break;
                case 15:
                    m61983uz();
                    break;
            }
            return;
        }
        m60281up();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61972k4(C13890ei c13890ei) {
        C13190rs c13190rs = (C13190rs) this.f44691c5.m65177k4();
        this.f43552to = c13190rs;
        if (c13190rs == null) {
            C13190rs c13190rs2 = new C13190rs();
            this.f43552to = c13190rs2;
            this.f44691c5.m65180k4(c13190rs2);
        }
        this.f43552to.f44259jd = c13890ei.m65289x1();
        this.f43552to.f44254ck = c13890ei.m65284k4();
        C13190rs c13190rs3 = this.f43552to;
        c13190rs3.f44270yj = false;
        c13190rs3.f44260k4 = false;
        c13190rs3.f44261kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61973k4(String str, C13061k5 c13061k5) {
        String strM60304k4;
        String str2;
        String str3;
        String strM60304k42;
        try {
            this.f43554x1.m65056x1((Object) null);
            boolean z = c13061k5 != null;
            AbstractC12892ae abstractC12892aeM61429b3 = z ? c13061k5.m61429b3() : this.f43552to.f44256dy.m61429b3();
            if (abstractC12892aeM61429b3 == null) {
                return;
            }
            if (abstractC12892aeM61429b3.mo60016c5() != 0) {
                str = C14113y2.m67440x1(str);
            }
            if (str.length() == 0) {
                return;
            }
            Object objMo60025k4 = abstractC12892aeM61429b3.mo60025k4(str, m60265h4(), this.f44693fa);
            this.f43554x1.m65056x1(objMo60025k4);
            int iMo60016c5 = abstractC12892aeM61429b3.mo60016c5();
            if (iMo60016c5 == 4 || iMo60016c5 == 1 || iMo60016c5 == 2) {
                if (abstractC12892aeM61429b3.mo60017ck() == 1) {
                    for (String str4 : (String[]) C7019kk.m27458kk(objMo60025k4, String[].class)) {
                        m61971k4(abstractC12892aeM61429b3.mo60016c5(), str4);
                    }
                } else {
                    m61971k4(abstractC12892aeM61429b3.mo60016c5(), (String) objMo60025k4);
                }
            }
            AbstractC13183r7 abstractC13183r7 = z ? c13061k5 : this.f43552to.f44256dy;
            if (abstractC13183r7.m61446v4() != 4294967295L && str.length() > abstractC13183r7.m61446v4()) {
                m60273k4("The actual length is greater than the MaxLength value.", str);
            }
            if (abstractC13183r7.m61441lr() != 4294967295L && str.length() < abstractC13183r7.m61441lr()) {
                m60273k4("The actual length is less than the MinLength value.", str);
            }
            if (abstractC13183r7.m61447wy() != null && !abstractC13183r7.m61450x1(objMo60025k4)) {
                m60273k4(abstractC12892aeM61429b3.mo60016c5() == 8 ? "'{0}' is not in the notation list." : "'{0}' is not in the enumeration list.", objMo60025k4.toString());
            }
            if (abstractC13183r7.m61440kk(objMo60025k4)) {
                return;
            }
            if (z) {
                str3 = "The value of the '{0}' attribute does not equal its fixed value.";
                strM60304k42 = c13061k5.m61443qq().toString();
            } else {
                str3 = "The value of the '{0}' element does not equal its fixed value.";
                C13190rs c13190rs = this.f43552to;
                strM60304k42 = C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck);
            }
            m60273k4(str3, strM60304k42);
        } catch (XmlSchemaException unused) {
            if (c13061k5 != null) {
                strM60304k4 = c13061k5.m61443qq().toString();
                str2 = "The '{0}' attribute has an invalid value according to its data type.";
            } else {
                C13190rs c13190rs2 = this.f43552to;
                strM60304k4 = C12962eb.m60304k4(c13190rs2.f44259jd, c13190rs2.f44254ck);
                str2 = "The '{0}' element has an invalid value according to its data type.";
            }
            m60273k4(str2, strM60304k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m61974k4(String str, C13061k5 c13061k5, C13322zd c13322zd, C13950o3 c13950o3, AbstractC13883dt abstractC13883dt, Object obj, AbstractC13319z7 abstractC13319z7, String str2, int i, int i2) {
        try {
            AbstractC12892ae abstractC12892aeM61429b3 = c13061k5.m61429b3();
            if (abstractC12892aeM61429b3 == null) {
                return;
            }
            if (abstractC12892aeM61429b3.mo60016c5() != 0) {
                str = C14113y2.m67440x1(str);
            }
            if (str.length() == 0) {
                return;
            }
            Object objMo60025k4 = abstractC12892aeM61429b3.mo60025k4(str, abstractC13883dt, c13950o3);
            int iMo60016c5 = abstractC12892aeM61429b3.mo60016c5();
            if (iMo60016c5 == 4) {
                if (abstractC12892aeM61429b3.mo60017ck() == 1) {
                    for (String str3 : (String[]) C7019kk.m27458kk(objMo60025k4, String[].class)) {
                        C12957dy.m60258k4(c13322zd, str3, obj, abstractC13319z7, str2, i, i2);
                    }
                } else {
                    C12957dy.m60258k4(c13322zd, (String) objMo60025k4, obj, abstractC13319z7, str2, i, i2);
                }
            } else if (iMo60016c5 == 9 && !c13061k5.m61450x1(objMo60025k4)) {
                XmlSchemaException xmlSchemaException = new XmlSchemaException("'{0}' is not in the enumeration list.", objMo60025k4.toString(), str2, i, i2);
                if (abstractC13319z7 == null) {
                    throw xmlSchemaException;
                }
                abstractC13319z7.mo12838k4(obj, new C13020hq(xmlSchemaException));
            }
            c13061k5.m61437k4(objMo60025k4);
        } catch (RuntimeException unused) {
            XmlSchemaException xmlSchemaException2 = new XmlSchemaException("The default value of '{0}' attribute is invalid according to its datatype.", c13061k5.m61443qq().toString(), str2, i, i2);
            if (abstractC13319z7 == null) {
                throw xmlSchemaException2;
            }
            abstractC13319z7.mo12838k4(obj, new C13020hq(xmlSchemaException2));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61988k4(String str, Object obj) {
        if (this.f44698yj == null) {
            this.f44698yj = new Hashtable();
        }
        this.f44698yj.addItem(str, obj);
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo60277k4() {
        C13125nk c13125nk = this.f43552to.f44256dy;
        if (c13125nk != null) {
            return c13125nk.m61276rv().m61458kk();
        }
        return false;
    }
}
