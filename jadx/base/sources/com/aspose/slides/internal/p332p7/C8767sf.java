package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sf */
/* JADX INFO: loaded from: classes4.dex */
public class C8767sf extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30098to = new C7017h4("txBox", "spLocks", "extLst");

    /* JADX INFO: renamed from: k4 */
    private boolean f30099k4;

    /* JADX INFO: renamed from: kk */
    private C8397nz f30100kk;

    /* JADX INFO: renamed from: x1 */
    private C8505pa f30101x1;

    public C8767sf() {
        m40993h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m40993h4() {
        this.f30099k4 = false;
    }

    /* JADX INFO: renamed from: kk */
    public final C8505pa m41000kk() {
        return this.f30101x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m41001to() {
        return this.f30100kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m41002x1() {
        return this.f30099k4;
    }

    public C8767sf(final AbstractC13912i5 abstractC13912i5) {
        m40993h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8767sf.f30098to.m27428k4(str) != 0) {
                    return false;
                }
                C8767sf.this.f30099k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8767sf.f30098to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C8767sf.this.f30101x1 = new C8505pa(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8767sf.this.f30100kk = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8505pa m40997k4() {
        if (this.f30101x1 != null) {
            throw new Exception("Only one <spLocks> element can be added.");
        }
        C8505pa c8505pa = new C8505pa();
        this.f30101x1 = c8505pa;
        return c8505pa;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40998k4(AbstractC7414ck abstractC7414ck) {
        this.f30100kk = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f30099k4;
        if (z) {
            c3059ii.m12955x1("txBox", z ? "1" : "0");
        }
        C8505pa c8505pa = this.f30101x1;
        if (c8505pa != null) {
            c8505pa.mo6846k4("a", c3059ii, "spLocks");
        }
        C8397nz c8397nz = this.f30100kk;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40999k4(boolean z) {
        this.f30099k4 = z;
    }
}
