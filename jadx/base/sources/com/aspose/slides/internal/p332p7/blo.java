package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class blo extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f20616du = new C7017h4("autoRecover", "crashSave", "dataExtractLoad", "repairLoad");

    /* JADX INFO: renamed from: k4 */
    private boolean f20617k4;

    /* JADX INFO: renamed from: kk */
    private boolean f20618kk;

    /* JADX INFO: renamed from: to */
    private boolean f20619to;

    /* JADX INFO: renamed from: x1 */
    private boolean f20620x1;

    public blo() {
        m28987x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28987x1() {
        this.f20617k4 = true;
        this.f20620x1 = false;
        this.f20618kk = false;
        this.f20619to = false;
    }

    public blo(AbstractC13912i5 abstractC13912i5) {
        m28987x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.blo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = blo.f20616du.m27428k4(str);
                if (iM27428k4 == 0) {
                    blo.this.f20617k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    blo.this.f20620x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    blo.this.f20618kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                blo.this.f20619to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f20617k4;
        if (!z) {
            c3059ii.m12955x1("autoRecover", z ? "1" : "0");
        }
        boolean z2 = this.f20620x1;
        if (z2) {
            c3059ii.m12955x1("crashSave", z2 ? "1" : "0");
        }
        boolean z3 = this.f20618kk;
        if (z3) {
            c3059ii.m12955x1("dataExtractLoad", z3 ? "1" : "0");
        }
        boolean z4 = this.f20619to;
        if (z4) {
            c3059ii.m12955x1("repairLoad", z4 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
