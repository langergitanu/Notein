package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class eg4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22224kk = new C7017h4("CommitmentTypeId", "AllSignedDataObjects");

    /* JADX INFO: renamed from: k4 */
    private wd3 f22225k4;

    /* JADX INFO: renamed from: x1 */
    private String f22226x1;

    public eg4() {
        this.f22225k4 = new wd3();
    }

    /* JADX INFO: renamed from: k4 */
    public final wd3 m31071k4() {
        return this.f22225k4;
    }

    public eg4(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eg4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = eg4.f22224kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    eg4.this.f22225k4 = new wd3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    eg4.this.f22226x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            eg4 eg4Var = eg4.this;
                            eg4Var.f22226x1 = C14113y2.m67400k4(eg4Var.f22226x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31072k4(String str) {
        this.f22226x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f22225k4.mo6846k4("xd", c3059ii, "CommitmentTypeId");
        m29301k4("xd", c3059ii, "AllSignedDataObjects", this.f22226x1, false);
        c3059ii.mo21898jd();
    }
}
