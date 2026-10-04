package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class g0g extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23148kk = new C7017h4("w_Author", "w_Date");

    /* JADX INFO: renamed from: k4 */
    private String f23149k4;

    /* JADX INFO: renamed from: x1 */
    private C14084qq f23150x1 = new C14084qq();

    public g0g() {
        m32210x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m32210x1() {
        C14084qq.f47299x1.CloneTo(this.f23150x1);
    }

    public g0g(AbstractC13912i5 abstractC13912i5) {
        m32210x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g0g.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = g0g.f23148kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    g0g.this.f23149k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(g0g.this.f23150x1);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:author", this.f23149k4);
        c3059ii.m12955x1("w:date", C13850af.m65108k4(this.f23150x1.Clone(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
        c3059ii.mo21898jd();
    }
}
