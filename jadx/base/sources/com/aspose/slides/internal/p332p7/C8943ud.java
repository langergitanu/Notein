package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ud */
/* JADX INFO: loaded from: classes4.dex */
public class C8943ud extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31213x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private int f31214k4;

    public C8943ud() {
        m42318x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42318x1() {
        this.f31214k4 = -1;
    }

    public C8943ud(AbstractC13912i5 abstractC13912i5) {
        m42318x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ud.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8943ud.f31213x1.m27428k4(str) != 0) {
                    return false;
                }
                C8943ud.this.f31214k4 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31214k4;
        if (i != -1) {
            c3059ii.m12955x1("val", C13850af.m65103k4(i));
        }
        c3059ii.mo21898jd();
    }
}
