package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class cdv extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f21037h4 = new C7017h4("table:name", "table:source-name", "table:object-name", "table:user-name", "table:password");

    /* JADX INFO: renamed from: du */
    private String f21038du;

    /* JADX INFO: renamed from: k4 */
    private String f21039k4;

    /* JADX INFO: renamed from: kk */
    private String f21040kk;

    /* JADX INFO: renamed from: to */
    private String f21041to;

    /* JADX INFO: renamed from: x1 */
    private String f21042x1;

    public cdv() {
    }

    public cdv(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cdv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = cdv.f21037h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    cdv.this.f21039k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    cdv.this.f21042x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    cdv.this.f21040kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    cdv.this.f21041to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                cdv.this.f21038du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f21039k4);
        c3059ii.m12955x1("table:source-name", this.f21042x1);
        c3059ii.m12955x1("table:object-name", this.f21040kk);
        String str3 = this.f21041to;
        if (str3 != null) {
            c3059ii.m12955x1("table:user-name", str3);
        }
        String str4 = this.f21038du;
        if (str4 != null) {
            c3059ii.m12955x1("table:password", str4);
        }
        c3059ii.mo21898jd();
    }
}
