package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class cjv extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21105kk = new C7017h4("w_DisplayText", "w_Value");

    /* JADX INFO: renamed from: k4 */
    private String f21106k4;

    /* JADX INFO: renamed from: x1 */
    private String f21107x1;

    public cjv() {
    }

    public cjv(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cjv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = cjv.f21105kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    cjv.this.f21106k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                cjv.this.f21107x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21106k4;
        if (str3 != null) {
            c3059ii.m12955x1("w:displayText", str3);
        }
        String str4 = this.f21107x1;
        if (str4 != null) {
            c3059ii.m12955x1("w:value", str4);
        }
        c3059ii.mo21898jd();
    }
}
