package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xy */
/* JADX INFO: loaded from: classes4.dex */
public class C9247xy extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33151kk = new C7017h4(C18293o1.f55803f, "mcJc");

    /* JADX INFO: renamed from: k4 */
    private C8836t5 f33152k4;

    /* JADX INFO: renamed from: x1 */
    private C7838hd f33153x1;

    public C9247xy() {
    }

    /* JADX INFO: renamed from: x1 */
    public final C7838hd m44747x1() {
        return this.f33153x1;
    }

    public C9247xy(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9247xy.f33151kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9247xy.this.f33152k4 = new C8836t5(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C9247xy.this.f33153x1 = new C7838hd(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8836t5 m44744k4() {
        return this.f33152k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44745k4(C7838hd c7838hd) {
        this.f33153x1 = c7838hd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44746k4(C8836t5 c8836t5) {
        this.f33152k4 = c8836t5;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8836t5 c8836t5 = this.f33152k4;
        if (c8836t5 != null) {
            c8836t5.mo6846k4("m", c3059ii, C18293o1.f55803f);
        }
        C7838hd c7838hd = this.f33153x1;
        if (c7838hd != null) {
            c7838hd.mo6846k4("m", c3059ii, "mcJc");
        }
        c3059ii.mo21898jd();
    }
}
