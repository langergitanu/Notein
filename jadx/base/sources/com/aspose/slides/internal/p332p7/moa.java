package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class moa extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26925kk = new C7017h4("table:id", "table:position");

    /* JADX INFO: renamed from: k4 */
    private String f26926k4;

    /* JADX INFO: renamed from: x1 */
    private int f26927x1;

    public moa() {
    }

    public moa(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.moa.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = moa.f26925kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    moa.this.f26926k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                moa.this.f26927x1 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:id", this.f26926k4);
        c3059ii.m12955x1("table:position", C13850af.m65103k4(this.f26927x1));
        c3059ii.mo21898jd();
    }
}
