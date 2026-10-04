package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class sdr extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30087kk = new C7017h4("autoPageBreaks", "fitToPage");

    /* JADX INFO: renamed from: k4 */
    private boolean f30088k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f30089x1;

    public sdr() {
        m40975x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m40975x1() {
        this.f30088k4 = true;
        this.f30089x1 = false;
    }

    public sdr(AbstractC13912i5 abstractC13912i5) {
        m40975x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sdr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = sdr.f30087kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    sdr.this.f30088k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                sdr.this.f30089x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f30088k4;
        if (!z) {
            c3059ii.m12955x1("autoPageBreaks", z ? "1" : "0");
        }
        boolean z2 = this.f30089x1;
        if (z2) {
            c3059ii.m12955x1("fitToPage", z2 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
