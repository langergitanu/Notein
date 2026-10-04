package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ax */
/* JADX INFO: loaded from: classes4.dex */
public class C7277ax extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20254to = new C7017h4("headerFooter", "pageMargins", "pageSetup");

    /* JADX INFO: renamed from: k4 */
    private C7288b0 f20255k4;

    /* JADX INFO: renamed from: kk */
    private C8551pv f20256kk;

    /* JADX INFO: renamed from: x1 */
    private C9124wn f20257x1;

    public C7277ax() {
    }

    public C7277ax(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ax.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7277ax.f20254to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7277ax.this.f20255k4 = new C7288b0(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7277ax.this.f20257x1 = new C9124wn(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7277ax.this.f20256kk = new C8551pv(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7288b0 c7288b0 = this.f20255k4;
        if (c7288b0 != null) {
            c7288b0.mo6846k4("cx", c3059ii, "headerFooter");
        }
        C9124wn c9124wn = this.f20257x1;
        if (c9124wn != null) {
            c9124wn.mo6846k4("cx", c3059ii, "pageMargins");
        }
        C8551pv c8551pv = this.f20256kk;
        if (c8551pv != null) {
            c8551pv.mo6846k4("cx", c3059ii, "pageSetup");
        }
        c3059ii.mo21898jd();
    }
}
