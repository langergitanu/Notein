package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.m8 */
/* JADX INFO: loaded from: classes4.dex */
public class C8248m8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26712to = new C7017h4("seriesIdx", "categoryIdx", "bldStep");

    /* JADX INFO: renamed from: k4 */
    private int f26713k4;

    /* JADX INFO: renamed from: kk */
    private byte f26714kk;

    /* JADX INFO: renamed from: x1 */
    private int f26715x1;

    public C8248m8() {
        m36729x1();
    }

    public C8248m8(AbstractC13912i5 abstractC13912i5) {
        m36729x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.m8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8248m8.f26712to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8248m8.this.f26713k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8248m8.this.f26715x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8248m8.this.f26714kk = C9173x5.m44203k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m36729x1() {
        this.f26713k4 = -1;
        this.f26715x1 = -1;
        this.f26714kk = (byte) 5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m36732x1(int i) {
        this.f26715x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36730k4(byte b) {
        this.f26714kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36731k4(int i) {
        this.f26713k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26713k4;
        if (i != -1) {
            c3059ii.m12955x1("seriesIdx", C13850af.m65103k4(i));
        }
        int i2 = this.f26715x1;
        if (i2 != -1) {
            c3059ii.m12955x1("categoryIdx", C13850af.m65103k4(i2));
        }
        c3059ii.m12955x1("bldStep", C9173x5.m44204k4(this.f26714kk));
        c3059ii.mo21898jd();
    }
}
