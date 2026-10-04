package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class c2j extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20890kk = new C7017h4("key", "val");

    /* JADX INFO: renamed from: k4 */
    private String f20891k4;

    /* JADX INFO: renamed from: x1 */
    private String f20892x1;

    public c2j() {
    }

    public c2j(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c2j.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = c2j.f20890kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    c2j.this.f20891k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                c2j.this.f20892x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("key", this.f20891k4);
        c3059ii.m12955x1("val", this.f20892x1);
        c3059ii.mo21898jd();
    }
}
