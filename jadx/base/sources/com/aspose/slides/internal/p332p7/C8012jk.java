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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jk */
/* JADX INFO: loaded from: classes4.dex */
public final class C8012jk extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25175to = new C7017h4("ptCount", TranslateLanguage.PORTUGUESE, "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8452ol f25176k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f25177kk;

    /* JADX INFO: renamed from: x1 */
    private List<C9099w9> f25178x1;

    public C8012jk() {
        this.f25178x1 = new List<>();
    }

    public C8012jk(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8012jk.f25175to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8012jk.this.f25176k4 = new C8452ol(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8012jk.this.f25178x1.addItem(new C9099w9(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8012jk.this.f25177kk = new C7683fo(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8452ol c8452ol = this.f25176k4;
        if (c8452ol != null) {
            c8452ol.mo6846k4("c", c3059ii, "ptCount");
        }
        List.Enumerator<C9099w9> it = this.f25178x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, TranslateLanguage.PORTUGUESE);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7683fo c7683fo = this.f25177kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9099w9[] m34737k4() {
        return this.f25178x1.toArray(new C9099w9[0]);
    }
}
