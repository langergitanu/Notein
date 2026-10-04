package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class hgq extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24073to = new C7017h4("URI", "CertDigest", "IssuerSerial");

    /* JADX INFO: renamed from: k4 */
    private String f24074k4;

    /* JADX INFO: renamed from: kk */
    private C8620qr f24075kk;

    /* JADX INFO: renamed from: x1 */
    private C7433cs f24076x1;

    public hgq() {
        this.f24076x1 = new C7433cs();
        this.f24075kk = new C8620qr();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7433cs m33341k4() {
        return this.f24076x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8620qr m33342x1() {
        return this.f24075kk;
    }

    public hgq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hgq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (hgq.f24073to.m27428k4(str) != 0) {
                    return false;
                }
                hgq.this.f24074k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hgq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = hgq.f24073to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    hgq.this.f24076x1 = new C7433cs(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    hgq.this.f24075kk = new C8620qr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f24074k4;
        if (str3 != null) {
            c3059ii.m12955x1("URI", str3);
        }
        this.f24076x1.mo6846k4("xd", c3059ii, "CertDigest");
        this.f24075kk.mo6846k4("xd", c3059ii, "IssuerSerial");
        c3059ii.mo21898jd();
    }
}
