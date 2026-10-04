package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class jq6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25304du = new C7017h4("ref", "filterColumn", "sortState", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f25305k4;

    /* JADX INFO: renamed from: kk */
    private tbp f25306kk;

    /* JADX INFO: renamed from: to */
    private g3j f25307to;

    /* JADX INFO: renamed from: x1 */
    private List<u8b> f25308x1;

    public jq6() {
        m34887x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34887x1() {
        this.f25308x1 = new List<>();
    }

    public jq6(final AbstractC13912i5 abstractC13912i5) {
        m34887x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jq6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (jq6.f25304du.m27428k4(str) != 0) {
                    return false;
                }
                jq6.this.f25305k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jq6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = jq6.f25304du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    jq6.this.f25308x1.addItem(new u8b(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    jq6.this.f25306kk = new tbp(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    jq6.this.f25307to = new g3j(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25305k4;
        if (str3 != null) {
            c3059ii.m12955x1("ref", str3);
        }
        List.Enumerator<u8b> it = this.f25308x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "filterColumn");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        tbp tbpVar = this.f25306kk;
        if (tbpVar != null) {
            tbpVar.mo6846k4("ssml", c3059ii, "sortState");
        }
        g3j g3jVar = this.f25307to;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
