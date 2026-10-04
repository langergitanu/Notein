package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class pvz extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28606du = new C7017h4("table:style-name", "table:paragraph-style-name", "text:style-name", "text:paragraph-style-name");

    /* JADX INFO: renamed from: k4 */
    private String f28607k4;

    /* JADX INFO: renamed from: kk */
    private String f28608kk;

    /* JADX INFO: renamed from: to */
    private String f28609to;

    /* JADX INFO: renamed from: x1 */
    private String f28610x1;

    public pvz() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m39161k4() {
        return this.f28607k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39162x1() {
        return this.f28608kk;
    }

    public pvz(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pvz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = pvz.f28606du.m27428k4(str);
                if (iM27428k4 == 0) {
                    pvz.this.f28607k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    pvz.this.f28610x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    pvz.this.f28608kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                pvz.this.f28609to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:style-name", this.f28607k4);
        c3059ii.m12955x1("table:paragraph-style-name", this.f28610x1);
        c3059ii.m12955x1("text:style-name", this.f28608kk);
        c3059ii.m12955x1("text:paragraph-style-name", this.f28609to);
        c3059ii.mo21898jd();
    }
}
