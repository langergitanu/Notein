package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.e7 */
/* JADX INFO: loaded from: classes4.dex */
public class C7537e7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22004kk = new C7017h4("boxPr", "e");

    /* JADX INFO: renamed from: k4 */
    private C7794gs f22005k4;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f22006x1;

    public C7537e7() {
        this.f22006x1 = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7794gs m30798k4() {
        if (this.f22005k4 != null) {
            throw new Exception("Only one <boxPr> element can be added.");
        }
        C7794gs c7794gs = new C7794gs();
        this.f22005k4 = c7794gs;
        return c7794gs;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m30799kk() {
        return this.f22006x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7794gs m30800x1() {
        return this.f22005k4;
    }

    public C7537e7(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.e7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7537e7.f22004kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7537e7.this.f22005k4 = new C7794gs(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7537e7.this.f22006x1 = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7794gs c7794gs = this.f22005k4;
        if (c7794gs != null) {
            c7794gs.mo6846k4("m", c3059ii, "boxPr");
        }
        this.f22006x1.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
