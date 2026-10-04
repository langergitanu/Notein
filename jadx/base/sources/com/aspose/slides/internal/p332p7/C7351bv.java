package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13938ms;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C7351bv extends AbstractC7268ar {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20729kk = new C7017h4("dataDisplayOptions16");

    /* JADX INFO: renamed from: k4 */
    private C8828t1 f20730k4;

    /* JADX INFO: renamed from: x1 */
    private C8093kj f20731x1;

    public C7351bv(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return;
        }
        C8093kj c8093kjM28418k4 = AbstractC7268ar.m28418k4(abstractC7414ck, "{56B9EC1D-385E-4148-901F-78D8002777C0}");
        this.f20731x1 = c8093kjM28418k4;
        if (c8093kjM28418k4 == null) {
            return;
        }
        try {
            for (AbstractC13901ga abstractC13901ga : c8093kjM28418k4.m37126x1().getDocumentElement()) {
                if (f20729kk.m27428k4(abstractC13901ga.getLocalName()) == 0) {
                    C3144um c3144um = new C3144um(abstractC13901ga.getOuterXml());
                    try {
                        C13938ms c13938ms = new C13938ms(c3144um);
                        try {
                            c13938ms.m65616kk(true);
                            while (!c13938ms.mo65015ar() && c13938ms.mo65028jd() != 1) {
                                c13938ms.mo65026h4();
                            }
                            if (!c13938ms.mo65015ar()) {
                                m29149k4(new C8828t1(c13938ms));
                            }
                            c13938ms.dispose();
                            c3144um.dispose();
                        } catch (Throwable th) {
                            c13938ms.dispose();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c3144um.dispose();
                        throw th2;
                    }
                }
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C8828t1 m29148k4() {
        return this.f20730k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29149k4(C8828t1 c8828t1) {
        this.f20730k4 = c8828t1;
    }
}
