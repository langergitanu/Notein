package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.si */
/* JADX INFO: loaded from: classes4.dex */
public class C8776si extends AbstractC8714rv {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f30171m9 = new C7017h4("macro", "fPublished", "nvPicPr", "blipFill", "spPr", "style");

    /* JADX INFO: renamed from: du */
    private C8087kh f30172du;

    /* JADX INFO: renamed from: h4 */
    private C8601qh f30173h4;

    /* JADX INFO: renamed from: k4 */
    private String f30174k4;

    /* JADX INFO: renamed from: kk */
    private C8926u8 f30175kk;

    /* JADX INFO: renamed from: to */
    private C9220xo f30176to;

    /* JADX INFO: renamed from: x1 */
    private boolean f30177x1;

    public C8776si() {
        m41066m9();
        this.f30175kk = new C8926u8();
        this.f30176to = new C9220xo();
        this.f30172du = new C8087kh();
    }

    /* JADX INFO: renamed from: m9 */
    private void m41066m9() {
        this.f30174k4 = "";
        this.f30177x1 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: du */
    public C8601qh mo35655du() {
        if (this.f30173h4 != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8601qh c8601qh = new C8601qh();
        this.f30173h4 = c8601qh;
        return c8601qh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: kk */
    public C8087kh mo35657kk() {
        return this.f30172du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: to */
    public C8601qh mo35658to() {
        return this.f30173h4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: x1 */
    public C9220xo mo35659x1() {
        return this.f30176to;
    }

    public C8776si(final AbstractC13912i5 abstractC13912i5) {
        m41066m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.si.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8776si.f30171m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8776si.this.f30174k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8776si.this.f30177x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.si.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8776si.f30171m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8776si.this.f30175kk = new C8926u8(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C8776si.this.f30176to = new C9220xo(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8776si.this.f30172du = new C8087kh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C8776si.this.f30173h4 = new C8601qh(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8714rv
    /* JADX INFO: renamed from: k4 */
    public AbstractC9177x6 mo35656k4() {
        return this.f30175kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f30174k4)) {
            c3059ii.m12955x1("macro", this.f30174k4);
        }
        boolean z = this.f30177x1;
        if (z) {
            c3059ii.m12955x1("fPublished", z ? "1" : "0");
        }
        this.f30175kk.mo6846k4("cdr", c3059ii, "nvPicPr");
        this.f30176to.mo6846k4("cdr", c3059ii, "blipFill");
        this.f30172du.mo6846k4("cdr", c3059ii, "spPr");
        C8601qh c8601qh = this.f30173h4;
        if (c8601qh != null) {
            c8601qh.mo6846k4("cdr", c3059ii, "style");
        }
        c3059ii.mo21898jd();
    }
}
