package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class s6u extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29940to = new C7017h4("table:column", "table:row", "table:table");

    /* JADX INFO: renamed from: k4 */
    private int f29941k4;

    /* JADX INFO: renamed from: kk */
    private int f29942kk;

    /* JADX INFO: renamed from: x1 */
    private int f29943x1;

    public s6u() {
    }

    public s6u(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s6u.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = s6u.f29940to.m27428k4(str);
                if (iM27428k4 == 0) {
                    s6u.this.f29941k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    s6u.this.f29943x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                s6u.this.f29942kk = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:column", C13850af.m65103k4(this.f29941k4));
        c3059ii.m12955x1("table:row", C13850af.m65103k4(this.f29943x1));
        c3059ii.m12955x1("table:table", C13850af.m65103k4(this.f29942kk));
        c3059ii.mo21898jd();
    }
}
