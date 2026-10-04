package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ap */
/* JADX INFO: loaded from: classes4.dex */
public class C7262ap extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20159kk = new C7017h4("uri");

    /* JADX INFO: renamed from: k4 */
    private String f20160k4;

    /* JADX INFO: renamed from: x1 */
    private C8249m9 f20161x1;

    public C7262ap() {
        this.f20161x1 = new C8249m9();
    }

    public C7262ap(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ap.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7262ap.f20159kk.m27428k4(str) != 0) {
                    return false;
                }
                C7262ap.this.f20160k4 = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    f20159kk.m27428k4(abstractC13912i5.mo65023fa());
                    this.f20161x1 = new C8249m9(abstractC13912i5);
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20160k4;
        if (str3 != null) {
            c3059ii.m12955x1("uri", str3);
        }
        this.f20161x1.mo6846k4("", c3059ii, "");
        c3059ii.mo21898jd();
    }
}
