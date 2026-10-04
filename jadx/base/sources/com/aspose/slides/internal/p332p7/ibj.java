package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ibj extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24587to = new C7017h4("docPartGallery", "docPartCategory", "docPartUnique");

    /* JADX INFO: renamed from: k4 */
    private ef9 f24588k4;

    /* JADX INFO: renamed from: kk */
    private vsx f24589kk;

    /* JADX INFO: renamed from: x1 */
    private ef9 f24590x1;

    public ibj() {
    }

    public ibj(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ibj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ibj.f24587to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ibj.this.f24588k4 = new ef9(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    ibj.this.f24590x1 = new ef9(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    ibj.this.f24589kk = new vsx(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        ef9 ef9Var = this.f24588k4;
        if (ef9Var != null) {
            ef9Var.mo6846k4("w", c3059ii, "docPartGallery");
        }
        ef9 ef9Var2 = this.f24590x1;
        if (ef9Var2 != null) {
            ef9Var2.mo6846k4("w", c3059ii, "docPartCategory");
        }
        vsx vsxVar = this.f24589kk;
        if (vsxVar != null) {
            vsxVar.mo6846k4("w", c3059ii, "docPartUnique");
        }
        c3059ii.mo21898jd();
    }
}
