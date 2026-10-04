package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ey */
/* JADX INFO: loaded from: classes4.dex */
public class C7613ey extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22521to = new C7017h4("funcPr", "fName", "e");

    /* JADX INFO: renamed from: k4 */
    private C8229lz f22522k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f22523kk;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f22524x1;

    public C7613ey() {
        this.f22524x1 = new C9085w3();
        this.f22523kk = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C8229lz m31429k4() {
        if (this.f22522k4 != null) {
            throw new Exception("Only one <funcPr> element can be added.");
        }
        C8229lz c8229lz = new C8229lz();
        this.f22522k4 = c8229lz;
        return c8229lz;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m31430kk() {
        return this.f22524x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m31431to() {
        return this.f22523kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8229lz m31432x1() {
        return this.f22522k4;
    }

    public C7613ey(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ey.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7613ey.f22521to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7613ey.this.f22522k4 = new C8229lz(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7613ey.this.f22524x1 = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7613ey.this.f22523kk = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8229lz c8229lz = this.f22522k4;
        if (c8229lz != null) {
            c8229lz.mo6846k4("m", c3059ii, "funcPr");
        }
        this.f22524x1.mo6846k4("m", c3059ii, "fName");
        this.f22523kk.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
