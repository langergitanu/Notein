package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mo */
/* JADX INFO: loaded from: classes4.dex */
public class C8276mo extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26919kk = new C7017h4("Algorithm", "RelationshipReference");

    /* JADX INFO: renamed from: k4 */
    private String f26920k4;

    /* JADX INFO: renamed from: x1 */
    private List<C9354za> f26921x1;

    public C8276mo() {
        m37015du();
    }

    /* JADX INFO: renamed from: du */
    private void m37015du() {
        this.f26921x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C9354za[] m37021kk() {
        return this.f26921x1.toArray(new C9354za[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m37022x1() {
        return this.f26920k4;
    }

    public C8276mo(final AbstractC13912i5 abstractC13912i5) {
        m37015du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8276mo.f26919kk.m27428k4(str) != 0) {
                    return false;
                }
                C8276mo.this.f26920k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8276mo.f26919kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8276mo.this.f26921x1.addItem(new C9354za(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9354za m37019k4() {
        C9354za c9354za = new C9354za();
        this.f26921x1.addItem(c9354za);
        return c9354za;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37020k4(String str) {
        this.f26920k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("Algorithm", this.f26920k4);
        List.Enumerator<C9354za> it = this.f26921x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "RelationshipReference");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
