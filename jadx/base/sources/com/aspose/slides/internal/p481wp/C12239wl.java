package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4289qw;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.AbstractC9956kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12239wl extends AbstractC12235um {

    /* JADX INFO: renamed from: c5 */
    public Dictionary<Integer, Integer> f40752c5;

    /* JADX INFO: renamed from: dy */
    public int f40753dy;

    /* JADX INFO: renamed from: h4 */
    public boolean f40754h4;

    /* JADX INFO: renamed from: ix */
    private C1375h4 f40755ix;

    /* JADX INFO: renamed from: jd */
    public int f40756jd;

    /* JADX INFO: renamed from: m9 */
    public boolean f40757m9;

    /* JADX INFO: renamed from: ne */
    private InterfaceC1984kk f40758ne;

    /* JADX INFO: renamed from: qq */
    private AbstractC3533um f40759qq;

    /* JADX INFO: renamed from: rv */
    private C4265c5 f40760rv;

    /* JADX INFO: renamed from: u4 */
    private int f40761u4;

    /* JADX INFO: renamed from: uz */
    private int f40762uz;

    /* JADX INFO: renamed from: wl */
    private boolean f40763wl;

    /* JADX INFO: renamed from: x6 */
    private int f40764x6;

    public C12239wl(AbstractC3511c5 abstractC3511c5) {
        this(abstractC3511c5, false);
    }

    /* JADX INFO: renamed from: bz */
    public final C1375h4 m57148bz() {
        return this.f40755ix;
    }

    /* JADX INFO: renamed from: du */
    public final void m57149du(int i) {
        this.f40764x6 = i;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        mo14107n_().mo14221x1(this);
    }

    /* JADX INFO: renamed from: g8 */
    public final int m57150g8() {
        return this.f40761u4;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC4282kp m57151h4(int i) {
        return this.f40759qq.m14402to(i);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 76;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57152k4(C1375h4 c1375h4) {
        this.f40755ix = c1375h4;
    }

    /* JADX INFO: renamed from: kp */
    public final boolean m57155kp() {
        return C7019kk.m27469x1(m57159ts(), C4289qw.class);
    }

    /* JADX INFO: renamed from: qm */
    public final int m57156qm() {
        return this.f40764x6;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "table-column";
    }

    /* JADX INFO: renamed from: ss */
    public final void m57157ss() {
        this.f40759qq = null;
    }

    /* JADX INFO: renamed from: sv */
    public final int m57158sv() {
        return this.f40762uz;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks
    public String toString() {
        C6765kp c6765kp = new C6765kp("fo:table-column");
        c6765kp.m26792k4(" column-number=").m26805kk(m57156qm());
        if (m57150g8() > 1) {
            c6765kp.m26792k4(" number-columns-repeated=").m26805kk(m57150g8());
        }
        if (m57158sv() > 1) {
            c6765kp.m26792k4(" number-columns-spanned=").m26805kk(m57158sv());
        }
        c6765kp.m26792k4(" column-width=").m26792k4(((AbstractC4282kp) m57159ts()).mo9926j_());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: ts */
    public final InterfaceC1984kk m57159ts() {
        return this.f40758ne;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um
    /* JADX INFO: renamed from: vj */
    public C4265c5 mo57067vj() {
        return this.f40760rv;
    }

    /* JADX INFO: renamed from: wp */
    public final boolean m57160wp() {
        return this.f40763wl;
    }

    public C12239wl(AbstractC3511c5 abstractC3511c5, boolean z) {
        super(abstractC3511c5);
        this.f40754h4 = true;
        this.f40757m9 = true;
        this.f40759qq = null;
        this.f40753dy = 0;
        this.f40752c5 = new Dictionary<>();
        this.f40756jd = 0;
        this.f40763wl = z;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14195k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57153k4(InterfaceC1984kk interfaceC1984kk) {
        this.f40758ne = interfaceC1984kk;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f40760rv = abstractC3533um.m14401to();
        this.f40764x6 = abstractC3533um.m14402to(76).mo9878h4().mo9884to();
        this.f40758ne = abstractC3533um.m14402to(77).mo9877dy();
        this.f40761u4 = abstractC3533um.m14402to(164).mo9878h4().mo9884to();
        this.f40762uz = abstractC3533um.m14402to(165).mo9878h4().mo9884to();
        super.mo14090k4(abstractC3533um);
        if (this.f40761u4 <= 0) {
            C12214ar.m56996k4(m14111q_().m59580u4()).mo57003k4(this, "number-columns-repeated", this.f40761u4, m14106m_());
        }
        if (this.f40762uz <= 0) {
            C12214ar.m56996k4(m14111q_().m59580u4()).mo57003k4(this, "number-columns-spanned", this.f40762uz, m14106m_());
        }
        if (this.f40758ne.m10115du() == 9) {
            if (!this.f40763wl && !mo57086e0().m57094qm()) {
                C12214ar.m56996k4(m14111q_().m59580u4()).mo57009to(this, m14106m_());
            }
            this.f40758ne = new C4289qw(1.0d, this);
        }
        if (this.f40763wl) {
            return;
        }
        this.f40759qq = abstractC3533um;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57154k4(AbstractC9956kk abstractC9956kk) {
        this.f40733ks = abstractC9956kk;
        m57120he();
    }
}
