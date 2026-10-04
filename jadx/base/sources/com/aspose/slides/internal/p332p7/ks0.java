package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ks0 extends AbstractC8714rv {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25910h4 = new C7017h4("nvPicPr", "blipFill", "spPr", "style", "extLst");

    /* JADX INFO: renamed from: du */
    private dnu f25911du;

    /* JADX INFO: renamed from: k4 */
    private zlf f25912k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f25913kk;

    /* JADX INFO: renamed from: to */
    private C8601qh f25914to;

    /* JADX INFO: renamed from: x1 */
    private C9220xo f25915x1;

    public ks0() {
        this.f25912k4 = new zlf();
        this.f25915x1 = new C9220xo();
        this.f25913kk = new C8087kh();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: du */
    public C8601qh mo35655du() {
        if (this.f25914to != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8601qh c8601qh = new C8601qh();
        this.f25914to = c8601qh;
        return c8601qh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: kk */
    public C8087kh mo35657kk() {
        return this.f25913kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: to */
    public C8601qh mo35658to() {
        return this.f25914to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: x1 */
    public C9220xo mo35659x1() {
        return this.f25915x1;
    }

    public ks0(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ks0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ks0.f25910h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ks0.this.f25912k4 = new zlf(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    ks0.this.f25915x1 = new C9220xo(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    ks0.this.f25913kk = new C8087kh(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    ks0.this.f25914to = new C8601qh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    ks0.this.f25911du = new dnu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: k4 */
    public AbstractC9177x6 mo35656k4() {
        return this.f25912k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, ContextChain.TAG_PRODUCT.equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main")) ? null : "http://schemas.openxmlformats.org/presentationml/2006/main");
        this.f25912k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvPicPr");
        this.f25915x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "blipFill");
        this.f25913kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "spPr");
        C8601qh c8601qh = this.f25914to;
        if (c8601qh != null) {
            c8601qh.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "style");
        }
        dnu dnuVar = this.f25911du;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
