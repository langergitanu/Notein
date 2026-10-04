package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.b2 */
/* JADX INFO: loaded from: classes4.dex */
public class C7291b2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20395to = new C7017h4("useA", "clrFrom", "clrTo");

    /* JADX INFO: renamed from: k4 */
    private boolean f20396k4;

    /* JADX INFO: renamed from: kk */
    private C7447cx f20397kk;

    /* JADX INFO: renamed from: x1 */
    private C7447cx f20398x1;

    public C7291b2() {
        m28684du();
        this.f20398x1 = new C7447cx();
        this.f20397kk = new C7447cx();
    }

    /* JADX INFO: renamed from: du */
    private void m28684du() {
        this.f20396k4 = true;
    }

    /* JADX INFO: renamed from: kk */
    public final C7447cx m28691kk() {
        return this.f20397kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7447cx m28692x1() {
        return this.f20398x1;
    }

    public C7291b2(final AbstractC13912i5 abstractC13912i5) {
        m28684du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.b2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7291b2.f20395to.m27428k4(str) != 0) {
                    return false;
                }
                C7291b2.this.f20396k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.b2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7291b2.f20395to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7291b2.this.f20398x1 = new C7447cx(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7291b2.this.f20397kk = new C7447cx(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f20396k4;
        if (!z) {
            c3059ii.m12955x1("useA", z ? "1" : "0");
        }
        this.f20398x1.mo6846k4("a", c3059ii, "clrFrom");
        this.f20397kk.mo6846k4("a", c3059ii, "clrTo");
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28689k4(boolean z) {
        this.f20396k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m28690k4() {
        return this.f20396k4;
    }
}
