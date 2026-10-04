package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p057c6.C1983k4;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.ck */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10327ck extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private int f36764c5;

    /* JADX INFO: renamed from: ck */
    private InterfaceC1986to f36765ck;

    /* JADX INFO: renamed from: dy */
    private int f36766dy;

    /* JADX INFO: renamed from: fa */
    private C1374fa f36767fa;

    /* JADX INFO: renamed from: h4 */
    protected C10339qq f36768h4;

    /* JADX INFO: renamed from: jd */
    private String f36769jd;

    /* JADX INFO: renamed from: m9 */
    private C4265c5 f36770m9;

    public AbstractC10327ck(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36768h4 = (C10339qq) abstractC3511c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks
    /* JADX INFO: renamed from: ar */
    public boolean mo14315ar() {
        return true;
    }

    /* JADX INFO: renamed from: bz */
    public final String m50335bz() {
        return this.f36769jd;
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC1981h4 m50336du(int i) {
        return this.f36768h4.m50379du(i);
    }

    /* JADX INFO: renamed from: e0 */
    public final C4265c5 m50338e0() {
        return this.f36770m9;
    }

    /* JADX INFO: renamed from: g8 */
    public final int m50339g8() {
        return this.f36766dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final InterfaceC1981h4 m50340h4(int i) {
        return this.f36768h4.m50383h4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C12007ix mo50341k4(C1983k4 c1983k4);

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f36770m9 = abstractC3533um.m14401to();
        this.f36766dy = abstractC3533um.m14402to(87).mo17251du();
        this.f36764c5 = abstractC3533um.m14402to(169).mo17251du();
        this.f36769jd = abstractC3533um.m14402to(199).mo9926j_();
        this.f36765ck = abstractC3533um.m14402to(197).mo9878h4();
        this.f36767fa = C1374fa.m8142k4(abstractC3533um.m14402to(StyleIdentifier.PLAIN_TABLE_1).mo17251du());
        if (C14113y2.m67411k4(this.f36769jd)) {
            this.f36769jd = mo50345ts();
        } else if (m50337du(m50335bz()) && !C14113y2.m67363du(m50335bz(), mo50345ts())) {
            m14118up().mo14341jd(this, m14105ks(), this.f36769jd, m14106m_());
        }
        if (m50338e0().m17150h4(false, null) == 0 && m50338e0().m17147du(false, null) == 0) {
            return;
        }
        m14118up().mo14356kk(this, m14105ks(), this.f36769jd, true, m14106m_());
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC10327ck m50342m9(int i) {
        return this.f36768h4.m50385m9(i);
    }

    /* JADX INFO: renamed from: qm */
    public final int m50343qm() {
        return this.f36764c5;
    }

    /* JADX INFO: renamed from: sv */
    public final int m50344sv() {
        return this.f36765ck.mo9884to();
    }

    /* JADX INFO: renamed from: ts */
    public abstract String mo50345ts();

    /* JADX INFO: renamed from: wp */
    public final C1374fa m50346wp() {
        return this.f36767fa;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m50337du(String str) {
        return C14113y2.m67363du(str, "xsl-region-before") || C14113y2.m67363du(str, "xsl-region-start") || C14113y2.m67363du(str, "xsl-region-end") || C14113y2.m67363du(str, "xsl-region-after") || C14113y2.m67363du(str, "xsl-before-float-separator") || C14113y2.m67363du(str, "xsl-footnote-separator");
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }
}
