package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qr */
/* JADX INFO: loaded from: classes4.dex */
public class C8620qr extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28990kk = new C7017h4("X509IssuerName", "X509SerialNumber");

    /* JADX INFO: renamed from: k4 */
    private String f28991k4;

    /* JADX INFO: renamed from: x1 */
    private String f28992x1;

    public C8620qr() {
    }

    public C8620qr(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8620qr.f28990kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8620qr.this.f28991k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8620qr c8620qr = C8620qr.this;
                            c8620qr.f28991k4 = C14113y2.m67400k4(c8620qr.f28991k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8620qr.this.f28992x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8620qr c8620qr2 = C8620qr.this;
                            c8620qr2.f28992x1 = C14113y2.m67400k4(c8620qr2.f28992x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39638x1(String str) {
        this.f28992x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39637k4(String str) {
        this.f28991k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("", c3059ii, "X509IssuerName", this.f28991k4, false);
        m29301k4("", c3059ii, "X509SerialNumber", this.f28992x1, false);
        c3059ii.mo21898jd();
    }
}
