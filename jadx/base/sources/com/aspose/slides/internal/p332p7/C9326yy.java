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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yy */
/* JADX INFO: loaded from: classes4.dex */
public class C9326yy extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33605du = new C7017h4("ptCount", "formatCode", "name", TranslateLanguage.PORTUGUESE);

    /* JADX INFO: renamed from: k4 */
    private long f33606k4;

    /* JADX INFO: renamed from: kk */
    private String f33607kk;

    /* JADX INFO: renamed from: to */
    private List<C7876hr> f33608to;

    /* JADX INFO: renamed from: x1 */
    private String f33609x1;

    public C9326yy() {
        m45266h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m45266h4() {
        this.f33608to = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final String m45274kk() {
        return this.f33609x1;
    }

    /* JADX INFO: renamed from: to */
    public final C7876hr[] m45275to() {
        return this.f33608to.toArray(new C7876hr[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m45276x1() {
        return this.f33606k4;
    }

    public C9326yy(final AbstractC13912i5 abstractC13912i5) {
        m45266h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9326yy.f33605du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9326yy.this.f33606k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9326yy.this.f33609x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C9326yy.this.f33607kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9326yy.f33605du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                C9326yy.this.f33608to.addItem(new C7876hr(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7876hr m45271k4() {
        C7876hr c7876hr = new C7876hr();
        this.f33608to.addItem(c7876hr);
        return c7876hr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45272k4(long j) {
        this.f33606k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45273k4(String str) {
        this.f33609x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("ptCount", C13850af.m65147x1(this.f33606k4));
        String str3 = this.f33609x1;
        if (str3 != null) {
            c3059ii.m12955x1("formatCode", str3);
        }
        String str4 = this.f33607kk;
        if (str4 != null) {
            c3059ii.m12955x1("name", str4);
        }
        List.Enumerator<C7876hr> it = this.f33608to.iterator();
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
