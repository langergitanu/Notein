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
public class u4f extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31026kk = new C7017h4("Id", "CommitmentTypeIndication");

    /* JADX INFO: renamed from: k4 */
    private String f31027k4;

    /* JADX INFO: renamed from: x1 */
    private List<eg4> f31028x1;

    public u4f() {
        m42087kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m42087kk() {
        this.f31028x1 = new List<>();
    }

    public u4f(final AbstractC13912i5 abstractC13912i5) {
        m42087kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u4f.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (u4f.f31026kk.m27428k4(str) != 0) {
                    return false;
                }
                u4f.this.f31027k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.u4f.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (u4f.f31026kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                u4f.this.f31028x1.addItem(new eg4(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final eg4 m42089k4() {
        eg4 eg4Var = new eg4();
        this.f31028x1.addItem(eg4Var);
        return eg4Var;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f31027k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        List.Enumerator<eg4> it = this.f31028x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("xd", c3059ii, "CommitmentTypeIndication");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
