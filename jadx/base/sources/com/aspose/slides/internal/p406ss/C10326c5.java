package com.aspose.slides.internal.p406ss;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p022ai.C1376jd;
import com.aspose.slides.internal.p022ai.C1378kk;
import com.aspose.slides.internal.p022ai.C1381up;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p023ak.C1389to;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10326c5 extends AbstractC10334k4 implements InterfaceC1380to {

    /* JADX INFO: renamed from: c5 */
    private String f36754c5;

    /* JADX INFO: renamed from: ck */
    private String f36755ck;

    /* JADX INFO: renamed from: fa */
    private InterfaceC1986to f36756fa;

    /* JADX INFO: renamed from: jd */
    private String f36757jd;

    /* JADX INFO: renamed from: ks */
    private C10339qq f36758ks;

    /* JADX INFO: renamed from: ne */
    private C10328du f36759ne;

    /* JADX INFO: renamed from: rv */
    private C10333jd f36760rv;

    /* JADX INFO: renamed from: up */
    private C1381up f36761up;

    /* JADX INFO: renamed from: x6 */
    private C10325bv f36762x6;

    /* JADX INFO: renamed from: yj */
    private Dictionary<String, AbstractC3524ks> f36763yj;

    public C10326c5(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36759ne = null;
    }

    /* JADX INFO: renamed from: du */
    public final C10343um m50323du(String str) {
        if (this.f36763yj.containsKey(str)) {
            return (C10343um) this.f36763yj.get_Item(str);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f36759ne == null) {
            m14123x1("(title?,static-content*,flow)");
        }
        mo14107n_().mo8561x1(this);
    }

    /* JADX INFO: renamed from: f9 */
    public final String m50324f9() {
        return this.f36757jd;
    }

    /* JADX INFO: renamed from: g8 */
    public final C10325bv m50325g8() {
        return this.f36762x6;
    }

    /* JADX INFO: renamed from: gi */
    public final String m50326gi() {
        return this.f36755ck;
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10334k4, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        this.f36763yj = new Dictionary<>();
        C10339qq c10339qqM50373du = mo14126yj().m50396bz().m50373du(this.f36755ck);
        this.f36758ks = c10339qqM50373du;
        if (c10339qqM50373du == null) {
            C10333jd c10333jdM50374h4 = mo14126yj().m50396bz().m50374h4(this.f36755ck);
            this.f36760rv = c10333jdM50374h4;
            if (c10333jdM50374h4 == null) {
                m14118up().mo14337c5(this, m14105ks(), this.f36755ck, m14106m_());
            }
        }
        mo14107n_().mo8553k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 53;
    }

    @Override // com.aspose.slides.internal.p022ai.InterfaceC1380to
    /* JADX INFO: renamed from: j2 */
    public final C1378kk mo8170j2() {
        C1381up c1381up = this.f36761up;
        return c1381up != null ? c1381up.mo8170j2() : C1378kk.f5979k4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public Stack<C1389to> mo14086k4(Stack<C1389to> stack, C1389to c1389to) {
        Dictionary<String, AbstractC3524ks> dictionaryM50334wp = m50334wp();
        if (dictionaryM50334wp != null) {
            Dictionary.ValueCollection.Enumerator<String, AbstractC3524ks> it = dictionaryM50334wp.getValues().iterator();
            while (it.hasNext()) {
                try {
                    AbstractC3524ks next = it.next();
                    if (C7019kk.m27469x1(next, C10343um.class)) {
                        stack = ((C10343um) next).m14085k4(stack);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        C10328du c10328duM50332sv = m50332sv();
        return c10328duM50332sv != null ? c10328duM50332sv.m14085k4(stack) : stack;
    }

    /* JADX INFO: renamed from: kp */
    public final boolean m50329kp() {
        C10333jd c10333jd = this.f36760rv;
        return c10333jd != null && c10333jd.m50356qm();
    }

    @Override // com.aspose.slides.internal.p022ai.InterfaceC1380to
    /* JADX INFO: renamed from: qw */
    public final C1378kk mo8171qw() {
        C1381up c1381up = this.f36761up;
        return c1381up != null ? c1381up.mo8171qw() : C1378kk.f5979k4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "page-sequence";
    }

    /* JADX INFO: renamed from: s7 */
    public final String m50330s7() {
        return this.f36754c5;
    }

    /* JADX INFO: renamed from: ss */
    public final boolean m50331ss() {
        C10333jd c10333jd = this.f36760rv;
        return c10333jd == null || c10333jd.m50352bz();
    }

    /* JADX INFO: renamed from: sv */
    public final C10328du m50332sv() {
        return this.f36759ne;
    }

    /* JADX INFO: renamed from: t6 */
    public final void m50333t6() {
        this.f36759ne = null;
        this.f36763yj.clear();
    }

    @Override // com.aspose.slides.internal.p022ai.InterfaceC1380to
    /* JADX INFO: renamed from: tq */
    public final C1376jd mo8172tq() {
        return this.f36761up.mo8172tq();
    }

    /* JADX INFO: renamed from: wp */
    public final Dictionary<String, AbstractC3524ks> m50334wp() {
        return this.f36763yj;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m50327h4(String str) {
        return this.f36763yj.containsKey(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10339qq m50328k4(int i, boolean z, boolean z2, boolean z3) {
        C10333jd c10333jd = this.f36760rv;
        if (c10333jd == null) {
            return this.f36758ks;
        }
        return c10333jd.m50354k4(i % 2 == 1, z, z2, z3, m50332sv().m50347ts());
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        int iMo14084ix = abstractC3511c5.mo14084ix();
        if (iMo14084ix == 16) {
            C10328du c10328du = (C10328du) abstractC3511c5;
            this.f36759ne = c10328du;
            m50322k4(c10328du);
        } else if (iMo14084ix == 70) {
            m50322k4((C10328du) abstractC3511c5);
            C10328du c10328du2 = (C10328du) abstractC3511c5;
            this.f36763yj.addItem(c10328du2.m50347ts(), c10328du2);
        } else if (iMo14084ix != 80) {
            super.mo14089k4(abstractC3511c5);
        } else {
            this.f36762x6 = (C10325bv) abstractC3511c5;
        }
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10334k4, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f36754c5 = abstractC3533um.m14385du(81).mo9926j_();
        this.f36757jd = abstractC3533um.m14385du(134).mo9926j_();
        this.f36755ck = abstractC3533um.m14385du(154).mo9926j_();
        this.f36756fa = abstractC3533um.m14385du(197).mo9878h4();
        this.f36761up = new C1381up(C1374fa.m8142k4(abstractC3533um.m14385du(StyleIdentifier.PLAIN_TABLE_1).mo17251du()), C1376jd.m8166k4(abstractC3533um.m14385du(255).mo17251du()));
        if (C14113y2.m67411k4(this.f36755ck)) {
            m14104kk("master-reference");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, NoteMeta.PROPERTY_TITLE)) {
                if (this.f36762x6 != null) {
                    m14093k4(interfaceC3757h4, "fo:title");
                    return;
                } else if (this.f36763yj.size() != 0) {
                    m14122x1(interfaceC3757h4, "fo:title", "fo:static-content");
                    return;
                } else {
                    if (this.f36759ne != null) {
                        m14122x1(interfaceC3757h4, "fo:title", "fo:flow");
                        return;
                    }
                    return;
                }
            }
            if (C14113y2.m67363du(str2, "static-content")) {
                if (this.f36759ne != null) {
                    m14122x1(interfaceC3757h4, "fo:static-content", "fo:flow");
                }
            } else if (!C14113y2.m67363du(str2, "flow")) {
                m14103kk(interfaceC3757h4, str, str2);
            } else if (this.f36759ne != null) {
                m14093k4(interfaceC3757h4, "fo:flow");
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m50322k4(C10328du c10328du) {
        String strM50347ts = c10328du.m50347ts();
        if (m50327h4(strM50347ts)) {
            m14118up().mo14357m9(this, c10328du.m14105ks(), strM50347ts, c10328du.m14106m_());
        }
        if (mo14126yj().m50396bz().m50377m9(strM50347ts) || C14113y2.m67363du(strM50347ts, "xsl-before-float-separator") || C14113y2.m67363du(strM50347ts, "xsl-footnote-separator")) {
            return;
        }
        m14118up().mo14339dy(this, c10328du.m14105ks(), strM50347ts, c10328du.m14106m_());
    }
}
