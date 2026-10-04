package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hb */
/* JADX INFO: loaded from: classes4.dex */
public class C7834hb extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24017kk = new C7017h4("alnScr", "ctrlPr");

    /* JADX INFO: renamed from: k4 */
    private C9408zw f24018k4;

    /* JADX INFO: renamed from: x1 */
    private C7782go f24019x1;

    public C7834hb() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m33262k4() {
        if (this.f24019x1 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f24019x1 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final C7782go m33264kk() {
        return this.f24019x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9408zw m33265x1() {
        return this.f24018k4;
    }

    public C7834hb(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7834hb.f24017kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7834hb.this.f24018k4 = new C9408zw(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7834hb.this.f24019x1 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33263k4(C9408zw c9408zw) {
        this.f24018k4 = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9408zw c9408zw = this.f24018k4;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "alnScr");
        }
        C7782go c7782go = this.f24019x1;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
