package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jkd extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25187h4 = new C7017h4("ref", "r:id", "location", "tooltip", "display");

    /* JADX INFO: renamed from: du */
    private String f25188du;

    /* JADX INFO: renamed from: k4 */
    private String f25189k4;

    /* JADX INFO: renamed from: kk */
    private String f25190kk;

    /* JADX INFO: renamed from: to */
    private String f25191to;

    /* JADX INFO: renamed from: x1 */
    private String f25192x1;

    public jkd() {
    }

    public jkd(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jkd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jkd.f25187h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    jkd.this.f25189k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    jkd.this.f25192x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    jkd.this.f25190kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    jkd.this.f25191to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                jkd.this.f25188du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("ref", this.f25189k4);
        if (this.f25192x1 != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f25192x1);
        }
        String str3 = this.f25190kk;
        if (str3 != null) {
            c3059ii.m12955x1("location", str3);
        }
        String str4 = this.f25191to;
        if (str4 != null) {
            c3059ii.m12955x1("tooltip", str4);
        }
        String str5 = this.f25188du;
        if (str5 != null) {
            c3059ii.m12955x1("display", str5);
        }
        c3059ii.mo21898jd();
    }
}
