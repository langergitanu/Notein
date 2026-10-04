package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ki */
/* JADX INFO: loaded from: classes4.dex */
public class C8089ki extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25672to = new C7017h4("f", "numCache", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f25673k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f25674kk;

    /* JADX INFO: renamed from: x1 */
    private C7402cf f25675x1;

    public C8089ki() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7402cf m35401k4() {
        if (this.f25675x1 != null) {
            throw new Exception("Only one <numCache> element can be added.");
        }
        C7402cf c7402cf = new C7402cf();
        this.f25675x1 = c7402cf;
        return c7402cf;
    }

    /* JADX INFO: renamed from: kk */
    public final C7402cf m35404kk() {
        return this.f25675x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m35405to() {
        return this.f25674kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35406x1() {
        return this.f25673k4;
    }

    public C8089ki(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ki.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8089ki.f25672to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8089ki.this.f25673k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8089ki c8089ki = C8089ki.this;
                            c8089ki.f25673k4 = C14113y2.m67400k4(c8089ki.f25673k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    C8089ki.this.f25675x1 = new C7402cf(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8089ki.this.f25674kk = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35402k4(C7402cf c7402cf) {
        this.f25675x1 = c7402cf;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35403k4(String str) {
        this.f25673k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("c", c3059ii, "f", this.f25673k4, false);
        C7402cf c7402cf = this.f25675x1;
        if (c7402cf != null) {
            c7402cf.mo6846k4("c", c3059ii, "numCache");
        }
        C7683fo c7683fo = this.f25674kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
