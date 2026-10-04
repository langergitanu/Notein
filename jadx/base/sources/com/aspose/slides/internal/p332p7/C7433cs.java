package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cs */
/* JADX INFO: loaded from: classes4.dex */
public class C7433cs extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21206kk = new C7017h4("DigestMethod", "DigestValue");

    /* JADX INFO: renamed from: k4 */
    private C7696fs f21207k4;

    /* JADX INFO: renamed from: x1 */
    private String f21208x1;

    public C7433cs() {
        this.f21207k4 = new C7696fs();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7696fs m29756k4() {
        return this.f21207k4;
    }

    public C7433cs(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cs.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7433cs.f21206kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7433cs.this.f21207k4 = new C7696fs(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7433cs.this.f21208x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7433cs c7433cs = C7433cs.this;
                            c7433cs.f21208x1 = C14113y2.m67400k4(c7433cs.f21208x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29757k4(String str) {
        this.f21208x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f21207k4.mo6846k4("", c3059ii, "DigestMethod");
        m29301k4("", c3059ii, "DigestValue", this.f21208x1, false);
        c3059ii.mo21898jd();
    }
}
