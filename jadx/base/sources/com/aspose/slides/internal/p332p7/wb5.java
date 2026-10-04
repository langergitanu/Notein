package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class wb5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32257du = new C7017h4("table:style-name", "table:paragraph-style-name", "text:style-name", "text:paragraph-style-name");

    /* JADX INFO: renamed from: k4 */
    private String f32258k4;

    /* JADX INFO: renamed from: kk */
    private String f32259kk;

    /* JADX INFO: renamed from: to */
    private String f32260to;

    /* JADX INFO: renamed from: x1 */
    private String f32261x1;

    public wb5() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m43610k4() {
        return this.f32258k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43611x1() {
        return this.f32259kk;
    }

    public wb5(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wb5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wb5.f32257du.m27428k4(str);
                if (iM27428k4 == 0) {
                    wb5.this.f32258k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    wb5.this.f32261x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    wb5.this.f32259kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                wb5.this.f32260to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:style-name", this.f32258k4);
        c3059ii.m12955x1("table:paragraph-style-name", this.f32261x1);
        c3059ii.m12955x1("text:style-name", this.f32259kk);
        c3059ii.m12955x1("text:paragraph-style-name", this.f32260to);
        c3059ii.mo21898jd();
    }
}
