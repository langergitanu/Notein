package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class knj extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25832kk = new C7017h4("indexedColors", "mruColors");

    /* JADX INFO: renamed from: k4 */
    private v2n f25833k4;

    /* JADX INFO: renamed from: x1 */
    private tba f25834x1;

    public knj() {
    }

    public knj(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.knj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = knj.f25832kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    knj.this.f25833k4 = new v2n(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    knj.this.f25834x1 = new tba(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        v2n v2nVar = this.f25833k4;
        if (v2nVar != null) {
            v2nVar.mo6846k4("ssml", c3059ii, "indexedColors");
        }
        tba tbaVar = this.f25834x1;
        if (tbaVar != null) {
            tbaVar.mo6846k4("ssml", c3059ii, "mruColors");
        }
        c3059ii.mo21898jd();
    }
}
