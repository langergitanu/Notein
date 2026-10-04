package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class cs2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21211to = new C7017h4("cNvPr", "cNvContentPartPr", "nvPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f21212k4;

    /* JADX INFO: renamed from: kk */
    private gt8 f21213kk;

    /* JADX INFO: renamed from: x1 */
    private C7488dk f21214x1;

    public cs2() {
        this.f21212k4 = new C7632f3();
        this.f21213kk = new gt8();
    }

    /* JADX INFO: renamed from: kk */
    public final gt8 m29764kk() {
        return this.f21213kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7488dk m29765x1() {
        return this.f21214x1;
    }

    public cs2(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cs2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = cs2.f21211to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    cs2.this.f21212k4 = new C7632f3(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    cs2.this.f21214x1 = new C7488dk(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    cs2.this.f21213kk = new gt8(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7632f3 m29762k4() {
        return this.f21212k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29763k4(C7488dk c7488dk) {
        this.f21214x1 = c7488dk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f21212k4.mo6846k4("p14", c3059ii, "cNvPr");
        C7488dk c7488dk = this.f21214x1;
        if (c7488dk != null) {
            c7488dk.mo6846k4("p14", c3059ii, "cNvContentPartPr");
        }
        this.f21213kk.mo6846k4("p14", c3059ii, "nvPr");
        c3059ii.mo21898jd();
    }
}
