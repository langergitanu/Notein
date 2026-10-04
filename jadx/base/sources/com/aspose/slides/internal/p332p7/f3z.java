package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class f3z extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22648to = new C7017h4(C18437z2.f56754h, "width", "shadow");

    /* JADX INFO: renamed from: k4 */
    private int f22649k4;

    /* JADX INFO: renamed from: kk */
    private int f22650kk;

    /* JADX INFO: renamed from: x1 */
    private int f22651x1;

    public f3z() {
        m31592x1();
    }

    public f3z(AbstractC13912i5 abstractC13912i5) {
        m31592x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f3z.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = f3z.f22648to.m27428k4(str);
                if (iM27428k4 == 0) {
                    f3z.this.f22649k4 = pxr.m39190k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    f3z.this.f22651x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                f3z.this.f22650kk = d3z.m30019k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m31592x1() {
        this.f22649k4 = 0;
        this.f22651x1 = 0;
        this.f22650kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22649k4;
        if (i != 0) {
            c3059ii.m12955x1(C18437z2.f56754h, pxr.m39191k4(i));
        }
        int i2 = this.f22651x1;
        if (i2 != 0) {
            c3059ii.m12955x1("width", C13850af.m65103k4(i2));
        }
        int i3 = this.f22650kk;
        if (i3 != 0) {
            c3059ii.m12955x1("shadow", d3z.m30020k4(i3));
        }
        c3059ii.mo21898jd();
    }
}
