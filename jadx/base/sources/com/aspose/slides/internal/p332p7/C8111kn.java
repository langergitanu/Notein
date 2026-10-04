package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kn */
/* JADX INFO: loaded from: classes4.dex */
public class C8111kn extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private C14047bz f25822kk = new C14047bz();

    /* JADX INFO: renamed from: to */
    private byte f25823to;

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f25820k4 = C14047bz.f47172k4.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final byte f25821x1 = C7290b1.m28682k4("sp");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25819du = new C7017h4("id", "bldStep");

    public C8111kn() {
        m35556x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35556x1() {
        f25820k4.CloneTo(this.f25822kk);
        this.f25823to = f25821x1;
    }

    public C8111kn(AbstractC13912i5 abstractC13912i5) {
        m35556x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8111kn.f25819du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8111kn.this.f25822kk = new C14047bz(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8111kn.this.f25823to = C7290b1.m28682k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (C14047bz.m66537x1(this.f25822kk, f25820k4)) {
            c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f25822kk), "}"));
        }
        byte b = this.f25823to;
        if (b != f25821x1) {
            c3059ii.m12955x1("bldStep", C7290b1.m28683k4(b));
        }
        c3059ii.mo21898jd();
    }
}
