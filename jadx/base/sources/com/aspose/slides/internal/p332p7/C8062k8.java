package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.k8 */
/* JADX INFO: loaded from: classes4.dex */
public class C8062k8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25498to = new C7017h4("txfldGUID", "f", "dlblFieldTableCache");

    /* JADX INFO: renamed from: k4 */
    private String f25499k4;

    /* JADX INFO: renamed from: kk */
    private C8583q7 f25500kk;

    /* JADX INFO: renamed from: x1 */
    private String f25501x1;

    public C8062k8() {
    }

    /* JADX INFO: renamed from: x1 */
    public final C8583q7 m35188x1() {
        return this.f25500kk;
    }

    public C8062k8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.k8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8062k8.f25498to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8062k8.this.f25499k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8062k8 c8062k8 = C8062k8.this;
                            c8062k8.f25499k4 = C14113y2.m67400k4(c8062k8.f25499k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    C8062k8.this.f25501x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8062k8 c8062k82 = C8062k8.this;
                            c8062k82.f25501x1 = C14113y2.m67400k4(c8062k82.f25501x1, abstractC13912i5.mo65052v4());
                        }
                    }
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8062k8.this.f25500kk = new C8583q7(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35187k4() {
        return this.f25499k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("c", c3059ii, "txfldGUID", this.f25499k4, false);
        m29301k4("c", c3059ii, "f", this.f25501x1, false);
        C8583q7 c8583q7 = this.f25500kk;
        if (c8583q7 != null) {
            c8583q7.mo6846k4("c", c3059ii, "dlblFieldTableCache");
        }
        c3059ii.mo21898jd();
    }
}
