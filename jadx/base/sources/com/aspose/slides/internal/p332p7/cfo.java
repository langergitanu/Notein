package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class cfo extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f21055k4 = ypt.m45077k4("none");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21056to = new C7017h4("followColorScheme", "extLst");

    /* JADX INFO: renamed from: kk */
    private ltr f21057kk;

    /* JADX INFO: renamed from: x1 */
    private int f21058x1;

    public cfo() {
        m29594x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29594x1() {
        this.f21058x1 = f21055k4;
    }

    public cfo(final AbstractC13912i5 abstractC13912i5) {
        m29594x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cfo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (cfo.f21056to.m27428k4(str) != 0) {
                    return false;
                }
                cfo.this.f21058x1 = ypt.m45077k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cfo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (cfo.f21056to.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                cfo.this.f21057kk = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f21058x1;
        if (i != f21055k4) {
            c3059ii.m12955x1("followColorScheme", ypt.m45078k4(i));
        }
        ltr ltrVar = this.f21057kk;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
