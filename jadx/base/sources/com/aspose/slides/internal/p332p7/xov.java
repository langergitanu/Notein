package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class xov extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private int f32998kk;

    /* JADX INFO: renamed from: to */
    private int f32999to;

    /* JADX INFO: renamed from: x1 */
    private String f33000x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f32997k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32996du = new C7017h4("xlink:href", "xlink:type", "xlink:actuate");

    public xov() {
        m44566x1();
    }

    public xov(AbstractC13912i5 abstractC13912i5) {
        m44566x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xov.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xov.f32996du.m27428k4(str);
                if (iM27428k4 == 0) {
                    xov.this.f33000x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    xov.this.f32998kk = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                xov.this.f32999to = x2a.m44176k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m44566x1() {
        this.f32998kk = f32997k4;
        this.f32999to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("xlink:href", this.f33000x1);
        int i = this.f32998kk;
        if (i != f32997k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f32999to;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
