package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.s2 */
/* JADX INFO: loaded from: classes4.dex */
public class C8734s2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f29872du = new C7017h4("wR", "hR", "stAng", "swAng");

    /* JADX INFO: renamed from: k4 */
    private String f29873k4;

    /* JADX INFO: renamed from: kk */
    private String f29874kk;

    /* JADX INFO: renamed from: to */
    private String f29875to;

    /* JADX INFO: renamed from: x1 */
    private String f29876x1;

    public C8734s2() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40727k4() {
        return this.f29873k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m40729kk() {
        return this.f29874kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m40731to() {
        return this.f29875to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m40733x1() {
        return this.f29876x1;
    }

    public C8734s2(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8734s2.f29872du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8734s2.this.f29873k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8734s2.this.f29876x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8734s2.this.f29874kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8734s2.this.f29875to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40728k4(String str) {
        this.f29873k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m40730kk(String str) {
        this.f29874kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m40732to(String str) {
        this.f29875to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40734x1(String str) {
        this.f29876x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("wR", this.f29873k4);
        c3059ii.m12955x1("hR", this.f29876x1);
        c3059ii.m12955x1("stAng", this.f29874kk);
        c3059ii.m12955x1("swAng", this.f29875to);
        c3059ii.mo21898jd();
    }
}
