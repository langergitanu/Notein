package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pj */
/* JADX INFO: loaded from: classes4.dex */
public class C8527pj extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28440du = new C7017h4("sSubSupPr", "e", "sub", "sup");

    /* JADX INFO: renamed from: k4 */
    private C7834hb f28441k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f28442kk;

    /* JADX INFO: renamed from: to */
    private C9085w3 f28443to;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f28444x1;

    public C8527pj() {
        this.f28444x1 = new C9085w3();
        this.f28442kk = new C9085w3();
        this.f28443to = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7834hb m38937k4() {
        return this.f28441k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m38939kk() {
        return this.f28442kk;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m38940to() {
        return this.f28443to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3 m38941x1() {
        return this.f28444x1;
    }

    public C8527pj(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8527pj.f28440du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8527pj.this.f28441k4 = new C7834hb(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8527pj.this.f28444x1 = new C9085w3(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8527pj.this.f28442kk = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8527pj.this.f28443to = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38938k4(C7834hb c7834hb) {
        this.f28441k4 = c7834hb;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7834hb c7834hb = this.f28441k4;
        if (c7834hb != null) {
            c7834hb.mo6846k4("m", c3059ii, "sSubSupPr");
        }
        this.f28444x1.mo6846k4("m", c3059ii, "e");
        this.f28442kk.mo6846k4("m", c3059ii, "sub");
        this.f28443to.mo6846k4("m", c3059ii, "sup");
        c3059ii.mo21898jd();
    }
}
