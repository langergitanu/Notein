package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class myx extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f27053m9 = new C7017h4("rubyAlign", "hps", "hpsRaise", "hpsBaseText", "lid", "dirty");

    /* JADX INFO: renamed from: du */
    private vp3 f27054du;

    /* JADX INFO: renamed from: h4 */
    private vsx f27055h4;

    /* JADX INFO: renamed from: k4 */
    private cn9 f27056k4;

    /* JADX INFO: renamed from: kk */
    private yd6 f27057kk;

    /* JADX INFO: renamed from: to */
    private yd6 f27058to;

    /* JADX INFO: renamed from: x1 */
    private yd6 f27059x1;

    public myx() {
        this.f27056k4 = new cn9();
        this.f27059x1 = new yd6();
        this.f27057kk = new yd6();
        this.f27058to = new yd6();
        this.f27054du = new vp3();
    }

    public myx(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.myx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = myx.f27053m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    myx.this.f27056k4 = new cn9(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    myx.this.f27059x1 = new yd6(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    myx.this.f27057kk = new yd6(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    myx.this.f27058to = new yd6(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    myx.this.f27054du = new vp3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    myx.this.f27055h4 = new vsx(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f27056k4.mo6846k4("w", c3059ii, "rubyAlign");
        this.f27059x1.mo6846k4("w", c3059ii, "hps");
        this.f27057kk.mo6846k4("w", c3059ii, "hpsRaise");
        this.f27058to.mo6846k4("w", c3059ii, "hpsBaseText");
        this.f27054du.mo6846k4("w", c3059ii, "lid");
        vsx vsxVar = this.f27055h4;
        if (vsxVar != null) {
            vsxVar.mo6846k4("w", c3059ii, "dirty");
        }
        c3059ii.mo21898jd();
    }
}
