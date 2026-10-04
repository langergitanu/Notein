package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.iq */
/* JADX INFO: loaded from: classes4.dex */
public class C7952iq extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24885to = new C7017h4("preferRelativeResize", "picLocks", "extLst");

    /* JADX INFO: renamed from: k4 */
    private boolean f24886k4;

    /* JADX INFO: renamed from: kk */
    private C8397nz f24887kk;

    /* JADX INFO: renamed from: x1 */
    private C7850hh f24888x1;

    public C7952iq() {
        m34387h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m34387h4() {
        this.f24886k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7850hh m34391k4() {
        if (this.f24888x1 != null) {
            throw new Exception("Only one <picLocks> element can be added.");
        }
        C7850hh c7850hh = new C7850hh();
        this.f24888x1 = c7850hh;
        return c7850hh;
    }

    /* JADX INFO: renamed from: kk */
    public final C7850hh m34394kk() {
        return this.f24888x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m34395to() {
        return this.f24887kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m34396x1() {
        return this.f24886k4;
    }

    public C7952iq(final AbstractC13912i5 abstractC13912i5) {
        m34387h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.iq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7952iq.f24885to.m27428k4(str) != 0) {
                    return false;
                }
                C7952iq.this.f24886k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.iq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7952iq.f24885to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7952iq.this.f24888x1 = new C7850hh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7952iq.this.f24887kk = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34392k4(AbstractC7414ck abstractC7414ck) {
        this.f24887kk = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f24886k4;
        if (!z) {
            c3059ii.m12955x1("preferRelativeResize", z ? "1" : "0");
        }
        C7850hh c7850hh = this.f24888x1;
        if (c7850hh != null) {
            c7850hh.mo6846k4("a", c3059ii, "picLocks");
        }
        C8397nz c8397nz = this.f24887kk;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34393k4(boolean z) {
        this.f24886k4 = z;
    }
}
