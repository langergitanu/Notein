package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sl */
/* JADX INFO: loaded from: classes4.dex */
public class C8785sl extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private C8397nz f30220du;

    /* JADX INFO: renamed from: kk */
    private C8491p4 f30221kk;

    /* JADX INFO: renamed from: to */
    private C7272au f30222to;

    /* JADX INFO: renamed from: x1 */
    private int f30223x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f30219k4 = C7490dl.m30396k4("plastic");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30218h4 = new C7017h4("prstMaterial", "bevel", "lightRig", "extLst");

    public C8785sl() {
        m41103du();
        this.f30221kk = new C8491p4();
    }

    /* JADX INFO: renamed from: du */
    private void m41103du() {
        this.f30223x1 = f30219k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m41109k4() {
        return this.f30223x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C7272au m41110kk() {
        return this.f30222to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8491p4 m41111x1() {
        return this.f30221kk;
    }

    public C8785sl(final AbstractC13912i5 abstractC13912i5) {
        m41103du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8785sl.f30218h4.m27428k4(str) != 0) {
                    return false;
                }
                C8785sl.this.f30223x1 = C7490dl.m30396k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sl.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8785sl.f30218h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C8785sl.this.f30221kk = new C8491p4(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8785sl.this.f30222to = new C7272au(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8785sl.this.f30220du = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f30223x1;
        if (i != f30219k4) {
            c3059ii.m12955x1("prstMaterial", C7490dl.m30397k4(i));
        }
        this.f30221kk.mo6846k4("a", c3059ii, "bevel");
        C7272au c7272au = this.f30222to;
        if (c7272au != null) {
            c7272au.mo6846k4("a", c3059ii, "lightRig");
        }
        C8397nz c8397nz = this.f30220du;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
