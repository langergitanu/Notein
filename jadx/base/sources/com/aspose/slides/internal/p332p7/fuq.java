package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class fuq extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f23054to = new C7017h4("shapeId", "r:id", "name");

    /* JADX INFO: renamed from: k4 */
    private long f23055k4;

    /* JADX INFO: renamed from: kk */
    private String f23056kk;

    /* JADX INFO: renamed from: x1 */
    private String f23057x1;

    public fuq() {
    }

    public fuq(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fuq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = fuq.f23054to.m27428k4(str);
                if (iM27428k4 == 0) {
                    fuq.this.f23055k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    fuq.this.f23057x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                fuq.this.f23056kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("shapeId", C13850af.m65147x1(this.f23055k4));
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f23057x1);
        String str3 = this.f23056kk;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        c3059ii.mo21898jd();
    }
}
