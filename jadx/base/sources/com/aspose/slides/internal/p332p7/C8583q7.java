package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.q7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8583q7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28773to = new C7017h4("ptCount", TranslateLanguage.PORTUGUESE, "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8452ol f28774k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f28775kk;

    /* JADX INFO: renamed from: x1 */
    private List<C9099w9> f28776x1;

    public C8583q7() {
        m39369m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m39369m9() {
        this.f28776x1 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC7414ck m39370du() {
        return this.f28775kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C8452ol m39372kk() {
        return this.f28774k4;
    }

    /* JADX INFO: renamed from: to */
    public final C9099w9[] m39373to() {
        return this.f28776x1.toArray(new C9099w9[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C9099w9 m39374x1() {
        C9099w9 c9099w9 = new C9099w9();
        this.f28776x1.addItem(c9099w9);
        return c9099w9;
    }

    public C8583q7(final AbstractC13912i5 abstractC13912i5) {
        m39369m9();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8583q7.f28773to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8583q7.this.f28774k4 = new C8452ol(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8583q7.this.f28776x1.addItem(new C9099w9(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8583q7.this.f28775kk = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8452ol m39371k4() {
        if (this.f28774k4 != null) {
            throw new Exception("Only one <ptCount> element can be added.");
        }
        C8452ol c8452ol = new C8452ol();
        this.f28774k4 = c8452ol;
        return c8452ol;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8452ol c8452ol = this.f28774k4;
        if (c8452ol != null) {
            c8452ol.mo6846k4("c", c3059ii, "ptCount");
        }
        List.Enumerator<C9099w9> it = this.f28776x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, TranslateLanguage.PORTUGUESE);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7683fo c7683fo = this.f28775kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
