package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class s8c extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29959to = new C7017h4("sectionId", "zmPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C14047bz f29960k4 = new C14047bz();

    /* JADX INFO: renamed from: kk */
    private ltr f29961kk;

    /* JADX INFO: renamed from: x1 */
    private ov2 f29962x1;

    public s8c() {
        m40822to();
        this.f29962x1 = new ov2();
    }

    /* JADX INFO: renamed from: to */
    private void m40822to() {
        C14047bz.f47172k4.CloneTo(this.f29960k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final ov2 m40825x1() {
        return this.f29962x1;
    }

    public s8c(final AbstractC13912i5 abstractC13912i5) {
        m40822to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s8c.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (s8c.f29959to.m27428k4(str) != 0) {
                    return false;
                }
                s8c.this.f29960k4 = new C14047bz(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.s8c.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = s8c.f29959to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    s8c.this.f29962x1 = new ov2(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    s8c.this.f29961kk = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m40823k4() {
        return this.f29960k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40824k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f29960k4);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("sectionId", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f29960k4), "}"));
        this.f29962x1.mo6846k4("psez", c3059ii, "zmPr");
        ltr ltrVar = this.f29961kk;
        if (ltrVar != null) {
            ltrVar.mo6846k4("psez", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
