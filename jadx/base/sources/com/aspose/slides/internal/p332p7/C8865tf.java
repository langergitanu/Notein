package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.tf */
/* JADX INFO: loaded from: classes4.dex */
public class C8865tf extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30725x1 = new C7017h4(TranslateLanguage.PORTUGUESE);

    /* JADX INFO: renamed from: k4 */
    private List<C7836hc> f30726k4;

    public C8865tf() {
        m41696du();
        this.f30726k4.addItem(new C7836hc());
        this.f30726k4.addItem(new C7836hc());
        this.f30726k4.addItem(new C7836hc());
    }

    /* JADX INFO: renamed from: du */
    private void m41696du() {
        this.f30726k4 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C7836hc m41700kk() {
        return this.f30726k4.get_Item(2);
    }

    /* JADX INFO: renamed from: x1 */
    public final C7836hc m41701x1() {
        return this.f30726k4.get_Item(1);
    }

    public C8865tf(final AbstractC13912i5 abstractC13912i5) {
        m41696du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8865tf.f30725x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8865tf.this.f30726k4.addItem(new C7836hc(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7836hc m41699k4() {
        return this.f30726k4.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m41699k4().mo6846k4("a", c3059ii, TranslateLanguage.PORTUGUESE);
        m41701x1().mo6846k4("a", c3059ii, TranslateLanguage.PORTUGUESE);
        m41700kk().mo6846k4("a", c3059ii, TranslateLanguage.PORTUGUESE);
        c3059ii.mo21898jd();
    }
}
