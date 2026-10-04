package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mi */
/* JADX INFO: loaded from: classes4.dex */
public class C8268mi extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26878x1 = new C7017h4("rad");

    /* JADX INFO: renamed from: k4 */
    private double f26879k4;

    public C8268mi() {
        m36968x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m36968x1() {
        this.f26879k4 = 0.0d;
    }

    public C8268mi(AbstractC13912i5 abstractC13912i5) {
        m36968x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8268mi.f26878x1.m27428k4(str) != 0) {
                    return false;
                }
                C8268mi.this.f26879k4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f26879k4;
        if (d != 0.0d) {
            c3059ii.m12955x1("rad", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        c3059ii.mo21898jd();
    }
}
