package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qz */
/* JADX INFO: loaded from: classes4.dex */
public class C8641qz extends AbstractC8333ne {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f29106c5 = new C7017h4("macro", "textlink", "fLocksText", "fPublished", "nvSpPr", "spPr", "style", "txBody");

    /* JADX INFO: renamed from: du */
    private C8600qg f29107du;

    /* JADX INFO: renamed from: dy */
    private C8952ug f29108dy;

    /* JADX INFO: renamed from: h4 */
    private C8087kh f29109h4;

    /* JADX INFO: renamed from: k4 */
    private String f29110k4;

    /* JADX INFO: renamed from: kk */
    private boolean f29111kk;

    /* JADX INFO: renamed from: m9 */
    private C8601qh f29112m9;

    /* JADX INFO: renamed from: to */
    private boolean f29113to;

    /* JADX INFO: renamed from: x1 */
    private String f29114x1;

    public C8641qz() {
        m39798rv();
        this.f29107du = new C8600qg();
        this.f29109h4 = new C8087kh();
    }

    /* JADX INFO: renamed from: rv */
    private void m39798rv() {
        this.f29111kk = true;
        this.f29113to = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: c5 */
    public String mo37448c5() {
        return this.f29110k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: ck */
    public boolean mo37449ck() {
        return this.f29111kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: du */
    public C8952ug mo30432du() {
        return this.f29108dy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: fa */
    public boolean mo37450fa() {
        return this.f29113to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: h4 */
    public C8952ug mo30434h4() {
        if (this.f29108dy != null) {
            throw new Exception("Only one <txBody> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f29108dy = c8952ug;
        return c8952ug;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: jd */
    public String mo37451jd() {
        return this.f29114x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public AbstractC7966ix mo30435k4() {
        return this.f29107du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: kk */
    public C8601qh mo30438kk() {
        return this.f29112m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: to */
    public C8601qh mo30440to() {
        if (this.f29112m9 != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8601qh c8601qh = new C8601qh();
        this.f29112m9 = c8601qh;
        return c8601qh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: x1 */
    public C8087kh mo30441x1() {
        return this.f29109h4;
    }

    public C8641qz(final AbstractC13912i5 abstractC13912i5) {
        m39798rv();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8641qz.f29106c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8641qz.this.f29110k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8641qz.this.f29114x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8641qz.this.f29111kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8641qz.this.f29113to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8641qz.f29106c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    C8641qz.this.f29107du = new C8600qg(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C8641qz.this.f29109h4 = new C8087kh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    C8641qz.this.f29112m9 = new C8601qh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                C8641qz.this.f29108dy = new C8952ug(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: kk */
    public void mo37453kk(boolean z) {
        this.f29113to = z;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: x1 */
    public void mo37454x1(String str) {
        this.f29114x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: x1 */
    public void mo37455x1(boolean z) {
        this.f29111kk = z;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public void mo37452k4(String str) {
        this.f29110k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29110k4;
        if (str3 != null) {
            c3059ii.m12955x1("macro", str3);
        }
        String str4 = this.f29114x1;
        if (str4 != null) {
            c3059ii.m12955x1("textlink", str4);
        }
        boolean z = this.f29111kk;
        if (!z) {
            c3059ii.m12955x1("fLocksText", z ? "1" : "0");
        }
        boolean z2 = this.f29113to;
        if (z2) {
            c3059ii.m12955x1("fPublished", z2 ? "1" : "0");
        }
        this.f29107du.mo6846k4("cdr", c3059ii, "nvSpPr");
        this.f29109h4.mo6846k4("cdr", c3059ii, "spPr");
        C8601qh c8601qh = this.f29112m9;
        if (c8601qh != null) {
            c8601qh.mo6846k4("cdr", c3059ii, "style");
        }
        C8952ug c8952ug = this.f29108dy;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cdr", c3059ii, "txBody");
        }
        c3059ii.mo21898jd();
    }
}
