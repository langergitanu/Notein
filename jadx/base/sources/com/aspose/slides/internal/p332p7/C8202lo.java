package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lo */
/* JADX INFO: loaded from: classes4.dex */
public class C8202lo extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26449to = new C7017h4("rName", "rVer", "blip");

    /* JADX INFO: renamed from: k4 */
    private String f26450k4;

    /* JADX INFO: renamed from: kk */
    private C8401o2 f26451kk;

    /* JADX INFO: renamed from: x1 */
    private String f26452x1;

    public C8202lo() {
    }

    public C8202lo(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8202lo.f26449to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8202lo.this.f26450k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8202lo.this.f26452x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8202lo.f26449to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C8202lo.this.f26451kk = new C8401o2(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36341k4(C8401o2 c8401o2) {
        this.f26451kk = c8401o2;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C6005k4.m24262k4(this.f26450k4 != null, "Required property \"RName\" is uninitialized.");
        c3059ii.m12955x1("rName", this.f26450k4);
        C6005k4.m24262k4(this.f26452x1 != null, "Required property \"RVer\" is uninitialized.");
        c3059ii.m12955x1("rVer", this.f26452x1);
        C8401o2 c8401o2 = this.f26451kk;
        if (c8401o2 != null) {
            c8401o2.mo6846k4("am3d", c3059ii, "blip");
        }
        c3059ii.mo21898jd();
    }
}
