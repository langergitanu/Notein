package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class xut extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33073kk = new C7017h4("dde-source", "table");

    /* JADX INFO: renamed from: k4 */
    private xtg f33074k4;

    /* JADX INFO: renamed from: x1 */
    private n6p f33075x1;

    public xut() {
        this.f33074k4 = new xtg();
        this.f33075x1 = new n6p();
    }

    public xut(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xut.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = xut.f33073kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    xut.this.f33074k4 = new xtg(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    xut.this.f33075x1 = new n6p(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f33074k4.mo6846k4("office", c3059ii, "dde-source");
        this.f33075x1.mo6846k4("table", c3059ii, "table");
        c3059ii.mo21898jd();
    }
}
