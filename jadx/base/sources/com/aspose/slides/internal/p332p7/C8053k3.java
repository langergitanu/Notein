package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.k3 */
/* JADX INFO: loaded from: classes4.dex */
public class C8053k3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25434h4 = new C7017h4("X509IssuerSerial", "X509SKI", "X509SubjectName", "X509Certificate", "X509CRL");

    /* JADX INFO: renamed from: du */
    private String f25435du;

    /* JADX INFO: renamed from: k4 */
    private C8620qr f25436k4;

    /* JADX INFO: renamed from: kk */
    private String f25437kk;

    /* JADX INFO: renamed from: to */
    private String f25438to;

    /* JADX INFO: renamed from: x1 */
    private String f25439x1;

    public C8053k3() {
    }

    public C8053k3(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.k3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8053k3.f25434h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8053k3.this.f25436k4 = new C8620qr(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8053k3.this.f25439x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8053k3 c8053k3 = C8053k3.this;
                            c8053k3.f25439x1 = C14113y2.m67400k4(c8053k3.f25439x1, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 2) {
                    C8053k3.this.f25437kk = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8053k3 c8053k32 = C8053k3.this;
                            c8053k32.f25437kk = C14113y2.m67400k4(c8053k32.f25437kk, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 3) {
                    C8053k3.this.f25438to = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8053k3 c8053k33 = C8053k3.this;
                            c8053k33.f25438to = C14113y2.m67400k4(c8053k33.f25438to, abstractC13912i5.mo65052v4());
                        }
                    }
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C8053k3.this.f25435du = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8053k3 c8053k34 = C8053k3.this;
                            c8053k34.f25435du = C14113y2.m67400k4(c8053k34.f25435du, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35093k4() {
        return this.f25438to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35094k4(String str) {
        this.f25438to = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8620qr c8620qr = this.f25436k4;
        if (c8620qr != null) {
            c8620qr.mo6846k4("", c3059ii, "X509IssuerSerial");
        }
        String str3 = this.f25439x1;
        if (str3 != null) {
            m29301k4("", c3059ii, "X509SKI", str3, false);
        }
        String str4 = this.f25437kk;
        if (str4 != null) {
            m29301k4("", c3059ii, "X509SubjectName", str4, false);
        }
        String str5 = this.f25438to;
        if (str5 != null) {
            m29301k4("", c3059ii, "X509Certificate", str5, false);
        }
        String str6 = this.f25435du;
        if (str6 != null) {
            m29301k4("", c3059ii, "X509CRL", str6, false);
        }
        c3059ii.mo21898jd();
    }
}
