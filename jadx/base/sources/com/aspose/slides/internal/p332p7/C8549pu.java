package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pu */
/* JADX INFO: loaded from: classes4.dex */
public class C8549pu extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28582kk = new C7017h4("rPr", "t");

    /* JADX INFO: renamed from: k4 */
    private C9135ws f28583k4;

    /* JADX INFO: renamed from: x1 */
    private String f28584x1;

    public C8549pu() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C9135ws m39135k4() {
        if (this.f28583k4 != null) {
            throw new Exception("Only one <rPr> element can be added.");
        }
        C9135ws c9135ws = new C9135ws();
        this.f28583k4 = c9135ws;
        return c9135ws;
    }

    /* JADX INFO: renamed from: kk */
    public final String m39137kk() {
        return this.f28584x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9135ws m39138x1() {
        return this.f28583k4;
    }

    public C8549pu(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8549pu.f28582kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8549pu.this.f28583k4 = new C9135ws(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8549pu.this.f28584x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8549pu c8549pu = C8549pu.this;
                            c8549pu.f28584x1 = C14113y2.m67400k4(c8549pu.f28584x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39136k4(String str) {
        this.f28584x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9135ws c9135ws = this.f28583k4;
        if (c9135ws != null) {
            c9135ws.mo6846k4("a", c3059ii, "rPr");
        }
        m29301k4("a", c3059ii, "t", this.f28584x1, false);
        c3059ii.mo21898jd();
    }
}
