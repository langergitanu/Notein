package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class rm1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29361kk = new C7017h4("sectionZmObj", "extLst");

    /* JADX INFO: renamed from: k4 */
    private s8c f29362k4;

    /* JADX INFO: renamed from: x1 */
    private ltr f29363x1;

    public rm1() {
        this.f29362k4 = new s8c();
    }

    public rm1(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rm1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = rm1.f29361kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    rm1.this.f29362k4 = new s8c(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    rm1.this.f29363x1 = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final s8c m40062k4() {
        return this.f29362k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("psez", str2, "http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom");
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2016/6/main") == null) {
            c3059ii.m12954to("xmlns", "p166", null, "http://schemas.microsoft.com/office/powerpoint/2016/6/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
            c3059ii.m12954to("xmlns", ContextChain.TAG_PRODUCT, null, "http://schemas.openxmlformats.org/presentationml/2006/main");
        }
        this.f29362k4.mo6846k4("psez", c3059ii, "sectionZmObj");
        ltr ltrVar = this.f29363x1;
        if (ltrVar != null) {
            ltrVar.mo6846k4("psez", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
