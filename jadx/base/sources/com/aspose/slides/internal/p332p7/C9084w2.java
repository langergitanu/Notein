package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.w2 */
/* JADX INFO: loaded from: classes4.dex */
public class C9084w2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32156x1 = new C7017h4("scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f32157k4;

    public C9084w2() {
        m43457x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m43457x1() {
        this.f32157k4 = new List<>();
    }

    public C9084w2(final AbstractC13912i5 abstractC13912i5) {
        m43457x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C9084w2.f32156x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9395zr c9395zr = new C9395zr(abstractC13912i5);
                    list = C9084w2.this.f32157k4;
                    c7394ca = new C7394ca("scrgbClr", c9395zr);
                } else if (iM27428k4 == 1) {
                    C7670fk c7670fk = new C7670fk(abstractC13912i5);
                    list = C9084w2.this.f32157k4;
                    c7394ca = new C7394ca("srgbClr", c7670fk);
                } else if (iM27428k4 == 2) {
                    C9052vm c9052vm = new C9052vm(abstractC13912i5);
                    list = C9084w2.this.f32157k4;
                    c7394ca = new C7394ca("hslClr", c9052vm);
                } else if (iM27428k4 == 3) {
                    C7939il c7939il = new C7939il(abstractC13912i5);
                    list = C9084w2.this.f32157k4;
                    c7394ca = new C7394ca("sysClr", c7939il);
                } else if (iM27428k4 == 4) {
                    C8732s1 c8732s1 = new C8732s1(abstractC13912i5);
                    list = C9084w2.this.f32157k4;
                    c7394ca = new C7394ca("schemeClr", c8732s1);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C8065k9 c8065k9 = new C8065k9(abstractC13912i5);
                    list = C9084w2.this.f32157k4;
                    c7394ca = new C7394ca("prstClr", c8065k9);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f32157k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f32156x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((C9395zr) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((C7670fk) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((C9052vm) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((C7939il) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((C8732s1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((C8065k9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
