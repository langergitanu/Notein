package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zb */
/* JADX INFO: loaded from: classes4.dex */
public class C9357zb extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33853du = new C7017h4("l", "t", "r", "b");

    /* JADX INFO: renamed from: k4 */
    private double f33854k4;

    /* JADX INFO: renamed from: kk */
    private double f33855kk;

    /* JADX INFO: renamed from: to */
    private double f33856to;

    /* JADX INFO: renamed from: x1 */
    private double f33857x1;

    public C9357zb() {
        m45569x1();
    }

    public C9357zb(AbstractC13912i5 abstractC13912i5) {
        m45569x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9357zb.f33853du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9357zb.this.f33854k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9357zb.this.f33857x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C9357zb.this.f33855kk = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C9357zb.this.f33856to = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m45569x1() {
        this.f33854k4 = Double.NaN;
        this.f33857x1 = Double.NaN;
        this.f33855kk = Double.NaN;
        this.f33856to = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("l", C22238OooO0oO.OooO00o(this.f33854k4, 12700.0d, 14));
        c3059ii.m12955x1("t", C22238OooO0oO.OooO00o(this.f33857x1, 12700.0d, 14));
        c3059ii.m12955x1("r", C22238OooO0oO.OooO00o(this.f33855kk, 12700.0d, 14));
        c3059ii.m12955x1("b", C22238OooO0oO.OooO00o(this.f33856to, 12700.0d, 14));
        c3059ii.mo21898jd();
    }
}
