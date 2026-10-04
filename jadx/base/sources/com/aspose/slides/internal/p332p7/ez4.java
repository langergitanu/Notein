package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ez4 extends AbstractC7379c5 {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22559du = new C7017h4("nvCxnSpPr", "spPr", "style", "extLst");

    /* JADX INFO: renamed from: k4 */
    private zw1 f22560k4;

    /* JADX INFO: renamed from: kk */
    private C8601qh f22561kk;

    /* JADX INFO: renamed from: to */
    private dnu f22562to;

    /* JADX INFO: renamed from: x1 */
    private C8087kh f22563x1;

    public ez4() {
        this.f22560k4 = new zw1();
        this.f22563x1 = new C8087kh();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: du */
    public AbstractC7414ck mo29428du() {
        return this.f22562to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: kk */
    public C8601qh mo29431kk() {
        return this.f22561kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: to */
    public C8601qh mo29432to() {
        if (this.f22561kk != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8601qh c8601qh = new C8601qh();
        this.f22561kk = c8601qh;
        return c8601qh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: x1 */
    public C8087kh mo29433x1() {
        return this.f22563x1;
    }

    public ez4(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ez4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ez4.f22559du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ez4.this.f22560k4 = new zw1(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    ez4.this.f22563x1 = new C8087kh(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    ez4.this.f22561kk = new C8601qh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    ez4.this.f22562to = new dnu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC7992jd mo29429k4() {
        return this.f22560k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: k4 */
    public void mo29430k4(AbstractC7414ck abstractC7414ck) {
        this.f22562to = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f22560k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvCxnSpPr");
        this.f22563x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "spPr");
        C8601qh c8601qh = this.f22561kk;
        if (c8601qh != null) {
            c8601qh.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "style");
        }
        dnu dnuVar = this.f22562to;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
