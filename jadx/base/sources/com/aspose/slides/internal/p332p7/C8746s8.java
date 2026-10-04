package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.s8 */
/* JADX INFO: loaded from: classes4.dex */
public class C8746s8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29945m9 = new C7017h4("show", "zeroWid", "zeroAsc", "zeroDesc", "transp", "ctrlPr");

    /* JADX INFO: renamed from: du */
    private C9408zw f29946du;

    /* JADX INFO: renamed from: h4 */
    private C7782go f29947h4;

    /* JADX INFO: renamed from: k4 */
    private C9408zw f29948k4;

    /* JADX INFO: renamed from: kk */
    private C9408zw f29949kk;

    /* JADX INFO: renamed from: to */
    private C9408zw f29950to;

    /* JADX INFO: renamed from: x1 */
    private C9408zw f29951x1;

    public C8746s8() {
    }

    public C8746s8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.s8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8746s8.f29945m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8746s8.this.f29948k4 = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8746s8.this.f29951x1 = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8746s8.this.f29949kk = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C8746s8.this.f29950to = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C8746s8.this.f29946du = new C9408zw(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C8746s8.this.f29947h4 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9408zw c9408zw = this.f29948k4;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "show");
        }
        C9408zw c9408zw2 = this.f29951x1;
        if (c9408zw2 != null) {
            c9408zw2.mo6846k4("m", c3059ii, "zeroWid");
        }
        C9408zw c9408zw3 = this.f29949kk;
        if (c9408zw3 != null) {
            c9408zw3.mo6846k4("m", c3059ii, "zeroAsc");
        }
        C9408zw c9408zw4 = this.f29950to;
        if (c9408zw4 != null) {
            c9408zw4.mo6846k4("m", c3059ii, "zeroDesc");
        }
        C9408zw c9408zw5 = this.f29946du;
        if (c9408zw5 != null) {
            c9408zw5.mo6846k4("m", c3059ii, "transp");
        }
        C7782go c7782go = this.f29947h4;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
