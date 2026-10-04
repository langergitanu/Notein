package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class eeo extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f22150k4 = axn.m28535k4("medium");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22151to = new C7017h4("draw:shape-id", "presentation:speed");

    /* JADX INFO: renamed from: kk */
    private int f22152kk;

    /* JADX INFO: renamed from: x1 */
    private String f22153x1;

    public eeo() {
        m30965x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30965x1() {
        this.f22152kk = f22150k4;
    }

    public eeo(AbstractC13912i5 abstractC13912i5) {
        m30965x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eeo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = eeo.f22151to.m27428k4(str);
                if (iM27428k4 == 0) {
                    eeo.this.f22153x1 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                eeo.this.f22152kk = axn.m28535k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:shape-id", this.f22153x1);
        int i = this.f22152kk;
        if (i != f22150k4) {
            c3059ii.m12955x1("presentation:speed", axn.m28536k4(i));
        }
        c3059ii.mo21898jd();
    }
}
