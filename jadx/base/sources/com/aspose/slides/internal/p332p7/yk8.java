package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class yk8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f33416h4 = new C7017h4("mapId", "xpath", "denormalized", "xmlDataType", "extLst");

    /* JADX INFO: renamed from: du */
    private g3j f33417du;

    /* JADX INFO: renamed from: k4 */
    private long f33418k4;

    /* JADX INFO: renamed from: kk */
    private boolean f33419kk;

    /* JADX INFO: renamed from: to */
    private int f33420to;

    /* JADX INFO: renamed from: x1 */
    private String f33421x1;

    public yk8() {
        m45040x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45040x1() {
        this.f33419kk = false;
        this.f33420to = 0;
    }

    public yk8(final AbstractC13912i5 abstractC13912i5) {
        m45040x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yk8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yk8.f33416h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    yk8.this.f33418k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    yk8.this.f33421x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    yk8.this.f33419kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                yk8.this.f33420to = t5p.m41548k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yk8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (yk8.f33416h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                yk8.this.f33417du = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("mapId", C13850af.m65147x1(this.f33418k4));
        c3059ii.m12955x1("xpath", this.f33421x1);
        boolean z = this.f33419kk;
        if (z) {
            c3059ii.m12955x1("denormalized", z ? "1" : "0");
        }
        c3059ii.m12955x1("xmlDataType", t5p.m41549k4(this.f33420to));
        g3j g3jVar = this.f33417du;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
