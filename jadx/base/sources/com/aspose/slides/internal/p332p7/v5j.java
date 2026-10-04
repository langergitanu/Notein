package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class v5j extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31547k4 = tii.m41744k4("single");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31548kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f31549x1;

    public v5j() {
        m42730x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42730x1() {
        this.f31549x1 = f31547k4;
    }

    public v5j(AbstractC13912i5 abstractC13912i5) {
        m42730x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.v5j.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (v5j.f31548kk.m27428k4(str) != 0) {
                    return false;
                }
                v5j.this.f31549x1 = tii.m41744k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31549x1;
        if (i != f31547k4) {
            c3059ii.m12955x1("val", tii.m41745k4(i));
        }
        c3059ii.mo21898jd();
    }
}
