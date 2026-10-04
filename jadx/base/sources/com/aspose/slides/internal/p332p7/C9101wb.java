package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wb */
/* JADX INFO: loaded from: classes4.dex */
public class C9101wb extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32252kk = new C7017h4("spPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8087kh f32253k4;

    /* JADX INFO: renamed from: x1 */
    private C7249ah f32254x1;

    public C9101wb() {
    }

    /* JADX INFO: renamed from: kk */
    public final C7249ah m43603kk() {
        return this.f32254x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m43604x1() {
        return this.f32253k4;
    }

    public C9101wb(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9101wb.f32252kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9101wb.this.f32253k4 = new C8087kh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C9101wb.this.f32254x1 = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8087kh m43601k4() {
        if (this.f32253k4 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f32253k4 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43602k4(C7249ah c7249ah) {
        this.f32254x1 = c7249ah;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8087kh c8087kh = this.f32253k4;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C7249ah c7249ah = this.f32254x1;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
