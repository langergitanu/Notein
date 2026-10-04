package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mz */
/* JADX INFO: loaded from: classes4.dex */
public class C8299mz extends AbstractC7379c5 {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f27062h4 = new C7017h4("macro", "fPublished", "nvCxnSpPr", "spPr", "style");

    /* JADX INFO: renamed from: du */
    private C8601qh f27063du;

    /* JADX INFO: renamed from: k4 */
    private String f27064k4;

    /* JADX INFO: renamed from: kk */
    private C7900i1 f27065kk;

    /* JADX INFO: renamed from: to */
    private C8087kh f27066to;

    /* JADX INFO: renamed from: x1 */
    private boolean f27067x1;

    public C8299mz() {
        m37181m9();
        this.f27065kk = new C7900i1();
        this.f27066to = new C8087kh();
    }

    /* JADX INFO: renamed from: m9 */
    private void m37181m9() {
        this.f27067x1 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: kk */
    public C8601qh mo29431kk() {
        return this.f27063du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: to */
    public C8601qh mo29432to() {
        if (this.f27063du != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8601qh c8601qh = new C8601qh();
        this.f27063du = c8601qh;
        return c8601qh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: x1 */
    public C8087kh mo29433x1() {
        return this.f27066to;
    }

    public C8299mz(final AbstractC13912i5 abstractC13912i5) {
        m37181m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8299mz.f27062h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8299mz.this.f27064k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8299mz.this.f27067x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8299mz.f27062h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8299mz.this.f27065kk = new C7900i1(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C8299mz.this.f27066to = new C8087kh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C8299mz.this.f27063du = new C8601qh(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7379c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC7992jd mo29429k4() {
        return this.f27065kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27064k4;
        if (str3 != null) {
            c3059ii.m12955x1("macro", str3);
        }
        boolean z = this.f27067x1;
        if (z) {
            c3059ii.m12955x1("fPublished", z ? "1" : "0");
        }
        this.f27065kk.mo6846k4("cdr", c3059ii, "nvCxnSpPr");
        this.f27066to.mo6846k4("cdr", c3059ii, "spPr");
        C8601qh c8601qh = this.f27063du;
        if (c8601qh != null) {
            c8601qh.mo6846k4("cdr", c3059ii, "style");
        }
        c3059ii.mo21898jd();
    }
}
