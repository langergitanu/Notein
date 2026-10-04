package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rd */
/* JADX INFO: loaded from: classes4.dex */
public class C8668rd extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29250to = new C7017h4("minColor", "midColor", "maxColor");

    /* JADX INFO: renamed from: k4 */
    private C8256md f29251k4;

    /* JADX INFO: renamed from: kk */
    private C8256md f29252kk;

    /* JADX INFO: renamed from: x1 */
    private C8256md f29253x1;

    public C8668rd() {
    }

    public C8668rd(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8668rd.f29250to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8668rd.this.f29251k4 = new C8256md(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8668rd.this.f29253x1 = new C8256md(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8668rd.this.f29252kk = new C8256md(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8256md c8256md = this.f29251k4;
        if (c8256md != null) {
            c8256md.mo6846k4("cx", c3059ii, "minColor");
        }
        C8256md c8256md2 = this.f29253x1;
        if (c8256md2 != null) {
            c8256md2.mo6846k4("cx", c3059ii, "midColor");
        }
        C8256md c8256md3 = this.f29252kk;
        if (c8256md3 != null) {
            c8256md3.mo6846k4("cx", c3059ii, "maxColor");
        }
        c3059ii.mo21898jd();
    }
}
