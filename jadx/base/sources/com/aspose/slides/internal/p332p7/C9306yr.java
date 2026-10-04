package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yr */
/* JADX INFO: loaded from: classes4.dex */
public class C9306yr extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33481to = new C7017h4("name", "if", "else");

    /* JADX INFO: renamed from: k4 */
    private String f33482k4;

    /* JADX INFO: renamed from: kk */
    private C8044jx f33483kk;

    /* JADX INFO: renamed from: x1 */
    private List<C8251mb> f33484x1;

    public C9306yr() {
        m45100du();
    }

    /* JADX INFO: renamed from: du */
    private void m45100du() {
        this.f33482k4 = "";
        this.f33484x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C8044jx m45106kk() {
        return this.f33483kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8251mb[] m45107x1() {
        return this.f33484x1.toArray(new C8251mb[0]);
    }

    public C9306yr(final AbstractC13912i5 abstractC13912i5) {
        m45100du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9306yr.f33481to.m27428k4(str) != 0) {
                    return false;
                }
                C9306yr.this.f33482k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9306yr.f33481to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C9306yr.this.f33484x1.addItem(new C8251mb(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9306yr.this.f33483kk = new C8044jx(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m45105k4() {
        return this.f33482k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f33482k4)) {
            c3059ii.m12955x1("name", this.f33482k4);
        }
        List.Enumerator<C8251mb> it = this.f33484x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("dgm", c3059ii, "if");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8044jx c8044jx = this.f33483kk;
        if (c8044jx != null) {
            c8044jx.mo6846k4("dgm", c3059ii, "else");
        }
        c3059ii.mo21898jd();
    }
}
