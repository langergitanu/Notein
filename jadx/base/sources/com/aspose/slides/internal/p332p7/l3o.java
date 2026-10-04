package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class l3o extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f26065h4 = new C7017h4("workbookPassword", "revisionsPassword", "lockStructure", "lockWindows", "lockRevision");

    /* JADX INFO: renamed from: du */
    private boolean f26066du;

    /* JADX INFO: renamed from: k4 */
    private int f26067k4;

    /* JADX INFO: renamed from: kk */
    private boolean f26068kk;

    /* JADX INFO: renamed from: to */
    private boolean f26069to;

    /* JADX INFO: renamed from: x1 */
    private int f26070x1;

    public l3o() {
        m35843x1();
    }

    public l3o(AbstractC13912i5 abstractC13912i5) {
        m35843x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l3o.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = l3o.f26065h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    l3o.this.f26067k4 = C14081nv.m67064k4(str2, 515);
                    return true;
                }
                if (iM27428k4 == 1) {
                    l3o.this.f26070x1 = C14081nv.m67064k4(str2, 515);
                    return true;
                }
                if (iM27428k4 == 2) {
                    l3o.this.f26068kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    l3o.this.f26069to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                l3o.this.f26066du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35843x1() {
        this.f26067k4 = 65535;
        this.f26070x1 = 65535;
        this.f26068kk = false;
        this.f26069to = false;
        this.f26066du = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26067k4;
        if ((i & 65535) != 65535) {
            c3059ii.m12955x1("workbookPassword", C14057f9.m66587k4(i & 65535, "X4"));
        }
        int i2 = this.f26070x1;
        if ((i2 & 65535) != 65535) {
            c3059ii.m12955x1("revisionsPassword", C14057f9.m66587k4(i2 & 65535, "X4"));
        }
        boolean z = this.f26068kk;
        if (z) {
            c3059ii.m12955x1("lockStructure", z ? "1" : "0");
        }
        boolean z2 = this.f26069to;
        if (z2) {
            c3059ii.m12955x1("lockWindows", z2 ? "1" : "0");
        }
        boolean z3 = this.f26066du;
        if (z3) {
            c3059ii.m12955x1("lockRevision", z3 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
