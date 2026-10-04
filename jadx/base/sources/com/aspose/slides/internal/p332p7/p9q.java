package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class p9q extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f28267h4 = new C7017h4("table:cell-range", "svg:x", "svg:y", "chart:style-name", ContextChain.TAG_PRODUCT);

    /* JADX INFO: renamed from: du */
    private ok7 f28268du;

    /* JADX INFO: renamed from: k4 */
    private String f28269k4;

    /* JADX INFO: renamed from: kk */
    private String f28270kk;

    /* JADX INFO: renamed from: to */
    private String f28271to;

    /* JADX INFO: renamed from: x1 */
    private String f28272x1;

    public p9q() {
    }

    public p9q(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.p9q.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = p9q.f28267h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    p9q.this.f28269k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    p9q.this.f28272x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    p9q.this.f28270kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                p9q.this.f28271to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.p9q.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (p9q.f28267h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                p9q.this.f28268du = new ok7(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28269k4;
        if (str3 != null) {
            c3059ii.m12955x1("table:cell-range", str3);
        }
        String str4 = this.f28272x1;
        if (str4 != null) {
            c3059ii.m12955x1("svg:x", str4);
        }
        String str5 = this.f28270kk;
        if (str5 != null) {
            c3059ii.m12955x1("svg:y", str5);
        }
        String str6 = this.f28271to;
        if (str6 != null) {
            c3059ii.m12955x1("chart:style-name", str6);
        }
        ok7 ok7Var = this.f28268du;
        if (ok7Var != null) {
            ok7Var.mo6846k4("text", c3059ii, ContextChain.TAG_PRODUCT);
        }
        c3059ii.mo21898jd();
    }
}
