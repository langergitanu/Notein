package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class yin extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33395kk = new C7017h4("name", "r:id");

    /* JADX INFO: renamed from: k4 */
    private String f33396k4;

    /* JADX INFO: renamed from: x1 */
    private String f33397x1;

    public yin() {
    }

    public yin(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yin.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yin.f33395kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    yin.this.f33396k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                yin.this.f33397x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f33396k4);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f33397x1);
        c3059ii.mo21898jd();
    }
}
