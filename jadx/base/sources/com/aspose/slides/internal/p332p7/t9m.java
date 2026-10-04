package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class t9m extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30629to = new C7017h4("prst", "invX", "invY");

    /* JADX INFO: renamed from: k4 */
    private String f30630k4;

    /* JADX INFO: renamed from: kk */
    private boolean f30631kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f30632x1;

    public t9m() {
        m41611to();
    }

    /* JADX INFO: renamed from: to */
    private void m41611to() {
        this.f30632x1 = false;
        this.f30631kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m41613k4() {
        return this.f30630k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m41616x1() {
        return this.f30632x1;
    }

    public t9m(AbstractC13912i5 abstractC13912i5) {
        m41611to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.t9m.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = t9m.f30629to.m27428k4(str);
                if (iM27428k4 == 0) {
                    t9m.this.f30630k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    t9m.this.f30632x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                t9m.this.f30631kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41614k4(String str) {
        this.f30630k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30630k4;
        if (str3 != null) {
            c3059ii.m12955x1("prst", str3);
        }
        boolean z = this.f30632x1;
        if (z) {
            c3059ii.m12955x1("invX", z ? "1" : "0");
        }
        boolean z2 = this.f30631kk;
        if (z2) {
            c3059ii.m12955x1("invY", z2 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41615k4(boolean z) {
        this.f30632x1 = z;
    }
}
