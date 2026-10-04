package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class hn7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f24231k4 = hcm.m33284k4("none");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24232to = new C7017h4("style", "color");

    /* JADX INFO: renamed from: kk */
    private bz0 f24233kk;

    /* JADX INFO: renamed from: x1 */
    private int f24234x1;

    public hn7() {
        m33531x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m33531x1() {
        this.f24234x1 = f24231k4;
    }

    public hn7(final AbstractC13912i5 abstractC13912i5) {
        m33531x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hn7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (hn7.f24232to.m27428k4(str) != 0) {
                    return false;
                }
                hn7.this.f24234x1 = hcm.m33284k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hn7.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (hn7.f24232to.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                hn7.this.f24233kk = new bz0(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24234x1;
        if (i != f24231k4) {
            c3059ii.m12955x1("style", hcm.m33285k4(i));
        }
        bz0 bz0Var = this.f24233kk;
        if (bz0Var != null) {
            bz0Var.mo6846k4("ssml", c3059ii, "color");
        }
        c3059ii.mo21898jd();
    }
}
