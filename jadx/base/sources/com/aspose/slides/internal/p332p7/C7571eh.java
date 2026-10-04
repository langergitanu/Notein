package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.eh */
/* JADX INFO: loaded from: classes4.dex */
public class C7571eh extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f22233x1 = new C7017h4("spPr");

    /* JADX INFO: renamed from: k4 */
    private C8087kh f22234k4;

    public C7571eh() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8087kh m31082k4() {
        if (this.f22234k4 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f22234k4 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m31083x1() {
        return this.f22234k4;
    }

    public C7571eh(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7571eh.f22233x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7571eh.this.f22234k4 = new C8087kh(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8087kh c8087kh = this.f22234k4;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        c3059ii.mo21898jd();
    }
}
