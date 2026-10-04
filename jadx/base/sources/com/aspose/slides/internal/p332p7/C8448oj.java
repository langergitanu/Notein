package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.oj */
/* JADX INFO: loaded from: classes4.dex */
public class C8448oj extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27975to = new C7017h4("fPr", "num", "den");

    /* JADX INFO: renamed from: k4 */
    private C9070vv f27976k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f27977kk;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f27978x1;

    public C8448oj() {
        this.f27978x1 = new C9085w3();
        this.f27977kk = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9070vv m38297k4() {
        return this.f27976k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m38299kk() {
        return this.f27977kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3 m38300x1() {
        return this.f27978x1;
    }

    public C8448oj(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8448oj.f27975to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8448oj.this.f27976k4 = new C9070vv(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8448oj.this.f27978x1 = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8448oj.this.f27977kk = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38298k4(C9070vv c9070vv) {
        this.f27976k4 = c9070vv;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9070vv c9070vv = this.f27976k4;
        if (c9070vv != null) {
            c9070vv.mo6846k4("m", c3059ii, "fPr");
        }
        this.f27978x1.mo6846k4("m", c3059ii, "num");
        this.f27977kk.mo6846k4("m", c3059ii, "den");
        c3059ii.mo21898jd();
    }
}
