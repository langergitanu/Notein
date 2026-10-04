package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class t8o extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30611to = new C7017h4("sb", "eb", "t");

    /* JADX INFO: renamed from: k4 */
    private long f30612k4;

    /* JADX INFO: renamed from: kk */
    private String f30613kk;

    /* JADX INFO: renamed from: x1 */
    private long f30614x1;

    public t8o() {
    }

    public t8o(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.t8o.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = t8o.f30611to.m27428k4(str);
                if (iM27428k4 == 0) {
                    t8o.this.f30612k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                t8o.this.f30614x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.t8o.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (t8o.f30611to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                t8o.this.f30613kk = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    t8o t8oVar = t8o.this;
                    t8oVar.f30613kk = C14113y2.m67400k4(t8oVar.f30613kk, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("sb", C13850af.m65147x1(this.f30612k4));
        c3059ii.m12955x1("eb", C13850af.m65147x1(this.f30614x1));
        m29301k4("ssml", c3059ii, "t", this.f30613kk, true);
        c3059ii.mo21898jd();
    }
}
