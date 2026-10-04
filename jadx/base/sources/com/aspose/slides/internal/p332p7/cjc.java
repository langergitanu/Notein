package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class cjc extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21099to = new C7017h4("rubyPr", "rt", "rubyBase");

    /* JADX INFO: renamed from: k4 */
    private myx f21100k4;

    /* JADX INFO: renamed from: kk */
    private bs9 f21101kk;

    /* JADX INFO: renamed from: x1 */
    private bs9 f21102x1;

    public cjc() {
        this.f21100k4 = new myx();
        this.f21102x1 = new bs9();
        this.f21101kk = new bs9();
    }

    public cjc(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cjc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = cjc.f21099to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    cjc.this.f21100k4 = new myx(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    cjc.this.f21102x1 = new bs9(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    cjc.this.f21101kk = new bs9(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f21100k4.mo6846k4("w", c3059ii, "rubyPr");
        this.f21102x1.mo6846k4("w", c3059ii, "rt");
        this.f21101kk.mo6846k4("w", c3059ii, "rubyBase");
        c3059ii.mo21898jd();
    }
}
