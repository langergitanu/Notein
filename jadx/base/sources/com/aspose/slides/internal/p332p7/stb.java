package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class stb extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30374to = new C7017h4("draw:shape-id", "draw:color", "sound");

    /* JADX INFO: renamed from: k4 */
    private String f30375k4;

    /* JADX INFO: renamed from: kk */
    private os6 f30376kk;

    /* JADX INFO: renamed from: x1 */
    private String f30377x1;

    public stb() {
    }

    public stb(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.stb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = stb.f30374to.m27428k4(str);
                if (iM27428k4 == 0) {
                    stb.this.f30375k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                stb.this.f30377x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.stb.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (stb.f30374to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                stb.this.f30376kk = new os6(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:shape-id", this.f30375k4);
        c3059ii.m12955x1("draw:color", this.f30377x1);
        os6 os6Var = this.f30376kk;
        if (os6Var != null) {
            os6Var.mo6846k4("presentation", c3059ii, "sound");
        }
        c3059ii.mo21898jd();
    }
}
