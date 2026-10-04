package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class yg3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f33375h4 = new C7017h4("w_Id", "w_Combine", "w_CombineBrackets", "w_Vert", "w_VertCompress");

    /* JADX INFO: renamed from: du */
    private int f33376du;

    /* JADX INFO: renamed from: k4 */
    private int f33377k4;

    /* JADX INFO: renamed from: kk */
    private int f33378kk;

    /* JADX INFO: renamed from: to */
    private int f33379to;

    /* JADX INFO: renamed from: x1 */
    private int f33380x1;

    public yg3() {
        m44999x1();
    }

    public yg3(AbstractC13912i5 abstractC13912i5) {
        m44999x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yg3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yg3.f33375h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    yg3.this.f33377k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    yg3.this.f33380x1 = vn6.m43185k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    yg3.this.f33378kk = ob5.m38173k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    yg3.this.f33379to = vn6.m43185k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                yg3.this.f33376du = vn6.m43185k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m44999x1() {
        this.f33377k4 = 0;
        this.f33380x1 = 0;
        this.f33378kk = 0;
        this.f33379to = 0;
        this.f33376du = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33377k4;
        if (i != 0) {
            c3059ii.m12955x1("w:id", C13850af.m65103k4(i));
        }
        int i2 = this.f33380x1;
        if (i2 != 0) {
            c3059ii.m12955x1("w:combine", vn6.m43186k4(i2));
        }
        int i3 = this.f33378kk;
        if (i3 != 0) {
            c3059ii.m12955x1("w:combineBrackets", ob5.m38174k4(i3));
        }
        int i4 = this.f33379to;
        if (i4 != 0) {
            c3059ii.m12955x1("w:vert", vn6.m43186k4(i4));
        }
        int i5 = this.f33376du;
        if (i5 != 0) {
            c3059ii.m12955x1("w:vertCompress", vn6.m43186k4(i5));
        }
        c3059ii.mo21898jd();
    }
}
