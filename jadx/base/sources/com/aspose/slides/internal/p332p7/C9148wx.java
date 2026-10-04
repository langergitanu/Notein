package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wx */
/* JADX INFO: loaded from: classes4.dex */
public class C9148wx extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32618kk = new C7017h4("symbol", "size");

    /* JADX INFO: renamed from: k4 */
    private int f32619k4;

    /* JADX INFO: renamed from: x1 */
    private int f32620x1;

    public C9148wx() {
        m44097x1();
    }

    public C9148wx(AbstractC13912i5 abstractC13912i5) {
        m44097x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9148wx.f32618kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9148wx.this.f32619k4 = C8258me.m36892k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9148wx.this.f32620x1 = C13850af.m65150x6(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m44097x1() {
        this.f32619k4 = 0;
        this.f32620x1 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32619k4;
        if (i != 0) {
            c3059ii.m12955x1("symbol", C8258me.m36893k4(i));
        }
        int i2 = this.f32620x1;
        if ((65535 & i2) != 0) {
            c3059ii.m12955x1("size", C13850af.m65146x1(i2));
        }
        c3059ii.mo21898jd();
    }
}
