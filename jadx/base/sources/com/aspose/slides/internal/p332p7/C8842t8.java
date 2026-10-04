package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.t8 */
/* JADX INFO: loaded from: classes4.dex */
public class C8842t8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30604kk = new C7017h4("mPr", TranslateLanguage.MARATHI);

    /* JADX INFO: renamed from: k4 */
    private C8481oy f30605k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7325bj> f30606x1;

    public C8842t8() {
        m41567du();
    }

    /* JADX INFO: renamed from: du */
    private void m41567du() {
        this.f30606x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C7325bj[] m41573kk() {
        return this.f30606x1.toArray(new C7325bj[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C8481oy m41574x1() {
        return this.f30605k4;
    }

    public C8842t8(final AbstractC13912i5 abstractC13912i5) {
        m41567du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.t8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8842t8.f30604kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8842t8.this.f30605k4 = new C8481oy(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8842t8.this.f30606x1.addItem(new C7325bj(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7325bj m41571k4() {
        C7325bj c7325bj = new C7325bj();
        this.f30606x1.addItem(c7325bj);
        return c7325bj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41572k4(C8481oy c8481oy) {
        this.f30605k4 = c8481oy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8481oy c8481oy = this.f30605k4;
        if (c8481oy != null) {
            c8481oy.mo6846k4("m", c3059ii, "mPr");
        }
        List.Enumerator<C7325bj> it = this.f30606x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("m", c3059ii, TranslateLanguage.MARATHI);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
