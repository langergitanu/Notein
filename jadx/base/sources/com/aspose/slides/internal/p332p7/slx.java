package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class slx extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30231to = new C7017h4("w_Name", "w_Shapeid", "r:id");

    /* JADX INFO: renamed from: k4 */
    private String f30232k4;

    /* JADX INFO: renamed from: kk */
    private String f30233kk;

    /* JADX INFO: renamed from: x1 */
    private String f30234x1;

    public slx() {
    }

    public slx(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.slx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = slx.f30231to.m27428k4(str);
                if (iM27428k4 == 0) {
                    slx.this.f30232k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    slx.this.f30234x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                slx.this.f30233kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30232k4;
        if (str3 != null) {
            c3059ii.m12955x1("w:name", str3);
        }
        String str4 = this.f30234x1;
        if (str4 != null) {
            c3059ii.m12955x1("w:shapeid", str4);
        }
        if (this.f30233kk != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f30233kk);
        }
        c3059ii.mo21898jd();
    }
}
