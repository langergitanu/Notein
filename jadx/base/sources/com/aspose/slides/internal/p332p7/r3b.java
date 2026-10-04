package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class r3b extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29150to = new C7017h4("table:position", "table:start-position", "table:end-position");

    /* JADX INFO: renamed from: k4 */
    private int f29151k4;

    /* JADX INFO: renamed from: kk */
    private int f29152kk;

    /* JADX INFO: renamed from: x1 */
    private int f29153x1;

    public r3b() {
        m39860x1();
    }

    public r3b(AbstractC13912i5 abstractC13912i5) {
        m39860x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.r3b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = r3b.f29150to.m27428k4(str);
                if (iM27428k4 == 0) {
                    r3b.this.f29151k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    r3b.this.f29153x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                r3b.this.f29152kk = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m39860x1() {
        this.f29151k4 = 0;
        this.f29153x1 = 0;
        this.f29152kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f29151k4;
        if (i != 0) {
            c3059ii.m12955x1("table:position", C13850af.m65103k4(i));
        }
        int i2 = this.f29153x1;
        if (i2 != 0) {
            c3059ii.m12955x1("table:start-position", C13850af.m65103k4(i2));
        }
        int i3 = this.f29152kk;
        if (i3 != 0) {
            c3059ii.m12955x1("table:end-position", C13850af.m65103k4(i3));
        }
        c3059ii.mo21898jd();
    }
}
