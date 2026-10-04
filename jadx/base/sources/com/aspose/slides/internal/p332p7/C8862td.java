package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.td */
/* JADX INFO: loaded from: classes4.dex */
public class C8862td extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f30712du = new C7017h4("row", "col", "rowOffset", "colOffset");

    /* JADX INFO: renamed from: k4 */
    private int f30713k4;

    /* JADX INFO: renamed from: kk */
    private double f30714kk;

    /* JADX INFO: renamed from: to */
    private double f30715to;

    /* JADX INFO: renamed from: x1 */
    private int f30716x1;

    public C8862td() {
        m41688x1();
    }

    public C8862td(AbstractC13912i5 abstractC13912i5) {
        m41688x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.td.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8862td.f30712du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8862td.this.f30713k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8862td.this.f30716x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8862td.this.f30714kk = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8862td.this.f30715to = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41688x1() {
        this.f30714kk = Double.NaN;
        this.f30715to = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("row", C13850af.m65103k4(this.f30713k4));
        c3059ii.m12955x1("col", C13850af.m65103k4(this.f30716x1));
        c3059ii.m12955x1("rowOffset", C22238OooO0oO.OooO00o(this.f30714kk, 12700.0d, 14));
        c3059ii.m12955x1("colOffset", C22238OooO0oO.OooO00o(this.f30715to, 12700.0d, 14));
        c3059ii.mo21898jd();
    }
}
