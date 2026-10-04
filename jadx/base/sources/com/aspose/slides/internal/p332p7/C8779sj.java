package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sj */
/* JADX INFO: loaded from: classes4.dex */
public final class C8779sj extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f30187k4 = C7578ek.m31111k4("linear");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30188kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f30189x1;

    public C8779sj() {
        this.f30189x1 = f30187k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m41074k4() {
        return this.f30189x1;
    }

    public C8779sj(AbstractC13912i5 abstractC13912i5) {
        this();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj()) && f30188kk.m27428k4(AbstractC7361bz.m29293kk(abstractC13912i5)) == 0) {
                this.f30189x1 = C7578ek.m31111k4(abstractC13912i5.mo65042rv());
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41075k4(int i) {
        this.f30189x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C7578ek.m31112k4(this.f30189x1));
        c3059ii.mo21898jd();
    }
}
