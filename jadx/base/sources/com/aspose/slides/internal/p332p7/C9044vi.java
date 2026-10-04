package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vi */
/* JADX INFO: loaded from: classes4.dex */
public class C9044vi extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31880to = new C7017h4("ptCount", "name", TranslateLanguage.PORTUGUESE);

    /* JADX INFO: renamed from: k4 */
    private long f31881k4;

    /* JADX INFO: renamed from: kk */
    private List<C7814h1> f31882kk;

    /* JADX INFO: renamed from: x1 */
    private String f31883x1;

    public C9044vi() {
        m43114du();
    }

    /* JADX INFO: renamed from: du */
    private void m43114du() {
        this.f31882kk = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C7814h1[] m43121kk() {
        return this.f31882kk.toArray(new C7814h1[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m43122x1() {
        return this.f31881k4;
    }

    public C9044vi(final AbstractC13912i5 abstractC13912i5) {
        m43114du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9044vi.f31880to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9044vi.this.f31881k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9044vi.this.f31883x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vi.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9044vi.f31880to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C9044vi.this.f31882kk.addItem(new C7814h1(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7814h1 m43119k4() {
        C7814h1 c7814h1 = new C7814h1();
        this.f31882kk.addItem(c7814h1);
        return c7814h1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43120k4(long j) {
        this.f31881k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("ptCount", C13850af.m65147x1(this.f31881k4));
        String str3 = this.f31883x1;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        List.Enumerator<C7814h1> it = this.f31882kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, TranslateLanguage.PORTUGUESE);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
