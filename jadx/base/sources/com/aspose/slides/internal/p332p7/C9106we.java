package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.we */
/* JADX INFO: loaded from: classes4.dex */
public class C9106we extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32281kk = new C7017h4("degHide", "ctrlPr");

    /* JADX INFO: renamed from: k4 */
    private C9408zw f32282k4;

    /* JADX INFO: renamed from: x1 */
    private C7782go f32283x1;

    public C9106we() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m43640k4() {
        if (this.f32283x1 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f32283x1 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final C7782go m43642kk() {
        return this.f32283x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9408zw m43643x1() {
        return this.f32282k4;
    }

    public C9106we(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.we.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9106we.f32281kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9106we.this.f32282k4 = new C9408zw(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C9106we.this.f32283x1 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43641k4(C9408zw c9408zw) {
        this.f32282k4 = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9408zw c9408zw = this.f32282k4;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "degHide");
        }
        C7782go c7782go = this.f32283x1;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
