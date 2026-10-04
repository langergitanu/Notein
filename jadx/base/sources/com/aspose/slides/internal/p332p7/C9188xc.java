package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xc */
/* JADX INFO: loaded from: classes4.dex */
public class C9188xc extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f32783to = new C7017h4("st", "end", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8461op f32784k4;

    /* JADX INFO: renamed from: kk */
    private C8397nz f32785kk;

    /* JADX INFO: renamed from: x1 */
    private C8461op f32786x1;

    public C9188xc() {
        this.f32784k4 = new C8461op();
        this.f32786x1 = new C8461op();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8461op m44294x1() {
        return this.f32786x1;
    }

    public C9188xc(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9188xc.f32783to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9188xc.this.f32784k4 = new C8461op(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9188xc.this.f32786x1 = new C8461op(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9188xc.this.f32785kk = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8461op m44293k4() {
        return this.f32784k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f32784k4.mo6846k4("a", c3059ii, "st");
        this.f32786x1.mo6846k4("a", c3059ii, "end");
        C8397nz c8397nz = this.f32785kk;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
