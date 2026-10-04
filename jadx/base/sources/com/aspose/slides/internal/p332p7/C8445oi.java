package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.oi */
/* JADX INFO: loaded from: classes4.dex */
public class C8445oi extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27954to = new C7017h4("sSubPr", "e", "sub");

    /* JADX INFO: renamed from: k4 */
    private C8947ue f27955k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f27956kk;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f27957x1;

    public C8445oi() {
        this.f27957x1 = new C9085w3();
        this.f27956kk = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C8947ue m38276k4() {
        if (this.f27955k4 != null) {
            throw new Exception("Only one <sSubPr> element can be added.");
        }
        C8947ue c8947ue = new C8947ue();
        this.f27955k4 = c8947ue;
        return c8947ue;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m38277kk() {
        return this.f27957x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m38278to() {
        return this.f27956kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8947ue m38279x1() {
        return this.f27955k4;
    }

    public C8445oi(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8445oi.f27954to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8445oi.this.f27955k4 = new C8947ue(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8445oi.this.f27957x1 = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8445oi.this.f27956kk = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8947ue c8947ue = this.f27955k4;
        if (c8947ue != null) {
            c8947ue.mo6846k4("m", c3059ii, "sSubPr");
        }
        this.f27957x1.mo6846k4("m", c3059ii, "e");
        this.f27956kk.mo6846k4("m", c3059ii, "sub");
        c3059ii.mo21898jd();
    }
}
