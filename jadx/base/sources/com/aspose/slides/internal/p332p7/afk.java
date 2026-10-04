package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class afk extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20025to = new C7017h4("Target", "Id", "SignedProperties");

    /* JADX INFO: renamed from: k4 */
    private String f20026k4;

    /* JADX INFO: renamed from: kk */
    private kwh f20027kk;

    /* JADX INFO: renamed from: x1 */
    private String f20028x1;

    public afk() {
    }

    /* JADX INFO: renamed from: k4 */
    public final kwh m28205k4() {
        if (this.f20027kk != null) {
            throw new Exception("Only one <signedProperties> element can be added.");
        }
        kwh kwhVar = new kwh();
        this.f20027kk = kwhVar;
        return kwhVar;
    }

    public afk(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.afk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = afk.f20025to.m27428k4(str);
                if (iM27428k4 == 0) {
                    afk.this.f20026k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                afk.this.f20028x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.afk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (afk.f20025to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                afk.this.f20027kk = new kwh(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28206k4(String str) {
        this.f20026k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("xd", str2, "http://uri.etsi.org/01903/v1.3.2#");
        if (c3059ii.mo12952k4("http://www.w3.org/2000/09/xmldsig#") == null) {
            c3059ii.m12954to("xmlns", "", null, "http://www.w3.org/2000/09/xmldsig#");
        }
        c3059ii.m12955x1("Target", this.f20026k4);
        String str3 = this.f20028x1;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        kwh kwhVar = this.f20027kk;
        if (kwhVar != null) {
            kwhVar.mo6846k4("xd", c3059ii, "SignedProperties");
        }
        c3059ii.mo21898jd();
    }
}
