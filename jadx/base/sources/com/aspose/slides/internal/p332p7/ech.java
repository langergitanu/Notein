package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ech extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22064to = new C7017h4("patternType", "fgColor", "bgColor");

    /* JADX INFO: renamed from: k4 */
    private int f22065k4;

    /* JADX INFO: renamed from: kk */
    private bz0 f22066kk;

    /* JADX INFO: renamed from: x1 */
    private bz0 f22067x1;

    public ech() {
        m30878x1();
    }

    public ech(final AbstractC13912i5 abstractC13912i5) {
        m30878x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ech.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (ech.f22064to.m27428k4(str) != 0) {
                    return false;
                }
                ech.this.f22065k4 = afy.m28219k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ech.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ech.f22064to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    ech.this.f22067x1 = new bz0(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    ech.this.f22066kk = new bz0(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m30878x1() {
        this.f22065k4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22065k4;
        if (i != 0) {
            c3059ii.m12955x1("patternType", afy.m28220k4(i));
        }
        bz0 bz0Var = this.f22067x1;
        if (bz0Var != null) {
            bz0Var.mo6846k4("ssml", c3059ii, "fgColor");
        }
        bz0 bz0Var2 = this.f22066kk;
        if (bz0Var2 != null) {
            bz0Var2.mo6846k4("ssml", c3059ii, "bgColor");
        }
        c3059ii.mo21898jd();
    }
}
