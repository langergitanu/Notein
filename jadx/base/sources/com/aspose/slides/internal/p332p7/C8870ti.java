package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ti */
/* JADX INFO: loaded from: classes4.dex */
public class C8870ti extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f30752du = new C7017h4("Id", "Target", "SignatureTime", "SignatureInfoV1");

    /* JADX INFO: renamed from: k4 */
    private String f30753k4;

    /* JADX INFO: renamed from: kk */
    private C9412zx f30754kk;

    /* JADX INFO: renamed from: to */
    private C8941uc f30755to;

    /* JADX INFO: renamed from: x1 */
    private String f30756x1;

    public C8870ti() {
    }

    /* JADX INFO: renamed from: du */
    public final C8941uc m41731du() {
        return this.f30755to;
    }

    /* JADX INFO: renamed from: kk */
    public final String m41734kk() {
        return this.f30753k4;
    }

    /* JADX INFO: renamed from: to */
    public final C9412zx m41735to() {
        return this.f30754kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8941uc m41736x1() {
        if (this.f30755to != null) {
            throw new Exception("Only one <signatureInfoV1> element can be added.");
        }
        C8941uc c8941uc = new C8941uc();
        this.f30755to = c8941uc;
        return c8941uc;
    }

    public C8870ti(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ti.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8870ti.f30752du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8870ti.this.f30753k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8870ti.this.f30756x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ti.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8870ti.f30752du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8870ti.this.f30754kk = new C9412zx(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8870ti.this.f30755to = new C8941uc(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9412zx m41732k4() {
        if (this.f30754kk != null) {
            throw new Exception("Only one <signatureTime> element can be added.");
        }
        C9412zx c9412zx = new C9412zx();
        this.f30754kk = c9412zx;
        return c9412zx;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m41737x1(String str) {
        this.f30756x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41733k4(String str) {
        this.f30753k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30753k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        c3059ii.m12955x1("Target", this.f30756x1);
        C9412zx c9412zx = this.f30754kk;
        if (c9412zx != null) {
            c9412zx.mo6846k4("", c3059ii, "SignatureTime");
        }
        C8941uc c8941uc = this.f30755to;
        if (c8941uc != null) {
            c8941uc.mo6846k4("", c3059ii, "SignatureInfoV1");
        }
        c3059ii.mo21898jd();
    }
}
