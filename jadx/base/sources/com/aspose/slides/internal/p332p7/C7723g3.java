package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.g3 */
/* JADX INFO: loaded from: classes4.dex */
public class C7723g3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f23194to = new C7017h4("sx", "sy", "sz");

    /* JADX INFO: renamed from: k4 */
    private C8291mu f23195k4;

    /* JADX INFO: renamed from: kk */
    private C8291mu f23196kk;

    /* JADX INFO: renamed from: x1 */
    private C8291mu f23197x1;

    public C7723g3() {
        this.f23195k4 = new C8291mu();
        this.f23197x1 = new C8291mu();
        this.f23196kk = new C8291mu();
    }

    public C7723g3(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7723g3.f23194to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7723g3.this.f23195k4 = new C8291mu(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7723g3.this.f23197x1 = new C8291mu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7723g3.this.f23196kk = new C8291mu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f23195k4.mo6846k4("am3d", c3059ii, "sx");
        this.f23197x1.mo6846k4("am3d", c3059ii, "sy");
        this.f23196kk.mo6846k4("am3d", c3059ii, "sz");
        c3059ii.mo21898jd();
    }
}
