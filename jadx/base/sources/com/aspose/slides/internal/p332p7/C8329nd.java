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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nd */
/* JADX INFO: loaded from: classes4.dex */
public class C8329nd extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27241x1 = new C7017h4(TranslateLanguage.PORTUGUESE);

    /* JADX INFO: renamed from: k4 */
    private List<C9099w9> f27242k4;

    public C8329nd() {
        m37426to();
    }

    /* JADX INFO: renamed from: to */
    private void m37426to() {
        this.f27242k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9099w9[] m37428x1() {
        return this.f27242k4.toArray(new C9099w9[0]);
    }

    public C8329nd(final AbstractC13912i5 abstractC13912i5) {
        m37426to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8329nd.f27241x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8329nd.this.f27242k4.addItem(new C9099w9(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9099w9 m37427k4() {
        C9099w9 c9099w9 = new C9099w9();
        this.f27242k4.addItem(c9099w9);
        return c9099w9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C9099w9> it = this.f27242k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, TranslateLanguage.PORTUGUESE);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
