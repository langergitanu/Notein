package com.aspose.slides.internal.p406ss;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p057c6.C1977c5;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4273fa;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C10339qq extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC1984kk f36807c5;

    /* JADX INFO: renamed from: ck */
    private C1374fa f36808ck;

    /* JADX INFO: renamed from: dy */
    private InterfaceC1984kk f36809dy;

    /* JADX INFO: renamed from: fa */
    private Dictionary<String, AbstractC10327ck> f36810fa;

    /* JADX INFO: renamed from: h4 */
    private C4273fa f36811h4;

    /* JADX INFO: renamed from: jd */
    private InterfaceC1986to f36812jd;

    /* JADX INFO: renamed from: ks */
    private boolean f36813ks;

    /* JADX INFO: renamed from: m9 */
    private String f36814m9;

    /* JADX INFO: renamed from: rv */
    private boolean f36815rv;

    /* JADX INFO: renamed from: up */
    private boolean f36816up;

    /* JADX INFO: renamed from: x6 */
    private boolean f36817x6;

    /* JADX INFO: renamed from: yj */
    private boolean f36818yj;

    public C10339qq(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36816up = false;
        this.f36818yj = false;
        this.f36813ks = false;
        this.f36815rv = false;
        this.f36817x6 = false;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks
    /* JADX INFO: renamed from: ar */
    public boolean mo14315ar() {
        return true;
    }

    /* JADX INFO: renamed from: bz */
    public final String m50378bz() {
        return this.f36814m9;
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC1981h4 m50379du(int i) {
        return this.f36812jd.mo9884to() % 180 == 0 ? new C1977c5(null, i, m50386qm().mo9884to()) : new C1977c5(null, i, m50382g8().mo9884to());
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f36816up) {
            return;
        }
        m14123x1("(region-body, region-before?, region-after?, region-start?, region-end?)");
    }

    /* JADX INFO: renamed from: e0 */
    public final C4273fa m50381e0() {
        return this.f36811h4;
    }

    /* JADX INFO: renamed from: g8 */
    public final InterfaceC1984kk m50382g8() {
        return this.f36809dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final InterfaceC1981h4 m50383h4(int i) {
        return this.f36812jd.mo9884to() % 180 == 0 ? new C1977c5(null, i, m50382g8().mo9884to()) : new C1977c5(null, i, m50386qm().mo9884to());
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 68;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        if (C7019kk.m27469x1(abstractC3511c5, AbstractC10327ck.class)) {
            m50384k4((AbstractC10327ck) abstractC3511c5);
        } else {
            super.mo14089k4(abstractC3511c5);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC10327ck m50385m9(int i) {
        if (this.f36810fa.containsKey(C14057f9.m66591x1(i))) {
            return this.f36810fa.get_Item(C14057f9.m66591x1(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: qm */
    public final InterfaceC1984kk m50386qm() {
        return this.f36807c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "simple-page-master";
    }

    /* JADX INFO: renamed from: sv */
    public final int m50387sv() {
        return this.f36812jd.mo9884to();
    }

    /* JADX INFO: renamed from: ts */
    public final Dictionary<String, AbstractC10327ck> m50388ts() {
        return this.f36810fa;
    }

    /* JADX INFO: renamed from: wp */
    public final C1374fa m50389wp() {
        return this.f36808ck;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m50380du(String str) {
        Dictionary.ValueCollection.Enumerator<String, AbstractC10327ck> it = this.f36810fa.getValues().iterator();
        while (it.hasNext()) {
            try {
                if (C14113y2.m67363du(it.next().m50335bz(), str)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        C10337m9 c10337m9 = (C10337m9) this.f9752k4;
        if (this.f36814m9 == null) {
            m14104kk("master-name");
        } else {
            c10337m9.m50375k4(this);
        }
        this.f36810fa = new Dictionary<>(5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f36811h4 = abstractC3533um.m14399m9();
        this.f36814m9 = abstractC3533um.m14402to(153).mo9926j_();
        this.f36809dy = abstractC3533um.m14402to(183).mo9877dy();
        this.f36807c5 = abstractC3533um.m14402to(186).mo9877dy();
        this.f36812jd = abstractC3533um.m14402to(197).mo9878h4();
        this.f36808ck = C1374fa.m8142k4(abstractC3533um.m14402to(StyleIdentifier.PLAIN_TABLE_1).mo17251du());
        if (C14113y2.m67411k4(this.f36814m9)) {
            m14104kk("master-name");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, "region-body")) {
                if (this.f36816up) {
                    m14093k4(interfaceC3757h4, "fo:region-body");
                    return;
                } else {
                    this.f36816up = true;
                    return;
                }
            }
            if (C14113y2.m67363du(str2, "region-before")) {
                if (!this.f36816up) {
                    m14122x1(interfaceC3757h4, "fo:region-body", "fo:region-before");
                    return;
                }
                if (this.f36818yj) {
                    m14093k4(interfaceC3757h4, "fo:region-before");
                    return;
                }
                if (this.f36813ks) {
                    m14122x1(interfaceC3757h4, "fo:region-before", "fo:region-after");
                    return;
                }
                if (this.f36815rv) {
                    m14122x1(interfaceC3757h4, "fo:region-before", "fo:region-start");
                    return;
                } else if (this.f36817x6) {
                    m14122x1(interfaceC3757h4, "fo:region-before", "fo:region-end");
                    return;
                } else {
                    this.f36818yj = true;
                    return;
                }
            }
            if (C14113y2.m67363du(str2, "region-after")) {
                if (!this.f36816up) {
                    m14122x1(interfaceC3757h4, "fo:region-body", "fo:region-after");
                    return;
                }
                if (this.f36813ks) {
                    m14093k4(interfaceC3757h4, "fo:region-after");
                    return;
                }
                if (this.f36815rv) {
                    m14122x1(interfaceC3757h4, "fo:region-after", "fo:region-start");
                    return;
                } else if (this.f36817x6) {
                    m14122x1(interfaceC3757h4, "fo:region-after", "fo:region-end");
                    return;
                } else {
                    this.f36813ks = true;
                    return;
                }
            }
            if (C14113y2.m67363du(str2, "region-start")) {
                if (!this.f36816up) {
                    m14122x1(interfaceC3757h4, "fo:region-body", "fo:region-start");
                    return;
                }
                if (this.f36815rv) {
                    m14093k4(interfaceC3757h4, "fo:region-start");
                    return;
                } else if (this.f36817x6) {
                    m14122x1(interfaceC3757h4, "fo:region-start", "fo:region-end");
                    return;
                } else {
                    this.f36815rv = true;
                    return;
                }
            }
            if (!C14113y2.m67363du(str2, "region-end")) {
                m14103kk(interfaceC3757h4, str, str2);
                return;
            }
            if (!this.f36816up) {
                m14122x1(interfaceC3757h4, "fo:region-body", "fo:region-end");
            } else if (this.f36817x6) {
                m14093k4(interfaceC3757h4, "fo:region-end");
            } else {
                this.f36817x6 = true;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50384k4(AbstractC10327ck abstractC10327ck) {
        this.f36810fa.set_Item(C14057f9.m66591x1(abstractC10327ck.mo14084ix()), abstractC10327ck);
    }
}
