package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ke */
/* JADX INFO: loaded from: classes4.dex */
public class C8079ke extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25614kk = new C7017h4("tcTxStyle", "tcStyle");

    /* JADX INFO: renamed from: k4 */
    private C9259y5 f25615k4;

    /* JADX INFO: renamed from: x1 */
    private C8686rm f25616x1;

    public C8079ke() {
    }

    /* JADX INFO: renamed from: kk */
    public final C9259y5 m35311kk() {
        return this.f25615k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8686rm m35312to() {
        return this.f25616x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8686rm m35313x1() {
        if (this.f25616x1 != null) {
            throw new Exception("Only one <tcStyle> element can be added.");
        }
        C8686rm c8686rm = new C8686rm();
        this.f25616x1 = c8686rm;
        return c8686rm;
    }

    public C8079ke(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ke.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8079ke.f25614kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8079ke.this.f25615k4 = new C9259y5(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8079ke.this.f25616x1 = new C8686rm(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9259y5 m35310k4() {
        if (this.f25615k4 != null) {
            throw new Exception("Only one <tcTxStyle> element can be added.");
        }
        C9259y5 c9259y5 = new C9259y5();
        this.f25615k4 = c9259y5;
        return c9259y5;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9259y5 c9259y5 = this.f25615k4;
        if (c9259y5 != null) {
            c9259y5.mo6846k4("a", c3059ii, "tcTxStyle");
        }
        C8686rm c8686rm = this.f25616x1;
        if (c8686rm != null) {
            c8686rm.mo6846k4("a", c3059ii, "tcStyle");
        }
        c3059ii.mo21898jd();
    }
}
