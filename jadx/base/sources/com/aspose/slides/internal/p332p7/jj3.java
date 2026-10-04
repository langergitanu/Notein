package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jj3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25169kk = new C7017h4("chart:class", "chart:style-name");

    /* JADX INFO: renamed from: k4 */
    private int f25170k4;

    /* JADX INFO: renamed from: x1 */
    private String f25171x1;

    public jj3() {
        m34726to();
    }

    /* JADX INFO: renamed from: to */
    private void m34726to() {
        this.f25170k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m34727k4() {
        return this.f25170k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m34728x1() {
        return this.f25171x1;
    }

    public jj3(AbstractC13912i5 abstractC13912i5) {
        m34726to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jj3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jj3.f25169kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    jj3.this.f25170k4 = los.m36342k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                jj3.this.f25171x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("chart:class", los.m36343k4(this.f25170k4));
        String str3 = this.f25171x1;
        if (str3 != null) {
            c3059ii.m12955x1("chart:style-name", str3);
        }
        c3059ii.mo21898jd();
    }
}
