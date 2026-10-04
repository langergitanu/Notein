package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class quf extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29029kk = new C7017h4("sldZmObj", "extLst");

    /* JADX INFO: renamed from: k4 */
    private bvk f29030k4;

    /* JADX INFO: renamed from: x1 */
    private ltr f29031x1;

    public quf() {
        this.f29030k4 = new bvk();
    }

    /* JADX INFO: renamed from: k4 */
    public final bvk m39683k4() {
        return this.f29030k4;
    }

    public quf(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.quf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = quf.f29029kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    quf.this.f29030k4 = new bvk(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    quf.this.f29031x1 = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("pslz", str2, "http://schemas.microsoft.com/office/powerpoint/2016/slidezoom");
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
        this.f29030k4.mo6846k4("pslz", c3059ii, "sldZmObj");
        ltr ltrVar = this.f29031x1;
        if (ltrVar != null) {
            ltrVar.mo6846k4("pslz", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
