package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class vg7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31863to = new C7017h4("namespaceUri", "name", "url");

    /* JADX INFO: renamed from: k4 */
    private String f31864k4;

    /* JADX INFO: renamed from: kk */
    private String f31865kk;

    /* JADX INFO: renamed from: x1 */
    private String f31866x1;

    public vg7() {
    }

    public vg7(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vg7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = vg7.f31863to.m27428k4(str);
                if (iM27428k4 == 0) {
                    vg7.this.f31864k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    vg7.this.f31866x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                vg7.this.f31865kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f31864k4;
        if (str3 != null) {
            c3059ii.m12955x1("namespaceUri", str3);
        }
        String str4 = this.f31866x1;
        if (str4 != null) {
            c3059ii.m12955x1("name", str4);
        }
        String str5 = this.f31865kk;
        if (str5 != null) {
            c3059ii.m12955x1("url", str5);
        }
        c3059ii.mo21898jd();
    }
}
