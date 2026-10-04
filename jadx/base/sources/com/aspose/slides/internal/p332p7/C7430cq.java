package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cq */
/* JADX INFO: loaded from: classes4.dex */
public class C7430cq extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21169to = new C7017h4("polygonId", "numPoints", "pcaRings");

    /* JADX INFO: renamed from: k4 */
    private String f21170k4;

    /* JADX INFO: renamed from: kk */
    private String f21171kk;

    /* JADX INFO: renamed from: x1 */
    private int f21172x1;

    public C7430cq() {
    }

    public C7430cq(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7430cq.f21169to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7430cq.this.f21170k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7430cq.this.f21172x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C7430cq.this.f21171kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("polygonId", this.f21170k4);
        c3059ii.m12955x1("numPoints", C13850af.m65103k4(this.f21172x1));
        c3059ii.m12955x1("pcaRings", this.f21171kk);
        c3059ii.mo21898jd();
    }
}
