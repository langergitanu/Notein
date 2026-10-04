package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dk */
/* JADX INFO: loaded from: classes4.dex */
public class C7488dk extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21683to = new C7017h4("isComment", "cpLocks", "extLst");

    /* JADX INFO: renamed from: k4 */
    private boolean f21684k4;

    /* JADX INFO: renamed from: kk */
    private C8397nz f21685kk;

    /* JADX INFO: renamed from: x1 */
    private C7450cz f21686x1;

    public C7488dk() {
        m30392x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30392x1() {
        this.f21684k4 = true;
    }

    public C7488dk(final AbstractC13912i5 abstractC13912i5) {
        m30392x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7488dk.f21683to.m27428k4(str) != 0) {
                    return false;
                }
                C7488dk.this.f21684k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7488dk.f21683to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7488dk.this.f21686x1 = new C7450cz(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7488dk.this.f21685kk = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f21684k4;
        if (!z) {
            c3059ii.m12955x1("isComment", z ? "1" : "0");
        }
        C7450cz c7450cz = this.f21686x1;
        if (c7450cz != null) {
            c7450cz.mo6846k4("a14", c3059ii, "cpLocks");
        }
        C8397nz c8397nz = this.f21685kk;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a14", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
