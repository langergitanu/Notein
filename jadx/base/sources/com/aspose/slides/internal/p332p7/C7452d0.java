package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.d0 */
/* JADX INFO: loaded from: classes4.dex */
public class C7452d0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private List<C7394ca> f21391du;

    /* JADX INFO: renamed from: kk */
    private int f21392kk;

    /* JADX INFO: renamed from: to */
    private int f21393to;

    /* JADX INFO: renamed from: k4 */
    public static final int f21389k4 = C7217a6.m27954k4("span");

    /* JADX INFO: renamed from: x1 */
    public static final int f21390x1 = C7449cy.m29974k4("cw");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f21388h4 = new C7017h4("meth", "hueDir", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    public C7452d0() {
        m29995to();
    }

    /* JADX INFO: renamed from: to */
    private void m29995to() {
        this.f21392kk = f21389k4;
        this.f21393to = f21390x1;
        this.f21391du = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m29997k4() {
        return this.f21392kk;
    }

    public C7452d0(final AbstractC13912i5 abstractC13912i5) {
        m29995to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.d0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7452d0.f21388h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7452d0.this.f21392kk = C7217a6.m27954k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7452d0.this.f21393to = C7449cy.m29974k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.d0.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C7452d0.f21388h4.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        C9395zr c9395zr = new C9395zr(abstractC13912i5);
                        list = C7452d0.this.f21391du;
                        c7394ca = new C7394ca("scrgbClr", c9395zr);
                        break;
                    case 3:
                        C7670fk c7670fk = new C7670fk(abstractC13912i5);
                        list = C7452d0.this.f21391du;
                        c7394ca = new C7394ca("srgbClr", c7670fk);
                        break;
                    case 4:
                        C9052vm c9052vm = new C9052vm(abstractC13912i5);
                        list = C7452d0.this.f21391du;
                        c7394ca = new C7394ca("hslClr", c9052vm);
                        break;
                    case 5:
                        C7939il c7939il = new C7939il(abstractC13912i5);
                        list = C7452d0.this.f21391du;
                        c7394ca = new C7394ca("sysClr", c7939il);
                        break;
                    case 6:
                        C8732s1 c8732s1 = new C8732s1(abstractC13912i5);
                        list = C7452d0.this.f21391du;
                        c7394ca = new C7394ca("schemeClr", c8732s1);
                        break;
                    case 7:
                        C8065k9 c8065k9 = new C8065k9(abstractC13912i5);
                        list = C7452d0.this.f21391du;
                        c7394ca = new C7394ca("prstClr", c8065k9);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m29998x1() {
        return this.f21391du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f21392kk;
        if (i != f21389k4) {
            c3059ii.m12955x1("meth", C7217a6.m27955k4(i));
        }
        int i2 = this.f21393to;
        if (i2 != f21390x1) {
            c3059ii.m12955x1("hueDir", C7449cy.m29975k4(i2));
        }
        List.Enumerator<C7394ca> it = this.f21391du.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f21388h4.m27428k4(next.m29539k4())) {
                    case 2:
                        ((C9395zr) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C7670fk) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C9052vm) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C7939il) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8732s1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8065k9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
        c3059ii.mo21898jd();
    }
}
