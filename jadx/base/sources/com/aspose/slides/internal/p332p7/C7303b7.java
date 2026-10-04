package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.b7 */
/* JADX INFO: loaded from: classes4.dex */
public class C7303b7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20439to = new C7017h4("limUppPr", "e", "lim");

    /* JADX INFO: renamed from: k4 */
    private C7312bc f20440k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f20441kk;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f20442x1;

    public C7303b7() {
        this.f20442x1 = new C9085w3();
        this.f20441kk = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7312bc m28735k4() {
        if (this.f20440k4 != null) {
            throw new Exception("Only one <limUppPr> element can be added.");
        }
        C7312bc c7312bc = new C7312bc();
        this.f20440k4 = c7312bc;
        return c7312bc;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m28736kk() {
        return this.f20442x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m28737to() {
        return this.f20441kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7312bc m28738x1() {
        return this.f20440k4;
    }

    public C7303b7(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.b7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7303b7.f20439to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7303b7.this.f20440k4 = new C7312bc(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7303b7.this.f20442x1 = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7303b7.this.f20441kk = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7312bc c7312bc = this.f20440k4;
        if (c7312bc != null) {
            c7312bc.mo6846k4("m", c3059ii, "limUppPr");
        }
        this.f20442x1.mo6846k4("m", c3059ii, "e");
        this.f20441kk.mo6846k4("m", c3059ii, "lim");
        c3059ii.mo21898jd();
    }
}
